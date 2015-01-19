package com.etc.white.controller;

import javax.annotation.Resource;




import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.white.model.BwVillageCommittee;

import com.etc.white.service.BwVillageCommitteeService;


@Controller
@RequestMapping("/bwVillageCommittee")
public class BwVillageCommitteeController {
	
	@Resource
	private BwVillageCommitteeService bwVillageCommitteeService;
	
	@RequestMapping("/find")
	public String find(Long id,ModelMap modelMap){
		modelMap.addAttribute("bwVillageCommittee",bwVillageCommitteeService.get(id));
		return "user-info";
	}
	
	@RequestMapping("/save")
	public String save(Long id, @ModelAttribute("user") BwVillageCommittee bwVillageCommittee){
		if(id!=null){
			this.bwVillageCommitteeService.update(bwVillageCommittee);
		}
		else
		{
			this.bwVillageCommitteeService.save(bwVillageCommittee);
		}
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id){
		this.bwVillageCommitteeService.delete(id);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/findlist")
	public String findAll(ModelMap modelMap){
		modelMap.addAttribute("bwVillageCommitteeList", this.bwVillageCommitteeService.findAll());
		return "user-list";
	}
	
}
