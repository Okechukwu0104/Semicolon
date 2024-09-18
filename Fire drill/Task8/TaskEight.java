import java.util.Scanner;

public class TaskEight{

    public static void main(String args[]){
	Scanner userInput = new Scanner (System.in);

	System.out.print("Input your 10 Scores");
	
	int count = 0;
	int sum = 0;
	

	while (count !=10){
	int scores = userInput.nextInt();
	    if(scores >= 0 && scores <= 100){

		sum+=scores;
		count++;
		
	    }else {System.out.println("Wrong input....try again");}
	
	
	}
	System.out.println("sum of valid numbers: "+sum);
    }


}