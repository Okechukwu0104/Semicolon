import java.util.Scanner;
public class PrimeNumbersRetry{

	public static void main (String args[]){
	Scanner userInput = new Scanner(System.in);
	System.out.print("Input a positive integer");
	int numberInput = userInput.nextInt();

	int counter = 0;
		for (int count = 1; count <= numberInput; count++){
		if(numberInput % count ==0) counter++;
		
		}

		if(counter ==2)System.out.print("Its a prime number");
		else System.out.print("This is not a prime number");
		
	}

}