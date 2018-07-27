package com.ruby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping(value="/helloController")
public ModelAndView helloworld() {
	String message="THis Is Simple Spring Program";
	return new ModelAndView ("hello","msg",message);
}


}

