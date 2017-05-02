package com.lovo.ssm.controller;


import com.lovo.ssm.entity.UserBean;
import com.lovo.ssm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@SuppressWarnings("ALL")
@Controller
public class LoginController {

	@Resource(name = "us")
	private UserService us;

	@RequestMapping("login")
	public String login(String username,String password,HttpServletRequest request){
		UserBean user = us.login(username, password);
		if(user != null){
			request.getSession().setAttribute("user",user);
			return "success";
		}else{
			return "login";
		}
	}
}
