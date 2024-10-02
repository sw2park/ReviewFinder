package com.reviewfinder.member.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.reviewfinder.mybatis.SqlMapConfig;

public class MemberDAO {
	
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession Session;
	
	public MemberDAO() {
		Session = factory.openSession(true);
	}
	
<<<<<<< HEAD
	public MemberDTO login(String userid, String userpw) {
		MemberDTO member = null;
=======
	public int login(String userid, String userpw) { 

		int member = 0;

>>>>>>> fd71cdebd6ba44d5db5a9bf8b987de4b142db769
		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid", userid);
		datas.put("userpw", userpw);
		
<<<<<<< HEAD
		member = Session.selectOne("Member.login",datas);
		
		return member;
	}
	
=======
		member = Session.selectOne("Member.login", datas);
		return member;
	}

>>>>>>> fd71cdebd6ba44d5db5a9bf8b987de4b142db769
	public boolean join(MemberDTO mdto) {
		boolean result = false;
		if(Session.insert("Member.join", mdto) == 1) {
			result = true;
		}
		return result;
	}
	
	public int checkID(String userid) {
		int cnt = 0;
		cnt = Session.selectOne("Member.checkId", userid);
		return cnt;
	}
	
	public int checkName(String username) {
		int cnt = 0;
		cnt = Session.selectOne("Member.checkName", username);
		return cnt;
	}
<<<<<<< HEAD
	
=======
>>>>>>> fd71cdebd6ba44d5db5a9bf8b987de4b142db769

}
