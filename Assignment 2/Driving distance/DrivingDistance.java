import java.util.Scanner;
 public class DrivingDistance
{
	
		static Scanner userInput = new Scanner(System.in);
	
		public static void main(String args[]){

		System.out.print ("Enter the driving distance: ");
		int drivingDistance =userInput.nextInt();

		System.out.print ("Enter miles per gallon: ");
		int milesGallon =userInput.nextInt();

		System.out.print ("Enter price per gallon: ");
		int gallonPrice =userInput.nextInt();


			int distanceTimesPrice =  drivingDistance * milesGallon;

			int finalAnswer = distanceTimesPrice / milesGallon;


		System.out.print("The cost of driving is $" + finalAnswer);
		}
}