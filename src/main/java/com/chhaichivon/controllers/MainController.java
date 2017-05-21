package com.chhaichivon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value ="/" , method = RequestMethod.GET)
	public String home(ModelMap modelMap){
		modelMap.addAttribute("message", "This is main controller ");
		return "index";
	}
	
	@RequestMapping(value ="/user", method = RequestMethod.GET)
	public String user(){
		return "user";
	}
	
}
