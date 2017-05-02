package com.lovo.ssm.service.imp;

import com.lovo.ssm.dao.UserMapper;
import com.lovo.ssm.entity.UserBean;
import com.lovo.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service("us")
public class UerServiceImp implements UserService {

	@Resource(name = "userMapper")
	private UserMapper um;

	@Override
	public UserBean login(String username, String password) {

		return um.getUserByNamePwd(username, password);
	}

}
