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
public class OrderFacade {
	
	@PersistenceContext(unitName = "progetto-unit")
	private EntityManager em;
	
	public Order createOrder(Integer productQuantity, Product product){
		TypedQuery<Order> 
		
	}

}
