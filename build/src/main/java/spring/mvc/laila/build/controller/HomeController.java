package spring.mvc.laila.build.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	@RequestMapping(value="/")
	public ModelAndView home(HttpServletResponse response) throws IOException
	{
		return new ModelAndView("home");
	}
	
	/*@RequestMapping(value="/recoveryInfo")
	public ModelAndView recoveryInfo(HttpServletRequest request, Model model) throws IOException
	{
		// Data on model
		model.addAttribute("message", request.getParameter("name").toUpperCase() + ", baby!");
		
		return new ModelAndView("recoveryInfo");
	}*/
	
	// Binding Request Params
	@RequestMapping(value="/recoveryInfo")
	public ModelAndView recoveryInfoII(@RequestParam("name") String name, Model model) throws IOException
	{
		// Data on model
		model.addAttribute("message", name.toUpperCase() + ", baby!");
		
		return new ModelAndView("recoveryInfo");
	}
}