package com.lovo.ssm.service;

import com.lovo.ssm.entity.UserBean;

public interface UserService {
	
	public UserBean login(String username, String password);
	
}
