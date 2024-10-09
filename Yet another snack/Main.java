

import java.util.*;


    class Main{

	public static void main(String args[]){

 	    Scanner userInput = new Scanner(System.in);
	    System.out.print("how many inputs? \nor press 0 to go to questions 5-11 ");
		int inputs = userInput.nextInt();

		Yas yas = new Yas();
		int [] numbers = new int [inputs];

		if(inputs != 0){
		System.out.println("enter your "+inputs+" value(s)");

		for (int i =0; i< numbers.length; i++){
			numbers[i] = userInput.nextInt();	
		}
		


	
		System.out.print("""
    		1 -> Largest Number
    		2 -> Reverse list
    		3 -> Occurrence of an element
    		4 -> Odd position elements
    		5 -> Even position elements
    		6 -> Running total
    		7 -> Other options
    """);
}

        int numberPicked;
        if (inputs == 0) {
            numberPicked = 7;
        }else {
            System.out.print("What do you want to do? ");
            numberPicked = userInput.nextInt();
        }

        switch (numberPicked) {
	case 1:{
		
		int result = yas.largest(numbers);
		System.out.print("The largest in the array: "+ result); 
		break;

	     }

	
	case 2:{
		
		int[] reverse = yas.reverse(numbers);
		System.out.println("reversed array: ");
		for(int num: reverse){
		System.out.print(num);
		}
		 
		break;
	     }



	case 3:{
		boolean result = yas.check(numbers);

		if(result == true)System.out.print(result+" ..was found");
		else System.out.print(result+ " ..was not found ");
		
		break;
		}




	case 4:{
		int []result = yas.oddIndex(numbers);

		for(int num: result){
		   if(num != 0){
		      System.out.print(num);
		   }
		
		 }


	      }


	case 5:{
		int []result = yas.evenIndex(numbers);

		for(int num: result){
		   if(num != 0){
		      System.out.print(num);
		   }
		
		 }


	      }





	case 6:{
		int result = yas.runningTotal(numbers);
			System.out.print("Total = "+result);
		
		break;
		}




	case 7:{


		System.out.print("""
         	       7 -> if string is Palindrome
                       8 -> sum numbers in list (3 functions)
               	       9 -> 2 list concatenation 
                       10 -> alternate combination of 2 lists
		       11 -> list of digits
              
                """);

        System.out.print("What do you want to do? : ");
      	int case7Choice = userInput.nextInt();

	switch(case7Choice){


	case 7:{
		Scanner scanner = new Scanner(System.in);
		System.out.print("input a string ");
		String string = scanner.nextLine();

		boolean result = yas.isPalindrome(string);
		System.out.println(result);


	}


	case 8: {

		int result = yas.sum(numbers);
		int result2 = yas.sum2(numbers);
		int result3 = yas.sum3(numbers);
		System.out.println("Total (for loop) = "+result);
		System.out.println("Total(while loop) = "+result2);
		System.out.println("Total (do while loop) = "+result3);



	}

	
	case 9: {
		
		System.out.print(" enter no of elements in array 2 ");
		int num = userInput.nextInt();
		int[] result = yas.concatenate(numbers, num);
	
		System.out.println(Arrays.toString(result));


	
		}





	case 10: {
		
		System.out.print(" enter no of elements in array 2 ");
		int num = userInput.nextInt();
		int[] result = yas.altConcatenate(numbers, num);
	
		System.out.println(Arrays.toString(result));


	
		}





	case 11:{
		    System.out.print("input a number");
			int number = userInput.nextInt();
			int total = String.valueOf(number).length();
			yas.numberList(number, total);
			     


	
		}
		



		




		}


















		}















	}




		
	}
    }