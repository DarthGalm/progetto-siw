package model;

import java.util.List;

import javax.persistence.*;

@Entity
public class OrderLine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	String productName;
	@Column(nullable = false)
	String productCode;
	@Column(nullable = false)
	Integer quantity;
	@Column(nullable = false)
	Long unitPrice;
	@Column(nullable=false)
	Long totalPrice; 
	
	@ManyToOne
	private Order order;
	
	@OneToOne
	@JoinColumn(name="product_fk")
	private Product product;

	public OrderLine() {
	}
	
	public OrderLine(String productName, String productCode, Integer quantity, Long unitPrice){
		this.productName = productName;
		this.productCode = productCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalPrice = quantity*unitPrice;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public int hashCode() {
		return this.getProductCode().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		OrderLine orderline = (OrderLine) obj;
		return this.getProductCode().equals(orderline.getProductCode());
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productCode=" + productCode
				+ ", quantity=" + quantity + ", unitPrice=" + unitPrice
			 + "]";
	
	}
}
