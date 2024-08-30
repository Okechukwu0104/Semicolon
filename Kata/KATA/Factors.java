import java.util.Scanner;

public class Factors{

	public static void main(String args[]){

 	    
		
		
		
	}


	    public static int factorOf(int number){	

		Scanner userInput = new Scanner(System.in);
	    System.out.print("input Integer");
		int input = userInput.nextInt();
		int result = factorOf(input);

		int counter = 0;
	    for (int count = 1; count <=number; count++){
		
		if(number % count ==0){ 
		counter+=1;
		}
		
		}
	  System.out.print("There are "+ counter + " factors of " + input);	
	}

    }