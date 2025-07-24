package 오민수;

import java.util.List;
import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		boolean Login = false;
		
		while(run) {
			System.out.println();
			System.out.println("==============================================");
			System.out.println("1. 관리자 계정 생성\t\t 2. 관리자 계정 로그인");
			System.out.println("3. 회원정보 등록\t\t 4. 회원정보 선택 조회");
			System.out.println("5. 회원정보 전체 조회\t\t 6. 구독 종료예정 회원 조회");
			System.out.println("7. 회원 등급 조회\t\t 8. 회원정보 수정");
			System.out.println("9. 회원정보 삭제\t\t 0. 종료");
			System.out.println("==============================================");
			System.out.println();
			System.out.print("선택> ");
			int choi = Integer.parseInt(sc.nextLine());
			
			switch(choi) {
			case 1:
				if (Login) {
					System.out.println("이미 로그인 상태입니다.");
					break;
				}
				
				System.out.print("ID 입력> ");
				String managerId = sc.nextLine();
				System.out.print("비밀번호 입력> ");
				String pw1 = sc.nextLine();
				System.out.print("비밀번호 확인> ");
				String pw2 = sc.nextLine();

				if (!pw1.equals(pw2)) {
					System.out.println("비밀번호가 일치하지 않습니다, 초기화면으로 돌아갑니다.");
					break;
				}

				boolean result = new MemberDAO().createManager(managerId, pw1);
				if (result) {
					System.out.println("계정 생성이 완료되었습니다.");
				} else {
					System.out.println("계정 생성에 실패하였습니다.");
				}
				break;
				
			case 2:
				if (Login) {
					System.out.println("이미 로그인 상태입니다.");
					break;
				}

				System.out.print("관리자 ID 입력> ");
				String loginId = sc.nextLine();
				System.out.print("비밀번호 입력> ");
				String loginPw = sc.nextLine();

				boolean loginOk = new MemberDAO().loginManager(loginId, loginPw);
				if (loginOk) {
					System.out.println("로그인 성공");
					Login = true;
				} else {
					System.out.println("로그인 실패, 초기화면으로 돌아갑니다.");
				}
				break;
				
			case 3:
				if (!Login) {
			        System.out.println("관리자 로그인 후 사용해주세요.");
			        break;
			    }

			    System.out.print("회원 ID (정수) 입력> ");
			    int memberId = Integer.parseInt(sc.nextLine());

			    System.out.print("이름 입력> ");
			    String name = sc.nextLine();

			    System.out.print("성별 입력 (M/W)> ");
			    String gender = sc.nextLine().toUpperCase(); // 대문자 입력

			    System.out.print("전화번호 입력 (010-xxxx-xxxx)> ");
			    String phone = sc.nextLine();

			    System.out.print("가입일시 입력 (YYYY-MM-DD)> ");
			    String registration = sc.nextLine();

			    System.out.print("구독 일 수 입력 (일 단위)> ");
			    String subscribe = sc.nextLine();

			    Member newMember = new Member(memberId, name, gender, phone, registration, subscribe);
			    boolean inserted = new MemberDAO().insertMember(newMember);

			    if (inserted) {
			        System.out.println("회원 등록이 완료되었습니다.");
			    } else {
			        System.out.println("회원 등록에 실패하였습니다.");
			    }
			    break;
			    
			case 4:
				if (!Login) {
			        System.out.println("관리자 로그인 후 사용해주세요.");
			        break;
			    }

			    System.out.print("조회할 회원 ID 입력> ");
			    int targetId = Integer.parseInt(sc.nextLine());

			    Member found = new MemberDAO().findMemberById(targetId);
			    if (found != null) {
			    	System.out.println();
			    	System.out.println("===========================================================================");
			    	System.out.printf("ID\t이름\t성별\t전화번호\t\t가입일시\t\t\t남은 구독기간\n");
			    	System.out.println("---------------------------------------------------------------------------");
			    	System.out.printf("%d\t%s\t%s\t%s\t%s\t\t%s\n", found.memberId
			    					  , found.name, found.gender, found.phone
			    					  , found.registration, found.subscribe);
			    	System.out.println("===========================================================================");
			    } else {
			        System.out.println("해당 회원은 존재하지 않습니다.");
			    }
			    break;
			    
			case 5:
				if (!Login) {
			        System.out.println("관리자 로그인 후 사용해주세요.");
			        break;
			    }

			    List<Member> members = new MemberDAO().findAllMembers();
			    if (members.isEmpty()) {
			        System.out.println("조회할 회원 정보가 없습니다.");
			    } else {
			    	System.out.println();
			    	System.out.println("===========================================================================");
			    	System.out.printf("ID\t이름\t성별\t전화번호\t\t가입일시\t\t\t남은 구독기간\n");
			        System.out.println("---------------------------------------------------------------------------");

			        for (Member m : members) {
			        	System.out.printf("%d\t%s\t%s\t%s\t%s\t\t%s\n", m.memberId
		    					  , m.name, m.gender, m.phone
		    					  , m.registration, m.subscribe);
			        }
			        System.out.println("===========================================================================");
			    }
			    break;
			    
			case 6:
				if (!Login) {
			        System.out.println("관리자 로그인 후 사용해주세요.");
			        break;
			    }

			    List<Member> expiringMembers = new MemberDAO().findExpiringMembers();
			    if (expiringMembers.isEmpty()) {
			        System.out.println("7일 이내에 구독 종료 예정인 회원이 없습니다.");
			    } else {
			        System.out.println();
			        System.out.println("===========================================================================");
			        System.out.printf("ID\t이름\t성별\t전화번호\t\t가입일시\t\t\t남은 구독기간\n");
			        System.out.println("---------------------------------------------------------------------------");

			        for (Member m : expiringMembers) {
			            System.out.printf("%d\t%s\t%s\t%s\t%s\t\t%s\n", m.memberId,
			                              m.name, m.gender, m.phone,
			                              m.registration, m.subscribe);
			        }
			        System.out.println("===========================================================================");
			    }
			    break;
			    
			case 7:
				if (!Login) {
			        System.out.println("관리자 로그인 후 사용해주세요.");
			        break;
			    }

			    System.out.print("등급을 조회할 회원 ID 입력> ");
			    int gid = Integer.parseInt(sc.nextLine());

			    String grade = new MemberDAO().getGradeById(gid);
			    if (grade == null) {
			        System.out.println("해당 회원이 존재하지 않습니다.");
			    } else if ("NONE".equals(grade)) {
			        System.out.println("해당 회원은 아직 등급 기준을 충족하지 못했습니다.");
			    } else {
			        Member mf = new MemberDAO().findMemberById(gid);
			        String dispName = (mf != null) ? mf.name : "";
			        System.out.printf("\n\"%s\"님의 등급은 \"%s\" 입니다.%n", dispName, grade);
			    }
			    break;
			    
			case 8:
				if (!Login) {
			        System.out.println("관리자 로그인 후 사용해주세요.");
			        break;
			    }

			    System.out.print("수정할 회원 ID 입력> ");
			    int uid = Integer.parseInt(sc.nextLine());

			    Member target = new MemberDAO().findMemberById(uid);
			    if (target == null) {
			        System.out.println("해당 회원이 존재하지 않습니다.");
			        break;
			    }

			    // 현재 정보 출력
			    System.out.println();
			    System.out.println("===========================================================================");
			    System.out.printf("ID\t이름\t성별\t전화번호\t\t가입일시\t\t\t남은 구독기간\n");
			    System.out.println("---------------------------------------------------------------------------");
			    System.out.printf("%d\t%s\t%s\t%s\t%s\t\t%s\n", target.memberId,
			                      target.name, target.gender, target.phone,
			                      target.registration, target.subscribe);
			    System.out.println("===========================================================================");

			    // 어떤 항목 수정?
			    System.out.println("수정할 항목을 선택하세요 (NAME / GENDER / PHONE / REGISTRATION / SUBSCRIBE)");
			    System.out.print("입력> ");
			    String col = sc.nextLine().trim().toUpperCase();

			    // 새 값 입력
			    System.out.print("새 값 입력> ");
			    String newVal = sc.nextLine();

			    boolean upOk = new MemberDAO().updateMemberField(uid, col, newVal);
			    if (upOk) {
			        System.out.println("수정 완료");
			    } else {
			        System.out.println("수정 실패");
			    }
			    break;
			    
			case 9:
				if (!Login) {
			        System.out.println("관리자 로그인 후 사용해주세요.");
			        break;
			    }

			    System.out.print("삭제할 회원 ID 입력> ");
			    int delId = Integer.parseInt(sc.nextLine());

			    Member delTarget = new MemberDAO().findMemberById(delId);
			    if (delTarget == null) {
			        System.out.println("해당 회원이 존재하지 않습니다.");
			        break;
			    }

			    // 정말 삭제? 확인
			    System.out.print("정말 삭제하시겠습니까? (Y/N)> ");
			    String yn = sc.nextLine().trim().toUpperCase();
			    if (!yn.equals("Y")) {
			        System.out.println("삭제를 취소했습니다.");
			        break;
			    }

			    boolean delOk = new MemberDAO().deleteMember(delId);
			    if (delOk) {
			        System.out.println("회원 정보가 삭제되었습니다.");
			    } else {
			        System.out.println("삭제 실패했습니다.");
			    }
			    break;
			    
			case 0:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default:
				System.out.println("잘못된 입력입니다, 초기화면으로 돌아갑니다.");
			
			}//end switch
			
			
		}//end while
		
		sc.close();
	}//end main

}//end class
