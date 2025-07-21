package chap05;

public class Arr204p {

	public static void main(String[] args) {
		//배열 생성 , 배열데이터 활용
		//204p 예제
		
		int[] scores;//주소값 자체가 없는상태
		scores = new int[] {83, 90, 87};//힙영역에 int타입 scores[83, 90, 87] <- 방 생성
		int sum1 = 0; // int타입 sum1이란 방에 숫자 0 넣음
		for(int i = 0; i < 3; i++) {
			sum1 += scores[i];// sum1의 방에다가 scores[방]을 3번방까지 집어넣음(0,1,2니까)
		}
		System.out.println("총합: " + sum1);
		//1번방은 83 2번방은 90 3번방은 87 이었고 그걸 한방에 다 더해서 넣었으니 총합이 나온다
		
		
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합: " + sum2);
		System.out.println();
		
		
		
		//int 항의 배열, 선언, 크기 : 5
		//배열에 50~100사이의 수 5개 입력 random
		//배열의 합 계산
		
		int[] scoresTwo = new int[5];
		for(int i = 0; i < 5; i++) {
			scoresTwo[i] = (int)(Math.random() *51) +50;
		}
		int sumTwo = add(scoresTwo);
		System.out.println(sumTwo);//아래와 같다
		System.out.println(add(scoresTwo));//아래와 같다
		
		
		
	}//end main
	
	

	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}//end add
	
	
}//end class
