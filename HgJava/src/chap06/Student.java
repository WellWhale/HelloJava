package chap06;

public class Student {
	//객체 생성 클래스
	
	//필드: 객체의 속성(데이터)
		String name;
		int kor;
		int eng;
		int math;
		
	//생성자: 객체 생성시 속성값을 초기화, 클래스명과 이름이 같다
		Student(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
	
	//메소드: 객체의 기능
		int tot() {
			int sum = this.kor + this.eng + this.math;// 총합
			return sum;
		}
		
		double avg() {
			return this.tot() / 3.0;// 3과목 평균
		}
		
		char grade() {
			char gradeChar;
			switch((int)this.avg()/10) {//평균을 int로 가져와서 10으로 나눈다
			case 10:
			case 9:
				gradeChar = 'A'; break;
			case 8:
				gradeChar = 'B'; break;
			case 7:
				gradeChar = 'C'; break;
			case 6:
				gradeChar = 'D'; break;
			default:
				gradeChar = 'F';
			}
			
			return gradeChar;// 등급을 리턴한다
		}
		
		
}//end class
