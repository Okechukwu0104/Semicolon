

import java.util.Scanner;


    class SquareTwo{

	public static void main(String args[]){

 	   

		int result = squareOf(square);
		System.out.print(result);
		
	}


	public static int squareOf(int number){

	 Scanner userInput = new Scanner(System.in);
	    System.out.print("input an integer");
		int square = userInput.nextInt();

	return(int) Math.pow(number,2);

	}
    }