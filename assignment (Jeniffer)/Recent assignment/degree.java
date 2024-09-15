/*
..collect your degree input from the user in celcius

..perform a calculation to convert it to Fareheit:(9/5) * degreeInput + 32 and save the result as farenheit_Result

..print out the result


*/

import java.util.Scanner;
public class degree{
    public static void main(String args[]){

	Scanner userInput = new Scanner(System.in);
	System.out.print("input your temperature in degree");
	float celciusInput = userInput.nextFloat();
	
	float const1 = 9/5;

	float Farenheit = (const1 * celciusInput) + 32;
	System.out.print(Farenheit);
	




    }


}