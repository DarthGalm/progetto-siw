package controller;

import java.util.List;

import model.ProductFacade;
import model.Product;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean
public class ProductController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String name;
	private String code;
	private String price;
	private String description;
	private String stockQuantity;
	private Product product;
	private List<Product> inventory;
	
	@EJB
	private ProductFacade productFacade;
	
	public String createProduct() {
		this.product = productFacade.createProduct(name, code, price, description, stockQuantity);
		if(product==null) return "productCreationError";
		return "completedProductCreation"; 
	}

	public String listProducts() { 
		this.inventory = productFacade.getAllProducts();
		return "inventory"; 
	}
	
	public String findProduct() {
		this.product = productFacade.getProduct(id);
		return "productDetails";
	}
	
//	public String findProduct(String code) {
//		this.product = productFacade.getProduct(code);
//		return "completedProductCreation";
//	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(String stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<Product> getInventory() {
		return inventory;
	}

	public void setInventory(List<Product> inventory) {
		this.inventory = inventory;
	}
	
}