package com.etc.white.controller;

import javax.annotation.Resource;




import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.white.model.User;
import com.etc.white.service.UserService;



/**
 * 控制层：mvc中的c
 * @author 蒋廷金
 * 2014年7月9日 下午10:38:46
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	
	@RequestMapping("/info")
	public String info(Long id,ModelMap modelMap){
		System.out.println("heheheheh");
		System.out.println(userService.get(id));
		modelMap.addAttribute("user",userService.get(id));
		return "user-info";
	}
	
	@RequestMapping("/save")
	public String save(Long id, @ModelAttribute("user") User user){
		if(id!=null){
			this.userService.update(user);
		}
		else
		{
			this.userService.save(user);
		}
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(Long id){
		this.userService.delete(id);
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/list")
	public String findAll(ModelMap modelMap){
		//System.out.println(this.userService.findAll().size());
		modelMap.addAttribute("userList", this.userService.findAll());
		return "user-list";
	}
	
	@RequestMapping("/input")
	public String input(Long id, ModelMap modelMap, @ModelAttribute("user") User user){
		if(id!=null){
			modelMap.addAttribute("user", this.userService.get(id));
		}
		return "user-info";
	}
}
