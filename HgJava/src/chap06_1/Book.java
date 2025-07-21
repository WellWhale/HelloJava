package chap06_1;

public class Book {
	//필드
	private int bookNum;// 프라이빗으로 다 바꿈
	private String bookName;
	private int bookPry;
	
	
	
	
	public int getBookNum() {//프라이빗 이어도 외부에서 쓸수있게 하는기능
		return bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public int getBookPry() {
		return bookPry;
	}




	//생성자: constructor
	Book(int bookNum, String bookName, int bookPry) {
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookPry = bookPry;
	}
	
	//메소드: method
}//end calss
