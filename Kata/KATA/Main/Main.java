import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Kata kata = new Kata();

        System.out.print("""
                1 -> Divide (Quotient)
                2 -> Even
                3 -> Factorial
                4 -> Factors
                5 -> Palindrome
                6 -> Positive Subtraction
                7 -> Prime Number
                8 -> Square (Boolean eg. 25 = 5*5)
                9 -> Square (Integer)
                """);

        System.out.print("Input an option: ");
        int numberPicked = userInput.nextInt();

        switch (numberPicked) {
            case 1:
                System.out.print("Input your first integer: ");
                int first = userInput.nextInt();

                System.out.print("Input your second integer: ");
                int second = userInput.nextInt();

                kata.divide(first, second);
                break;

            case 2:
                System.out.print("Input your number: ");
                int number = userInput.nextInt();

                boolean even = kata.isEven(number);  
                System.out.println("Is the number even? " + even);  
                break;

	    case 3:
		System.out.print("Input an integer");
		int numberInput = userInput.nextInt();
		
		long factorial = (long)kata.factorialOf(numberInput);
		System.out.print(factorial);
		break;


	    case 4: 
	    System.out.print("input Integer");
		int input1 = userInput.nextInt();
		int result = kata.factorOf(input1);
		
		System.out.print("There are "+ result + " factors " );
		break;

	
	    case 5:
	    System.out.print("input first digit");
		int one = userInput.nextInt();

		 System.out.print("input second digit");
		int two = userInput.nextInt();

		 System.out.print("input third digit");
		int third = userInput.nextInt();

		 System.out.print("input fourth digit");
		int fourth = userInput.nextInt();

		 System.out.print("input fifth digit");
		int fifth = userInput.nextInt();

		boolean conclusion = (boolean) kata.isPalindrome(one, two, third, fourth, fifth);
		System.out.print("is userInput a palindrone? "+ conclusion);

		break;



	     case 6: 
       		 System.out.print("Enter 1st integer: ");
        	int numberOne = userInput.nextInt();

	 	System.out.print("Enter 2nd integer: ");
        	int numberTwo = userInput.nextInt();

		int answer = kata.positiveSubtraction(numberOne, numberTwo);
		System.out.print("Answer: "+ answer);

		break;


	     case 7:
		 System.out.print("Enter an integer: ");
       		 int digitInput = userInput.nextInt();
        
       		String primeNumber =  kata.isPrimeNumber(digitInput);
		System.out.print(primeNumber);
		 break;


	     case 8: 
		 System.out.print("input your integer");
	   	 int numbers = userInput.nextInt();
	
		boolean booleanResult =  kata.isSquare(numbers);
		System.out.print(booleanResult);
		break;

	     case 9:
	   	System.out.print("input an integer");
		int square = userInput.nextInt();

		int longResult = kata.squareOf(square);
		System.out.print(longResult);
		break;
		

            default:
                System.out.print("Invalid input");
                break;
        }
    }
}
