package chap06;

public class StudentMain {

	public static void main(String[] args) {
		//객체 생성
//		Student st1 = new Student("홍길동", 100, 100, 100);
//		Student st2 = new Student("김길동", 90, 90, 90);
//		Student st3 = new Student("이길동", 80, 80, 80);
//		Student st4 = new Student("나길동", 70, 70, 70);
//		Student st5 = new Student("박길동", 60, 60, 60);
		
		//객체 생성 => 배열에 저장
		//학생리스트 StudentDao에 저장했음
		//불러오기(호출)
		StudentDao stdao = new StudentDao();
		Student[] students = stdao.stData();
		
		//객체 사용
//		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\n",
//				st1.name, st1.kor, st1.eng, st1.math, st1.tot(), st1.avg(), st1.grade());
//		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\n",
//				st2.name, st2.kor, st2.eng, st2.math, st2.tot(), st2.avg(), st2.grade());
//		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\n",
//				st3.name, st3.kor, st3.eng, st3.math, st3.tot(), st3.avg(), st3.grade());
		
		//배열을 이용한 객체 사용
		for(int i = 0; i < students.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\t%s\n",
					students[i].name, students[i].kor, students[i].eng, students[i].math,
					students[i].tot(), students[i].avg(), students[i].grade());
		}
		
	}//end main
}//end class
