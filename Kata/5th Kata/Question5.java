import java.util.Scanner;

public class Question5{

	public static void main(String args[]){

 	    Scanner userInput = new Scanner(System.in);
	    System.out.print("input Integer");
		int input = userInput.nextInt();
		int result = factorOf(input);
		
		System.out.print("There are "+ result + " factors of " + input);
		
	}


	    public static int factorOf(int number){	
		int counter = 0;
	    for (int count = 1; count <=number; count++){
		
		if(number % count ==0){ 
		counter+=1;
		}
		
		}
	  return counter;	
	}

    }