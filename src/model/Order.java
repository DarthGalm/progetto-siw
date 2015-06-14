package model;

import javax.persistence.*;

import java.util.Date;

@Entity
public class Order {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private String code;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationTime;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date closingTime;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date shippedDate;
	
	@ManyToOne
	private Customer customer;

	
	public Order(){
	}
	
	public Order(String code, Date creationTime) {
		this.code = code;
		this.creationTime = creationTime;
	}
	public Order(Date creationTime){
		this.creationTime = creationTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}
	
	
	public Date getClosingTime() {
		return closingTime;
	}

	public void setClosingTime(Date closingTime) {
		this.closingTime = closingTime;
	}

	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	@Override
	public int hashCode() {
		return this.code.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Order order = (Order) obj;
		return this.getCode().equals(order.getCode());
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", creationTime=" + creationTime
				+ ", closingTime=" + closingTime + ", shippedDate=" + shippedDate
			 + "]";
	}
}
