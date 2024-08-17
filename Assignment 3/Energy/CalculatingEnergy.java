import java.util.Scanner;
import java.lang.Math;

class CalculatingEnergy
{

public static void main (String args[])
{
	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter the amount of water in kilograms: ");
	double waterAmount = userInput.nextDouble();

	System.out.print("Enter the initial temperature: ");
	double initialTemperature = userInput.nextDouble() ;

	System.out.print("Enter the final temperature: ");
	double finalTemperature = userInput.nextDouble() ;

	double temperatureDifference = finalTemperature - initialTemperature ;
	double energyNeeded = waterAmount * temperatureDifference * 4184 ;

	System.out.print("The energy needed is: " + energyNeeded );
	
}
}