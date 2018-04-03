package com.jay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jay.entity.PageBean;
import com.jay.entity.Song;
import com.jay.service.SongService;

@Controller
@RequestMapping("/visitor")
public class VisitorController {

	@Autowired
	private SongService songService;
	
	@RequestMapping("visitorQueryAll")
	public String visitorQueryAll(Model model, PageBean pb)throws Exception{
		
		List<Song> l = songService.queryAll();
		pb.setTotalRecord(l.size());
		pb.caculateSomeProperty();
		
		List<Song> list = songService.queryByPage(pb);
		model.addAttribute("list", list);
		model.addAttribute("page", pb);
		
		return "/visitor/visitorQueryAll";
	}
	
	@RequestMapping(value = "selectByName")
	public ModelAndView findByName(String name)throws Exception{
		
		List<Song> list = songService.findByName(name);
		
		ModelAndView mlv = new ModelAndView();
		
		mlv.addObject("list", list);
		mlv.setViewName("/visitor/visitorQueryAll");
		
		return mlv;
	}
}
