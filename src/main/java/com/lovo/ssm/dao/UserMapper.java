package com.lovo.ssm.dao;

import com.lovo.ssm.entity.UserBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

	UserBean getUserByNamePwd(@Param("username") String username,
                              @Param("password") String password);

}
