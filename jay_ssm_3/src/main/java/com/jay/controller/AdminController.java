package com.jay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jay.entity.PageBean;
import com.jay.entity.Song;
import com.jay.entity.User;
import com.jay.service.SongService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private SongService songService;
	
	@RequestMapping("queryAll")
	public ModelAndView quereyAll(PageBean pb)
	{
		ModelAndView mlv = new ModelAndView();
		List<Song> l = songService.queryAll();
		int totalRecord = l.size();
		
		pb.setTotalRecord(totalRecord);
		pb.caculateSomeProperty();
		List<Song> list = songService.queryByPage(pb);
		
		mlv.addObject("list", list);
		mlv.addObject("page", pb);
		mlv.setViewName("queryAll");
//System.out.println("已经进入controller");
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
		return new ModelAndView("redirect:/admin/queryAll");
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(Song s){
		songService.delete(s.getId());
//System.out.println("ɾ���ɹ���");
		return new ModelAndView("redirect:/admin/queryAll");
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
		
		return new ModelAndView("redirect:/admin/queryAll");
	}
	
	
	
	@RequestMapping(value = "findByName")
	public ModelAndView findByName(String name){
		
		List<Song> list = songService.findByName(name);
		
		ModelAndView mlv = new ModelAndView();
		
		mlv.addObject("list", list);
		mlv.setViewName("queryAll");
		
		return mlv;
	}
	
}
