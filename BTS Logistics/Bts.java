 import java.util.Scanner;

   public class Bts{
	public static void main(String args[]){
	    Scanner userInput = new Scanner (System.in);
	
		System.out.print("Enter the munber of successful deliveries ");
		int successfulDelivery = userInput.nextInt();
		
		int driversWage = logistics(successfulDelivery);
	
		if (driversWage ==0){System.out.print("\n Pls input number between 1 and 100");}
		
		else{System.out.print("The riders wage: #"+ driversWage);}	
		
	}




	public static int logistics(int successfulDelivery){
        
		int basePay = 5000;

		if (successfulDelivery >= 70 && successfulDelivery <= 100){
		    int parcelAmount = 500;
			
			int wages = (successfulDelivery*500)+basePay;
		    	return wages;


		}else if (successfulDelivery >=60 && successfulDelivery <70 ){
		   	 int parcelAmount = 250;
			
			int wages = (successfulDelivery*250)+5000;
		    	return (wages);


		}else if (successfulDelivery >=50 && successfulDelivery <60 ){
		    int parcelAmount = 200;
			
			int wages = (successfulDelivery*200)+5000;
		    	return (wages);


		}else if (successfulDelivery < 50 && successfulDelivery > 0){
		      int parcelAmount = 160;
			
		      int wages = (successfulDelivery*160)+5000;
		    	return (wages);


		}else {return 0;}	

		
	
		

	    }
        }