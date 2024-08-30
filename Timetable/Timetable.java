import java.util.Scanner;
public class Timetable{
    
    public static void main(String[] args) {
        Scanner userInput= new Scanner (System.in);
        
        System.out.println("input your number");
        int number = userInput.nextInt();
        
        for(int count=1; count<= 10; count++){
            int result = number * count;
              System.out.println (number +"x"+count+"="+ result);

        }
        
    }
    
}