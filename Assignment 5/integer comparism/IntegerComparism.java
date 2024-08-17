import java.util.Scanner;
import java.lang.Math;

public class IntegerComparism
{
public static void main (String args[])

	{
		Scanner userInput = new Scanner (System.in);
		System.out.print("Enter an integer:");

		int integerEntry = userInput.nextInt();
		double squareCalc = Math.pow(integerEntry,2);

	if (integerEntry == 100)
		{
		System.out.println("The given integer is equal to 100");
		} else 
		{System.out.println("The given integer is not equal to 100");}

		if (squareCalc == 100)
		{
		System.out.println("Squaring the integer is equal to 100");
		}else
		{
		System.out.println("Squaring the integer is not equal to 100");
		}
	
	if (integerEntry < 100 )
		{
		System.out.println("The integer is less than 100");
		}
	
		if (squareCalc < 100)
		{
		System.out.println("Squaring the integer is less than 100");
		}


		if (integerEntry > 100 )
		{
		System.out.println("The integer is greater than 100");
		}
	
	if (squareCalc > 100)
		{
		System.out.println("Squaring the integer gave a result that is greater than 100");
		}

	}
	
}