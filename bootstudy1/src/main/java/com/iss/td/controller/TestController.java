package com.iss.td.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iss.td.bean.User;
import com.iss.td.dao.UserDao;


@Controller
public class TestController {
	
	@Autowired
	private UserDao dao;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/test1")
	public String test1(Model model){
		List<User> userList = dao.getAllBySex(1);
		model.addAttribute("userList", userList);
		logger.info("in test1 method");
		return "home";
	}	
	
	@RequestMapping(value="/test2")
	public String test2(Model model,User user){
		dao.saveAndFlush(user);
		List<User> userList = dao.getAllBySex(1);
		model.addAttribute("userList", userList);
		logger.info("in test2 method");
		return "home";
	}	
	
	
}
