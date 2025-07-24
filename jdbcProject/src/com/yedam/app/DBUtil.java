package com.yedam.app;

import java.sql.Connection;
//얘가 통로역할
import java.sql.DriverManager;
//얘가 생성역할
public class DBUtil {
	public static Connection getConnect() {
		Connection conn = null;//리턴 할 빈방 일단 생성
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 잡기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			//빈방에 값을 할당
		} catch (Exception e) {
			e.printStackTrace();//실패 시 상세한 예외내역 보여주기
		}
		return conn;
	}
}