package com.eomcs.lmsst.handler;

import java.util.Iterator;
import java.util.List;

import com.eomcs.lmsst.domain.Member;

public class MemberListCommand implements Command {


	  List<Member> memberList;
	  
	  
	  public MemberListCommand(List<Member> list) {
	    this.memberList = list;
	  }
	  @Override
	public void execute() {
		    // Member 객체의 목록을 저장할 배열을 넘기는데 크기가 0인 배열을 넘긴다.
		    // toArray()는 내부에서 새 배열을 만들고, 값을 복사한 후 리턴한다.
		   /* Member[] arr = this.memberList.toArray(new Member[] {});
		    for (Member m : arr) 
		    */
			  Iterator<Member> iterator = memberList.iterator();
			  while(iterator.hasNext()) {
				  Member m = iterator.next();
		      System.out.printf("%d, %s, %s, %s, %s\n", 
		          m.getNo(), m.getName(), m.getEmail(), 
		          m.getTel(), m.getRegisteredDate());
		    }
		  }
}
