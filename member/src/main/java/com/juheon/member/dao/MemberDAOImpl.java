package com.juheon.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.juheon.member.domain.MemberVO;

public class MemberDAOImpl implements MemberDAO{
	
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	private RowMapper<MemberVO> mapper = new RowMapper<MemberVO>() {
		
		@Override
		public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			MemberVO vo = new MemberVO();
			vo.setDetailAddress(rs.getString("detailAddress"));
			vo.setEmail(rs.getString("email"));
			vo.setMemId(rs.getString("memId"));
			vo.setMemName(rs.getString("memName"));
			vo.setMemPassword(rs.getString("memPassword"));
			vo.setPostCode(rs.getString("postCode"));
			vo.setRegiDate(rs.getString("regiDate"));		
			return vo;
		}
	};
	
	@Override
	public int insertMember(MemberVO vo) {
		return jdbcTemplate.update("insert into members values(?,?,?,?,?,?,sysdate)",
				vo.getMemId(), vo.getMemPassword(), vo.getMemName(),
				vo.getEmail(), vo.getPostCode(), vo.getDetailAddress() );
	}

	@Override
	public int deleteMember(String memId) {
		return jdbcTemplate.update("delete from members where memId = ?",memId);
	}

	@Override
	public int updateMember(MemberVO vo) {
		return jdbcTemplate.update("update members set memPassword = ?, memName = ?, email=? where memId = ?",
				vo.getMemPassword(), vo.getMemName(), vo.getEmail(), vo.getMemId()
				);
	}

	@Override
	public MemberVO getMember(String memId) {
		return jdbcTemplate.queryForObject("select * from members where memId = ?", 
				new Object[] {memId},mapper);
	}

	@Override
	public List<MemberVO> getAllMember() {
		return jdbcTemplate.query("select * from members", mapper);
	}

	@Override
	public int deleteAll() {
		return jdbcTemplate.update("delete from members");
	}

	@Override
	public int getCount() {
		return jdbcTemplate.queryForObject("select count(*) from members",Integer.class);
	}

	
};
