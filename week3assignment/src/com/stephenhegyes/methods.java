package com.stephenhegyes;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(concatenateString("Hello", 3));
		
		String firstName = "Stephen";
		String lastName = "Hegyes";
		String fullName = wholeName(firstName, lastName);
		System.out.println(fullName);
		
		int sum = 0;
		int[] question9 = {14, 56, 61};
		
		
		System.out.println(validation(question9, sum));
		
		
		double[] grades = {54.55, 97.30, 76, 81.50};
		System.out.println(average(grades));
		
		
		double[] grade1 = {10, 40, 55};
		double[] grade2 = {1, 5, 15};
		System.out.println(arrayAverages(grade1, grade2));
		
		boolean isHotOutside = true;
		double moneyInPocket = 56.77;
		System.out.println(hotOutside(isHotOutside, moneyInPocket));
		
		
		int[] question13 = {100, 46, 77, 754};
		System.out.println(calculation(question13));
		
	}
	//question 7
	public static String concatenateString(String str, int num) {
		String answer = "";
		for (int i = 0; i < num; i++) {
			answer += str;
		}
		return answer;
	}
	//question 8
	public static String wholeName(String a, String b) {
		String fullName = a + " " + b;
		return fullName;
	}
	
	//question 9
	public static boolean validation(int question9[], int sum) {
		for (int total : question9) {
			sum += total;
			if (sum > 100) {
				return true;
			}
		}
		return false;
		
	}
	//question 10
	public static double average(double[] array3)	{
		double average = 0;
		for (double number : array3)	{
			average += number;
			
		}
	return average / array3.length;
	
	}
	
	
	//Question 11
	static public boolean arrayAverages(double[] array1, double[] array2)	{
		double average1 =0;
		double average2 =0;
		for(double numbers : array2)	{
		average2 += numbers;
	}	
		for(double number : array1)	{
		average1 += number;
		
		if (average1 > average2) {
		return true;
	
	}
	}
	return false;
	}
	
	//Question 12
	
	static public boolean hotOutside(boolean a, double b) {
		if (a = true && b > 10.50) {
			return true;
		} else {
		return false;
	}
	
	}
	
	//Question 13
	static public int calculation(int[] array6) {
		int sum = 0;
		for (int number : array6) {
			sum += number;
		}
		return sum;
	}

	
	
}
