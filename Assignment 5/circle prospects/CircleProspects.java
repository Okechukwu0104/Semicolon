import java.util.Scanner;


class CircleProspects
{
	public static void main (String args[])
	{
	Scanner userInput = new Scanner(System.in);
	
	System.out.print("input your circles radius: \n");
	float radiusValue = userInput.nextFloat() ;
	
		System.out.printf("Diameter = %f", 2*radiusValue);
		System.out.printf("\nCircumference = %f", 2*radiusValue*(Math.PI));
		System.out.printf("\nArea = %f",(Math.pow(radiusValue,2))* Math.PI);
	


	}

}