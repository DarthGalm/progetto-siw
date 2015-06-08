package model;

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
public class LoginFacade {
	
	@PersistenceContext(unitName = "progetto-unit")
    private EntityManager em;
	
	
	public Customer customerLogin(String email, String password) {
		TypedQuery<Customer> query = em.createNamedQuery("retrieveCustomerByEmail", Customer.class);
		try{
		Customer customer = query.setParameter("email", email).getSingleResult();
		if(customer.checkPassword(password))
			return customer;
		else
			return null;
		} catch(NoResultException e) {
			return null;
		}
	}
	
	public Admin adminLogin(String email, String password) {
		TypedQuery<Admin> query = em.createNamedQuery("retrieveAdminByEmail", Admin.class);
		try{
		Admin admin = query.setParameter("email", email).getSingleResult();
		if(admin.checkPassword(password))
			return admin;
		else
			return null;
		} catch(NoResultException e) {
			return null;
		}
	}
	
	
	

}
