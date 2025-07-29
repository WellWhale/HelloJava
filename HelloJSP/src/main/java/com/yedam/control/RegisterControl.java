package com.yedam.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;

public class RegisterControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// WEB-INF/html/register_form.html 을 열어주는 기능
		try {
			//요청재지정
			req.getRequestDispatcher("WEB-INF/html/register_form.jsp").forward(req, resp);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
