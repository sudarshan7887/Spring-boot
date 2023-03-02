package com.Sudarshan.WebApplicationProperties;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController 
{
	@RequestMapping("index")
	public String Home() {
		System.out.println("This is Application dot Properties File Tutorial");
		return "index";
	}
}
