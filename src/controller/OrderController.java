package controller;

import java.util.Date;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.Column;

import model.*;

@ManagedBean
@SessionScoped
public class OrderController {
	
	private Long id;
	private String code;
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
	private Customer customer;
	
	@EJB
	private OrderFacade orderFacade;
	
	@EJB
	private ProductFacade productFacade;
	
	@EJB
	private CustomerFacade customerFacade;
	
	public String createOrder(){ return "";}
	
	

}
