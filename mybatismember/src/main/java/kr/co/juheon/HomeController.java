package kr.co.juheon;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.juheon.dao.MemberDao;
import kr.co.juheon.vo.MemberVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private MemberDao dao;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping("/memberResult")
	public String insert(MemberVo vo, Model model) {
		dao.addMember(vo);
		model.addAttribute("result", dao.getOneMember(vo.getMemId()) );
		return "memberResult";
	}
	
	
	
}
