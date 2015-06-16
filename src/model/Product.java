package model;

import java.util.List;

import javax.persistence.*;

@Entity
@NamedQueries({
@NamedQuery(name = "findAllProducts", query = "SELECT p FROM Product p"),
@NamedQuery(name = "retrieveProductByCode", query = "SELECT prod FROM Product prod WHERE prod.code = :code"), 
//@NamedQuery(name="findProvidersForProduct", query="SELECT DISTINCT p.providers FROM Product p WHERE p.id = :id")
@NamedQuery(name="findProvidersForProduct", query="SELECT DISTINCT prov FROM Product prod JOIN prod.providers prov WHERE prod = :product")
})
																															//AND prov IN prod.providers
public class Product {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String code;
	@Column(nullable = false)
	private Long price;
	@Column(nullable = false)
	private String description;
	@Column(nullable = false)
	private Integer stockQuantity;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade={CascadeType.ALL})
	private List<Provider> providers;
	
	public Product(){}
	
	public Product(String name, String code, Long price, String description, Integer stockQuantity) {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
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