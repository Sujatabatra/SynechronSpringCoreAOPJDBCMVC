package com.sujata.controllers;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.bean.User;
import com.sujata.model.service.UserService;

@Controller
@SessionAttributes({"username"}) //if we are puting any attributes on session scope using @SessionAttributes Annotation, then that attribute must be on request scope
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public ModelAndView openingController(){
//		command is the default name
//		return new ModelAndView("index", "command", new User());
		return new ModelAndView("index", "user", new User());
	}

	@RequestMapping("/login")
	public ModelAndView loginCheckController(@ModelAttribute("user") User user/*,HttpSession session*/){
		ModelAndView modelandView=new ModelAndView();
		System.out.println(user);
		
//		session.setAttribute("username", user.getUserName());
		
		String message=null;
		if(userService.checkLogin(user))
			message="Login Successful!!";
		else
			message="Login Failed!!";
		modelandView.addObject("message", message);
		modelandView.addObject("username", user.getUserName());
		modelandView.setViewName("result");
		
		return modelandView;
	}
	
	@ModelAttribute("myusers")
	public Set<String> getUserNames(){
		Set<String> users=userService.getAllUserNamesOnly();
		return users;
	}
}
