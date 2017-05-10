package com.focal.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainCall {

	@RequestMapping("/main")
	public ModelAndView mainpage(HttpServletRequest req, HttpServletResponse res)
	{
		String message;
		String userid= req.getParameter("userid");
		String password= req.getParameter("password");
		if(userid.equalsIgnoreCase("2909sanjay"))
		{
			if(password.equals("2909sonu"))
			{
				message="Hello "+userid;
				return new ModelAndView("mainPage","message", message);
			}
		}
		return new ModelAndView("errorPage","message", "Sorry Wrong password Please try again!!!");
	}
}
