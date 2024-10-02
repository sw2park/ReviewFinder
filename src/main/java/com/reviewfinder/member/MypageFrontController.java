package com.reviewfinder.member;

import java.io.IOException;

import com.reviewfinder.action.ActionForward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.mp")
public class MypageFrontController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
		String requestURI = request.getRequestURI();
		ActionForward forward = null;
	
		switch(requestURI) {
		
		case "/":
			//비밀번호 변경
			break;	
		}
		
		case "/":
			//닉네임 변경
			break;	
		}
	
		case "/":
			//'보관함' 조회
			break;	
		}

		case "/":
			//'보관함' 더보기
			break;	
		}

		if(forward != null) {
	         if(forward.isRedirect()) {
	        	 response.sendRedirect(forward.getPath());
	         }else {
	            RequestDispatcher disp = request.getRequestDispatcher(forward.getPath());
	            disp.forward(request, response);
	         }
	      }
		
	
	}
	
}

