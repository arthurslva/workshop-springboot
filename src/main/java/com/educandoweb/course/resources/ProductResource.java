package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.service.ProductService;

@RestController
@RequestMapping(value="/product")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity <List<Product>> findAll(){
		List<Product> lista = productService.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity <Product> findById(@PathVariable Long id){
		Product obj = productService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
