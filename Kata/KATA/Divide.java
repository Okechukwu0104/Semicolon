import java.util.Scanner;

    public class Divide{

	

 	  
			
		





	public static float divide(){
		 Scanner value = new Scanner(System.in);
	    System.out.print("input your 1at integer");
		int first = value.nextInt();
		
	     System.out.print("input your 2nd integer");
		int second = value.nextInt();
		
	      float quotient =  (float) firstInput / secondInput;

			 if (secondInput ==0)
			return 0 ;
			else{return quotient;}	
		
		System.out.println("The Quotient: " + quotient );
		   		

	}	
	  


    }