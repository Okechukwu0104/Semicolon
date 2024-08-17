import java.util.Scanner;
import java.lang.Math;

public class CirclePerimeter 
{
	public static void main (String args[])
	{
	Scanner userInput = new Scanner (System.in);

	System.out.print ("input your radius (I prefer it this way :)  ) :");

	double radiusEntry = userInput.nextDouble();

	double perimeterCalc = 2 * radiusEntry * 3.14159  ;
	double areaCalc = Math.pow(radiusEntry, 2) * 3.14159 ;
	
	float perimeterConvert = (float) perimeterCalc ;
	float areaConvert = (float) areaCalc ; 

	System.out.print ("area = " + areaConvert + "\nand perimeter = " + perimeterConvert );
	}
}