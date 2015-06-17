package controller;

import java.util.Date;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.Column;

import model.*;

@ManagedBean
@SessionScoped
public class OrderController {
	
	private Long id;
	private Date creationTime;
	private Date shippedDate;
	private Order order;
	private String productName;
	private String productCode;
	private Integer quantity;
	private Long unitPrice;
	private Long totalPrice; 
	private OrderLine orderLine;
	private Product product;
	private String customerEmail;
	private Customer customer;
	
	@EJB
	private OrderFacade orderFacade;
	
	@EJB
	private ProductFacade productFacade;
	
	@EJB
	private CustomerFacade customerFacade;
	
	public String createOrder() {
	this.product = productFacade.retrieveProductByCode (productCode);
	if(quantity>product.getStockQuantity()) return "quantityError";
//	this.customer = customerFacade.retrieveCustomerByEmail(customerEmail); //ERRORE NULLPOINTER EXCEPTION	
//	if(customer==null) return "genericError";
	if(!FacesContext.getCurrentInstance().getExternalContext().getSessionMap().containsKey("order")) {
	this.order = orderFacade.createOrder(customer);
	FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("order", this.order);
/*	this.customer.addOrder(this.order); 	//ERRORE NULLPOINTER EXCEPTION */	
	this.orderLine = orderFacade.addOrderLine(quantity, product, order);
	Integer quantityLeft=(product.getStockQuantity()-quantity);
	product.setStockQuantity(quantityLeft);
	productFacade.updateProduct(product);
			}
	else{
		this.orderLine = orderFacade.addOrderLine(quantity, product, order);
		Integer quantityLeft=(product.getStockQuantity()-quantity);
		product.setStockQuantity(quantityLeft);
		productFacade.updateProduct(product);
	}
//	if(order==null && orderLine==null) return "genericError";
	return "orderCompleted";
//	return "test";
	}
	
	public String closeOrder() {
		FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
		return "success";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public CustomerFacade getCustomerFacade() {
		return customerFacade;
	}

	public void setCustomerFacade(CustomerFacade customerFacade) {
		this.customerFacade = customerFacade;
	}

	public Long getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public OrderLine getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(OrderLine orderLine) {
		this.orderLine = orderLine;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public OrderFacade getOrderFacade() {
		return orderFacade;
	}

	public void setOrderFacade(OrderFacade orderFacade) {
		this.orderFacade = orderFacade;
	}

	public ProductFacade getProductFacade() {
		return productFacade;
	}

	public void setProductFacade(ProductFacade productFacade) {
		this.productFacade = productFacade;
	}


	
	

}
