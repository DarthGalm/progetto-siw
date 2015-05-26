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
	@PersistenceContext(unitName = "db_progetto")
    private EntityManager em;

	public Customer createCustomer(String firstname, String lastname, Date dateOfBirth, String email, String password, Address address ) {
		Customer customer = new Customer();
		em.persist(customer);
		return customer;
	}
}
