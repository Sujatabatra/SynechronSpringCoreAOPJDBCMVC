package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyFirstController {
	
	@RequestMapping("/first")
	public ModelAndView firstController(){
		String message="Welcome to the world of Spring MVC from first!!";
		return new ModelAndView("index.jsp", "msg", message);
	}
	
	@RequestMapping("/second")
	public ModelAndView secondController(){
		ModelAndView mv=new ModelAndView();
		String message="Welcome to the world of Spring MVC from second!!";
		
		mv.addObject("msg", message);
		mv.setViewName("index.jsp");
		
		return mv;
	}
	
	@RequestMapping("/third")
	public ModelAndView thirdController(){
		String message="Welcome to the world of Spring MVC from Third!!";
		return new ModelAndView("index.jsp", "msg", message);
	}
	

}
