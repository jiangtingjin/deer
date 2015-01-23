package com.etc.white.controller;

import javax.annotation.Resource;






import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etc.white.model.BwLife;
import com.etc.white.service.BwLifeService;


@Controller
@RequestMapping("/bwLife")
public class BwLifeController {
	
	@Resource
	private BwLifeService bwLifeService;
	
	@RequestMapping("/find")
	public String find(Long id,ModelMap modelMap){
		modelMap.addAttribute("bwLife",bwLifeService.get(id));
		return "user-info";
	}
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	public String save(Long id, @ModelAttribute("user") BwLife bwLife){
		if(id!=null){
			this.bwLifeService.update(bwLife);
		}
		else
		{
			this.bwLifeService.save(bwLife);
		}
		return "redirect:/user/list.do";
	}
	
	  @RequestMapping(value="save",method=RequestMethod.GET)
      public String save(ModelMap modelMap){
          
          modelMap.put("type","lifeAdd");
          return "admin/main";
         
      }
	
	@RequestMapping("/delete")
	public String delete(Long id){
		this.bwLifeService.delete(id);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/findlist")
	public String findAll(ModelMap modelMap){
		modelMap.addAttribute("bwLifeList", this.bwLifeService.findAll());
		modelMap.put("type","life");
		return "admin/main";
	}
	
}
