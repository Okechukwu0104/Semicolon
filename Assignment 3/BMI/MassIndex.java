import java.util.Scanner;
import java.lang.Math;

class MassIndex 
{
public static void main (String args[])
	{
	Scanner userInput = new Scanner (System.in);

	System.out.print("Enter weight in pounds:");
	double pounds = userInput.nextDouble();

	System.out.print("Enter height in inches:");
	double height = userInput.nextDouble();
		
	double poundsCalc = pounds * 0.45359237;
	double heightCalc = height * 0.0254;
	double heightSquared = Math.pow(heightCalc, 2);

	double finalResult = poundsCalc / heightSquared ;

	System.out.print("BMI is " + finalResult );
	
	}
}