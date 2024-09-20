import java.util.Scanner;

public class TicTacToe3d{
    public static void main(String args[]){
	
	Scanner userInput = new Scanner(System.in);
	String [][] input = new String [3][3];


	
	int count = 0;
	while(count != 9){
	  System.out.println("input x or o ");
		String userEntry = userInput.next();
	    if(userEntry.equals("x") || userEntry.equals("o")){
	
		int row = count / 3;
                int column = count % 3;
	     	input[row][column] = userEntry;
	     	count++;
		
	    }
		else System.out.println("input x or o pls ");
	}
	


	for(int i =0; i<3; i++){
		
	   for(int j = 0; j<3; j++){
	
		if(j ==0)System.out.print("     ");

		System.out.print(input[i][j] + " ");
	   }
	
		System.out.println();
	}






    }


}


