package controller;

import java.util.Date;
import java.util.List;

import model.Customer;
import model.Address;
import model.CustomerFacade;

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
	private String email;
	private String password;
	private Customer customer;

	@EJB
	private CustomerFacade customerFacade;
	
	public String createCustomer() {
		this.customer = customerFacade.createCustomer(firstname, lastname, dateOfBirth, email, password);
		return "customer"; 
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

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public CustomerFacade getCustomerFacade() {
		return customerFacade;
	}

	public void setCustomerFacade(CustomerFacade customerFacade) {
		this.customerFacade = customerFacade;
	}
	

}
