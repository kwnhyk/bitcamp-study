package com.eomcs.oop.ex03.test;

public class Engine {
	int valve;
	int sylinder;
	int cc;
	int oilstate;
	


Engine(int sylinder,int valve, int cc){
	this.sylinder = sylinder;
	this.valve = valve;
	this.cc = cc;
	this.oilstate = 0;
	
}
void cleanOil() {
	this.oilstate = 10;
}
}