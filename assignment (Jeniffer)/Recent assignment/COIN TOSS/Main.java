import java.util.Scanner;

public class Main{

public static void main(String args[]){

Scanner userInput = new Scanner (System.in);



while(true){

System.out.print("""
	COIN TOSSING GAME

1 -> TOSS THE COIN (As many times as you want)

2 -> EXIT

	""");

	
	int option = userInput.nextInt();
switch(option){
	
	case 1:  CoinTossing.flip();break;
		
		


	case 2: System.out.print("Bye..");
		break;

	



}

 
}

}



}