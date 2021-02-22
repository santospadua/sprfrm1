package spring.mvc.laila.build.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/port") // Structured directory
public class PortController
{
	@RequestMapping(value="/recoveryInfo")
	public ModelAndView recoveryInfo(@RequestParam("name") String name, Model model) throws IOException
	{
		model.addAttribute("message", name.toUpperCase() + ", programmer!");
		return new ModelAndView("recoveryInfo");
	}
}