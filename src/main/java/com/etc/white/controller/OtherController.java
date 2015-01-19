package com.etc.white.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/other")
public class OtherController {
    
    @RequestMapping("/main")
    public String mian(){
       
        return "admin/main";
    }

}
