package com.tns.Userservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class User_Service 
{
	@Autowired
	private User_Service_Repository repo;
	
	public List<Users> listAll()
	{
		return repo.findAll();
	}
	
	public void save (Users U)
	{
		repo.save(U);
	}
	
	public Users get(Integer U_id)
	{
		return repo.findById(U_id).get();
	}
	public void delete(Integer U_id)
	{
		repo.deleteById(U_id);
	}
}
