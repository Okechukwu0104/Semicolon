import java.util.Scanner;
public class ConvertToHMandS{

public static void main(String args[]){
Scanner userInput = new Scanner(System.in);
System.out.print("Input time (in milliseconds)");
int milliInput = userInput.nextInt();

conversion(milliInput);

}



public static void conversion(int milliInput){
int secondsCalc = 1000;
int minsCalc = 60;
int hoursCalc = 3600;


int totalSeconds = milliInput/secondsCalc;

int hours = totalSeconds / hoursCalc;
int remainingHours = totalSeconds % hoursCalc;

int minutes = remainingHours / minsCalc;
int seconds = remainingHours % secondsCalc;


System.out.print(hours +":"+ minutes +":"+seconds);



}

}