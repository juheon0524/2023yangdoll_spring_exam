package com.juheon.member.service;

import java.util.List;

import com.juheon.member.domain.MemberVO;

public interface MemberService {
	int add(MemberVO vo);
	int del(String memId);
	int upd(MemberVO vo);
	List<MemberVO> listAll();
}
