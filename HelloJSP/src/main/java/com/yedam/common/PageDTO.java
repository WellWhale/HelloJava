package com.yedam.common;

import lombok.Data;

// 페이징정보를 담아놓기위한..
@Data
public class PageDTO {

		private int currPage;//현재페이지정보
		private int start, end;//시작페이지, 끝페이지 지정
		
		public PageDTO(int page, int totalCnt) {
			currPage = page;// 3페이지라 쳤을때 스타트는 1 끝은 10으로 만들고싶다 ->
			end = (int)Math.ceil(page * 1.0 / 10) * 10;//끝 번호 구하기(현재 3페이지라 치고)
			start = end - 9;//스타트 번호
//			 = totalCnt;
		}
}
