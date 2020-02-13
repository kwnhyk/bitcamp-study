package com.eomcs.lms.dao;

import java.util.List;

import com.eomcs.lms.domain.Board;

public class BoardObjectFileDao extends AbstractObjectFileDao<Board> implements BoardDao{


	
	
	public BoardObjectFileDao(String filename) {
		super(filename);
	}
	
	  //서블릿 객체들이 데이터를 다룰때 사용할 메서드를 정의한다.
	  @Override
	public int insert(Board board) throws Exception {
		  Board originBoard = findByNo(board.getNo());
			
			if(originBoard !=null) {//같은 번호의 게시물이 있다면
				return 0;
			}
			
			list.add(board);//새 게시물을 등록한다
		  saveData();		  
		  return 1;
	  }
	
	
	  @Override
	public int update(Board board ) throws Exception{
		  for(int i = 0; i<list.size();i++) {
			  if(list.get(i).getNo()==board.getNo()) {
				  list.set(i,board);
				  saveData();
				  return 1;
			  }
		  }
		  return 0;
	  }

	  @Override
	public int delete(int no) throws Exception{
		  for(int i = 0; i<list.size();i++) {
			  if(list.get(i).getNo()==no) {
				  list.remove(i);
				  saveData();
				 return 1;
	  }
			  
}
		  return 0;
		  
	  }
	  @Override
	public List<Board> findAll() throws Exception{
		  return list;
	  }
	  @Override
	public Board findByNo(int no) throws Exception{
		  for(Board b : list) {
			  if(b.getNo()==no) {
				  return b;
			  }
		  }
		  return null;
			  
		  }
	  @Override
		protected <K> int indexOf(K key) {
			  for(int i = 0; i<list.size(); i++) {
				  if(list.get(i).getNo() == (int) key)// k 가 어떤타입인지 형변환해서 사용하라
					  return i;
			  }
			  return -1;
		}
	  }

