
public class Triangle{

public static double hypotenuse(double side1, double side2){

	double firstSide = Math.pow(side1,2);
	double secondSide = Math.pow(side2,2);

	double sum = firstSide + secondSide;  
	double thirdSide = Math.sqrt(sum);


	return thirdSide;


}

}