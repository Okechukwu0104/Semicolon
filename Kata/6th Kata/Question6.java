

import java.util.Scanner;


    class Question6{

	public static void main(String args[]){

 	    Scanner integer = new Scanner(System.in);
	    System.out.print("input your integer");
	    int number = integer.nextInt();
	
		boolean result =  isSquare(number);
		System.out.print(result);
	}


		public static boolean isSquare(int integer){
		int counter = 0;

		for(int count = 1; count<= integer; count++ ){
		    if(count*count == integer) {
			return True;
			}	

			}
			return False;
		}
		
		
}



    