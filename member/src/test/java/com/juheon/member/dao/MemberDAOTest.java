package com.juheon.member.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.juheon.member.domain.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/bean.xml")
public class MemberDAOTest {
	@Autowired
	private ApplicationContext context; //필드 => 객체가 생성되면 기본값을 갖는다. context = null;
	
	@Autowired
	private MemberDAO dao;
	
	private MemberVO mem1, mem2, mem3;
	
	@Test
	@Ignore
	public void contextTest() {
		assertNotNull(context);
	}
	
	@Before
	public void dataSetup() {
		mem1 = new MemberVO("ju","hean","leejuheon","aa@aaa.com","12345","권선동",null);
		mem2 = new MemberVO("ju2","hean2","leejuheon2","bb@bbb.com","23456","권선동2",null);
		mem3 = new MemberVO("ju3","hean3","leehuheon3","cc@ccc.com","34567","권선동3",null);
	}
	
	@Test
	public void addNget() {
		dao.deleteAll();
		assertEquals(dao.getCount(), 0);
		int result = dao.insertMember(mem1);
		assertEquals(result, 1);
		assertEquals(dao.getCount(), 1);
		result = dao.insertMember(mem2);
		assertEquals(result, 1);
		assertEquals(dao.getCount(), 2);
		result = dao.insertMember(mem3);
		assertEquals(result, 1);
		assertEquals(dao.getCount(), 3);
		// 정확하게 해당 컬럼에 입력이 되었는지 테스트 해야 한다.
		MemberVO getVO = dao.getMember(mem1.getMemId());
		objEquals(getVO, mem1);
		getVO = dao.getMember(mem2.getMemId());
		objEquals(getVO, mem2);
		getVO = dao.getMember(mem3.getMemId());
		objEquals(getVO, mem3);
		
	}
	private void objEquals(MemberVO mem1, MemberVO getVO) {
		assertEquals(getVO.getDetailAddress(), mem1.getDetailAddress());
		assertEquals(getVO.getEmail(), mem1.getEmail());
		assertEquals(getVO.getMemName(), mem1.getMemName());
		assertEquals(getVO.getMemPassword(), mem1.getMemPassword());
		assertEquals(getVO.getPostCode(), mem1.getPostCode());
	}
}
