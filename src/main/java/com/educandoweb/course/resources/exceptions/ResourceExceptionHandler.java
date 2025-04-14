package com.educandoweb.course.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.educandoweb.course.service.exceptions.DataBaseException;
import com.educandoweb.course.service.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> erros (ResourceNotFoundException e, HttpServletRequest request){
		String erro = "Resource not found ";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), erro, e.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(status).body(err);
	}
	
	@ExceptionHandler(DataBaseException.class)
	public ResponseEntity<StandardError> dataBase (DataBaseException e, HttpServletRequest request){
		String erro = "DataBase Error ";
		HttpStatus stats = HttpStatus.BAD_REQUEST;
		StandardError err = new StandardError(Instant.now(), stats.value(), erro, e.getMessage(), request.getRequestURI());
		
		return ResponseEntity.status(stats).body(err);

}
	}
