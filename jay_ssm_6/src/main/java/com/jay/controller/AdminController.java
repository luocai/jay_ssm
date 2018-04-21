package com.jay.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
	public ModelAndView quereyAll(@RequestParam(required=true, defaultValue = "1")Integer page, @RequestParam(required=false,defaultValue="5")Integer pageSize)throws Exception{
		ModelAndView mlv = new ModelAndView();
		PageHelper.startPage(page, pageSize);
		List<Song> list = songService.query();
		// public PageInfo(List<T> list, int navigatePages) 指定导航页数目
		PageInfo<Song> pageInfo = new PageInfo<Song>(list,5);
//		pageInfo.setSize(6);

//		pageInfo.setNavigateLastPage(5);
System.out.println(pageInfo);		
		
//		if (pageInfo.getPageNum() == 1){
//			pageInfo.setNavigateFirstPage(1);
//			pageInfo.setNavigateLastPage(5);
//		}else if(pageInfo.getPageNum() >1 && pageInfo.getPageNum() <pageInfo.getPages()){
//			pageInfo.setNavigateFirstPage(navigateFirstPage);
//		}
//		
		mlv.addObject("list", list);
		mlv.addObject("pageInfo", pageInfo);
		mlv.setViewName("/admin/queryAll");
//System.out.println("已经进入controller");
		return mlv;
	}
	
	@RequestMapping("toAdd")
	public ModelAndView toAdd()throws Exception{
		return new ModelAndView("/admin/add");
	}
	
	@RequestMapping("add")
	public ModelAndView add(Song s)throws Exception{
		
		songService.add(s);
		return new ModelAndView("redirect:/admin/queryAll");
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(Song s)throws Exception{
		songService.delete(s.getId());
//System.out.println("ɾ���ɹ���");
		return new ModelAndView("redirect:/admin/queryAll");
	}
	
	@RequestMapping("toEdit")
	public ModelAndView toEdit(Song s)throws Exception{
		Song song = songService.queryById(s.getId());
		ModelAndView mlv = new ModelAndView();
		mlv.addObject(song);
		mlv.setViewName("/admin/edit");
		return mlv;
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(Song s)throws Exception{

		songService.update(s);

		return new ModelAndView("redirect:/admin/queryAll");
	}
	
	
	
	@RequestMapping(value = "findByName")
	public ModelAndView findByName(String name) throws Exception{
		
		List<Song> list = songService.findByName(name);
		
		ModelAndView mlv = new ModelAndView();
		
		mlv.addObject("list", list);
		mlv.setViewName("/admin/queryAll");
		
		return mlv;
	}
	
}
