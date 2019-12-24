package com.eomcs.basic.ex07x.test;

public class test02 {
	public static void main(String[] args) throws Exception{
		// 배열의 값 중에서 최대 값을 출력하라.
		int[] values = {34, 4, -3, 78, 12, 22, 45, 0, -22};
		sort(values);
		System.out.println("-------------------------");

		printValues(values);

	}
	static void sort(int[] values) throws Exception{
		for(int x =( values.length - 1); x > 0; x--) {


		int temp = 0;
		for(int i = 0; i <x; i++) {
			Thread.currentThread().sleep(1000);
			if(values[i] > values[i+1]) {
				temp = values[i];
				values[i] = values[i+1];
				values[i+1] = temp;
			}
			Thread.currentThread().sleep(1000);
			printValues(values,i);
		}
	}
	}
	static void printValues(int[] values) {
		for(int i = 0; i <values.length; i++) {
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
}

