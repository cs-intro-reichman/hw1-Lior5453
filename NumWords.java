// Prints a given number using a hundreds, tens, and units notation.

// This function gets 1 number and prints its value with houndreads, tens and ones
public class NumWords 
{
	public static void main(String args[]) 
	{
		int number = Integer.parseInt(args[0]);

		System.out.println(number/100 + " hundreds, " + number/10%10 + " tens, and " + number%10 + " ones.");
	}
}