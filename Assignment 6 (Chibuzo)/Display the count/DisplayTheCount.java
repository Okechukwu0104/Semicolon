import java.util.Scanner;

public class DisplayTheCount
{
public static void main(String args[])
	{
 	Scanner userInput = new Scanner(System.in);
	int positive =0, negative = 0, zero = 0	;

	for(i=1; i>0; i++){
	System.out.print("enter as many Numbers as you want");
	int numberInput = userInput.nextInt();
	
	
	if(numberInput > 0){
	positive++;

	}else if(numberInput < 0){

	negative++;

	}else{
	zero++;

	System.out.print("press 0 to end input ");
	int userDecision = userInput.nextInt()
	
	if (userDecision == 0){
	break;
	    }
	
	System.out.println("The result of the numbers entered are as follows:");
	System.out.println("zeros:"+ zero +"\nPositive"+positive +"\nNegative"+ negative);

	}


	}
}