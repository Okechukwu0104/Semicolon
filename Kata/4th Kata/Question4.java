import java.util.Scanner;

    public class Question4{

	public static void main(String args[]){

 	    Scanner value = new Scanner(System.in);
	    System.out.print("input your 1at integer");
		int first = value.nextInt();
		
	     System.out.print("input your 2nd integer");
		int second = value.nextInt();
			
		float quotient = divide(first,second );
			
		System.out.println("The Quotient: " + quotient );

	}



	public static float divide(int firstInput, int secondInput){
		
	      float quotient =  (float) firstInput / secondInput;

			 if (secondInput ==0)
			return 0 ;
			else{return quotient;}			

		   		

	}	
	  


    }