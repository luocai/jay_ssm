package com.jay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jay.entity.PageBean;
import com.jay.entity.Song;
import com.jay.service.SongService;

@Controller
@RequestMapping("/visitor")
public class VisitorController {

	@Autowired
	private SongService songService;
	
	@RequestMapping("visitorQueryAll")
	public String visitorQueryAll(Model model,@RequestParam(required=true,defaultValue="5")Integer page, @RequestParam(required=false,defaultValue="5")Integer pageSize)throws Exception{
		
		PageHelper.startPage(page, pageSize);
		List<Song> list = songService.query();
		PageInfo<Song> pageInfo = new PageInfo<Song>(list,5);
		

		model.addAttribute("list", list);
		model.addAttribute("page", pageInfo);
		
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
