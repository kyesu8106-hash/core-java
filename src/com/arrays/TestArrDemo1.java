package com.arrays;

//WAP to Represent 5 from an array..?
public class TestArrDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started!!");

//   step1:Declaration		
		int[] ages;
		
//   step2:Creation
		ages = new int[10];
		
//   step3:initialization
		ages[0] = 21;
		ages[1] = 22;
		ages[2] = 23;
		ages[3] = 21;
		ages[4] = 23;
		ages[5] = 21;
		ages[6] = 22;
		ages[7] = 21;
		ages[8] = 23;
		ages[9] = 21;
		
		
//    step4:representation of for each loop
		for (int age : ages) {
			if (age % 2 == 0) {
				System.out.println(age);
			}
		}
		
//   step4:representation of for loop		
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		System.out.println("main method ended!!");

	}

}
