package com.juheon.member;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.juheon.member.service.MemberService;
import com.juheon.member.vo.MemberVO;

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
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/inMember")
	public String inMember() {
		return "inMember";
	}
	
	@RequestMapping(value = "/memberSave")
	public String memberSave(MemberVO vo, Model model) {
		// 입력폼에서 넘겨준 자료를 vo로 넘겨 받아서
		// 서비스의 입력 메서드에게 자료를 전달해준 후 결과값을 정수로 받는다.
		int result = service.memberSave(vo);
		model.addAttribute("inCount",result);
		model.addAttribute("irum",vo.getMemName());
		return "inMemberResult";
	}
	// getMember요청
	@RequestMapping(value="/getMember")
	public String getMember(String memId, Model model) {
		MemberVO resultVo = service.getMember(memId);
		System.out.println(resultVo + "<===컨트롤러에서 받은 최종 결과");
		model.addAttribute("member", resultVo);
		return "getMemberView";
	}
	// delMember요청
	@RequestMapping(value="/delMember")
	public String delMember(String memId, Model model) {
		int result = service.delMember(memId);
		System.out.println(result + "<===컨트롤러에서 받은 최종 결과");
		model.addAttribute("memId", result);
		model.addAttribute("Id", memId);
		return "delMemberView";
	}
	
}
