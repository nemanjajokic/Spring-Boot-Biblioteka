package io.neca.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BibliotekaController {

	@Value("${msg.welcome}")
	String welcome;
	
	@RequestMapping("/")
	public ModelAndView welcome() {
		ModelAndView mv = new ModelAndView("home");
		mv.addObject(welcome);
		
		return mv;
	}
	
}
