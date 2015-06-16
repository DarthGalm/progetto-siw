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
	
	public Order createOrder(Integer productQuantity, Product product, Long id){
		Order order;
		if(id==0) {
			order = new Order(new java.util.Date());
		} else {
			TypedQuery<Order> query = em.createNamedQuery("retrieveOrderById", Order.class);
			order = query.setParameter("id", id).getSingleResult();
		}
		
		OrderLine orderLine = new OrderLine(product.getName(), product.getCode(), productQuantity, product.getPrice());
		orderLine.setTotalPrice(productQuantity*product.getPrice());
		orderLine.setProduct(product);
		
		List<OrderLine> orderLineList = order.getOrderLines();
		orderLineList.add(orderLine);
		order.setOrderLines(orderLineList);
		return null;
		
		
		
	}

}
