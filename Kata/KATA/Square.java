

import java.util.Scanner;


    class Square{

	public static void main(String args[]){

 	    
	
		boolean result =  isSquare(number);
		System.out.print(result);
	}


		public static boolean isSquare(int integer){

		Scanner integer = new Scanner(System.in);
	    System.out.print("input your integer");
	    int number = integer.nextInt();
		
		int counter = 0;

		for(int count = 1; count<= integer; count++ ){
		    if(count*count == integer) {
			return True;
			}	

			}
			return False;
		}
		
		
}



    