import java.util.Scanner;


    public class DaysOfChristmas{

	

	public static void main(String args[]){
	while(true){
	System.out.print("""



			:::::::::::::::::::::::::::::::::::::::::
				THE 12 DAYS OF CHRISTMAS

			         Pick a Day from 1 - 12 
				
				or press 0 to exit
			::::::::::::::::::::::::::::::::::::::::::	


			""");

	Scanner userNumber = new Scanner(System.in);

	
	
	int dayPicked = userNumber.nextInt();

	switch(dayPicked){

		case 1: dayOne();break;
		
		case 2: dayTwo();break;

		case 3:  dayThree();break;

		case 4: dayFour();break;
		
		case 5: dayFive();break;

		case 6: daySix();break;

		case 7: daySeven();break;

		case 8: dayEight();break;
		
		case 9: dayNine();break;

		case 10: dayTen();break;

		case 11: dayEleven();break;

		case 12: dayTwelve();break;
		
		default: System.out.print ("Sorry...there is no "+ dayPicked+ "th verse of the song\n\ntry again.. ");break;
		
		}if(dayPicked == 0)break;
	
	    }
	}





	public static void dayOne(){

	System.out.print ("""
		On the first day of Christmas my true love sent to me:

	-> A partridge in a pear tree

		

		""");

		
		
	}
	



	public static void dayTwo(){

	System.out.print ("""
		On the second day of Christmas my true love sent to me:

	-> Two turtle doves,
	-> And a partridge in a pear tree.

	

		""");

		
	}
	


	public static void dayThree(){


	System.out.print ("""
		**On the third day of Christmas my true love sent to me**

	-> Three French hens,
	-> Two turtle doves,
	-> And a partridge in a pear tree.

	

		""");
		
	}



	public static void dayFour(){

	System.out.print ("""
		**On the Fourth day of Christmas my true love sent to me**

	-> Four calling birds
	-> Three French hens,
	-> Two turtle doves,
	-> And a partridge in a pear tree.
	
	

		""");
	}


	


	
	public static void dayFive(){

	System.out.print ("""
		**On the Fifth day of Christmas my true love sent to me**
	
	-> Five gold rings
	-> Four calling birds
	-> Three French hens,
	-> Two turtle doves,
	-> And a partridge in a pear tree.


		""");



	}





	public static void daySix(){

	System.out.print ("""
		**On the Six day of Christmas my true love sent to me**

	-> six geese a-laying
	-> Five gold rings
	-> Four calling birds
	-> Three French hens,
	-> Two turtle doves,
	-> And a partridge in a pear tree.

	

		""");



	}





	public static void daySeven(){

	System.out.print ("""
		**On the Seven day of Christmas my true love sent to me**

	-> Seven swans a-swimming
	-> Six geese a-laying
	-> Five gold rings
	-> Four calling birds
	-> Three French hens,
	-> Two turtle doves,
	-> And a partridge in a pear tree.
	

		""");

	

	}




	public static void dayEight(){

	System.out.print ("""
		**On the Eight day of Christmas my true love sent to me**

	-> Eight maids a-milking
	-> Seven swans a-swimming
	-> Six geese a-laying
	-> Five gold rings
	-> Four calling birds
	-> Three French hens,
	-> Two turtle doves,
	-> And a partridge in a pear tree.

	

		""");



	}





	public static void dayNine(){

	System.out.print ("""
		**On the Ninth day of Christmas my true love sent to me**


	-> Nine ladies dancing
	-> Eight maids a-milking
	-> Seven swans a-swimming
	-> Six geese a-laying
	-> Five gold rings
	-> Four calling birds
	-> Three French hens,
	-> Two turtle doves,
	-> And a partridge in a pear tree.

	

		""");



	}





	public static void dayTen(){


	System.out.print ("""
		**On the Tenth day of Christmas my true love sent to me**

	-> Ten lords a-leaping
	-> Nine ladies dancing
	-> Eight maids a-milking
	-> Seven swans a-swimming
	-> Six geese a-laying
	-> Five gold rings
	-> Four calling birds
	-> Three French hens,
	-> Two turtle doves,
	-> And a partridge in a pear tree.

	
		""");


	}




	public static void dayEleven(){

	System.out.print ("""
		**On the Eleven day of Christmas my true love sent to me**

	-> Eleven pipers piping
	-> Ten lords a-leaping
	-> Nine ladies dancing
	-> Eight maids a-milking
	-> Seven swans a-swimming
	-> Six geese a-laying
	-> Five gold rings
	-> Four calling birds
	-> Three French hens,
	-> Two turtle doves,
	-> And a partridge in a pear tree.

	

		""");



	}

	public static void dayTwelve(){

		System.out.print ("""
		**On the Twelfth day of Christmas my true love sent to me**

	-> Twelve drummers drumming
	-> Eleven pipers piping
	-> Ten lords a-leaping
	-> Nine ladies dancing
	-> Eight maids a-milking
	-> Seven swans a-swimming
	-> Six geese a-laying
	-> Five gold rings
	-> Four calling birds
	-> Three French hens,
	-> Two turtle doves,
	-> And a partridge in a pear tree.

	

		""");



        }


}