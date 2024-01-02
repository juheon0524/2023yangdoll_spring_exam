package com.juheon.member.service;

import java.util.List;

import com.juheon.member.dao.MemberDAO;
import com.juheon.member.domain.MemberVO;

public class MemberServiceImpl implements MemberService {
	MemberDAO dao;

	public void setDao(MemberDAO dao) {
		//필요에 따라서 선행작업이 이루어진다.
		this.dao = dao;
	}

	@Override
	public int add(MemberVO vo) {
		//필요에 따라서 선행작업이 이루어진다.
		return dao.insertMember(vo);
	}

	@Override
	public int del(String memId) {
		//필요에 따라서 선행작업이 이루어진다.
		return dao.deleteMember(memId);
	}

	@Override
	public int upd(MemberVO vo) {
		//필요에 따라서 선행작업이 이루어진다.
		return dao.updateMember(vo);
	}

	@Override
	public List<MemberVO> listAll() {
		//필요에 따라서 선행작업이 이루어진다.
		return dao.getAllMember();
	}
	
}
