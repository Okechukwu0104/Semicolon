import java.util.Scanner;
import java.lang.Math;

class AverageAcceleration
{

public static void main(String args[])
{
 Scanner userInput = new Scanner(System.in);

	System.out.print("Enter V0 (initial velocity)");
	double initialVelocity = userInput.nextDouble();

	System.out.print("Enter V1 (final velocity)");
	double finalVelocity = userInput.nextDouble();

	System.out.print("Enter t (time)");
	double timeTaken = userInput.nextDouble();

	double velocitySubtraction = finalVelocity - initialVelocity;
	 double finalAnswer = velocitySubtraction / timeTaken;

	System.out.print("The average acceleration is :" + finalAnswer );

}

}