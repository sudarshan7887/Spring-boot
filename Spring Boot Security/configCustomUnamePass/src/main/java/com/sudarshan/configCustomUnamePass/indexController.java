package com.sudarshan.configCustomUnamePass;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController 
{
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
}
