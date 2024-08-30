import java.util.Scanner;

    public class PositiveSubtraction{
	public static void main(String args[]){

	
		int result = positiveSubtraction(numberOne, numberTwo);
		System.out.print("Answer: "+ result);


}


		public static int positiveSubtraction(int numberOne,int numberTwo){

		Scanner userInput = new Scanner(System.in);
        	System.out.print("Enter 1st integer: ");
       		 int numberOne = userInput.nextInt();

		 System.out.print("Enter 2nd integer: ");
       		 int numberTwo = userInput.nextInt();

		
		if (numberOne < numberTwo){
			int result = numberTwo - numberOne ; 
			System.out.print(result);
		}else{ int result = numberOne - numberTwo;
			System.out.print(result);
			}






}


    }


	

	