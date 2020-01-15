package com.eomcs.lmsst.util;

public abstract class AbstractList<E> implements List<E> {
	protected int size;

	public int size() {
		return size;
	}
	


@Override
public Iterator<E> iterator() {
	//List객체 에서 값을 꺼내줄 Iterator 객체를 준비하여 리턴한다.
	return new ListIterator<E>(this);
}

}






