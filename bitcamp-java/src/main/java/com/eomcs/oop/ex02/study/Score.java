package com.eomcs.oop.ex02.study;

public class Score {
	String name;
	int k,e,m;
	 int sum;
	 float avg;

public  void calculator() {
	this.sum = this.k+this.e+this.m;
	this.avg = this.sum / 3f;
}

}
