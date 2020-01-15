package com.eomcs.lmsst.util;
//목록 객체의 사용 규칙을 따로 정의
public interface List<E> {
	//사용 규칙(호출할 메서드의 시그니쳐)이기 때문에 모든 메서드는 추상 메서드이다.
	//또한 규칙은 공개되어야 하기 때문에 모든 메서드는 public이다.
	//문법 public abstract 리턴타입 메서드명(파라미터,....);
	//public을 생략 가능
	//abstract 리턴타입 메서드명(파라미터,....);
	//abstract 생략 가능
	//리턴타입 메서드명(파라미터,...);

	public abstract void add(E e) ;


	

	void add(int index, E value);


	E get(int index) ;

	 E set(int index, E e);

	E remove(int index) ;

	Object[] toArray();

	E[] toArray(E[] arr) ;
	int size();
	//내부에 보관된 값을 꺼내주는 메서드 규칙을 추가한다.
	//값을 저장하는 방식에 따라 구현 방법이 다르기 때문에
	//서브 클래스가 구현해야만 하는 추상 메서드이다.
	Iterator<E> iterator();
	
}
