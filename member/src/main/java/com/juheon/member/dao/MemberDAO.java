package com.juheon.member.dao;

import java.util.List;

import com.juheon.member.domain.MemberVO;

public interface MemberDAO {
	int insertMember(MemberVO vo);
	int deleteMember(String memId);
	int updateMember(MemberVO vo);
	int deleteAll(); //delete from members;
	int getCount(); //select count (*) as cnt from members;
	MemberVO getMember(String memId);
	List<MemberVO> getAllMember();
}
