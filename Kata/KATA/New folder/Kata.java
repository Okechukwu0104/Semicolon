public class Kata {

    public static float divide(int first, int second) {

        if (second == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }

        float quotient = (float) first / second;
        System.out.println("The Quotient: " + quotient);
        return quotient;
    }


    public static boolean isEven(int number) {
        return number % 2 == 0;
    }


	public static int factorialOf (int numberInput){
		int counter = 1;
	    for (int count = 1; count <=numberInput; count++){
		
		counter*=count;
		
		
	    }
	 return counter;
      }


  public static int factorOf(int number){	
		int counter = 0;
	    for (int count = 1; count <=number; count++){
		
		if(number % count ==0){ 
		counter+=1;
		}
		
		}
	  return counter;	
	}


	public static boolean isPalindrome (int a, int b, int c, int d , int e){
		
		if (a == e && b == d && c==c){
			return true;
		}
		
		else return false;
       	
	}



	public static int positiveSubtraction(int numberOne, int numberTwo){
		
		if (numberOne < numberTwo){
			return numberTwo - numberOne ; 
			
		}else{ int result = numberOne - numberTwo;
			return result;
			}
	}

	

    public static String isPrimeNumber(int numberInput) {
        int counter = 0;

        for (int count = 1; count <= numberInput; count++) {
            if (numberInput % count == 0) {
                counter++;
            }
        }



        if (counter == 2) return ("It's a prime number");
         else return ("It's not a prime number");
        
    }




	public static boolean isSquare(int integer){
		int counter = 0;

		for(int count = 1; count*count<= integer; count++ ){
		    if(count*count == integer) return (true);
		    
		}
		return (false);
	}



	public static int squareOf(int square){

		int squareValue = (int)Math.pow(square,2);

		return (squareValue);

	}





}
