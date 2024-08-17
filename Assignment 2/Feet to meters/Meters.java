import java.util.Scanner;

class Meters
{

	static Scanner userInput = new Scanner (System.in);
	public static void main (String args[])
	{
		System.out.println("Entr a value for feet:");
		double feetValue = userInput.nextDouble();

		double finalAnswer = feetValue * 0.305;
		System.out.println(feetValue + " " + "feet is " + finalAnswer + " meters" );
	}
}