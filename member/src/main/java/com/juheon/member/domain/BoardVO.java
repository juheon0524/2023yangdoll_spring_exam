package com.juheon.member.domain;

import lombok.Data;

@Data
public class BoardVO {
	long boardNo; 
	String title;
	String contents;
	String writer;
	String writeDate;
	
	public BoardVO() {
		// TODO Auto-generated constructor stub
	}

	public BoardVO(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	
}
