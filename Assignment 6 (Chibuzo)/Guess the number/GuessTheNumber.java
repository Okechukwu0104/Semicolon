import java.util.Scanner ;

public class GuessTheNumber
{
public static void main(String args[])
{

	Scanner userInput = new Scanner(System.in);
	double numberGenerated = Math.random()*10;
	int numberToGuess = (int) numberGenerated;
	int usersGuess;

	do{
	

	System.out.print("guess the random number we have: ");
	usersGuess = userInput.nextInt();
	

	if (usersGuess > numberToGuess)
	{
	 System.out.print("too high...try again: ");
	

	}else if (usersGuess < numberToGuess)
	 {
	  System.out.print("too low...try again: ");


	 }else 
	  {
	  System.out.print("That is correct! \n");
	  }



	}while(usersGuess != numberToGuess);
	
	System.out.print (" lets try this again...shall we?");

	userInput.close();
	
}

}