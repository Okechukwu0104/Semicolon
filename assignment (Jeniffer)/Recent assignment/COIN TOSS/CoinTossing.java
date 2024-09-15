import java.util.Scanner;

public class CoinTossing {

    public static void flip() {
        Scanner userInput = new Scanner(System.in);
        int head = 0;
        int tail = 0;

    System.out.println("Keep pressing 1 to flip and press 0 to stop");

        while (true) {
        int entry = userInput.nextInt();
        if (entry == 0){ break;}

        else if (entry == 1) {

		int coin = (int) (Math.random() * 2);
                if (coin == 1) head++;
                else tail++;
		System.out.print("coin tossed..");
        } else {
       System.out.println("Invalid input. Press 1 to flip or 0 to stop.");
        }
        }

        System.out.println("resultesults:");
        System.out.println("Total heads: " + head);
        System.out.println("Total tails: " + tail);
    }
}

