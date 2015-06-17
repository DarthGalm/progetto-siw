package model;

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
public class OrderFacade {
	
	@PersistenceContext(unitName = "progetto-unit")
	private EntityManager em;
	
	public Order createOrder(Customer customer){
		Order order = new Order(new java.util.Date(), customer);
		em.persist(order);
		return order;
		}
	
	public OrderLine addOrderLine(Integer productQuantity, Product product, Order order) {
		OrderLine orderLine = new OrderLine(product.getName(), product.getCode(), productQuantity, product.getPrice());
		orderLine.setProduct(product);
		orderLine.setOrder(order);
		order.addOrderLine(orderLine);
		em.persist(orderLine);
		return orderLine;
	}
	
	public List<Order> getAllOrders() {
		TypedQuery<Order> query = em.createNamedQuery("findAllOrders", Order.class);
		List <Order> orders = query.getResultList();
		return orders;
	}
	
	public Order closeOrderAdmin(Long id) {
	    Order order = em.find(Order.class, id);
	    order.setShippedDate(new java.util.Date());
		return order;
	}
	
	public List<Order> getAllOrdersCustomer(Long customerId) {
		TypedQuery<Order> query = em.createNamedQuery("findAllOrdersForCustomer", Order.class);
		List <Order> orders = query.setParameter("id", customerId).getResultList();
		return orders;	
	}
	
	public List<OrderLine> getAllOrderLinesCustomer(Long orderId) {
		TypedQuery<Order> query = em.createNamedQuery("retrieveOrderById", Order.class);
		Order order = query.setParameter("id", orderId).getSingleResult();
		List<OrderLine> orderLines = order.getOrderLines();
		return orderLines;	
	}
	
	public void updateOrder(Order order) {
		em.merge(order);
	}
	

}
