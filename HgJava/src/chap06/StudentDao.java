package chap06;

public class StudentDao {
	//학생 데이터 생성
	//클래스니까 필드 구성요소 필요
	//필드, 생성자, 메소드
	
	//생성자: 기본생성자 사용할거임 => 아무것도 안쓰면 컴파일할때 자동으로 생성
	
	//메소드
	Student[] stData() {
		Student[] students = {
				new Student("홍길동", 100, 100, 100),
				new Student("김길동", 90, 90, 90),
				new Student("이길동", 80, 80, 80),
				new Student("나길동", 70, 70, 70),
				new Student("박길동", 60, 60, 60),
				new Student("가나다", 50, 50, 50),
				new Student("라마바", 40, 40, 40),
				new Student("사아자", 30, 30, 30),
				new Student("차카타", 20, 20, 20),
				new Student("파하가", 10, 10, 10)
		};
		
		return students;
	}

}
