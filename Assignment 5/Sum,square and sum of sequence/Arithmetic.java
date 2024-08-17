import java.util.Scanner;
import java.lang.Math;

public class Arithmetic
{
public static void main (String args[])

	{
	Scanner userInput = new Scanner(System.in);

	System.out.print("input your first integer: ");
	double firstNumber =  userInput.nextDouble();	

	System.out.print("input your second integer: ");
	double secondNumber = userInput.nextDouble();


	double squareOne = Math.pow(firstNumber,2);
	double squareTwo = Math.pow(secondNumber,2);
	double squareOneSum = squareOne + squareOne;
	double squareTwoSum = squareTwo + squareTwo;
	double numberDifference = squareOne - squareTwo;

	System.out.println("1) the square of " + firstNumber + " is "+ squareOne);
	System.out.println("2) the square of " + secondNumber + " is "+ squareTwo);
	System.out.println("3)The sum of the first number squared is: " + squareOneSum + " \nand the sun of the second number squared is: " + squareTwoSum + "\n4) The difference between the square of each number is: " +  numberDifference);
	
	
	}
}