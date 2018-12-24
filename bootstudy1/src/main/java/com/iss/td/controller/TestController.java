package com.iss.td.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iss.td.bean.User;
import com.iss.td.dao.UserDao;
import com.iss.td.propertyconstant.PropertyConstant;


/**
 * 指定
 * @author TD
 *
 */
@Controller
public class TestController {
	@Autowired
	private PropertyConstant constant; 	
	
	@Autowired
	private UserDao dao;
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value="/test1")
	public String test1(Model model,@Value("${test.td.userId1}") long userId1){
		List<User> userList = dao.getAllBySex(1);
		model.addAttribute("userList", userList);
		logger.info("in test1 method");
		logger.info("userid1=:"+userId1);
		return "home";
	}	
	
	@RequestMapping(value="/test2")
	public String test2(Model model,User user){
		dao.saveAndFlush(user);
		List<User> userList = dao.getAllBySex(1);
		model.addAttribute("userList", userList);
		logger.info("in test2 method");
		logger.info("constant.name="+constant.getName());
		logger.info("constant.phone="+constant.getPhone());
		return "home";
	}	
	
	
}
