package com.yedam;

import org.apache.ibatis.session.SqlSession;

import com.yedam.common.DBUtil;
import com.yedam.mapper.BoardMapper;
import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;
import com.yedam.vo.BoardVO;

public class Main {
	public static void main(String[] args) {
		
		BoardService svc = new BoardServiceImpl(); // 업무기능
		
		
		//위에 업무기능 때문에 빠진다
//		SqlSession sqlSession = DBUtil.getInstance().openSession();
//		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		
		//전체조회
//		List<BoardVO> list = mapper.selectList();
//		for(BoardVO board : list) {
//			System.out.println(board.toString());
//		}
		
		//단건조회
		int searchNo = 1;
//		BoardVO board = mapper.selectBoard(searchNo);
//		System.out.println(board.toString());
		
		//조회,조회수 증가 => 업무(조회: 글번호조회 + 조회카운트)
//		BoardVO board = mapper.selectBoard(searchNo);
//		mapper.updateCount(searchNo);
		
		BoardVO board = svc.searchBoard(searchNo);
		
		System.out.println(board.toString());

	}//end main
}//end class
