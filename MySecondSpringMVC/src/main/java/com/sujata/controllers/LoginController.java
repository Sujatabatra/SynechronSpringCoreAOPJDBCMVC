package com.sujata.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.User;
import com.sujata.model.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String openingController(){
		return "index";
	}

	@RequestMapping("/login")
	public ModelAndView loginCheckController(HttpServletRequest request,HttpSession session){
		ModelAndView modelandView=new ModelAndView();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		session.setAttribute("username", username);
		User user=new User(username, password);
		String message=null;
		if(userService.checkLogin(user))
			message="Login Successful!!!";
		else
			message="Login Failed!!!";
		modelandView.addObject("message", message);
//		modelandView.addObject("username", username);
		modelandView.setViewName("result");
		
		return modelandView;
	}
}
