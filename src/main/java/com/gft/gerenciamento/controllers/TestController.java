package com.gft.gerenciamento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class TestController {

	@GetMapping("index")
	public String index(Model model) {
		model.addAttribute("ola", "Ola mundo");
		return "layout.html";
	}
}
