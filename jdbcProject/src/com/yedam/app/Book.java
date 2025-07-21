package com.yedam.app;

public class Book {
	private int id;
	private String title;
	private String author;
	private int price;
	
	//우클릭 -> 소스 -> 유징필드 사용해서 만든것
	public Book(int id, String title, String author, int price) {
//		super(); //부모클래스, 아직 안배웠음
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book() {}//기본생성자
	
	//우클릭 -> 소스 -> getter setter로 만든것
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}
