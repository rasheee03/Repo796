package com.lti.test;

import java.time.LocalDate;
import java.time.Year;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.RegistrationDao;
import com.lti.model.Login;
import com.lti.model.Registration;

public class registrationtest {

	@Test
	public void addUserTest(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("app-config.xml");
		RegistrationDao dao=(RegistrationDao)ctx.getBean("reg1");

		Registration r =new Registration();
		r.setCaptcha("xyzw");
		r.setCity("ahmedabad");
		r.setDateOfBirth(LocalDate.of(1997, 11, 3));
		r.setEmail("abc@gmail.com");
		
		r.setName("rashi");
		r.setMobile(999999999);
		r.setQualification("BE");
		r.setPassword("rrrrr");
		r.setState("gujarat");
		r.setRole("ROLE_USER");
		r.setYear_of_completion(Year.of(2019));
		
		dao.addNewUser(r);
		
		
		Login l=new Login();
		l.setEmail(r.getEmail());
		l.setPassword(r.getPassword());
		
		r.setLogin(l);
	}
}
