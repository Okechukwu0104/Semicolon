import java.util.Scanner;

public class TaskFive{

    public static void main(String args[]){
	Scanner userInput = new Scanner (System.in);

	System.out.print("Input your 10 Scores");
	
	int count = 0;
	int sum = 0;
	while (count !=10){
	int scores = userInput.nextInt();
	    if(scores % 2 ==0){
		sum+=scores;
	
	    }
	count++;
	
	}
	System.out.print("sum of even numbers: "+sum);
	
    }


}