import java.util.Scanner;
public class Kilo
{
	static Scanner userInput = new Scanner (System.in);
	public static void main (String args[])
	{

	
	System.out.print ("Enter a number in pounds: ");
	

	if (userInput.hasNextInt()) {
		int poundsInput = userInput.nextInt();
		double convertedInput = poundsInput / 0.454 ;
		System.out.println(poundsInput + " " + "pounds is" + " " + convertedInput + " " + "kilograms");
	} else
	{ System.out.println("Lets try this again....shall we?");}

	
	}
}