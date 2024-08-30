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






}
