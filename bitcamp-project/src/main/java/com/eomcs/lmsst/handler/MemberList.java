package com.eomcs.lmsst.handler;

import com.eomcs.lmsst.domain.Member;

public class MemberList {
	static final int MEMBER_SIZE = 100;

	  int memberCount = 0;
	  Member[] members;
	public MemberList() {
		this.members = new Member[MEMBER_SIZE];
	}
	public  void add(Member member) {
		// TODO Auto-generated method stub
		this.members[this.memberCount++]= member;
	}
	public Member[] toArray() {
		Member[] arr = new Member[this.memberCount];
		  for (int i = 0; i < this.memberCount; i++) {
		      arr[i] = this.members[i];
		    }	
		  return arr;
	}
}
