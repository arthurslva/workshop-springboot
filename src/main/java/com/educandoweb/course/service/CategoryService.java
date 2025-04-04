package com.educandoweb.course.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	public CategoryRepository category;
	
	public List<Category> findAll(){
		return category.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = category.findById(id);
		return obj.get();
	}

}
