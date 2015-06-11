package controller;

import java.util.List;

import model.Provider;
import model.ProviderFacade;
import model.Address;
import model.Product;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class ProviderController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String name;
	private String email;
	private String phoneNumber;
	private String iva;
	private Provider provider;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	private Address address;
	//private List<Product> inventory;
	
	@EJB
	private ProviderFacade providerFacade;
	
	public String createProvider() {
		this.address = providerFacade.createAddress(street, city, state, zipcode, country);
		this.provider = providerFacade.createProvider(name, email, phoneNumber, iva, address);
		if(provider==null) return "providerRegistrationError";
		return "completedProviderRegistration"; 
	}
	
	public String findProvider() {
		this.provider = providerFacade.getProvider(id);
		return "provider";
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIva() {
		return iva;
	}

	public void setIva(String iva) {
		this.iva = iva;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
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

//	public List<Product> getInventory() {
//		return inventory;
//	}
//
//	public void setInventory(List<Product> inventory) {
//		this.inventory = inventory;
//	}

	
	
	
}
