package com.reviewfinder.join;

import com.reviewfinder.action.Action;
import com.reviewfinder.action.ActionForward;
import com.reviewfinder.member.dao.MemberDAO;
<<<<<<< HEAD
import com.reviewfinder.member.dao.MemberDTO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;
=======

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
>>>>>>> fd71cdebd6ba44d5db5a9bf8b987de4b142db769

public class LoginAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {

		ActionForward forward = new ActionForward();
<<<<<<< HEAD
		HttpSession Session = req.getSession();
=======
>>>>>>> fd71cdebd6ba44d5db5a9bf8b987de4b142db769
		
		MemberDAO mdao = new MemberDAO();
		
		String userid = req.getParameter("userid");
		String userpw = req.getParameter("userpw");
	
<<<<<<< HEAD
		MemberDTO mdto = mdao.login(userid, userpw);
		
		forward.setRedirect(true);
		mdto.setUserpw(null);
		
		if (mdto != null){ //로그인 성공(성공 시 메인 페이지로 연결해야함)
			Session.setAttribute("session_id", mdto);
			forward.setPath("/qnaboard/BoardList.bo");
		} else {						//로그인 실패
			forward.setPath("/join/login.jsp?flag=false");
=======
		forward.setRedirect(true);
		
		if (mdao.login(userid, userpw) == 1){ //로그인 성공(성공 시 메인 페이지로 연결해야함)
			forward.setPath("http://localhost:8081/index.jsp");
		} else {						//로그인 실패
			forward.setPath("http://localhost:8081/join/login.jsp?flag=false");
>>>>>>> fd71cdebd6ba44d5db5a9bf8b987de4b142db769
		}
	
		return forward;
	}
<<<<<<< HEAD
	
	
=======
>>>>>>> fd71cdebd6ba44d5db5a9bf8b987de4b142db769
}
