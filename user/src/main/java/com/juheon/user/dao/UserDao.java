package com.juheon.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.juheon.user.domain.User;

public class UserDao {
	private ConnectionInter inter; //필요한 객체를 주입받기 위해서 상위 인터페이스 타입으로 정의 하고...

	
	
	public void setInter(ConnectionInter inter) {
		this.inter = inter;
	}



	public int add(User user) { //테이블에 자료를 입력 => 입력한 자료의 개수를 반환해주는 것이 좋다.
	      int result = 0;
	      Connection con= null;
	      PreparedStatement ps = null;
//	      ResultSet rs = null;
	      try {
	    	 con = inter.getConnection();
	         ps = con.prepareStatement( "insert into users values(?, ?, ?)"  );
	         ps.setString(1, user.getId());
	         ps.setString(2, user.getName());
	         ps.setString(3, user.getPassword());
	         result = ps.executeUpdate();
	      }catch (SQLException e) {
	         // TODO: handle exception
	      } finally {
	/*         if( rs != null) {
	            try {
	               rs.close();
	            } catch (SQLException e) {         }
	         } */
	         if( ps != null) {
	            try {
	               ps.close();
	            } catch (SQLException e) {         }
	         }
	         if( con != null) {
	            try {
	               con.close();
	            } catch (SQLException e) {         }
	         }
	      }
	      
	      
	      return result;
	   }
	   public User get(String id) { // 테이블에 있는 자료를 하나(반드시) 사용자정보 읽어가기(User를 반환)
	      User user = null;
	      Connection con= null;
	      PreparedStatement ps = null;
	      ResultSet rs = null;
	      try {
	    	 con = inter.getConnection();
	         ps = con.prepareStatement( "select * from users where id = ?"  );
	         ps.setString(1, id);
	         rs = ps.executeQuery();
	         while(rs.next()) {
	            user = new User();
	            user.setId(  rs.getString("id")   );
	            user.setName(   rs.getString("name")   );
	            user.setPassword(  rs.getString("password")   );
	            return user; //조기 반환
	         }
	      }catch (SQLException e) {
	          // TODO: handle exception
	       } finally {
	         if( rs != null) {
	            try {
	               rs.close();
	            } catch (SQLException e) {         }
	         } 
	         if( ps != null) {
	            try {
	               ps.close();
	            } catch (SQLException e) {         }
	         }
	         if( con != null) {
	            try {
	               con.close();
	            } catch (SQLException e) {         }
	         }
	      }
	      
	      return user;
	   }
	   public List<User> getAll() { // 테이블에 있는 자료를 하나(반드시) 사용자정보 읽어가기(User를 반환)
	      List<User> list = null;
	      Connection con= null;
	      PreparedStatement ps = null;
	      ResultSet rs = null;
	      try {
	    	 con = inter.getConnection();
	         ps = con.prepareStatement( "select * from users"  );
	         rs = ps.executeQuery();
	         list = new ArrayList<User>();
	         while(rs.next()) {
	            User user = new User();
	            user.setId(  rs.getString("id")   );
	            user.setName(   rs.getString("name")   );
	            user.setPassword(  rs.getString("password")   );
	            list.add(user);
	         }
	         return list;
	      }catch (SQLException e) {
	          // TODO: handle exception
	       } finally {
	         if( rs != null) {
	            try {
	               rs.close();
	            } catch (SQLException e) {         }
	         } 
	         if( ps != null) {
	            try {
	               ps.close();
	            } catch (SQLException e) {         }
	         }
	         if( con != null) {
	            try {
	               con.close();
	            } catch (SQLException e) {         }
	         }
	      }
	      
	      return list;
	   }
	
}
