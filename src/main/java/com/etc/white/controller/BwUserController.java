package com.etc.white.controller;

import javax.annotation.Resource;




import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.white.model.BwUser;

import com.etc.white.service.BwUserService;


@Controller
@RequestMapping("/bwUser")
public class BwUserController {
	
	@Resource
	private BwUserService bwUserService;
	
	@RequestMapping("/find")
	public String find(Long id,ModelMap modelMap){
		modelMap.addAttribute("bwUser",bwUserService.get(id));
		return "user-info";
	}
	
	@RequestMapping("/save")
	public String save(Long id, @ModelAttribute("user") BwUser bwUser){
		if(id!=null){
			this.bwUserService.update(bwUser);
		}
		else
		{
			this.bwUserService.save(bwUser);
		}
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id){
		this.bwUserService.delete(id);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/findlist")
	public String findAll(ModelMap modelMap){
		modelMap.addAttribute("bwUserList", this.bwUserService.findAll());
		modelMap.put("type","user");
		return "admin/main";
	}
	
}
