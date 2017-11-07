package com.amanuel.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class humanController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name" ,required=false) String searchQuery,Model model) {
		System.out.print("name: " + searchQuery);
		model.addAttribute("newName", searchQuery);
		if (searchQuery == null) {
			return "hello";
		}
		
		return "index";
	}

}
