package com.tns.Userservice;

import javax.persistence.NoResultException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User_Service_Controller 
{
	private User_Service service;
	
	@GetMapping("/Userservice")
	public java.util.List<Users> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/Userservice/{U_id}")
	public ResponseEntity<Users> get(@PathVariable Integer U_id)
	{
		try
		{
			Users U=service.get(U_id);
			return new ResponseEntity<Users>(U,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Users>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/Userservice")
	public void add(@RequestBody Users U)
	{
		service.save(U);
	}
	
	@PutMapping("/Userservice")
	public ResponseEntity<?>update(@RequestBody Users u,@PathVariable Integer U_id)
	{
		Users existU=service.get(U_id);
		service.save(existU);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/Userservice/{U_id}")
	public void delete(@PathVariable Integer U_id)
	{
		service.delete(U_id);
	}
}
