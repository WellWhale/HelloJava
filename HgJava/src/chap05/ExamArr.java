package chap05;

public class ExamArr {

	public static void main(String[] args) {
		// 배열 과제 1번
		// 크기는 10, 데이터는 1~100사이 난수
		int[] scores = new int[10];
		int hap = 0;
		int min = 100;
		int max = 0;
		int count = 0;
		String countStr = "";
		
		System.out.print("랜덤 수: ");
		
		for(int i = 0; i < 10; i++) {
			scores[i] = (int)(Math.random() *100) +1;
			System.out.print(scores[i] + " ");
			hap += scores[i];
			if(min > scores[i]) {
				min = scores[i];
			}
			if(max < scores[i]) {
				max = scores[i];
			}
			if(i % 4 == 0) {
				count++;
			}
			if(i % 4 == 0) {
				countStr += "i";
			}
		}
		System.out.println("\n총합: " + hap);
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
		System.out.println("4의 배수의 갯수: " + count);
		System.out.println("4의 배수들: " + countStr);
		// 배열의 요소 중 4의 배수 출력
		// 4의 배수 갯수 출력
		
		
		//2차원 배열
		//배열 선언
		int [][] twoArr = {
				{80,90},
				{70,60,50}
		};
		//2차원 배열 출력
		for(int i = 0; i < twoArr.length; i++) {
			for(int j = 0; j < twoArr[i].length; j++) {
				System.out.printf("| %d ", twoArr[i][j]);
			}
			System.out.println("|");
		}
		
		
		
		System.out.println();// 결과 줄 나누기용 의미x
		
		
		
		//과제2번
		int[][] by = {
				{1,2,3},
				{1,2},
				{1},
				{1,2,3}
		};
		for(int i = 0; i < by.length; i++) {
			for(int j = 0; j < by[i].length; j++) {
				System.out.printf("| %d ", by[i][j]);
			}
			System.out.println("|");
		}
		
		
		System.out.println();// 결과 줄 나누기용 의미x
		
		
		//과제3번
		int[][] js = new int[3][10];
		int sum = 0;
		for(int i = 0; i < js.length; i++) {
			for(int j = 0; j < js[i].length; j++) {
				js[i][j] = (int)(Math.random() *2);
				sum += js[i][j];
				System.out.printf("| %d ", js[i][j]);
			}
			System.out.println("|");
		}
		System.out.println("관객 총합: " + sum);
		
		
		
		System.out.println();// 결과 줄 나누기용 의미x
		
		
		
		//과제4번
		int[][] stu = new int[3][5];
		
		for(int i = 0; i < stu.length; i++) {
			for(int j = 0; j < stu[i].length; j++) {
				stu[i][j] = (int)(Math.random() *51) +50;
				System.out.printf("%d ", stu[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < stu.length; i++) {
			double svg1 = 0;
			for(int j = 0; j < stu[i].length; j++) {
				stu[i][j] = (int)(Math.random() *51) +50;
				svg1 += stu[i][j];
			}
			System.out.printf("%d번 학생 평균 = %.2f\n", i+1, svg1/5);
		}
		
		
		System.out.println();// 결과 줄 나누기용 의미x
		
		
		//과제5번
		int countTwo = 0;
		String[] card1 = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] card2 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		
		while(true) {
			int cho1 = (int)(Math.random() *card1.length);
			int cho2 = (int)(Math.random() *card2.length);
			if(countTwo == 5) break;
			System.out.print(card1[cho1] + "의 " + card2[cho2] + "\n");	
			countTwo++;
		}
		
		
		System.out.println();// 결과 줄 나누기용 의미x
		
		
		int[][] arr = new int[3][5];
		
		for(int i = 0; i < 5; i++) {
			int a = (int)(Math.random() *3);
			int b = (int)(Math.random() *5);
			
			
			if(arr[a][b] == 0) {
				arr[a][b] = 1;
			} else {
				i--;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
			    System.out.printf("%d ", arr[i][j]);	
			}
			System.out.println();
		}
		

	}// main end

}// class end
