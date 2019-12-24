package com.eomcs.basic.ex07x.test;

public class test01x {
  public static void main(String[] args) {
    // 배열의 값 중에서 최대 값을 출력하라.
    int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};
    int value = max(values);
    System.out.println(value);
    // 출력결과:
    // 78
  }
  
  static int max(int[] values) {
	  int maxValue = values[0];
	  for(int i = 1 ; i < values.length; i++) {
		  if(values[i] > maxValue) {
			  maxValue = values[i];
		  }
	  }
	  
	  
	  // 파라미터로 배열을 받고, 그 값 중에서 최대 값을 찾아 리턴한다.
    return  maxValue;
  }
}
