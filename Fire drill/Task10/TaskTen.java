import java.util.Scanner;

public class TaskTen{

    public static void main(String args[]){
	Scanner userInput = new Scanner (System.in);

	System.out.print("Input your 10 Scores");
	 
	int count = 0;
	int sum = 0;
	

	while (count !=10){
	int scores = userInput.nextInt();
	    if(scores >= 0 && scores <= 100){

		sum+=scores;
		
	    }
	count++;
	
	}
	System.out.println("sum of valid numbers: "+sum);
	int average = sum / count;
	System.out.println("average of the valid numbers: " + average);
	
    }


}