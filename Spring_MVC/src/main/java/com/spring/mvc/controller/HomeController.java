package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller  
public class HomeController {

	@RequestMapping("/home") 
	public String home(Model m) { 
		m.addAttribute("name","Kapil");
		List<String> list = new ArrayList<String>(); 
		list.add("Kapil");
		list.add("Sachin");
		list.add("Bhola");
		list.add("Krishna");
		
		m.addAttribute("list",list);
		return "home"; 
	}
	
	@RequestMapping("/login")
	public ModelAndView login() {
		
		ModelAndView model = new ModelAndView();
		
		model.addObject("ClassName","12th");
		model.addObject("renumber",121212);
		
		model.setViewName("login"); // konse Controll view dikhna hai jasie hum huper kiya return ya return modeview ka obj hounga 
		return model;
	}
}
