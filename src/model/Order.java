package model;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="orders")
@NamedQuery(name="retrieveOrderById", query="SELECT o FROM Order o WHERE o.id = :id")
public class Order {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationTime;
	@Temporal(TemporalType.TIMESTAMP)
	private Date shippedDate;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(fetch=FetchType.EAGER, cascade={CascadeType.REMOVE})
	@JoinColumn(name="orders_id")
	private List<OrderLine> orderLines;

	
	public Order(){
	}
	
	public Order(Date creationTime, Customer customer){
		this.creationTime = creationTime;
		this.customer = customer;
		this.orderLines = new ArrayList<OrderLine>();
	}
	
	public void addOrderLine(OrderLine orderLine) {
		this.orderLines.add(orderLine);
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
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderLine> getOrderLines() {
		return orderLines;
	}

	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}

//	@Override
//	public int hashCode() {
//		return this.code.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Order order = (Order) obj;
//		return this.getCode().equals(order.getCode());
//	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", creationTime=" + creationTime
				+ ", shippedDate=" + shippedDate + "]";
	}
}
