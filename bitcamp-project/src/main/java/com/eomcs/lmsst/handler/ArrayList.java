package com.eomcs.lmsst.handler;

import java.util.Arrays;



public class ArrayList {

	  static final int DEFAULT_CAPACITY = 3;
	
    Object[] list ;
    int size = 0;
	
    public ArrayList() {
    	this.list = new Object[DEFAULT_CAPACITY];
    }
    public ArrayList(int capacity) {
    	if(capacity < DEFAULT_CAPACITY ||capacity >10000)
    		this.list = new Object[DEFAULT_CAPACITY];
    	else
    		this.list = new Object[capacity];
    }
	public Object[] toArray() {
	/*Board[] arr = new Board[this.size];
		for(int i  = 0; i< this.size;i++) {
			arr[i] = this.list[i];
		}
		*/
	return Arrays.copyOf(this.list, this.size);
		
	}
	public void add(Object obj) {
		if(this.size == this.list.length) {
			int oldCapacity = this.list.length;
			int newCapacity = oldCapacity +(oldCapacity >>1);
			/*Board[] arr = new Board[newCapacity];
			for(int i = 0; i< this.list.length; i++) {
				arr[i] = this.list[i];
			}
			this.list = arr;
			*/
			this.list = Arrays.copyOf(this.list, newCapacity);
			System.out.printf("새배열을 저장%d",newCapacity);
		}
		this.list[this.size++] =obj;
		// TODO Auto-generated method stub
		
	}
	public Object get(int idx) {
	if(idx >=0&& idx<this.size) {
		return this.list[idx];
	}else {
		 return null;
}
}
}