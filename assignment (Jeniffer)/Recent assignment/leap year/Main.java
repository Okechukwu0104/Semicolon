import java.util.Scanner;
public class Main{
public static void main(String args[]){

Scanner userInput = new Scanner (System.in);
System.out.print("Enter year of choice: ");
int year = userInput.nextInt();

System.out.print(LeapYear.isorNotLeapYear(year));



}

}