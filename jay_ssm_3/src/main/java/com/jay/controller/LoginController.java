package com.jay.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jay.entity.User;
import com.jay.service.SongService;
import com.jay.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private SongService songService;
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "login", method = {RequestMethod.GET})
	public ModelAndView toLogin()
	{
		return new ModelAndView("../login");
	}
	
	@RequestMapping(value = "login", method = {RequestMethod.POST}) 
	public ModelAndView login(User user){
		
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
		Subject subject = SecurityUtils.getSubject();
		
		subject.login(token);
		
		if (subject.hasRole("client")){
System.out.println("client");
			return new ModelAndView("redirect:/admin/queryAll");
		}
		
		return new ModelAndView("login");
	}
	
	@RequestMapping(value = "register", method = {RequestMethod.GET})
	public ModelAndView toRegister()
	{
		return new ModelAndView("register");
	}
	
	@RequestMapping(value = "register", method = {RequestMethod.POST})
	public ModelAndView register(User user)
	{
		userService.add(user);
		
		return new ModelAndView("login");
	}
}
