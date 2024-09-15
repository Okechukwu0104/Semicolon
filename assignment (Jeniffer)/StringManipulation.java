import java.util.Scanner;

public class StringManipulation {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a String: ");

        String input = userInput.nextLine();

        // stringPosition(input);
        //subString(input);
	//seperateChar(input);
	//removeSpace(input);
	//reverseCase(input);
	//reverseString(input);
	//stringPalindrome(input)
	pilatinCoding(input)
    }




    public static void stringPosition(String input) {
        for (int count = 0; count < input.length(); count++) {
            // General output
            char output = input.charAt(count);
            System.out.print(output);
            System.out.print("  ");
            // ASCII code
            System.out.println("The ASCII code: " + (int) output);
        }
        System.out.println(input.length());
        System.out.print("\t");
        System.out.print(" ");
        forCases(input);
    }





    public static void forCases(String character) {
        for (int count = 0; count < character.length(); count++) {
            // To fetch uppercase
            char output = character.charAt(count);
            if (Character.isUpperCase(output)) {
                System.out.print(output);
            }
        }
        // You can do the same for lowercase and digit
    }





    public static void casesCount(String input) {
        // To count individual characters
        int ucount = 0;
        int lcount = 0;
        int dcount = 0;
        for (int count = 0; count < input.length(); count++) {
            char c = input.charAt(count);
            if (Character.isUpperCase(c)) ucount++;
            if (Character.isLowerCase(c)) lcount++;
            if (Character.isDigit(c)) dcount++;
        }
        System.out.println("\n\n ");
        System.out.println("Total uppercases: " + ucount);
        System.out.println("Total lowercases: " + lcount);
        System.out.println("Total digits: " + dcount);
    }






    // To create a substring with only capital letters
    public static void subString(String input) {
        String subString = "";
        for (int count = 0; count < input.length(); count++) {
            char c = input.charAt(count);
            if (Character.isUpperCase(c)) {
                subString += c;
            }
        }
        System.out.print(subString);
    }


//to seperate characters from digits
public static void seperateChar(String input){

   String letter = "",digit="";
      for (int count = 0; count < input.length(); count++) {

	char output = input.charAt(count);
	if(Character.isDigit(output))letter+=output;

	if(Character.isLetter(output))digit+=output;

	
}
      System.out.print("Seperating letters from numbers"+letter +"   "+ digit);

}



// to remove spaces
public static void removeSpace(String input){
	String lnew = "";
      for (int count = 0; count < input.length(); count++) {

	char output = input.charAt(count);
	if(!Character.isWhitespace(output))lnew+=output;

}
System.out.print("no space: "+ lnew);
}


//to reverse the case of a string

public static void reverseCase(String input){

 String newString = "";
for(int count = 0; count < input.length(); count++){

char output = input.charAt(count);

if(Character.isUpperCase(output))newString+=Character.toLowerCase(output);
else newString+=Character.toUpperCase(output);
}
System.out.print(newString);
}





//to check the reverse of the string
public static void reverseString(String input){
String reverse = "";

for(int count = 0; count < input.length(); count++){
	char output = input.charAt(count);

reverse = input+reverse;
}
System.out.print("Reversed String: "+reverse);
}



//palindrome
public static void stringPalindrome(String input){
	String reverse = "";

	for(int count = 0; count < input.length(); count++){

	char output = input.charAt(count);
	reverse = input+reverse;
}
	System.out.print("Reversed String: "+reverse);
	if(input.equalsIgnoreCase(output)){System.out.print("Its a palindrome");}
	else{System.out.print("Its not a palindrome");}

}


//piglatin encoding
public static void pilatinCoding(String input){
String pilatin = "";
	for(int count = 0; count < input.length(); count++){
	 String newString = input.toUpperCase(output);
	char output = newString.charAt(input);
	 if(newString=="A"|| newString=="E"|| newString=="I"|| newString=="O"|| newString=="U"||){

	if(count==0){
  	    pilatin = input+"WAY";
	}else{
       pilatin = input.substring(count)+input.substring(0,count)+"WAY";
	break;
	}
}
	Syste.out.print(pilatin);

}



}




}