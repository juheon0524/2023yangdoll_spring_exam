package com.juheon.refactoryuser.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.juheon.user.dao.UserDao;
import com.juheon.user.domain.User;

public class UserDaoTest {
	
	@Test
	public void addNget() {
		User user = new User();
		user.setId("juheon"); 
		user.setName("이주헌");
		user.setPassword("juheon");
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		UserDao dao = context.getBean("userDao", UserDao.class);
		
		int result = dao.add(user);
		System.out.println(user.getId()+"등록 성공");
		User getUser = dao.get(user.getId());
		System.out.println(getUser.getName());
		System.out.println(getUser.getPassword());
		System.out.println(getUser.getId() + "조회 성공!!!");
		
		
	}
}
