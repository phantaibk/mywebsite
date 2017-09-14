package phan.myweb.springweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import phan.myweb.spring.business.UserBusiness;
import phan.myweb.spring.model.User;

@Controller

public class UserController {
	
	@Autowired
	UserBusiness userBusiness;
	
	@RequestMapping(value="/users-list", method = RequestMethod.GET)
	public String account(Model model) {
		List<User> list = userBusiness.findAll();
		System.out.println(list);
		return "/backend/user-list";
	}
}
