package model;

import javax.persistence.*;

import java.util.*;

	@Entity
	public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String country; 
	
	public Address(){
	}
	
	public Address(String street, String city, String state, String zipcode, String country){
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
		}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	@Override
	public int hashCode() {
		return this.street.hashCode()+this.zipcode.hashCode();
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		Address a = (Address) obj;
		return this.getStreet().equals(a.getStreet())&& this.getZipcode().equals(a.getZipcode());
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + ", country="
				+ country + "]";
	}
}
