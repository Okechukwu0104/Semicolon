import java.util.Scanner;
import java.lang.Math;
class RunwayLength
{
	public static void main (String args[])
	{
	Scanner userInput = new Scanner(System.in);
	System.out.println("Enter Speed in m/s:");
	int speedValue = userInput.nextInt ();

	System.out.println("Enter acceleration in m/s^2:");
	double accelerationValue = userInput.nextDouble ();

	double vSquared = Math.pow(speedValue , 2) ;
	double accelerationTimes2 = 2 * accelerationValue ; 
	double finalAnswer = vSquared / accelerationTimes2 ;
	
	System.out.println("The minimum ruway length for this airplane is :" + finalAnswer);
	
	}
}