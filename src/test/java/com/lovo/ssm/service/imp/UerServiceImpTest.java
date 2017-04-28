package com.lovo.ssm.service.imp;

import com.lovo.ssm.dao.UserMapper;
import com.lovo.ssm.entity.UserBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Elivs on 2017/4/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UerServiceImpTest {

    @Resource
    private UserMapper mapper;

    @Test
    public void login() throws Exception {

        UserBean user = mapper.getUserByNamePwd("liyi", "admin");
        System.out.println("---------------" + user.getUserId() +"------------------");
    }

}