package com.eomcs.basic.ex04;


//변수와 블록
public class Exam81{
    public static void main(String[] args){
    int a;
    //메서드 안에 블록을 이용하여 변수의 사용 범위를 통제할 수 있다.
    {
    	
    //블록 안에서 블록 밖 변수 사용 가능
    	a = 100;
    	int b;
    	
    	
    }
    if(true) {
    	//int a =200;
    	
    	int b =200;
    }
    //b = 300;//컴파일 오류
    }
    
    }
    
