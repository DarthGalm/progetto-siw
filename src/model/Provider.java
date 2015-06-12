package model;

import java.util.List;

import javax.persistence.*;

@Entity
@NamedQuery(name = "retrieveProviderByEmail", query = "SELECT prov FROM Provider prov WHERE prov.email = :email")
public class Provider {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	public String firstName;
	@Column(nullable = false)
	public String lastName;
	@Column (nullable = false)
	public String email;
	@Column (nullable = false)
	public String phoneNumber;
	@Column (nullable = false)
	public String iva;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name="address_fk")
	private Address address;
	
//  @ManyToMany
//	private List<Product> inventory;
	
	public Provider(){
	}
	
	public Provider(String firstName, String lastName, String email, String phoneNumber, String iva, Address address){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.iva = iva;
		this.address = address;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
//	public List<Product> getInventory() {
//	return inventory;
//}
//
//public void setInventory(List<Product> inventory) {
//	this.inventory = inventory;
//}

	@Override
	public int hashCode() {
		return this.getEmail().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Provider prov = (Provider) obj;
		return this.getEmail().equals(prov.getEmail());
	}
	
	@Override
	public String toString() {
		return "Provider [id=" + id + ", firstName=" + firstName + ",  lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", iva=" + iva + "]";
	}

	
}
