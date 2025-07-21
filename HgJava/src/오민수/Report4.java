package 오민수;

import java.util.Scanner;

public class Report4 {

	public static void main(String[] args) {
		
		//4번
		Scanner sc = new Scanner(System.in);
		
		for(int i = 2; i <= 9; i++) {
			System.out.printf("%3d단   ", i);
		}
		
		System.out.println();
		
		for(int j = 1; j <= 9; j++) {
			for(int k = 1; k <= 8; k++) {
				System.out.printf("%dx%d=%2d ", (k+1), j, (k+1)*j);
			}
			System.out.println();
		}
		
		sc.close();

	}

}
