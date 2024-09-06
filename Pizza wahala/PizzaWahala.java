/*
1...print the menu and ask for the users choice 
2...ask for the number of customers and the piza type
3...save these inputs as numberOfGuests and pizzaSize rspectively (this same format should be used for other sizes too)
4...save the number of slices and the price of each of the pizza types as variables
5...calculate the boxes purchased by rounding up the result of dividing the no. of customers with the number of slices
5...to get the number of slices remaining multiply the boxes by the pizza size and then the customers will be deducted from the result (this means that each customer will get 1 pizza from the total number of slices which is the aim of the first multiplication)
6...to get the price, you multiply the boxes ordered by the price of a box;
7...After that, you display your results
*/


import java.util.Scanner;
import java.lang.Math;

    public class PizzaWahala{

	public static void main(String...args){
		
	System.out.print("""
	
	Welcome to Iya Afeez Pizza joint, Ajegunle.


			MENU
..........................................................
	Pizza type     Number of Slices    Price of box
..........................................................

	1: Sapa Size        4               2,000       

	2: Small Money      6               2,400

	3: Big Boys         8               3,000

	4: Odogwu           12              4,200
.........................................................
	0: Exit


   What pizza type are you buying today? 

   (pick options 1-4).

	""");

		Scanner userInput = new Scanner(System.in);
		int typeChosen = userInput.nextInt();
	
		
		switch(typeChosen){

		
		case 1: System.out.print("How many customers are paying ?  ");
				int customersForSapaSize = userInput.nextInt();
				System.out.println(" ");

			if (customersForSapaSize > 0){
				int sapaSize = 4;
				int sapaPrice = 2000;


				double sapa = (double)customersForSapaSize / sapaSize;
				double sapaBoxCounter = Math.ceil(sapa);
				int sapaBoxes =(int) sapaBoxCounter;


 	
				int sapaSlicesLeft = (sapaBoxes*sapaSize) - customersForSapaSize;


				float price = sapaPrice * sapaBoxes;

					System.out.println("     PURCHASE DETAILS");
					System.out.println("Pizza Type: Sapa Size");
					System.out.println(" ");

					System.out.println(" Total Boxes: "+ sapaBoxes);
					System.out.println(" For "+ customersForSapaSize + " person(s)\n Total Price: #"+ price + "\n Leftover Slices: "+ sapaSlicesLeft);
					System.out.println(" ");

					System.out.print("    Enjoy your Pizza!!");
				
				
			 }else{
			System.out.print("Wrong Input..pls try again");
		
			}


			break;



		 case 2: System.out.print("How many customers are paying ?  ");
				int customersForsmallBoysSize = userInput.nextInt();
				System.out.println(" ");

			if (customersForsmallBoysSize > 0){
				int smallBoysSize = 6;
				int smallBoysPrice = 2400;


				double smallBoys = (double)customersForsmallBoysSize / smallBoysSize;
				double smallBoysBoxCounter = Math.ceil(smallBoys);
				int smallBoysBoxes =(int) smallBoysBoxCounter;


 	
				int smallBoysSlicesLeft = (smallBoysBoxes*smallBoysSize) - customersForsmallBoysSize;


				float price = smallBoysPrice * smallBoysBoxes;

					System.out.println("     PURCHASE DETAILS");
					System.out.println("Pizza Type: Small Boys Size");
					System.out.println(" ");

					System.out.println(" Total Boxes: "+ smallBoysBoxes);
					System.out.println(" For "+ customersForsmallBoysSize + " person(s)\n Total Price: #"+ price + "\n Leftover Slices: "+ smallBoysSlicesLeft);
					System.out.println(" ");

					System.out.print("    Enjoy your Pizza!!");
				
				
			 }else{
			System.out.print("Wrong Input..pls try again");
		
			}


		

		break;



	 case 3:  System.out.print("How many customers are paying ?  ");
				int customersForbigBoysSize = userInput.nextInt();
				System.out.println(" ");

			if (customersForbigBoysSize > 0){
				int bigBoysSize = 8;
				int bigBoysPrice = 3000;


				double bigBoys = (double)customersForbigBoysSize / bigBoysSize;
				double bigBoysBoxCounter = Math.ceil(bigBoys);
				int bigBoysBoxes =(int) bigBoysBoxCounter;


 	
				int bigBoysSlicesLeft = (bigBoysBoxes*bigBoysSize) - customersForbigBoysSize;


				float price = bigBoysPrice * bigBoysBoxes;

					System.out.println("     PURCHASE DETAILS");
					System.out.println("Pizza Type: Big Boys Size");
					System.out.println(" ");

					System.out.println(" Total Boxes: "+ bigBoysBoxes);
					System.out.println(" For "+ customersForbigBoysSize + " person(s)\n Total Price: #"+ price + "\n Leftover Slices: "+ bigBoysSlicesLeft);
					System.out.println(" ");

					System.out.print("    Enjoy your Pizza!!");
				
				
			 }else{
			System.out.print("Wrong Input..pls try again");
		
			}



			break;



	case 4: System.out.print("How many customers are paying ?  ");
				int customersForOdogwuSize = userInput.nextInt();
				System.out.println(" ");

			if (customersForOdogwuSize > 0){
				int odogwuSize = 12;
				int odogwuPrice = 4200;


				double odogwu = (double)customersForOdogwuSize / odogwuSize;
				double odogwuBoxCounter = Math.ceil(odogwu);
				int odogwuBoxes =(int) odogwuBoxCounter;


 	
				int odogwuSlicesLeft = (odogwuBoxes*odogwuSize) - customersForOdogwuSize;


				float price = odogwuPrice * odogwuBoxes;

					System.out.println("     PURCHASE DETAILS");
					System.out.println("Pizza Type: *ODOGWU* Size");
					System.out.println(" ");

					System.out.println(" Total Boxes: "+ odogwuBoxes);
					System.out.println(" For "+ customersForOdogwuSize + " person(s)\n Total Price: #"+ price + "\n Leftover Slices: "+ odogwuSlicesLeft);
					System.out.println(" ");

					System.out.print("    Enjoy your Pizza!!");
				
				
			 }else{
			System.out.print("Wrong Input..pls try again");
			
		
			}



			break;



		case 0: System.out.print("Thank you for your patronage");break;

		default: System.out.print("Wrong input..pls try again");
			break;

				
	     } 	    
	

	}

    }
