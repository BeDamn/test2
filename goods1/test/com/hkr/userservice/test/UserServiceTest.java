package com.hkr.userservice.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.com.hkr.goods.user.domain.User;
import cn.com.hkr.goods.user.service.UserService;

public class UserServiceTest {

	@Test
	public void testLogin1() {
		UserService userservice = new UserService(); 
		User user = new User();
		user.setLoginname("刘备");
		user.setLoginpass("123");
		User user1 = userservice.login(user);
		assertNull(user1);
	}
	
	@Test
	public void testLogin2() {
		UserService userservice = new UserService(); 
		User user = new User();
		user.setLoginname("tom");
		user.setLoginpass("root123");
		User user1 = userservice.login(user);
		assertNull(user1);
	}
	
	@Test
	public void testLogin3() {
		UserService userservice = new UserService(); 
		User user = new User();
		user.setLoginname("CR");
		user.setLoginpass("54321");
		User user1 = userservice.login(user);
		assertNull(user1);
	}
	
	@Test
	public void testLogin4() {
		UserService userservice = new UserService(); 
		User user = new User();
		user.setLoginname("张三");
		user.setLoginpass("root123");
		User user1 = userservice.login(user);
		assertNull(user1);
	}

}
