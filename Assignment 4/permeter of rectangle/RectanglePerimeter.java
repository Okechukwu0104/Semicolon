import java.util.Scanner;
import java.lang.Math;

public class RectanglePerimeter  
{
	public static void main (String args[])
	{
	Scanner userInput = new Scanner (System.in);

	System.out.print("Input the width of the rectangle:");
	double widthEntry = userInput.nextDouble();

	System.out.print("input the height of the rectangle:");
	double heightEntry = userInput.nextDouble();
	
	double areaCalc = widthEntry * heightEntry ;
	double addition = widthEntry + heightEntry ;
	double perimeterCalc = 2 * addition ;

	float areaConvert = (float)areaCalc;
	float perimeterConvert = (float)perimeterCalc;

	System.out.print("area of the rectangle = " + areaConvert + "\nand the perimeter = " + perimeterConvert);
	}

}