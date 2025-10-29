// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat 
{
	public static void main(String[] args) 
	{
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1)); // Creating int with first and second charcters from args
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4)); // Creating int from third and fourth characters from args

		// formating the minutes into a 2 digits - incase the minutes lower then 10 fixing it by adding 0 before the number
		String formatted = String.format("%02d", minutes); 

		if (hours < 12)
		{
			System.out.print(hours + ":" + formatted + " AM");
		}	
		else if (hours == 12)
		{
			System.out.print(hours + ":" + formatted + " PM");
		}
		else // If after 12:00 remove 12 hours to change to PM time
		{
			System.out.println((hours - 12) + ":" + formatted + " PM");
		}
	}
}