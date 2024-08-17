import java.util.Scanner;
import java.lang.Math;
public class DivisibleBy3
{
public static void main (String args[])
	{
	Scanner userInput = new Scanner (System.in);

	System.out.print("input your integer: ");
	int givenInteger = userInput.nextInt();

	double remainderCalc = givenInteger % 3 ;

		if(remainderCalc == 0)
		{
		System.out.print( givenInteger + " is divisible by 3");
		
		}else{System.out.print(givenInteger + " is not divisible by 3");}
	}

}