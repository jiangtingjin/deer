package com.etc.white.controller;

import javax.annotation.Resource;





import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	
	@RequestMapping(value="save",method=RequestMethod.POST)
	public String save(Long id, @ModelAttribute("user") BwUser bwUser){
	    
		if(id!=null){
			this.bwUserService.update(bwUser);
		}
		else
		{
			this.bwUserService.save(bwUser);
		}
		return "redirect:/bwUser/findlist.do";
	}
	
	@RequestMapping(value="save",method=RequestMethod.GET)
    public String save(ModelMap modelMap){
        
	    modelMap.put("type","userAdd");
        return "admin/main";
       
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
