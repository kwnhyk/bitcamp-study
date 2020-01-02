package com.eomcs.oop.ex05.test;

public class Sedan extends com.eomcs.oop.ex05.a.Car {
	public boolean sunroof;
	public boolean auto;
	
	public Sedan() {}
	public Sedan(String model, String maker, int capacity,
			boolean sunroof, boolean auto) {
		super(model,maker,capacity);
		this.sunroof =sunroof;
		this.auto = auto;
		
	}
		
		

}
