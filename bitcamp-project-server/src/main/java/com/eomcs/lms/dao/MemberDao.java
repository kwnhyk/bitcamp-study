package com.eomcs.lms.dao;

import java.util.List;

import com.eomcs.lms.domain.Member;

public interface MemberDao {

	
	
	  //서블릿 객체들이 데이터를 다룰때 사용할 메서드를 정의한다.
	  public int insert(Member member) throws Exception ;
		
	  default List<Member> findByKeyword(String keyword) throws Exception {
		    return null;
		  }
	 
	
		  
	  public int update(Member member ) throws Exception;
		

	  public int delete(int no) throws Exception;

	  public List<Member> findAll() throws Exception;
		
	  public Member findByNo(int no) throws Exception;
	  }
