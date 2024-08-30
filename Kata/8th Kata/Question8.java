import java.util.Scanner;

public class Question8{

	public static void main(String args[]){
	Scanner valueInput = new Scanner (System.in);
		System.out.print("Input an integer");
	int number = valueInput.nextInt();
		
		long factorial = (long)factorialOf(number);
		System.out.print(factorial);
	}



	public static int factorialOf (int numberInput){
		int counter = 1;
	    for (int count = 1; count <=numberInput; count++){
		
		counter*=count;
		
		
	    }
	 return counter;
      }
	
}