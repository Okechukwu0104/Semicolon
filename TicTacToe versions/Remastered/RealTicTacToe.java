import java.util.Scanner;

public class RealTicTacToe{
    public static void main(String args[]){
	
	Scanner userInput = new Scanner(System.in);
	String [][] input = new String [3][3];

	System.out.println("Welcome to tic-tac-toe game\n");

	int entryPoints = 1;

	  for(int i = 0; i < 3; i++) {		
            for(int j = 0; j < 3; j++) {
		if(j ==0)System.out.print("     ");
                input[i][j] = "["+entryPoints+"]";
		entryPoints++;
		System.out.print(input[i][j]);
            }
		System.out.println();
        }
	
		System.out.println();



	
	int count = 0, xCount = 0, oCount = 0;
	while(count != 9){
	     System.out.println("input position of play");
		int position = userInput.nextInt();
		int play = position-1; 

	  System.out.println("input x or o ");
		String userEntry = userInput.next();
	    if(userEntry.equals("x") || userEntry.equals("o")){
	
		int row = play / 3;
                int column = play % 3;
		if(input[row][column].matches("\\[\\d+\\]")) {
	     	    input[row][column] = "["+userEntry+"]";

		if(userEntry .equals("x"))xCount++;
		else oCount++;

	     	    count++;
		}else {System.out.println("position taken...Try again");}






		for(int i =0; i<3; i++){
	  	 for(int j = 0; j<3; j++){
	
			if(j ==0)System.out.print("     ");

			System.out.print(input[i][j] + "   ");
	   }
	
		System.out.println();
	}

		System.out.println("       \n Plays: X: "+xCount+"   O: "+oCount);
		
	    }
		else System.out.println("input x or o pls ");

		
	}
	


	





    }


}


