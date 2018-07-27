package com.ruby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping(value="/welcome")
public String welcomes(Model model) {
	model.addAttribute("welcome","Welcome MEssage");
	return "welcome";
}
}