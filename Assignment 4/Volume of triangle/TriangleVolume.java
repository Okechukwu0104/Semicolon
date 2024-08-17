import java.util.Scanner;
import java.lang.Math;

public class TriangleVolume 
{
public static void main (String args[])
	{
	Scanner userInput = new Scanner (System.in);
	
	System.out.print("Drop your triangles legth of sides: ");
	double sidesLength = userInput.nextDouble();
	
	double lengthSquared = Math.pow(sidesLength, 2);
	double squareRoot = Math.sqrt(3);
	double squareRootCalc = squareRoot / 4;
	
	double areaCalc = squareRootCalc * lengthSquared ;
	double VolumeCalc = areaCalc * sidesLength ; 

	float areaConvert = (float) areaCalc ;
	float volumeConvert = (float)VolumeCalc ;

	System.out.printf(" The area is :  " + areaConvert + "\nThe volume of the Trianglar prism is  " + volumeConvert);
	}
}