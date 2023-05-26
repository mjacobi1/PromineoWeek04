package week4;

import java.util.Arrays;

public class Week04Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Coding Steps — Arrays and Methods
//		
//		Create an array of int called ages that contains the following values: 
//		3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 23};
				
//		Programmatically subtract the value of the first element in the array from the value 
//		in the last element of the array (i.e. do not use ages[7] in your code). Print the result 
//		to the console.  
		
		int subtraction = (ages[ages.length - 1]) - ages[0];
		System.out.println(subtraction);
//		
//		Add a new age to your array and repeat the step above to ensure it is dynamic (works 
//		for arrays of different lengths).
		
		// I added the number 23 to the end of my Array and ran it again.		

//		Use a loop to iterate through the array and calculate the average age. Print the result 
//		to the console.
		
		int calcAverage = 0;
		for (int number : ages) {
			calcAverage += number;
		}
		int average = calcAverage / ages.length;
		System.out.println(average);
		
//		Create an array of String called names that contains the following values: “Sam”, 
//		“Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
						
//		Use a loop to iterate through the array and calculate the average number of letters per 
//		name. Print the result to the console.

		int lettersInNames = 0;
		for (String name : names) {
			lettersInNames += name.length();
		}
		int averageNames = lettersInNames / names.length;
		System.out.println(averageNames);
		
//		Use a loop to iterate through the array again and concatenate all the names together, 
//		separated by spaces, and print the result to the console.
		
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();

//		How do you access the last element of any array?
		
		// The last element in an array will have an index of the array length minus one. This 
		// written as arrayName[array.length - 1]

//		How do you access the first element of any array?
		
		// The first element in any array will have an index of [0] because we start counting 
		// at 0 in Java. This can be written as arrayName[0]

//		Create a new array of int called nameLengths. Write a loop to iterate over the previously 
//		created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[6];
		for (int i = 0; i < names.length; i ++) {
			nameLengths[i] = names[i].length();
		}
		
		System.out.println(Arrays.toString(nameLengths));
		
		 

//	
////		Write a loop to iterate over the nameLengths array and calculate the sum of all the elements 
////		in the array. Print the result to the console.

		int totalSum = 0;
		for (int name : nameLengths) {
			totalSum += name;
		}
		System.out.println(totalSum);
		
		///////testing methods below//////
		
		System.out.println(concatThreeTimes("hello", 5));
		
		System.out.println(fullName("Mary", "Jacobi"));
		
		int[] methodArray = {1, 303, 5};
		System.out.println(greaterThan(methodArray));
		
		double[] methodDoubleAverage = {4.5, 2.0, 5.75}; 
		System.out.println(elementAverage(methodDoubleAverage));
		
		double[] methodDoubleAverageDuo = {2.5, 1.0, 2.75}; 
		System.out.println(greaterAverage(methodDoubleAverage, methodDoubleAverageDuo));
		
		boolean isHotOutside = false;
		double moneyInPocket = 20.00;
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		
		
	}		
	
	
//		Write a method that takes a String, word, and an int, n, as arguments and returns the word 
//		concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the 
//		method to return “HelloHelloHello”).
	
		public static String concatThreeTimes(String word, int n) {			
			String finalConcat = "";
			for (int i = 0; i < n; i++) {
				finalConcat += word;			}
			return(finalConcat);
		}
	
//		Write a method that takes two Strings, firstName and lastName, and returns a full name 
//		(the full name should be the first and the last name as a String separated by a space).

		public static String fullName(String firstName, String lastName) {
			String fullName = firstName + " " + lastName;			
			return(fullName);
		}
		
//		Write a method that takes an array of int and returns true if the sum of all the ints in 
//		the array is greater than 100.

		public static boolean greaterThan(int[] a) {
			
		int sumOfAll = 0;
		for (int number : a) {
			sumOfAll += number;
		}
		if (sumOfAll > 100) {
			return(true);
		} else {
			return(false);
		}
		}
		
//		Write a method that takes an array of double and returns the average of all the elements in 
//		the array.
		
		public static double elementAverage(double[] array) {
			double averageAll = 0;
			for (int i = 0; i < array.length; i++) {
				averageAll += array[i];
			}
			double finalAverage = averageAll / array.length;
			return(finalAverage);
		}
		
//		Write a method that takes two arrays of double and returns true if the average of the 
//		elements in the first array is greater than the average of the elements in the second array.
		
		public static boolean greaterAverage(double[] one, double[] two) {
			double averageOne = 0;
			for (int i = 0; i < one.length; i++) {
				averageOne += one[i];
			}
			double finalAverageOne = averageOne / one.length;
			
			double averageTwo = 0;
			for (int i = 0; i < two.length; i++) {
				averageTwo += two[i];
			}
			double finalAverageTwo = averageTwo / two.length;
			if (finalAverageOne > finalAverageTwo) {
				return(true);
			} else {
				return(false);
			}
		}
	
		
//		Write a method called willBuyDrink that takes a boolean isHotOutside, and a double 
//		moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater 
//		than 10.50.
		
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50) {
				return(true);
			} else {
				return(false);
			}
		}
		
//		Create a method of your own that solves a problem. In comments, write what the method does 
//		and why you created it.
		
		public static boolean willHelpToBathroom(int time, boolean hasToGo) {
			if ((time > 2 && time < 3) || (time > 6 && time < 7) || hasToGo == true) {
				return(true);
			} else {
				return(false);
			}
		}
		
		// This is a very short method that explains when I help someone at work. It is my own
		// method. I check on people at the times in the method OR if they tell me that they need help.

}
