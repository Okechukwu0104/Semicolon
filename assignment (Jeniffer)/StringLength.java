import java.util.Scanner;

public class StringLength{
public static void main (String args[]){

    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String word = userInput.nextLine();

    int result = countLetters(word);
	System.out.print(result);
}



public static int countLetters(String s){
return s.length();
}




}