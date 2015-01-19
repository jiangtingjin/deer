package com.etc.white.controller;

import javax.annotation.Resource;





import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.white.model.BwForum;

import com.etc.white.service.BwForumService;

@Controller
@RequestMapping("/bwForum")
public class BwForumController {
	
	@Resource
	private BwForumService bwForumService;
	
	@RequestMapping("/find")
	public String find(Long id,ModelMap modelMap){
		modelMap.addAttribute("bwForum",bwForumService.get(id));
		return "user-info";
	}
	
	@RequestMapping("/save")
	public String save(Long id, @ModelAttribute("user") BwForum bwForum){
		if(id!=null){
			this.bwForumService.update(bwForum);
		}
		else
		{
			this.bwForumService.save(bwForum);
		}
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id){
		this.bwForumService.delete(id);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/findlist")
	public String findAll(ModelMap modelMap){
		modelMap.addAttribute("bwForumList", this.bwForumService.findAll());
		return "user-list";
	}
	
}
