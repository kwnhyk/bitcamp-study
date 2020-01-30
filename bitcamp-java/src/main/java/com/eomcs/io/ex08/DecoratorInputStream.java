package com.eomcs.io.ex08;

import java.io.IOException;
import java.io.InputStream;

public abstract class DecoratorInputStream extends InputStream {
	InputStream in;
	
	
	
	public DecoratorInputStream(InputStream in) {
		//장식품처럼 붙였다 뗏다 할 수 있는 기능을 수행하는 객체는
		//다른 장식품에 붙일 수 있도록 생성자에서 그 객체의 주소를 받아야 한다.
		this.in = in;
	}
	@Override
	public int read() throws IOException {
		//read()메서드가 호출되면 
		//이 장식품과 연결된 다른 부품의 read()를 실행한다
		return in.read();
	}
	
}
