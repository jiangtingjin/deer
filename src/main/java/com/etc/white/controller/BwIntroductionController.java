package com.etc.white.controller;

import javax.annotation.Resource;





import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.white.model.BwIntroduction;

import com.etc.white.service.BwIntroductionService;


@Controller
@RequestMapping("/bwIntroduction")
public class BwIntroductionController {
	
	@Resource
	private BwIntroductionService bwIntroductionService;
	
	@RequestMapping("/find")
	public String find(Long id,ModelMap modelMap){
		modelMap.addAttribute("bwIntroduction",bwIntroductionService.get(id));
		return "user-info";
	}
	
	@RequestMapping("/save")
	public String save(Long id, @ModelAttribute("user") BwIntroduction bwIntroduction,ModelMap modelMap){
		/*if(id!=null){
			this.bwIntroductionService.update(bwIntroduction);
		}
		else
		{
			this.bwIntroductionService.save(bwIntroduction);
		}*/
		modelMap.put("type","introductionAdd");
		return "admin/main";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id){
		this.bwIntroductionService.delete(id);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/findlist")
	public String findAll(ModelMap modelMap){
		modelMap.addAttribute("bwIntroductionList", this.bwIntroductionService.findAll());
		modelMap.put("type","introduction");
		return "admin/main";
	}
	
}
