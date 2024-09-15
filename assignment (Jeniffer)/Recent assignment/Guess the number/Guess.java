import java.util.Scanner;
public class Guess{
public static void numberGen(){


    Scanner userInput = new Scanner (System.in);

    int realNumber =(int)(Math.random()*20);

    System.out.print("   New  Number Generated  >>  guess the number: ");

  int guess = userInput.nextInt();

	guessResult(guess, realNumber, userInput);

}

public static void guessResult(int guess, int realNumber, Scanner userInput ){
    int count = 0;

    while(realNumber!= guess){

	guess = userInput.nextInt();
	if(guess < realNumber){System.out.print( "Thats low...try again: ");}
	else if(guess > realNumber){System.out.print( "Thats high...try again: ");}
	
		count++; 
continue;
	}
	if(guess == realNumber)System.out.print( "Congratulations! you guessed wrong "+count+" times");
System.out.print("Do you want to try again? ");
   

}



}