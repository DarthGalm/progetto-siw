package controller;

import java.util.Date;
import java.util.List;

import model.Customer;
import model.Address;
import model.CustomerFacade;
import model.LoginFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class CustomerController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String firstname;
	private String lastname ;
	private String dateOfBirth;
	private String day;
	private String month;
	private String year;
	private String email;
	private String password;
	private Customer customer;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	private Address address;
	
	
	@EJB
	private CustomerFacade customerFacade;
	@EJB
	private LoginFacade loginFacade;
	
	public String createCustomer() {
		this.dateOfBirth = customerFacade.createDateOfBirth(day, month, year);
		this.address = customerFacade.createAddress(street, city, state, zipcode, country);
		this.customer = customerFacade.createCustomer(firstname, lastname, dateOfBirth, email, password, address);
		if(customer==null) return "registrationError";
		return "completedRegistration"; 
	}
	
	public String login() {
		this.customer = loginFacade.customerLogin(email, password);
		if(customer==null) return "loginError";
		return "loggedUserHome";
	}
	
	public String findCustomer() {
		this.customer = customerFacade.getCustomer(id);
		return "customer";
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
}