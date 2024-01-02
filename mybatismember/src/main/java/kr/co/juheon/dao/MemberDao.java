package kr.co.juheon.dao;

import java.util.List;

import kr.co.juheon.vo.MemberVo;

public interface MemberDao {
	List<MemberVo> getAllMember(); //전체회원 조회
	MemberVo getOneMember(String memId);
	int addMember(MemberVo vo);
	int delMember(String memId);
	int updateMember(MemberVo vo);
}
