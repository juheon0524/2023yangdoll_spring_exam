package kr.co.juheon.repository;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.juheon.repogitory.MemberDAO;
import kr.co.juheon.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberTest {
	@Autowired
	ApplicationContext context;

	@Autowired
	DataSource ds;
	
	@Autowired
	MemberDAO dao;

	@Test
	public void contextTest() { // 설정 정보를 잘 읽어 왔는가 => 첫 테스트의 출발
		assertNotNull(context);
		// 스프링으로 등록된 빈 목록 보기
		System.out.println("====================");
		for(String createBeanName : context.getBeanDefinitionNames()) {
			System.out.println(createBeanName);
		}
	}

	
	 @Test public void connectionTest() { assertNotNull(ds); } // DB연결이 잘 되는가?
	 
	 @Test
	 public void getMemberTest() {
		 assertNotNull(dao.getMember("aaa"));
		 System.out.println(dao.getMember("aaa") + "<===========");
	 }
	 
	 @Test
	 public void lecForeachMapTest() {
		 List<String> list = new ArrayList<String>();
		 list.add("23456"); list.add("34567"); list.add("12345");
		 List<MemberVO> listResult = dao.getMemberForEach(list);
		 assertNotNull(listResult);
		 for(MemberVO vo : listResult) {
			 System.out.println("==========>" + vo);
		 }
	 }
}
