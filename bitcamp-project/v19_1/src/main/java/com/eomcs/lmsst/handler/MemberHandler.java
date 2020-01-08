package com.eomcs.lmsst.handler;

import java.sql.Date;
import java.util.Scanner;

import com.eomcs.lmsst.domain.Member;
import com.eomcs.lmsst.util.ArrayList2;

public class MemberHandler {
  
  ArrayList2<Member> memberList;

  public Scanner input;

  public MemberHandler(Scanner input) {
    this.input = input;
    this.memberList = new ArrayList2<>();
  }
  
  public void listMember() {
    // Member 객체의 목록을 저장할 배열을 넘기는데 크기가 0인 배열을 넘긴다.
    // toArray()는 내부에서 새 배열을 만들고, 값을 복사한 후 리턴한다.
    Member[] arr = this.memberList.toArray(new Member[] {});
    for (Member m : arr) {
      System.out.printf("%d, %s, %s, %s, %s\n", 
          m.getNo(), m.getName(), m.getEmail(), 
          m.getTel(), m.getRegisteredDate());
    }
  }

  public void addMember() {
    Member member = new Member();

    System.out.print("번호? ");
    member.setNo(input.nextInt());
    input.nextLine(); // 줄바꿈 기호 제거용

    System.out.print("이름? ");
    member.setName(input.nextLine());

    System.out.print("이메일? ");
    member.setEmail(input.nextLine());

    System.out.print("암호? ");
    member.setPassword(input.nextLine());

    System.out.print("사진? ");
    member.setPhoto(input.nextLine());

    System.out.print("전화? ");
    member.setTel(input.nextLine());

    member.setRegisteredDate(new Date(System.currentTimeMillis()));
    
    this.memberList.add(member);
    
    System.out.println("저장하였습니다.");
  }
  public void updateMember() {
		System.out.print("멤버 인덱스? ");		
		int index = input.nextInt();
		input.nextLine(); // 숫자 뒤의 남은 공백 제거

		Member oldMember = this.memberList.get(index);
		if (oldMember == null) {
			System.out.println("멤버 인덱스가 유효하지 않습니다.");
			return;
		}
		String inputStr = null;
		boolean changed=false;
		Member newMember = new Member();
		System.out.printf("이름(%s)? ", oldMember.getName());
		inputStr = input.nextLine();
		if(inputStr.equals("")) {
			newMember.setName(oldMember.getName());
		}else {
			newMember.setName(inputStr);
		}
		
		System.out.printf("이메일(%s)? ", oldMember.getEmail());
		inputStr = input.nextLine();
		if(inputStr.length()==0) {
			newMember.setEmail(oldMember.getEmail());
		}	else {
				newMember.setEmail(inputStr);
			}
			System.out.printf("암호(%s)? ", oldMember.getPassword());
		inputStr = input.nextLine();
		if(inputStr.length()==0) {
			newMember.setPassword(oldMember.getPassword());
		}	else {
				newMember.setPassword(inputStr);
      }
      System.out.printf("사진(%s)? ", oldMember.getPhoto());
      inputStr = input.nextLine();
      if(inputStr.length()==0) {
        newMember.setPhoto(oldMember.getPhoto());
      }	else {
          newMember.setPhoto(inputStr);
        }
        System.out.printf("전화번호(%s)? ", oldMember.getTel());
        inputStr = input.nextLine();
        if(inputStr.length()==0) {
          newMember.setTel(oldMember.getTel());
        }	else {
            newMember.setTel(inputStr);
          }
	
  }
  
  public void deleteMember() {
    System.out.print("게시글 인덱스? ");
    int index = input.nextInt();
    input.nextLine(); // 숫자 뒤의 남은 공백 제거
    
    Member Member = this.memberList.get(index);
    
    if (Member == null) {
      System.out.println("게시글 인덱스가 유효하지 않습니다.");
      return;
    }
    
    this.memberList.remove(index);
    
    System.out.println("게시글을 삭제했습니다.");
  }


public void detailMember() {
  System.out.print("게시글 인덱스? ");
  int index = input.nextInt();
  input.nextLine(); // 숫자 뒤의 남은 공백 제거
  
  Member member = this.memberList.get(index);
  
  if (member == null) {
    System.out.println("수업 인덱스가 유효하지 않습니다.");
    return;
  }
  
  System.out.printf("번호: %d\n", member.getNo());
  System.out.printf("이름 %s\n",member.getName());
  System.out.printf("이메일: %s\n", member.getEmail());
  
  System.out.printf("암호:%s\n ",member.getPassword());

  System.out.printf("사진? %s\n",member.getPhoto());

  System.out.printf("전화?%s \n",member.getTel());



}
}
