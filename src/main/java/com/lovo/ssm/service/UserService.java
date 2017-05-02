package com.lovo.ssm.service;

import com.lovo.ssm.entity.UserBean;

public interface UserService {
	
	UserBean login(String username, String password);
	
}
