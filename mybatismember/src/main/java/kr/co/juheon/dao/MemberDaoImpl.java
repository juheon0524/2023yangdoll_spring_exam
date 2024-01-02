package kr.co.juheon.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.juheon.vo.MemberVo;

@Repository("userDao")
public class MemberDaoImpl implements MemberDao {

	// Mybatis
	@Autowired
	private SqlSession session;
	
	@Override
	public List<MemberVo> getAllMember() {
		return session.selectList("memberNs.selectMemberAll");
	}

	@Override
	public MemberVo getOneMember(String memId) {
		return session.selectOne("memberNs.selectMemberId", memId);
	}

	@Override
	public int addMember(MemberVo vo) {
		return session.insert("memberNs.insertMember", vo);
	}

	@Override
	public int delMember(String memId) {
		return session.delete("memberNs.deleteMember", memId);
	}

	@Override
	public int updateMember(MemberVo vo) {
		return session.update("memberNs.updateMember", vo);
	}

}
