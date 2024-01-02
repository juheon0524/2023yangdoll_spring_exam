package kr.co.juheon.repogitory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.juheon.vo.MemberVO;

@Repository
public class MemberDAOMybatis implements MemberDAO{

	@Autowired
	SqlSession session;
	
	String ns = "kr.co.juheon.Member.";
	
	@Override
	public MemberVO getMember(String memId) {
		return session.selectOne(ns + "getMember", memId);
	}
	
	@Override
	public int updateMember(MemberVO vo) {
		return session.update(ns + "updateMember", vo);
	}
	
	@Override
	public List<MemberVO> getAllMember() {
		return session.selectList(ns + "getAllMember");
	}

	@Override
	public List<MemberVO> getMemberForEach(List<String> list) {
		return session.selectList(ns+"getMemberForEach", list);
	}

}
