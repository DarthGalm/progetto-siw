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

	public Product createProduct(String name, String code, Long price, String description, Integer stockQuantity){
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
	
	public List<Product> getAllProductsCustomer() {
		TypedQuery<Product> query = em.createNamedQuery("findAllProducts", Product.class);
		List <Product> inventoryCustomer = query.getResultList();
		return inventoryCustomer;
	}
	
	public Product getProduct(Long id) {
    Product product = em.find(Product.class, id);
	return product;
	}
	
	public Product retrieveProductByCode(String code) {
		TypedQuery<Product> query = em.createNamedQuery("retrieveProductByCode", Product.class);
		try{
			Product product = query.setParameter("code", code).getSingleResult();
			return product;
		} catch(NoResultException e) {
		return null; 
		}
	}
	
	public List<Provider> findProvidersForProduct(Product product) {
		TypedQuery<Provider> query = em.createNamedQuery("findProvidersForProduct", Provider.class);
		List<Provider> providers = query.setParameter("id", product.getId()).getResultList();
		return providers;
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
