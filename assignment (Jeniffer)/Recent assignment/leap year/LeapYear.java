import java.util.Scanner;

public class LeapYear{

public static String isorNotLeapYear(int year){

if (year%4 ==0 && year%100 !=0){
    return "This is a leap year";
}else{
    return "This is not a leap year";
}

}
}