import java.util.Scanner;

    public class Question3{
	public static void main(String args[]){

	Scanner userInput = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int numberOne = userInput.nextInt();

	 System.out.print("Enter 2nd integer: ");
        int numberTwo = userInput.nextInt();

		int result = positiveSubtraction(numberOne, numberTwo);
		System.out.print("Answer: "+ result);


}


		public static int positiveSubtraction(int numberOne,int numberTwo){
		
		if (numberOne < numberTwo){
			int result = numberTwo - numberOne ; 
			return result;
		}else{ int result = numberOne - numberTwo;
			return result;
			}






}


    }


	

	