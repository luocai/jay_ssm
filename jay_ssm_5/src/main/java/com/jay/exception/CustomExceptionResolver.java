package com.jay.exception;

import javax.security.auth.login.AccountNotFoundException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomExceptionResolver implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
			Exception e) {
		
		ModelAndView mlv = new ModelAndView();
		CustomException customException;
		
		if (e instanceof CustomException){
			customException = (CustomException)e;
		}else if (e instanceof UnknownAccountException){
			mlv.addObject("message", "账号不存在");
			mlv.setViewName("error");
			return mlv;
		}else if (e instanceof IncorrectCredentialsException){
			mlv.addObject("message", "密码错误");
			mlv.setViewName("error");
			return mlv;
		}else{
			customException = new CustomException("未知错误");
		}
		
		String message = customException.getMessage();
		
		mlv.addObject("message", message);
		mlv.setViewName("error");
		return mlv;
	}

}
