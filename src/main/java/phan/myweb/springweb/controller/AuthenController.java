package phan.myweb.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AuthenController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String redirect(Model model){
		return "redirect:/users-list";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model){
		return "/authentication/login";
		//test commit file change
	}
}
