package com.yedam.mapper;

import java.util.List;

import com.yedam.vo.Book;
// 인터페이스 (규칙만 지정)
public interface BookMapper {
	public Book selectBook(int id);//한건
	
	public List<Book> selectList(int page);
	
	public int insertBook(Book book);
	
	public int deleteBook(int id);
}
