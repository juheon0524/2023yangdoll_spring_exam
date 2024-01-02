package com.juheon.member.dao;

import com.juheon.member.vo.MemberVO;

public interface MemberDAO {

	int memberSave(MemberVO vo);

	MemberVO getMember(String memId);

	int delMember(String memId);

}
