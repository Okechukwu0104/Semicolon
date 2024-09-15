import java.util.Scanner;


public class Main{
  public static void main(String args[]){

  Scanner userInput = new Scanner(System.in);

 System.out.print("Enter a Double value: ");
 
	if(userInput.hasNextDouble()){

	double num = userInput.nextDouble();
	System.out.println("Floor :" + Math.myFloor(num));
	System.out.println("Ceil :" + Math.myCeil(num));

	}else{System.out.print("wrong input...Try again");}

   }

}