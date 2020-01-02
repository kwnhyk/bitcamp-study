// 캡슐화(encapsulation) - 필요한 이유
package com.eomcs.oop.ex07.b;
class Score{
	String name;
	int kor;
	int eng;
	int math;
	int sum;
	float aver ;
	 
	void compute() {
		this.sum = this.kor+this.eng+this.math;
		this.aver = this.sum /3f;
	}
}

public class Exam0110 {


	
    public static void main (String[] args) {
        // 환자 데이터를 등록해보자!
        Score c1 = new Score();
        c1.name = "홍길동";
        c1.kor = 100;
        c1.eng = 100;
        c1.math = 50;
        c1.compute();
        System.out.printf("%d+%d+%d=%d \n   avg=%f",c1.kor,c1.eng,c1.math,c1.sum,c1.aver);
        // 위의 코드의 문제점을 분석!
        // => 각각의 값이 인스턴스 변수에 들어갈 수 있는 값이기 때문에 컴파일 오류는 발생하지 않는다.
        // => 그러나, "환자" 데이터로서 유효한 값은 아니다!
        // => 위의 데이터는 거의 괴물 데이터라 볼 수 있다.
        //    즉 환자를 추상화시킨 목적을 상실한 것이다.
        //    즉 추상화가 무너진 것이다!
        // => Customer는 환자 데이터를 다루기 위해서 만든 클래스이지,
        //    괴물이나 비과학적 데이터를 다루기 위해서 만든 클래스가 아니다.
        //    즉 유효하지 않은 데이터를 넣게 되면 클래스를 정의한 이유를 상실하게 된다.
        // 이를 방지하기 위해 만든 문법이 "캡슐화(encapsulation)"이다.
        //
        // 캡슐화?
        // => 인스턴스의 변수에 추상화 목적에 맞는 유효한 값만 넣을 수 있도록
        //    외부 접근을 제한하는 문법이다.
        // => 제한 범위
        //    private   : 클래스 내부에서만 접근 가능
        //    (default) : 클래스 내부 + 같은 패키지
        //    protected : 클래스 내부 + 같은 패키지 + 자식클래스
        //    public    : 모두 접근 가능!
        // 
    }
  
}







