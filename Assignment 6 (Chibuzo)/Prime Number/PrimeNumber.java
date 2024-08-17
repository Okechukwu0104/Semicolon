import java.util.Scanner;

class PrimeNumber
{
public static void main(String args[])
	{
 	Scanner userInput = new Scanner(System.in);
	System.out.print("Input a positive integer ");

	int numberInput = userInput.nextInt();

	double number = (double) numberInput;
	double squareCalc = Math.sqrt(number);
	int remainder = (int)squareCalc;
	//int remainder = (%)squareCalc;
	
	System.out.println("these are the predctions:");

		if(numberInput <=1)
		{
		System.out.println(numberInput + " is not a prime number");
		}
		if((numberInput == 2) || (numberInput == 3) )
		{
		System.out.println(numberInput + "is a prime numbers");
		}
		
		if((numberInput % 3 != 0) && (numberInput % 5 != 0) && (numberInput % 7 != 0) && (numberInput % 9 != 0));
		{
		System.out.print(" this is not a prime number, ");
		}
		if(remainder == 0)
		{
		System.out.println(numberInput +" also can be divided evenly. (not a prime number)");	
		}

		if(remainder != 0)
		{
		System.out.println(numberInput +" also cannot be divided evenly.(prime number");	
		}


		else{System.out.print(numberInput + " is not a prime number");}
		
		

		

		
	}
}