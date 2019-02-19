package com.itbank.mvc04;

import java.sql.*;

import org.springframework.stereotype.Component;

@Component
public class MemberDAO {
	
	public void update(MemberDTO dto) throws Exception {
		//1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. DB연결
		String url = "jdbc:mysql://localhost:3366/spring";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. SQL문 객체화
		String sql = "update member set tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getTel());
		ps.setString(2, dto.getId());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
		
		con.close();
		ps.close();
	}
	
	public void delete(MemberDTO dto) throws Exception {
		//1. 드라이버 셋팅
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. DB연결
		String url = "jdbc:mysql://localhost:3366/spring";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		
		//3. SQL문 객체화
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		
		//4. SQL문 실행 요청
		ps.executeUpdate();
		
		con.close();
		ps.close();
	}
	
	

	public void insert(MemberDTO dto) throws Exception {
//		1) 드라이버 로딩
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버 로딩 성공..");
		
//		2) db연결-db명, id, pw
		String url = "jdbc:mysql://localhost:3366/spring";
		String user = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공...");
			
//		3) SQL문 객체화
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 객체화 성공...");
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		ps.setString(3, dto.getName());
		ps.setString(4, dto.getTel());
		
//		4) SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("4. SQL문 실행 요청 성공...");
		
		con.close();
		ps.close();
	}

}
