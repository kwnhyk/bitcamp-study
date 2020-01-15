package com.eomcs.lmsst.util;
//Iterator 규칙에 따라 
public class ListIterator<E>implements Iterator<E> {






	List<E> list;
	int cursor;

	public ListIterator(List<E> list) {
		this.list = list;
	}
	@Override
	public boolean hasNext() {
		return cursor < list.size();
	}
	@Override
	public E next() {
		return list.get(cursor++);
	} 


}
