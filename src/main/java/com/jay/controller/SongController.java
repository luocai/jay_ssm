package com.jay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jay.entity.Song;
import com.jay.entity.User;
import com.jay.service.SongService;

@Controller
public class SongController {

	@Autowired
	private SongService songService;
	
	@RequestMapping("queryAll")
	public ModelAndView quereyAll()
	{
		ModelAndView mlv = new ModelAndView();
		List<Song> list = songService.queryAll();
		
//System.out.println("这里可以执行呦");

		mlv.addObject("list", list);
		mlv.setViewName("queryAll");
		
		return mlv;
	}
	
	@RequestMapping("toAdd")
	public ModelAndView toAdd(){
		return new ModelAndView("add");
	}
	
	@RequestMapping("add")
	public ModelAndView add(Song s)
	{
		
		songService.add(s);
		return new ModelAndView("redirect:/queryAll");
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(Song s){
		songService.delete(s.getId());
//System.out.println("删除成功了");
		return new ModelAndView("redirect:/queryAll");
	}
	
	@RequestMapping("toEdit")
	public ModelAndView toEdit(Song s)
	{
		Song song = songService.queryById(s.getId());
		ModelAndView mlv = new ModelAndView();
		mlv.addObject(song);
		mlv.setViewName("edit");
		return mlv;
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(Song s){
System.out.println(s);
		songService.update(s);
		
		return new ModelAndView("redirect:/queryAll");
	}
	
	@RequestMapping("toLogin")
	public ModelAndView toLogin()
	{
		return new ModelAndView("login");
	}
	
	@RequestMapping("login") //此处需要修改哦
	public ModelAndView login(User user){
		boolean flag = songService.login(user.getUsername(), user.getPassword());
		String msg = null;
		if (flag == true)
			return new ModelAndView("redirect:/queryAll");
		else
		{
			msg = "账号或者密码错误";
			ModelAndView mlv = new ModelAndView();
			mlv.addObject("msg",msg);
			mlv.setViewName("login");
			return mlv;
		}
	}
	
	@RequestMapping("toRegister")
	public ModelAndView toRegister()
	{
		return new ModelAndView("register");
	}
	
	@RequestMapping("register")
	public ModelAndView register(User user)
	{
		songService.register(user);
		
		return new ModelAndView("login");
	}
	
}
