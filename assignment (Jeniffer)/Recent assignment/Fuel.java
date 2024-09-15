import java.util.Scanner;
public class Fuel{
public static void main(String args[]){
Scanner userInput = new Scanner(System.in);

    System.out.print("Input your budget: "); 

	float userBudget = userInput.nextFloat();
	float fuelPrice = 885;
	float affordableLiters = userBudget/fuelPrice;

	System.out.print("You can buy: "+ affordableLiters + " Liters");

	}
    }


