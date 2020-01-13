package com.eomcs.lmsst.util;

import com.eomcs.lmsst.util.LinkedList.LinkedList;

public class Queue<E> extends LinkedList<E> {
	
	public void offer(E value) {
		this.add(value);
	}
	public E poll() {
		return(E) this.remove(0);
		
	}
	@Override
	public Queue<E> clone() {
		Queue<E> temp = new Queue<>();
		for(int i = 0 ; i <this.size();i++) {
			temp.offer(this.get(i));
		}
		return temp;
	}
	/*
	@Override
public	 Object clone(){
		// TODO Auto-generated method stub
		try {
			return(Queue) super.clone();
		}catch(CloneNotSupportedException ex) {
			System.out.println(ex);
			return null;
		}

	}
	*/
}
