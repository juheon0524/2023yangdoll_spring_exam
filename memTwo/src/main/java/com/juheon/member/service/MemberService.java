package com.juheon.member.service;

import com.juheon.member.vo.MemberVO;

public interface MemberService {

	int memberSave(MemberVO vo);

	MemberVO getMember(String memId);

	int delMember(String memId);

}
