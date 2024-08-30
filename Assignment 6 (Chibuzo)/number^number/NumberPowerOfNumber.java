public class NumberPowerOfNumber
{
public static void main (String args[]) 
	{
	try{
	System.out.print("input first number: ");
	double userInput1 = readNumber();
	int firstNumber = (int) userInput1;

	System.out.print("input second number: ");
	double userInput2 = readNumber();
	int secondNumber = (int) userInput2;

	double powerCalculation = Math.pow(firstNumber,secondNumber);
	int finalAnswer = (int)powerCalculation;

	System.out.print(firstNumber +" raised to power of "+ secondNumber +" is: "+ finalAnswer);

	} catch(Exception e){System.out.print("An error occoured..try again");}

	}


 public static double readNumber() throws Exception 
{
        StringBuilder wrongInput = new StringBuilder();
        int ch;

        while ((ch = System.in.read()) != '\n ' && ch != -1) {
            wrongInput.append((char) ch);
        }
        return Double.parseDouble(wrongInput.toString().trim());
}

}







