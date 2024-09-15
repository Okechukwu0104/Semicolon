import java.util.Scanner;

public class Main{

 public static void main(String args[]){
	Scanner userInput = new Scanner(System.in);

	System.out.print("Enter your First side: ");
	double side1 = userInput.nextDouble();

	System.out.print("Enter your Second side: ");
	double side2 = userInput.nextDouble();

	float result = (float)Triangle.hypotenuse(side1,side2);

	System.out.print("The hypotenuse of the triangle: "+ result);

    }


} 