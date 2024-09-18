import java.util.Scanner;

public class TaskOne{

    public static void main(String args[]){
	Scanner userInput = new Scanner (System.in);

	System.out.print("Input your 10 Scores");
	int scores ;

	int count = 0;
	int sum = 0;
	while (count !=10){
	scores = userInput.nextInt();
	
	sum+=scores;
	count++;
	
	}
	System.out.print(sum);
	
    }


}