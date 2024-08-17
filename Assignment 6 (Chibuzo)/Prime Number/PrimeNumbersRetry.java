import java.util.Scanner;
public class PrimeNumbersRetry{

	public static void main (String args[]){
	Scanner userInput = new Scanner(System.in);
	System.out.print("Input a positive integer");

	int numberInput = userInput.nextInt();
	
		if (numberInput % 2 ==0){
		System.out.print(numberInput + " is not a prime number");
		}else {System.out.print("this is a prime number");}

		//for(number = 0; number <=Mat.sqr)
	}

}