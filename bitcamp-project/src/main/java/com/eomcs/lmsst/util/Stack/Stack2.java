package com.eomcs.lmsst.util.Stack;

import java.util.Arrays;

public class Stack2<E> implements Cloneable {
	private static final int DEFAULT_CAPACITY = 10;
	Object[] elementData;

	int size;

	public Stack2() {
		this.elementData = new Object[DEFAULT_CAPACITY];
		this.size = 0;

	}

	public void push(E value){
		if(this.size == this.elementData.length){
		grow();

		}
		this.elementData[size++]=value;

	
}
	@SuppressWarnings("unchecked")
	public E pop(){
		if(this.empty())
			return null;
		E value =(E)this.elementData[--this.size];
		this.elementData[this.size] =null;
		return value;


	}
	public boolean empty(){
		return this.size ==0;
	}
	private void grow(){
		
		this.elementData = Arrays.copyOf(elementData, newCapacity());	
		
			


	
	
}

	private int newCapacity(){
		int oldCapacity = this.elementData.length;
		return  oldCapacity + (oldCapacity >>1);
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public Stack2<E> clone(){
		try {
			Stack2<E> temp = (Stack2<E>)super.clone();
		Object[] arr = new Object[this.size];
		for(int i = 0; i< this.size; i++) {
			arr[i] = this.elementData[i];
		}
		temp.elementData =arr;
		return temp;
			
		}catch(CloneNotSupportedException ex) {
			System.out.println(ex);
			return null;
		}
		
	}
}