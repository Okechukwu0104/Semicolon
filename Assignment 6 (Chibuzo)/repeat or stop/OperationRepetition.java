import java.util.Scanner;

public class OperationRepetition
{
	public static void main (String args[])
	{
	Scanner userInput = new Scanner(System.in);

	String userDecision ;
	
	do{
	
	System.out.print ("input the first Number: ");
	int numberOne = userInput.nextInt();
	
	System.out.print ("input the second Number: ");
	int numberTwo = userInput.nextInt();


	int theAnswer = numberOne + numberTwo ;
	
	System.out.print("the sum of " + numberOne + " and "+ numberTwo + " gave: " + theAnswer);

	System.out.print("\nYou want to retry?... (yes/no): ");
	userDecision = userInput.next();

	
	  }while (userDecision.equalsIgnoreCase ("yes"));

	System.out.print("See you later");

	userInput.close();
	


	
	}
}

