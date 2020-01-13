package com.eomcs.lmsst.util.Stack;

import java.util.Arrays;

public class Stack<E> implements Cloneable{
private static final int DEFAULT_CAPACITY =10;
	
	Object[] elementDate;  
	int size;
	
	
	public Stack() {
		this.elementDate =  new  Object[DEFAULT_CAPACITY];
		this.size = 0;
		
	}
	public void push(E value) {
		if(this.size == elementDate.length) {
		/*	int oldCapacity = elementDate.length;
			int newCapacity = oldCapacity +(oldCapacity >>1);
			this.elementDate = Arrays.copyOf(elementDate, newCapacity);*/
			grow();
		}
		this.elementDate[size++] =  value;
		
	}
	//배열크기를 늘리는 코드를 별도의 메서드grow()로 분리(리팩토링)
	private void grow() {
		
	
		this.elementDate = Arrays.copyOf(elementDate, newCapacity());
	}
	//배열크기 계산 메소드 따로 분리 (리팩토링)
	private int newCapacity() {
		int oldCapacity = elementDate.length;
	return  oldCapacity +(oldCapacity >>1);
	}
	@SuppressWarnings("unchecked")
	public E pop() {
	
		if(this.empty())
			return null;
		E value =(E) this.elementDate[--this.size];
		 this.elementDate[this.size] = null;
		 return value;
	}
	//empty 추가
	public boolean empty() {
		return this.size == 0;
	}
	/*	@Override
		public  Stack clone()  {
		try {	
			return (Stack) super.clone();
			
		}catch(CloneNotSupportedException ex){
			//Object 의  clone() 메서드는
			//복제가 허용된 객체에 대해서만 해당 인스턴스 변수를 복제한다.
			//복제가 허용되지 않은 객체에 대해서 clone()을 호출하면
			//CloneNotSupportedException 실행 오류가 발생한다.
			//해결책 ?
			//clone()을 재정의하는 메서드는 반드시 Cloneable 인터페이스를 지정해야 한다.
			//즉 해당 객체가 복제할 수 있음을 표시하는 문법이다.
			System.out.println(ex);
			return null;
		
	
}}*/
	//deep copy
	@SuppressWarnings("unchecked")
	@Override
	public  Stack<E> clone()  {
	try{
		Stack<E> temp = (Stack<E>) super.clone();
	Object[] arr = new Object[this.size];
	for(int i = 0; i < this.size; i++) {
		arr[i] = this.elementDate[i];
	}
	temp.elementDate = arr;
	return temp;
	}catch(CloneNotSupportedException ex) {
		System.out.println(ex);
		return null;
	}
}
}