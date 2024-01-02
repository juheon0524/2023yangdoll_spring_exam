package com.juheon.member.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.juheon.member.domain.BoardVO;

public class BoardDAOImpl implements BoardDAO {
	
	
	JdbcTemplate jdbcTemplate;
	

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	RowMapper<BoardVO> mapper = new RowMapper<BoardVO>() {
		
		@Override
		public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			BoardVO vo = new BoardVO();
			vo.setBoardNo(rs.getLong("boardNo"));
			vo.setTitle(rs.getString("title"));
			vo.setContents(rs.getString("contents"));
			vo.setWriter(rs.getString("writer"));
			vo.setWriteDate(rs.getString("writeDate"));
			return null;
		}
	};
	
	@Override
	public int saveBoard(BoardVO vo) {
		return jdbcTemplate.update("insert into boards values(?,?,?,?,sysdate)", vo.getBoardNo(),
				vo.getTitle(),vo.getContents(),vo.getWriter());
	}

	@Override
	public int removeBoard(long boardNo) {
		//delete from boards where boardNo = ?
		return jdbcTemplate.update("delete from boards where boardNo = ?",boardNo);
	}

	@Override
	public int updateBoard(BoardVO vo) {
		// update boards set title = ?, contents = ?, writer = ? where boardNo=?
		return jdbcTemplate.update("update boards set title = ?, contents = ?, writer = ? where boardNo=?",
				vo.getBoardNo(),vo.getTitle(),vo.getContents(),vo.getWriter()
				);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select count(*) from boards",Integer.class);
	}

	@Override
	public BoardVO getBoard(long boardNo) {
		return jdbcTemplate.queryForObject("select * from boards where boardNo = ?", 
				new Object[] {boardNo},mapper);
	}

	@Override
	public List<BoardVO> gettAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from boards", mapper);
	}

}
