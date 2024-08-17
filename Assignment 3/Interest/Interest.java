import java.util.Scanner;
import java.lang.Math;

public class Interest

{
	public static void main(String args[])
	{
		Scanner userInput = new Scanner(System.in);

		System.out.print("Enter Balance: ");
		double balance = userInput.nextDouble ();

		System.out.print("Enetr the percentage interest rate: ");
		double interestRate = userInput.nextDouble ();
	
		double percentage = interestRate / 100 ;
		double totalRateCalc = percentage / 1200 ;
		double finalRate = balance * totalRateCalc;

		float rateDouble2Float = (float) finalRate;

		float finalResult = rateDouble2Float * 100;
	
		System.out.printf("The total calculation gave: " + finalRate + "\nTherefore, the intrest is " + finalResult + "." );
	}
}