// Generates three integer random numbers in a given range,
// and prints them in increasing order.

// This function gets a range and generates 3 random numbers from 0 to it and prints them
// After that it prints them in order of their sizes
public class Ascend 
{
	public static void main(String[] args) 
	{
		int range = Integer.parseInt(args[0]);

		// Generating the 3 random numers from 0 to range value
		int firstNum = (int)(Math.random() * (range + 1)); // Math.random returns 0.0 - 1.0 not including 1 -> adding 1 to range so it will inculde it
		int secondNum = (int)(Math.random() * (range + 1));
		int thirdNum = (int)(Math.random() * (range + 1));
		
		// Printing the regular 3 numbers
		System.out.println(firstNum + " " + secondNum + " " + thirdNum);

		// Sorting the numbers then printing them again
		int biggestNum = Math.max(firstNum, secondNum);
		biggestNum = Math.max(biggestNum, thirdNum);
		int smallestNum = Math.min(firstNum, secondNum);
		smallestNum = Math.min(smallestNum, thirdNum);
		int middleNum = (firstNum + secondNum + thirdNum) - biggestNum - smallestNum;

		System.out.println(smallestNum + " " + middleNum + " " + biggestNum);
	}
}