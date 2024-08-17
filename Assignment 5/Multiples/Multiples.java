import java.util.Scanner;
import java.lang.Math;

class Multiples
{
public static void main (String args[])

	{
	Scanner userInput = new Scanner (System.in);

	System.out.print ("input your first number: ");
	int firstValue = userInput.nextInt();

	System.out.print("input your second number: ");
	int secondValue = userInput.nextInt();

	int firstTripled = firstValue * 3 ;
	int secondDoubled = secondValue * 2 ;
	int finalValue = firstValue % secondValue;
	
	if (finalValue == 0)
	{System.out.print(firstValue + " is a multiple of " + secondValue); }
	
	else 
	{System.out.print(firstValue + " is not a multiple of " + secondValue); }
	
	}
}