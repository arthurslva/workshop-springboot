package com.educandoweb.course.entities.pk;

import java.io.Serializable;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "produc_id")
	private Product produtc;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	public Product getProdutc() {
		return produtc;
	}
	public void setProdutc(Product produtc) {
		this.produtc = produtc;
	}
	public Order getOrder() {
		return order;
	}
	public Order setOrder(Order order) {
		this.order = order;
	}
	
	
	
	

}
