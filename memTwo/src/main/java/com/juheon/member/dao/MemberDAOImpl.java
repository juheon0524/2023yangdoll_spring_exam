package com.juheon.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.juheon.member.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	RowMapper<MemberVO> mapper = new RowMapper<MemberVO>() {
		
		@Override
		public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			MemberVO vo = new MemberVO();
			vo.setDetailAddress(rs.getString("detailAddress"));
			vo.setEmail(rs.getString("email"));
			vo.setMemId(rs.getString("memId"));
			vo.setMemName(rs.getString("memName"));
			vo.setMemPassword(rs.getString("memPassword"));
			vo.setRegiDate(rs.getString("regiDate"));
			return vo;
		}
	};

	
	@Override
	public int memberSave(MemberVO vo) {
		/* String query = "insert into members values(?,?,?,?,?,?,sysdate)"; */
		return this.jdbcTemplate.update(MemberQuery.memberSave,
				vo.getMemId(), vo.getMemPassword(), vo.getMemName(),
				vo.getEmail(), vo.getPostCode(), vo.getDetailAddress());
	}
	@Override
	public MemberVO getMember(String memId) {
		/* String query = "select * from members where memId = ?"; */
		return this.jdbcTemplate.queryForObject(MemberQuery.getMember, new Object[] {memId} ,mapper);
	}
	
	@Override
	public int delMember(String memId) {
		/* String query = "delete from members where memId = ?"; */
		return this.jdbcTemplate.update(MemberQuery.delMember, memId);
	}

}
