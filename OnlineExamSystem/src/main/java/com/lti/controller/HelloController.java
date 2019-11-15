package com.lti.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	
	@RequestMapping("/hello.lti")
	public String hello(Map model)                    //return type hona jaruri hai , bcoz it will return some resource

	{
		model.put("message","hello LTIties");
		return "hello1.jsp";
	}
}
