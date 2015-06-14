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
	String quantity;
	@Column(nullable = false)
	String unitPrice;
	
	@ManyToOne
	private Order order;
	
	@OneToOne
	@JoinColumn(name="product_fk")
	private Product product;

	public OrderLine() {
	}
	
	public OrderLine(String productName, String productCode,String quantity, String unitPrice){
		this.productName = productName;
		this.productCode = productCode;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
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

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
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
