package model;
import model.Customer;
import model.Address;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import java.util.Date;
import java.util.List;

@Stateless
public class CustomerFacade {
	
	@PersistenceContext(unitName = "progetto-unit")
    private EntityManager em;
	
	public Address createAddress(String street, String city, String state, String zipcode, String country) {
		Address address = new Address(street, city, state, zipcode, country);
		return address;
	}

	public Customer createCustomer(String firstname, String lastname, String dateOfBirth, String email, String password, Address address) {
		Customer customer = new Customer(firstname, lastname, dateOfBirth, email, password, address);
		em.persist(customer);
		return customer;
	}
	
	public Customer getCustomer(Long id) {
	    Customer customer = em.find(Customer.class, id);
		return customer;
	}
	
}
