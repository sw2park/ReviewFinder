package com.reviewfinder.movie;

import java.io.IOException;

import com.reviewfinder.action.ActionForward;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.mv")
public class MovieFrontController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String requestURI = request.getRequestURI();
		ActionForward forward = null;
		
		if(requestURI.equals("/movie/MovieBasicSetteing.mv")) {
			forward = new MovieBasicInsertAction().execute(request, response);
		}else if(requestURI.equals("/movie/InsertMovieDB.mv")) {
			forward = new InsertMovieAction().execute(request, response);
<<<<<<< HEAD
		}else if(requestURI.equals("/movie/InsertBoxoffice.mv")){
			
		}else if(requestURI.equals("/test.mv")) {	//임시
			forward = new TestAction().execute(request, response);
		}
=======
		}
		
>>>>>>> fd71cdebd6ba44d5db5a9bf8b987de4b142db769
		if(forward!=null) {
			if(forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			}else {
				RequestDispatcher disp = request.getRequestDispatcher(forward.getPath());
				disp.forward(request, response);
			}
		}
	}
	
}









