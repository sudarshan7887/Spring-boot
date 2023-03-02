package com.Sudarshan.myWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
	@RequestMapping("Home")
	public String Home() {
		System.out.println("Hii");
		return "Home.jsp";
	}
}
