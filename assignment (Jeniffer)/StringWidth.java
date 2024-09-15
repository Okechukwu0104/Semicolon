import java.util.*;

public class String{
public static void main(String args[]){

Scanner userInput = new Scanner(System.in); 

 System.out.print("Enter a number: ");
    int number = userInput.nextInt();

System.out.print("Enter the width: ");
    int width = userInput.nextInt();


	String result = format(number, width);
}


public static String format(int number, int width){


int addons = width - num.length();

StringBuilder format = new StringBuilder();
if(addons > 0){
for(int count = 0; count< addons; count++){

format.append(0);

}format.append(num);

return format.toString;


}else return num;



}
}