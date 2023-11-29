package com.cg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MainController {

	
	@RequestMapping("/start")
	public String view() {
		return "index";
	}
	
	
}
