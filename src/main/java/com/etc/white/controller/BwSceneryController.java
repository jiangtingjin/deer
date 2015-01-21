package com.etc.white.controller;

import javax.annotation.Resource;




import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.white.model.BwScenery;

import com.etc.white.service.BwSceneryService;


@Controller
@RequestMapping("/bwScenery")
public class BwSceneryController {
	
	@Resource
	private BwSceneryService bwSceneryService;
	
	@RequestMapping("/find")
	public String find(Long id,ModelMap modelMap){
		modelMap.addAttribute("bwScenery",bwSceneryService.get(id));
		return "user-info";
	}
	
	@RequestMapping("/save")
	public String save(Long id, @ModelAttribute("user") BwScenery bwScenery){
		if(id!=null){
			this.bwSceneryService.update(bwScenery);
		}
		else
		{
			this.bwSceneryService.save(bwScenery);
		}
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id){
		this.bwSceneryService.delete(id);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/findlist")
	public String findAll(ModelMap modelMap){
		modelMap.addAttribute("bwSceneryList", this.bwSceneryService.findAll());
		modelMap.put("type","scenery");
		return "admin/main";
	}
	
}
