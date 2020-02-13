package com.eomcs.lms.dao;

import java.util.List;

import com.eomcs.lms.domain.Board;

public interface BoardDao{


	
//데이터를 저장하고 꺼내는 방식에 상관없이
	//DAO사용법을 통일하기 위해
	//메서드 호출 규칙을 정의한다
	

	  public int insert(Board board) throws Exception ;
		
	

		
	
	  public int update(Board board ) throws Exception;
		 

	  public int delete(int no) throws Exception;
		 
		 
		  
	 
	  public List<Board> findAll() throws Exception;
		
	  public Board findByNo(int no) throws Exception;
		
	
}