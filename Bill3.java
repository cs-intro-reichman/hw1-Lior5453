// Splits a restaurant bill evenly among three diners.
// The program will get 3 names and the dinner price
// This program will print the value each person will have to pay rounden up
public class Bill3 
{
	public static void main(String[] args) 
	{
	    String firstName = args[0];
		String secondName = args[1];
		String thirdName = args[2];
		int dinnerPrice = Integer.parseInt(args[3]); // each args is a string value, Integer.parseInt makes it be a int value

		double priceEach = (double)dinnerPrice / 3; // dinnerPrice is a int value so changing it to double so we can round up later
		priceEach = Math.ceil(priceEach); // rounding up the price

		System.out.println("Dear " + thirdName + ", " + secondName + ", and " + firstName + ": pay " + priceEach + " Shekels each.");
	}
}
