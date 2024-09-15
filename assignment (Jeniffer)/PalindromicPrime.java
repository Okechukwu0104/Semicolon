public class PalindromicPrime{
	public static void main(String args[]){
	int lineCount =0;
	for(int number = 1; number<=1000;number++){
	    if(isPrime(number) && isPalindrone(number)){
		System.out.print(number+ " ");
		lineCount++;
	    if(lineCount % 10==0){System.out.println("\t");}
	    }
		
	

	}

	}


	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; 
        }
        for (int counter = 2; counter <= Math.sqrt(number); counter++) { 
            if (number % counter == 0) {
                return false;
            }
        }
        return true;
    }


	public static Boolean isPalindrone(int number){
	int digit = 0;
	int reversed = 0;
	int numberInput = number;
	while(number!=0){
		digit = number%10;
		reversed = (reversed*10)+digit;
		number/=10;
	
	}
	if(reversed == numberInput){
	  return true;
	}else{return false;}

	}

}