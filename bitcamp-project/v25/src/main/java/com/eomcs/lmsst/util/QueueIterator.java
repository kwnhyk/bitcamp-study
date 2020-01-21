package com.eomcs.lmsst.util;

import com.eomcs.lmsst.util.Queue;

//Iterator 규칙에 따라 값을 꺼내주는 클래스 정의
public class QueueIterator<E>implements Iterator<E> {






	Queue<E> queue;

	public QueueIterator(Queue<E> queue) {
		this.queue = queue.clone();
	}
	@Override
	public boolean hasNext() {
		return queue.size()>0;
	}
	@Override
	public E next() {
		return queue.poll();
	} 


}
