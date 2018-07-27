package com.ruby.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReqResController {
	@RequestMapping(value="/hello")
	public ModelAndView helloWorld(HttpServletRequest req,HttpServletResponse res) {
		String  name=req.getParameter("name");
		String pass=req.getParameter("password");
		if(pass.equals("ruby")) {
			String msg= "hii "+name +" on new Page" ;
			return new ModelAndView("hello","msg",msg);
		}
		else {
			return new ModelAndView("errorPage","msg","Sorry You Entered Wrong Password");
		}
	}

}
