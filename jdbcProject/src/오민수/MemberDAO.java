package 오민수;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
	
	//case1
	public boolean createManager(String id, String pw) {
		Connection conn = DBUtil.getConnect();//DB와 연결
		String sql = "insert into manager (manager_id, password) values (?, ?)";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pw);

			int result = stmt.executeUpdate();
			return result > 0;
		} catch (Exception e) {
			System.out.println("관리자 계정 생성 중 오류 발생");
			e.printStackTrace();
		}
		return false;
	}//end case1
	
	
	//case2
	public boolean loginManager(String id, String pw) {
		Connection conn = DBUtil.getConnect();
		String sql = "select * from manager where manager_id = ? and password = ?";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pw);

			ResultSet rs = stmt.executeQuery();
			return rs.next();  // 결과값이 있으면 로그인 성공
		} catch (Exception e) {
			System.out.println("로그인 중 오류 발생");
			e.printStackTrace();
		}
		return false;
	}//end case2
	
	
	//case3
	public boolean insertMember(Member m) {
	    Connection conn = DBUtil.getConnect();
	    String sql = "INSERT INTO MEMBERS (MEMBER_ID, NAME, GENDER, PHONE, REGISTRATION, SUBSCRIBE) "
	               + "VALUES (?, ?, ?, ?, TO_DATE(?, 'YYYY-MM-DD'), ?)";

	    try {
	    	PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setInt(1, m.memberId);
	        stmt.setString(2, m.name);
	        stmt.setString(3, m.gender);
	        stmt.setString(4, m.phone);
	        stmt.setString(5, m.registration); // 날짜 문자열
	        stmt.setString(6, m.subscribe);

	        int result = stmt.executeUpdate();//영향받은 행 수 반환
	        return result > 0;
	    } catch (Exception e) {
	        System.out.println("회원 등록 중 오류 발생");
	        e.printStackTrace();
	    }
	    return false;
	}//end case3
	
	
	//case4
	public Member findMemberById(int memberId) {
	    Connection conn = DBUtil.getConnect();
	    String sql = "SELECT MEMBER_ID, NAME, GENDER, PHONE, "
	            + "TO_CHAR(REGISTRATION, 'YYYY-MM-DD') AS REGISTRATION, "
	            + "SUBSCRIBE FROM MEMBERS WHERE MEMBER_ID = ?";
	    
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, memberId);
	        ResultSet rs = pstmt.executeQuery();

	        if (rs.next()) {
	            String name = rs.getString("NAME");
	            String gender = rs.getString("GENDER");
	            String phone = rs.getString("PHONE");
	            String registration = rs.getString("REGISTRATION");
	            String subscribe = rs.getString("SUBSCRIBE");

	            return new Member(memberId, name, gender, phone, registration, subscribe);
	        }
	    } catch (Exception e) {
	        System.out.println("회원 단건 조회 중 오류 발생");
	        e.printStackTrace();
	    }
	    return null;
	}//end case4
	
	
	//case5
	public List<Member> findAllMembers() {
	    Connection conn = DBUtil.getConnect();
	    List<Member> list = new ArrayList<>();

	    String sql = "SELECT MEMBER_ID, NAME, GENDER, PHONE, "
	               + "TO_CHAR(REGISTRATION, 'YYYY-MM-DD') AS REGISTRATION, "
	               + "SUBSCRIBE FROM MEMBERS ORDER BY MEMBER_ID";

	    try (PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {

	        while (rs.next()) {
	            int id = rs.getInt("MEMBER_ID");
	            String name = rs.getString("NAME");
	            String gender = rs.getString("GENDER");
	            String phone = rs.getString("PHONE");
	            String registration = rs.getString("REGISTRATION");
	            String subscribe = rs.getString("SUBSCRIBE");

	            list.add(new Member(id, name, gender, phone, registration, subscribe));
	        }
	    } catch (Exception e) {
	        System.out.println("전체 회원 조회 중 오류 발생");
	        e.printStackTrace();
	    }

	    return list;
	}//end case5
	
	
	//case6
	public List<Member> findExpiringMembers() {
	    Connection conn = DBUtil.getConnect();
	    List<Member> list = new ArrayList<>();

	    String sql = "SELECT MEMBER_ID, NAME, GENDER, PHONE, " +
	                 "TO_CHAR(REGISTRATION, 'YYYY-MM-DD') AS REGISTRATION, SUBSCRIBE " +
	                 "FROM MEMBERS";

	    try (PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {

	        while (rs.next()) {
	            int id = rs.getInt("MEMBER_ID");
	            String name = rs.getString("NAME");
	            String gender = rs.getString("GENDER");
	            String phone = rs.getString("PHONE");
	            String registration = rs.getString("REGISTRATION");
	            String subscribeStr = rs.getString("SUBSCRIBE");

	            // 숫자만 추출
	            if (subscribeStr == null) continue;
	            String numStr = subscribeStr.replaceAll("[^0-9]", "");
	            if (numStr.isEmpty()) continue;

	            int left = Integer.parseInt(numStr);
	            if (left >= 1 && left <= 7) {
	                list.add(new Member(id, name, gender, phone, registration, subscribeStr));
	            }
	        }
	    } catch (Exception e) {
	        System.out.println("구독 종료 예정 회원 조회 중 오류 발생");
	        e.printStackTrace();
	    }
	    return list;
	}//end case6
	
	
	//case7
	public String getGradeById(int memberId) {
	    Connection conn = DBUtil.getConnect();
	    String sql = "SELECT TO_CHAR(REGISTRATION, 'YYYY-MM-DD') AS REG FROM MEMBERS WHERE MEMBER_ID = ?";
	    try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	        pstmt.setInt(1, memberId);
	        ResultSet rs = pstmt.executeQuery();

	        if (!rs.next()) return null; // 회원 없음

	        String regStr = rs.getString("REG");
	        LocalDate regDate = LocalDate.parse(regStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	        long months = ChronoUnit.MONTHS.between(regDate, LocalDate.now());

	        if (months >= 12) return "VVIP";
	        else if (months >= 9) return "VIP";
	        else if (months >= 6) return "GOLD";
	        else if (months >= 3) return "SILVER";
	        else return "NONE"; // 등급 미달
	    } catch (Exception e) {
	        System.out.println("등급 조회 중 오류 발생");
	        e.printStackTrace();
	    }
	    return null;
	}//end case7
	
	
	//case8
	public boolean updateMemberField(int memberId, String column, String newValue) {
	    switch (column) {
	        case "NAME":
	        case "GENDER":
	        case "PHONE":
	        case "SUBSCRIBE":
	            break;
	        case "REGISTRATION":
	            // 날짜 컬럼은 따로 처리
	            String sqlDate = "UPDATE MEMBERS SET REGISTRATION = TO_DATE(?, 'YYYY-MM-DD') WHERE MEMBER_ID = ?";
	            try (Connection conn = DBUtil.getConnect();
	                 PreparedStatement ps = conn.prepareStatement(sqlDate)) {
	                ps.setString(1, newValue);
	                ps.setInt(2, memberId);
	                return ps.executeUpdate() > 0;
	            } catch (Exception e) {
	                System.out.println("회원 정보 수정 중 오류 발생");
	                e.printStackTrace();
	                return false;
	            }
	        default:
	            System.out.println("수정 불가한 컬럼입니다.");
	            return false;
	    }

	    // 문자열 컬럼 공통 처리
	    String sql = "UPDATE MEMBERS SET " + column + " = ? WHERE MEMBER_ID = ?";
	    try (Connection conn = DBUtil.getConnect();
	         PreparedStatement ps = conn.prepareStatement(sql)) {
	        ps.setString(1, newValue);
	        ps.setInt(2, memberId);
	        return ps.executeUpdate() > 0;
	    } catch (Exception e) {
	        System.out.println("회원 정보 수정 중 오류 발생");
	        e.printStackTrace();
	    }
	    return false;
	}//end case8
	
	
	//case9
	public boolean deleteMember(int memberId) {
	    String sql = "DELETE FROM MEMBERS WHERE MEMBER_ID = ?";
	    try (Connection conn = DBUtil.getConnect();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {

	        pstmt.setInt(1, memberId);
	        int r = pstmt.executeUpdate();
	        return r > 0;
	    } catch (Exception e) {
	        System.out.println("회원 삭제 중 오류 발생");
	        e.printStackTrace();
	    }
	    return false;
	}//end case9


}
