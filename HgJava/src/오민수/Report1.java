package 오민수;
import java.util.Scanner;

public class Report1 {
	public static void main(String[] args) {
		
		//1번
		Scanner sc = new Scanner(System.in);
		System.out.print("윤년 계산을 할 년도를 입력하시오: ");
		int year = Integer.parseInt(sc.nextLine());
		
		if (year % 4 == 0) {//4년 단위로 떨어지고(필수)
			if(year % 100 != 0 || year % 400 == 0) {//100년 단위로 "안"떨어 "지거나" 400년 단위로 떨어지면 윤년
				System.out.printf("%d년도는 윤년입니다.\n", year);
			} else {
				System.out.printf("%d년도는 평년입니다.\n", year);
			}
		} else {
			System.out.printf("%d년도는 평년입니다.\n", year);
		}

		sc.close();
	}
}
