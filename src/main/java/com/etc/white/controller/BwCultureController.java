package com.etc.white.controller;

import javax.annotation.Resource;






import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etc.white.model.BwCulture;
import com.etc.white.service.BwCultureService;


@Controller
@RequestMapping("/bwCulture")
public class BwCultureController {
	
	@Resource
	private BwCultureService bwCultureService;
	
	@RequestMapping("/find")
	public String find(Long id,ModelMap modelMap){
		modelMap.addAttribute("bwCulture",bwCultureService.get(id));
		return "user-info";
	}
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	public String save(Long id, @ModelAttribute("user") BwCulture bwCulture){
		if(id!=null){
			this.bwCultureService.update(bwCulture);
		}
		else
		{
			this.bwCultureService.save(bwCulture);
		}
		return "redirect:/user/list.do";
	}
	
	  @RequestMapping(value="save",method=RequestMethod.GET)
      public String save(ModelMap modelMap){
          
          modelMap.put("type","cultureAdd");
          return "admin/main";
         
      }
	
	@RequestMapping("/delete")
	public String delete(Long id){
		this.bwCultureService.delete(id);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/findlist")
	public String findAll(ModelMap modelMap){
		modelMap.addAttribute("bwCultureList", this.bwCultureService.findAll());
		modelMap.put("type","culture");
		return "admin/main";
	}
	
}
