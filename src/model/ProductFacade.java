package model;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

import java.util.List;

@Stateless
public class ProductFacade {
	
	@PersistenceContext(unitName = "progetto-siw")
    private EntityManager em;
    
	public Product createProduct(String name, String code, Float price, String description, Integer stockQuantity) {
		Product product = new Product(name, code, price, description, stockQuantity);
		em.persist(product);
		return product;
	}
	
	public Product getProduct(Long code) {
	    Product product = em.find(Product.class, code);
		return product;
	}
	
	public void updateProduct(Product product){
		em.merge (product);
	}
	
	public void deleteProduct(Product product){
		em.remove(product);
	}
	
	public void deleteProduct(String code){
		Product product = em.find(Product.class, code);
		deleteProduct(product);
	}

	
}
