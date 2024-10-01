package com.reviewfinder.movie.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.reviewfinder.mybatis.SqlMapConfig;

public class MovieDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession session;
	
	public MovieDAO() {
		session = factory.openSession(true);
	}

	// DB에 영화가 있으면 true, 없으면 false
	public boolean checkMoiveDB() {
		boolean result = false;
		int cnt = session.selectOne("Dbtest.checkMoiveDB");
		if(cnt > 0){
			result = true;
		}
		
		return result;
	}

	public void insertMovieDB(HashMap<String, MovieDTO> moviemap) {
		List<MovieDTO> movie = new ArrayList<MovieDTO>();
		for(int i=1;i<=moviemap.size();i++) {
			movie.add(moviemap.get(""+i+""));
		}
		for(int i=0;i<movie.size();i++) {
			if(session.insert("Dbtest.insertMovieDB",movie.get(i))==1) {
				System.out.println("db저장 성공");
			}else {
				System.out.println("실패");
			}
		}
	}
	// 오버로딩
	public void insertMovieDB(List<MovieDTO> movie) {
		for(int i=0;i<movie.size();i++) {
			if(session.insert("Dbtest.insertMovieDB",movie.get(i))==1) {
				System.out.println("db저장 성공");
			}else {
				System.out.println("실패");
			}
		}
	}
	
	// 박스오피스 테이블 추가
	public void insertBoxOffice(HashMap<String, MovieDTO> moviemap) {
		List<MovieDTO> movie = new ArrayList<MovieDTO>();
		for(int i=1;i<=moviemap.size();i++) {
			movie.add(moviemap.get(""+i+""));
		}
		for(int i=0;i<movie.size();i++) {
			if(session.insert("Dbtest.insertBoxOffice",movie.get(i))==1) {
				System.out.println("BOXOFFICE_RANK db저장 성공");
			}else {
				System.out.println("BOXOFFICE_RANK db저장 실패");
			}
		}
	}
	
	public MovieDTO selectMovieFromDB(String movie_title, String movie_date) {
		MovieDTO movie = new MovieDTO();
		HashMap<String, String> title_date = new HashMap<String, String>();
		title_date.put("movie_title", movie_title);
		title_date.put("movie_date", movie_date);
		
		movie = session.selectOne("Dbtest.selectMovieFromDB",title_date);
		
		return movie;
	}
}
