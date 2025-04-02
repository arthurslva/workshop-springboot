package com.educandoweb.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository Repository;

	public List<User> findAll() {
		return Repository.findAll();

	}
	
	public User findById(Long id){
		Optional<User> obj = Repository.findById(id);
		return obj.get();
	}

}
