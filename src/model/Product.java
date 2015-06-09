package model;

import javax.persistence.*;

@Entity
public class Product {
	
	@Id 
	private Long id;
	
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String code;
	@Column(nullable = false)
	private Float price;
	@Column(nullable = false)
	private String description;
	@Column(nullable = false)
	private Integer stockQuantity;
	
	public Product(){}
	
	public Product(String name, String code, Float price, String description, Integer stockQuantity) {
		this.name=name;
		this.code=code;
		this.price=price;
		this.description=description;
		this.stockQuantity=stockQuantity;
	}

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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	@Override
	public int hashCode() {
		return this.code.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Product prod = (Product) obj;
		return this.getCode().equals(prod.getCode());
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", code=" + code
				+ ", price=" + price + ", description=" + description
				+ ", stockQuantity=" + stockQuantity + "]";
	}
}