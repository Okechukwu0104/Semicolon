public class Loop{
    public static void main(String args[]){

	
	for(int i = 0; i<=10; i++){
		for(int j = 0; j<=i; j++){


		System.out.print("*");


		}
System.out.println(" ");

	}

	loop2();
System.out.println(" ");
	loop3();
System.out.println(" ");
	loop4();
System.out.println(" ");
	loop5();
System.out.println(" ");
	loop6();

    }




    public static void loop2(){

	
	for(int i = 10; i>=0; i--){
		for(int j = 0; j<=i; j++){


		System.out.print("*");


		}
System.out.println(" ");

	}


	}



	public static void loop2cont(){

	
	}






// *circle*
public static void loop3(){

//1st half
	
	
	for(int i = 0; i<=10; i++){
	for(int k=0;k<=i;k++){
	System.out.print(".");
	}
	for(int star = 10; star>=i; star-- ){
	System.out.print("*");
	
	}

	    for(int j = 0; j<=i; j++){
		System.out.print(" ");
		for(int star = 10; star>=i; star--){

		System.out.print("*");


		}
	    }
		System.out.println(" \t");
    	}


//2nd circle

	
	
}
	

public static void loop4(){
	
	
	for(int i = 0; i<=10; i++){
	    for(int j = 0; j<=i; j++){
		System.out.print(" ");
		 }
		for(int star = 10; star>=i; star--){

		System.out.print("*");
		}
		System.out.println();
	   
    	}
	
	
}

	

public static void loop5(){

	for(int i = 1; i<=10; i++){
	    for(int j = 1; j<=i; j++){
		System.out.print(" ");
		 }
		for(int star = 1; star<=i; star++){

		System.out.print("*");
		}
		System.out.println();
	   
    	}



}




public static void loop6(){

	for(int i = 10; i>=0; i--){
	    for(int j = 0; j<=i; j++){

		System.out.print(".");
	    }

		for(int star = 10; star>=i; star--){
		System.out.print("$");
		}
		System.out.println();
	}



}

    





}