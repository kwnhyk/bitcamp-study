package com.eomcs.oop.ex08.test;


public class F extends Object{
F(){//파라미터가 없는 생성자를 default construnctor 라고 부른다.

    super();//모든 생성자는 첫 문장으로 수퍼클래스의 생성자를 호출해야 한다.

}
F(int i) {
    this();//수퍼 클래스의 생성자 대신 자기 자신의 다른 생성자를 호출할 수 있다.
}
F(String s){
//super 클래스의 생성자나 자신의 생성자나 모두 첫 문장으로 와야하기 때문에 
//다음과 같이 나란히 호출할 수 없다.
    super();
    //this();
}
F(int a, int b){
    //수퍼 클래스의 생성자 호출을 생략하면 기본으로 수퍼 클래스의 default 생성자를 호출한다.
    //super();

}
}

class F2 extends F{
F2(int a){
    //생성자가 한 개 이상 있으면 컴파일러는 default 생성자를 만들지 않는다.

}

}
class F3 extends E2{
F3(){
    //수퍼 클래스에 기본 생성자가 없을 때 개발자가 직접/
    //어떤 수퍼 클래스의 생성자를 호출할지 지정해야 한다
    super(100);//E2(int) 생성자를 호출한다.

}


}
class TestD{
public static void main(String[] args){
    D3 obj = new D3();//D3가 상속하고 있는 수퍼클래스의 인스턴스 변수까지 생성한다
    //


}
}