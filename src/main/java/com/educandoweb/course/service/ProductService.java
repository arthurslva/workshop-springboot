package com.educandoweb.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepository product;
	
	public List<Product> findAll(){
		return product.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = product.findById(id);
		return obj.get();
	}

}
