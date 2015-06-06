
package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@NamedQuery(name = "retrieveCustomerByEmail", query = "SELECT c FROM Customer c WHERE c.email = :email")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String firstname;
	@Column(nullable = false)
	private String lastname;
	@Column(nullable = false)
	private String dateOfBirth;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String password;
	
	@OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="address_fk")
	private Address address;
	
	public Customer(){
	}
	
	public Customer(String firstname, String lastname, String dateOfBirth, String email, String password, Address address){
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.password = password;
		this.address = address;
		
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public boolean checkPassword(String password) {
		return this.getPassword().equals(password);
	}
	
	@Override
	public int hashCode() {
		return this.getEmail().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Customer c = (Customer) obj;
		return this.getEmail().equals(c.getEmail());
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	
}
