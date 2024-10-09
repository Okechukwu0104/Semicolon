

import java.util.*;


  public class Yas{

	public static int largest(int numbers[] ){
	
		int largest = numbers[0];
	    
		for(int count = 0; count < numbers.length; count++){
		
			if(largest < numbers[count]) largest = numbers[count];
			
			
		}
			return largest;
	}


	
	public static int[] reverse(int[] numbers){

	    int [] reversed = new int[numbers.length];

		for(int count = 0; count< numbers.length; count++){
		reversed[count] = numbers[numbers.length-1-count];
		}return reversed;
		

	
	}



	public static boolean check(int numbers[]){

	
	System.out.print("input the number you want to check for? ");
	Scanner userInput = new Scanner (System.in);
	int check = userInput.nextInt();
	
	for(int count = 0; count< numbers.length; count++){
		if(numbers[count] == check) return true;
		
		
	} return false;


	}



	public static int[] oddIndex(int numbers[]){

		int [] odd = new int[numbers.length];
	
		for(int count = 0; count < numbers.length; count++){
		if(count % 2 != 0) odd [count] = numbers [count];
		
		}return odd ;
		

	}



	public static int[] evenIndex(int numbers[]){

		int [] odd = new int[numbers.length];
	
		for(int count = 0; count < numbers.length; count++){
		if(count % 2 == 0) odd [count] = numbers [count];
		
		}return odd ;
		

	}




	public static int runningTotal(int numbers[]){
		
			int total = 0;
		for (int count = 0; count < numbers.length; count++) {
			total +=numbers[count];
			
		 }return total;


	}

	
	
	public static boolean isPalindrome(String input){


		String reversed = new StringBuilder(input).reverse().toString();
		System.out.print(reversed);

		if (input.equals(reversed)){
			return true;
		}else return false;

	
	}


	public static int sum(int [] numbers){

		int sum = 0;
	     for(int count = 0; count<numbers.length; count++){
		sum+=numbers[count];


	     }return sum;
	

	}

	
		public static int sum2(int [] numbers){

		int sum = 0;
		int count = 0;
	     while(count != numbers.length){
		sum+=numbers[count];
		count++;


	     }return sum;


	

	}



	public static int sum3(int [] numbers){

		int sum = 0;
		int count = 0;

		do{
		sum+=numbers[count];
		count++;
	     }while(count != numbers.length);
		

		return sum;

	}


	
		
	
	public static int [] concatenate(int [] numbers, int num){

		Scanner userInput = new Scanner(System.in);

		int [] newArray = new int [num];
	
		for(int count = 0; count < newArray.length; count++){
		    newArray[count] = userInput.nextInt();
		
		}	
		int totalLength = numbers.length + newArray.length;
		int [] concatedArray = new int [totalLength];

		System.arraycopy(numbers, 0, concatedArray, 0, numbers.length);

		System.arraycopy(newArray, 0,concatedArray,numbers.length,newArray.length);


	return concatedArray;
	}





	public static int [] altConcatenate(int [] numbers, int num){

		Scanner userInput = new Scanner(System.in);

		int [] newArray = new int [num];
	
		for(int count = 0; count < newArray.length; count++){
		    newArray[count] = userInput.nextInt();
		
		}
		
			
		int totalLength = numbers.length + newArray.length;
		int [] altConcatedArray = new int[totalLength];
		int index =0;
		for(int count = 0; count<totalLength; count++){

		if(count < numbers.length)altConcatedArray [index++] = numbers[count];

		 if(count < newArray.length) altConcatedArray [index++] = newArray[count];

			
		}

	return altConcatedArray;
	}




	public static void numberList(int number, int total){
		
		int [] newArray = new int[total];
	     for(int count = 0; count < total; count++){

		int extract = (int) number/10;
		int digit = (int)number%10;
		number = extract;

		newArray[total-1-count] = digit;
		
	     }

		int [] prints = new int[total];
		int count = 0;
		for(int num : newArray){
		System.out.print(num + " ");
		  
		}
	

	}




    }