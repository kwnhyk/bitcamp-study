package com.eomcs.lmsst.util;

import com.eomcs.lmsst.util.Stack.Stack;

//Iterator 규칙에 따라 값을 꺼내주는 클래스 정의
public class StackIterator<E>implements Iterator<E> {






	Stack<E> stack;

	public StackIterator(Stack<E> stack) {
		this.stack = stack.clone();
	}
	@Override
	public boolean hasNext() {
		return !stack.empty();
	}
	@Override
	public E next() {
		return stack.pop();
	} 


}
