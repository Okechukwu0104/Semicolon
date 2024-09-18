import java.util.Scanner;

public class TaskSeven{

    public static void main(String args[]){
	Scanner userInput = new Scanner (System.in);

	System.out.print("Input your 10 Scores");
	
	int count = 0;
	int sum = 0;
	int evenCount = 0;

	while (count !=10){
	int scores = userInput.nextInt();
	    if(scores % 2 ==0){
		sum+=scores;
		evenCount++; 
	    }
	count++;
	
	}
	System.out.println("sum of even numbers: "+sum);
	int average = sum/evenCount ;

	System.out.println("The average of the even numbers = "+ average);
	
    }


}