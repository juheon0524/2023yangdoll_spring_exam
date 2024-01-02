package com.juheon.member.dao;

import java.util.List;

import com.juheon.member.domain.BoardVO;

public interface BoardDAO {
	int saveBoard(BoardVO vo);
	int removeBoard(long boardNo);
	int updateBoard(BoardVO vo);
	
	int getCount();
	BoardVO getBoard(long boardNo);
	List<BoardVO> gettAll();
}
