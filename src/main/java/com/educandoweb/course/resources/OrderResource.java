package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.service.OrderService;

@RestController
@RequestMapping(value = "/order")

public class OrderResource {
	
	@Autowired
	public OrderService orderservice;
	
	@GetMapping
	public ResponseEntity <List<Order>> findAll(){
		List<Order> list = orderservice.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity <Order> findById(@PathVariable Long id) {
		Order obj = orderservice.findById(id);
		return ResponseEntity.ok().body(obj);
	
		
	}

}
