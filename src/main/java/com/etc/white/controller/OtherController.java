package com.etc.white.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/other")
public class OtherController {
    
    @RequestMapping("/index")
    public String mian(ModelMap model){
       
        model.put("right", "right");
        return "admin/index";
    }
    @RequestMapping("/main")
    public String mian1(ModelMap model){
        model.put("news", "news");
        return "admin/main";
    }


}
