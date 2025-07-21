package chap04;

public class Gugudan {

	public static void main(String[] args) {
		//구구단
		
//		for(int dan = 2; dan <= 9; dan++) {
//			System.out.print("*** "+dan+"단 ***\n");
//			for(int gob = 1; gob <= 9; gob++) {
//				System.out.printf("%d x %d = %d\n", dan, gob, dan*gob);
//			}
//			System.out.print("\n");
//		}
		
		
		
		
		
		
		//구구단2
		
		for(int hr = 2; hr <= 9; hr++) {
			System.out.printf("%5d단", hr);
		}
		System.out.println();
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%2dx%d=%2d", j, i, j*i);
			}
			System.out.println();
		}
		
		
		
		
		
		
		//별찍기1
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		//별찍기2
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 4; j - i >= 1; j--) {
//				System.out.printf(" ");
//			}
//			
//			for(int k = 1; k <= i; k++) {
//				System.out.printf("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		//별찍기2 새로운방식
//		for(int i = 1; i <= 4; i++) {
//			for(int j = 4; j >= 1; j--) {
//				if(i < j) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.print("\n");
//		}
		
		
		
		
		
		//문제3, 몇번만에 탈출했는지 출력 추가
		int count = 0;
		
		while(true) {
			int dice1 = (int)(Math.random() *6) +1;
			int dice2 = (int)(Math.random() *6) +1;
			int hap = dice1 + dice2;
			count++;
			
			System.out.printf("첫번째:%d 두번째:%d\n", dice1, dice2);
			
			if(hap == 5) {
				System.out.println("두 주사위의 합이 \"5\"가 되었습니다.");
				System.out.printf("%d번 만에 탈출에 성공하였습니다.\n", count);
				break;
			}
		}
		
		
		
		
		
		
		//문제4
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				int result = 4*i + 5*j;
				if(result == 60) {
					System.out.printf("x는\"%d\" y는\"%d\"\n", i, j);
				}
			}
		}
		
		
		
		
		
		
	}
}
