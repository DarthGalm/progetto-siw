package model;

import model.Product;

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
public class ProductFacade {
	
	@PersistenceContext(unitName = "progetto-unit")
    private EntityManager em;

	public Product createProduct(String name, String code, String price, String description, String stockQuantity){
		Product product = new Product(name, code, price, description, stockQuantity);
		em.persist(product);
		return product;
	}
	
}
