package 오민수;

public class Report7 {

	public static void main(String[] args) {
		

		//7번
		for(int i = 1; i <= 50; i++) {
			int a = i / 10;
			int b = i % 10;
			int count = 0;
			char ha = '♥';
			
			if(a == 3 || a == 6 || a == 9) {
				count++;
			}
			
			if(b == 3 || b == 6 || b == 9) {
				count++;
			}
			
			if(count == 1) {
				System.out.printf("%-4s ", ha);
			} else if (count == 2) {
				System.out.printf("%s%-3s ", ha, ha);
			} else {
				System.out.printf("%-4d ", i);
			}
			
			if(i % 10 == 0) System.out.println();//10 단위로 줄 변경
		}

		
		
	}// end
}
