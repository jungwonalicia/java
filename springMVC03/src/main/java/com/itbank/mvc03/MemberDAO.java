package com.itbank.mvc03;

import java.sql.*;

public class MemberDAO {

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
		String sql = "insert into member values ('win', 'win', 'win', 'win')";
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 객체화 성공...");
		
		
//		4) SQL문 실행 요청
		ps.executeUpdate();
		System.out.println("4. SQL문 실행 요청 성공...");
		
	}

}
