package com.educandoweb.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	public OrderRepository Repository;

	public List<Order> findAll() {
		return Repository.findAll();

	}

	public Order findById(Long id) {
		Optional<Order> obj = Repository.findById(id);
		return obj.get();
	}

}
