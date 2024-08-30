import java.util.Scanner;

public class Even {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = userInput.nextInt();

        isEven(integer);
    }

    public static void isEven(int number) {
        if (number % 2 == 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
