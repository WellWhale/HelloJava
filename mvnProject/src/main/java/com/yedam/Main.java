package com.yedam;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.yedam.common.DBUtil;
import com.yedam.mapper.BookMapper;
import com.yedam.vo.Book;

public class Main {
	public static void main(String[] args) {
		//RunExe는 Runnable을 구현하는 클래스
//		Runnable exe = new RunExe(); <- Runnable 이 더 크기때문이 이렇게도 가능하다
		// 인터페이스 < 구현클래스
		RunExe exe = new RunExe();
		exe.run();
		
//		DBUtil util = new DBUtil();
//		SqlSessionFactory factory = util.getInstance();
//      static 방식이 아닐때
		
		SqlSessionFactory factory = DBUtil.getInstance();
// 	    static 일때
		
		SqlSession sqlSession = factory.openSession(); // SqlSession 객체를 반환.
		
		//인터페이스 - 구현클래스
		BookMapper mapper = sqlSession.getMapper(BookMapper.class);
		Book book = mapper.selectBook(1000);//이걸 프린트하면 단건조회
		List<Book> list = mapper.selectList();//이걸 프린트하면 전체조회
		//이게 요즘방식?
		
		//단건 조회
		Book book1 = sqlSession.selectOne("com.yedam.mapper.BookMapper.selectBook", 1000);
		System.out.println(book1);
//		System.out.println(book.toString());
		
		//전체 조회
		List<Book> list2 = sqlSession.selectList("com.yedam.mapper.BookMapper.selectList");
		for(Book book2 : list2) {
			System.out.println(book2.toStr());
		}
		
	}//end method
}//end main