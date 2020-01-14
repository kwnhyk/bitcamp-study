package com.eomcs.lmsst.util;


/*Generalization 1단계:
//=> ArrayList와 LinkedList 사이의 공통 분모를 추출하여 수퍼 클래스를 정의한다.
//=> ArrayList와 LinkedList는 이렇게 정의한 수퍼 클래스를 상속 받는다.
//2단계
//서브 클래스에 공통 분모를 물려주는 용도의 클래스는 인스턴스를 생성하지 못하게 추상 클래스로 선언
//서브 클래스에서 구현할 메서드를 그냥 일반 메서드로 정의하면
//서브 클래스를 정의하는 개발자가 해당 메소드를 오버라이딩 한다는 보장을 하지 못한다.
//상속 받는 메서드 중에서 반드시 서브클래스에서 오버라이딩 해야 할 메서드라면
//문법으로 표시를 하는 것이 좋다
//이런 용도로 만든 문법이 "추상 메서드"이다
//추상 메서드의 오버라이딩은 선택 사항이 아니라 필수 사항이다
 따라서 서브 클래스를 만드는 개발자는 반드시 이 추상 메서드를 구현해야 한다.
 
 추상메서드
 =>서브 클래스가 반드시 재정의 해야 할 메서드라면 수퍼 클래스에서 정의하지 않는다.
 또한 서브 클래스가 반드시 오버라이딩 하도록 강제하고 싶을 떄 사용하는 문법이다*/
public abstract class AbstractList<E> {
protected int size;

public int size() {
 return size;
}

public abstract void add(E e) ;
 //ArrayList나 LinkedList는 동작 방법이 다르기 때문에 
 //여기서 구현할 필요가 없다.
	//서브클래스가 반드시 구현하도록 강제한다


public abstract void add(int index, E value);


public abstract E get(int index) ;


public abstract E set(int index, E e);

public abstract  E remove(int index) ;

public abstract Object[] toArray();

public abstract E[] toArray(E[] arr) ;
}






