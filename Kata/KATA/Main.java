import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kata kata = new Kata();

        System.out.print("""
                1 -> Divide (Quotient)
                2 -> Even
                3 -> Factorial
                4 -> Factors
                5 -> Palindrome
                6 -> Positive Subtraction
                7 -> Prime Number
                8 -> Square (Boolean)
                9 -> Square (Integer)
                """);

        System.out.print("Input an option: ");
        int numberPicked = input.nextInt();

        switch (numberPicked) {
            case 1:
                System.out.print("Input your first integer: ");
                int first = input.nextInt();

                System.out.print("Input your second integer: ");
                int second = input.nextInt();

                kata.divide(first, second);
                break;

            case 2:
                System.out.print("Input your number: ");
                int number = input.nextInt();

                boolean even = kata.isEven(number);  
                System.out.println("Is the number even? " + even);  
                break;

	    case 3:
		System.out.print("Input an integer");
		int numberInput = valueInput.nextInt();
		
		long factorial = (long)kata.factorialOf(numberInput);
		System.out.print(factorial);


            default:
                System.out.print("Invalid input");
                break;
        }
    }
}
