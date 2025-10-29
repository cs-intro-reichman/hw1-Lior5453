// Computes the future value of a saving investment.
public class FVCalc 
{
	public static void main(String[] args)
	{
		int currentValue = Integer.parseInt(args[0]);
		double annualInterestRate = Double.parseDouble(args[1]);
		int numYears = Integer.parseInt(args[2]);
		
		double fututeValue = currentValue * Math.pow((1 + (annualInterestRate / 100)), numYears); // Dividing intrest rate by 100 so it will be in precentage

		System.out.println("After " + numYears + " years, $" + currentValue + " saved at " + annualInterestRate + "% will yield $" + (int)fututeValue);
	}
}