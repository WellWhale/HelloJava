package 오민수;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
		// DB접속정보 활용 -> 세션(Connection 객체)
		public static Connection getConnect() {
			Connection conn = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.22:1521:xe", "scott", "tiger");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return conn;
		}
	}
