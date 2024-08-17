import java.util.Scanner;

class PalindromeCode 
{
  public static void main(String[] args) 
{
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a number with more than 2 digits: ");
  String userInput = scanner.nextLine();

// Ensure the input is a number with more than 2 digits        
if (userInput.length() > 2 && userInput.matches("\\d+")) 
{
int number = Integer.parseInt(userInput);
// Check if the number is a palindrome
if (isPalindrome(number)) 
{
System.out.println("The number is a palindrome.");
} else {
System.out.println("The number is not a palindrome.");
}
} else {
System.out.println("Please enter a valid number with more than 2 digits.");
}
}

// Function to check if a number is a palindrome
public static boolean isPalindrome(int number) {
String numStr = String.valueOf(number);
int length = numStr.length();

// Compare characters from the beginning and end
for (int i = 0; i < length / 2; i++) {
if (numStr.charAt(i) != numStr.charAt(length - 1 - i)) {
return false;
}
}
return true;
}
}
