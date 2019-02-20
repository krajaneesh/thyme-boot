package com.virtualpairprogrammers.learningthymeleaf;

import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/")
	public ModelAndView homePage() {
		return new ModelAndView("homepage", "username", "Matt Greencroft");
	}
	
	@RequestMapping("/profile")
	public ModelAndView viewProfile() {
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("title", "Mr");
		model.put("firstName", "Matt");
		model.put("surname", "Greencroft");
		model.put("dateOfBirth", new GregorianCalendar(2006,3,9).getTime());
		model.put("description", "a <strong>fantastic</strong> Java Programmer");
		
		return new ModelAndView("profile", "model", model);
	}
}
