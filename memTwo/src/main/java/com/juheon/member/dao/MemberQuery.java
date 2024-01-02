package com.juheon.member.dao;

public interface MemberQuery {
	String memberSave = "insert into members values(?,?,?,?,?,?,sysdate)";
	String getMember = "select * from members where memId = ?";
	String delMember = "delete from members where memId = ?";
}
