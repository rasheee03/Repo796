package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Registration;

@Component("reg1")
public class RegistrationDao {
	
	
	//@autowired doesnt work for injecting entity manager object
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addNewUser(Registration registration)
	{
		entityManager.persist(registration);
	}
	
	


}
