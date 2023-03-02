package com.Sudarshan.ModelObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class homeController {
	
	@RequestMapping("home")
	public ModelAndView Home(student student) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj" , student);
		
		mv.setViewName("home");
		return mv;
	}
}
