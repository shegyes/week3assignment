package com.stephenhegyes;

public class codingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 33;
		
		int n = ages[0] -= ages[ages.length - 1];
		
		System.out.println(n * -1);
		
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum = sum + ages[i];
		}
		
		double average = sum / ages.length;
		
		System.out.println(average);
		
		
		
		
		
	}

}
