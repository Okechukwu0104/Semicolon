import java.util.Scanner;

public class TaskFour{

    public static void main(String args[]){
	Scanner userInput = new Scanner (System.in);

	System.out.print("Input your 10 Scores");
	int scores ;

	int count = 0;
	int sum = 0;
	while (count !=10){
	scores = userInput.nextInt();
 	    if(count % 2==0){
		sum+=scores;
	    }
	count++;
	
	}
	System.out.println("The Sum in even indexes: "+ sum);

	
    }


}