import java.util.Scanner;

public class TicTacToe{
    public static void main(String args[]){
	
	Scanner userInput = new Scanner(System.in);
	String [] input = new String [9];



	int count = 0;
	while(count != 9){
	  System.out.println("input x or o ");
		String userEntry = userInput.next();
	    if(userEntry.equals("x") || userEntry.equals("o")){
	     	input[count] = userEntry;
	     	count++;
	    }
		else System.out.println("input x or o pls ");
	}
		
	
		for(count = 0; count < 9; count++){
		    	if(count % 3==0)System.out.print("     ");

			System.out.print(input[count]+" ");
			
		    if(count ==2 || count ==5)System.out.println();
		}

    }
  

}


