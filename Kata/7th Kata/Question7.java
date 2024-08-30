

import java.util.Scanner;

    class Question7{

	public static void main(String...args){

 	    Scanner userInput = new Scanner(System.in);
	    System.out.print("input first digit");
		int first = userInput.nextInt();

		 System.out.print("input second digit");
		int second = userInput.nextInt();

		 System.out.print("input third digit");
		int third = userInput.nextInt();

		 System.out.print("input fourth digit");
		int fourth = userInput.nextInt();

		 System.out.print("input fifth digit");
		int fifth = userInput.nextInt();

		boolean conclusion =(boolean) isPalindrome(first, second, third, fourth, fifth);
		System.out.print(conclusion);

	}



	public static boolean isPalindrome (int a, int b, int c, int d , int e){
		
		if (a == e && b == d && c==c){
			return (true +"its a palindrone");
		}
		
		return (false +"its not a palindrone");
       
	}

    }