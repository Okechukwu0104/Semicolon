

import java.util.Scanner;


    class Question9{

	public static void main(String args[]){

 	    Scanner userInput = new Scanner(System.in);
	    System.out.print("input an integer");
		int square = userInput.nextInt();

		int result = squareOf(square);
		System.out.print(result)
		
	}


	public static int squareOf(int squaredNumber){

	int number = Math.pow(number,2);

	return number;

	}
    }