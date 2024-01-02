package com.juheon.member;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.juheon.member.domain.MemberVO;
import com.juheon.member.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MemberService service;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home"; // 완성된 내용 => /WEB-INF/views/home.jsp
	}
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "test"; // 완성된 내용 => /WEB-INF/views/test.jsp
	}
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public String member(Locale locale, Model model) {	
		return "memberJoin"; // 완성된 내용 => /WEB-INF/views/memberJoin.jsp
	}
	@RequestMapping(value = "/memberJoin")
	public String memberJoin(MemberVO vo, Model model) {	
		// 입력폼에서 입력된 데이터를 넘겨 받아서
		// 서비스 클래스에게 입력에 필요한 작업을 하도록 지시하고 그 결과를 받는다.
		int rtnValue = service.add(vo);
		// 받은 결과를 응답페이지에서 필요하다면 모델에 넣어준다.
		model.addAttribute("result", rtnValue);
		model.addAttribute("memberName", vo.getMemName());
		
		System.out.println(vo);
		return "memberJoinResult"; // 완성된 내용 => /WEB-INF/views/memberJoinResult.jsp
	}
	
}
