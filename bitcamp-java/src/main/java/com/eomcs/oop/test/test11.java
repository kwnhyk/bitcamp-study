package com.eomcs.oop.test;

public class test11 {

	
	
	
	
	public static void main(String[] args) {

		 class Member{
			int no;
			String name;
			int birthYear;
			char gender;
			float height;
			float weight;
			boolean personalTraining;
			
		}


	

		 Member[ ] arr  = new Member[3000];
		 int count = 0;
		 while(count < 3000) {
			 arr[count] = new Member();
			 count++;
		 }
		
		
}

}
