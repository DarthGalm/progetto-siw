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
	

	public void productJoinProvider(Provider provider, Product product) {
		List<Provider> providers = product.getProviders();
		providers.add(provider);
		product.setProviders(providers);
		this.updateProduct(product);
	}
	
	public List<Product> getAllProducts() {
		TypedQuery<Product> query = em.createNamedQuery("findAllProducts", Product.class);
		List <Product> inventory = query.getResultList();
		return inventory;
//        CriteriaQuery<Product> cq = em.getCriteriaBuilder().createQuery(Product.class);
//        cq.select(cq.from(Product.class));
//        List<Product> products = em.createQuery(cq).getResultList();
//		return products;
	}
	
	public Product getProduct(Long id) {
    Product product = em.find(Product.class, id);
	return product;
	}
	
	public Product retrieveProductByCode(String code) {
		Product product = em.find(Product.class, code);
		return product;
	}

	public void updateProduct(Product product) {
        em.merge(product);
	}
	
//    private void deleteProduct(Product product) {
//        em.remove(product);
//    }
//
//	public void deleteProduct(String code) {
//        Product product = em.find(Product.class, code);
//        deleteProduct(product);
//	}
}
