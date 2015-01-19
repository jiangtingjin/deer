package com.etc.white.controller;

import javax.annotation.Resource;





import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.white.model.BwNews;

import com.etc.white.service.BwNewsService;


@Controller
@RequestMapping("/bwNews")
public class BwNewsController {
	
	@Resource
	private BwNewsService bwNewsService;
	
	@RequestMapping("/find")
	public String find(Long id,ModelMap modelMap){
		modelMap.addAttribute("bwNews",bwNewsService.get(id));
		return "user-info";
	}
	
	@RequestMapping("/save")
	public String save(Long id, @ModelAttribute("user") BwNews bwNews){
		if(id!=null){
			this.bwNewsService.update(bwNews);
		}
		else
		{
			this.bwNewsService.save(bwNews);
		}
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id){
		this.bwNewsService.delete(id);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/findlist")
	public String findAll(ModelMap modelMap){
		modelMap.addAttribute("bwNewsList", this.bwNewsService.findAll());
		return "user-list";
	}
	
}