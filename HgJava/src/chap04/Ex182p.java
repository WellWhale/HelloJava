package chap04;

public class Ex182p {

	public static void main(String[] args) {
		
		//1에서 100까지 정수 중 3의 배수 합, 3의 배수의 갯수
		int num1 = 0;
		int num2 = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				num1 += i;
				num2++;
			}
		}
		System.out.printf("1에서 100까지의 정수 중 3의 배수 합은 \"%d\" 이다.\n", num1);
		System.out.printf("1에서 100까지의 정수 중 3의 배수 총 갯수는 \"%d개\" 이다.", num2);

		
		
		
		
	}
}
