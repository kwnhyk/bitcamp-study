package com.eomcs.basic.ex07x.test;

public class test03 {
	public static void main(String[] args) throws Exception{
		// 배열의 값 중에서 최대 값을 출력하라.
		int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};
		reverse(values);
		printValues(values);
		}

	
	
 static void reverse(int [] values) {
	 int count = values.length >>1 ;
	 int temp = 0;
	 for(int i = 0,  j = values.length;  i  <  count ;  i++, j--) {
		 temp = values[i];
		 values[i]=values[j];
		 values[j]=temp;
		 
		 System.out.printf("%3d ", values[i]);
		 
	 }
	 
	 System.out.println();
	 
 }
 static void printValues(int[] values, int currPos) {
		for(int i = 0; i <values.length; i++) {
			
			if (i == currPos) {
				System.out.printf("%3d<- ",values[i]);
			}else {
				System.out.printf("%3d   ",values[i]);
			}
		}
		System.out.println();
		
	}
	static void printValues(int[] values) {
		for(int i = 0; i <values.length; i++) {
			System.out.printf("%3d ", values[i]);
		}
		System.out.println();
		
	}
}

