package com.meerket.project01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MarketController {
		
		@RequestMapping(value="/main")
		public String main(Model model) {
					
			return "main";	
		}
	
}
