package com.juheon.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juheon.member.dao.MemberDAO;
import com.juheon.member.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	MemberDAO dao;

	@Override
	public int memberSave(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.memberSave(vo);
	}

	@Override
	public MemberVO getMember(String memId) {
		// TODO Auto-generated method stub
		return dao.getMember(memId);
	}

	@Override
	public int delMember(String memId) {
		// TODO Auto-generated method stub
		return dao.delMember(memId);
	}
}
