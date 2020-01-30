package com.eomcs.io.ex08;

import java.io.IOException;
import java.io.OutputStream;

public abstract class DecoratorOutputStream extends OutputStream {
	
	
	
	OutputStream in;
	public DecoratorOutputStream(OutputStream in) {
		this.in = in;
		
	}
	
	
	@Override
	public void write(int b) throws IOException {
	in.write(b);	
	
	}
	@Override
	public void close() throws IOException {
		in.close();
		
		
	}
}
