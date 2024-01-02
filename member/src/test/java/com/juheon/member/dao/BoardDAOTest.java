package com.juheon.member.dao;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.juheon.member.domain.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/bean.xml")
public class BoardDAOTest {
	@Autowired
	private ApplicationContext context; //필드 => 객체가 생성되면 기본값을 갖는다. context = null;
	
	@Autowired
	private BoardDAO dao;
	
	private BoardVO data1, data2, data3;
	
	@Before
	public void dataSetup() {
		data1 = new BoardVO(1,"test Title1111","test Contents1111","juheon1111");
		data2 = new BoardVO(2,"test Title2222","test Contents2222","juheon2222");
		data3 = new BoardVO(3,"test Title3333","test Contents3333","juheon3333");
	}
	
	@Test
	public void objInjection() {
		assertNotNull(dao);
	}
	
}
