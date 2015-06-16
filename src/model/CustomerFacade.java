package model;

import model.Customer;
import model.Address;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;

import java.util.Date;
import java.util.List;

@Stateless
public class CustomerFacade {
	
	@PersistenceContext(unitName = "progetto-unit")
    private EntityManager em;
	
	public String createDateOfBirth(String day, String month, String year) {
		//String s = "//";
		return day + "//" + month +"//" + year;
		
	}
	public Address createAddress(String street, String city, String state, String zipcode, String country) {
		Address address = new Address(street, city, state, zipcode, country);
		return address;
	}

	public Customer createCustomer(String firstname, String lastname, String dateOfBirth, String email, String password, Address address) {
		TypedQuery<Customer> query = em.createNamedQuery("retrieveCustomerByEmail", Customer.class);
		try{
			Customer customer = query.setParameter("email", email).getSingleResult();
			return null;
		} catch(NoResultException e) {
		Customer customer = new Customer(firstname, lastname, dateOfBirth, email, password, address);
		em.persist(customer);
		return customer; 
		}
	}
	
//	public Customer login(String email, String password) {
//		TypedQuery<Customer> query = em.createNamedQuery("retrieveCustomerByEmail", Customer.class);
//		try{
//		Customer customer = query.setParameter("email", email).getSingleResult();
//		if(customer.checkPassword(password))
//			return customer;
//		else
//			return null;
//		} catch(NoResultException e) {
//			return null;
//		}
//	}
	
	public Customer getCustomer(Long id) {
	    Customer customer = em.find(Customer.class, id);
		return customer;
	}
	
	public Customer retrieveCustomerByEmail(String email) {
		TypedQuery<Customer> query = em.createNamedQuery("retrieveCustomerByEmail", Customer.class);
		Customer customer = query.setParameter("email", email).getSingleResult();
		return customer;
	}
	
}
