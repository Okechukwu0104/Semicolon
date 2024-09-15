
public class Math{

public static double myFloor(double num){

int number = (int)num ;
double extract = num - number;

double result = num - extract; 
return result;


}
public static double myCeil(double num){

int number = (int)num ;
double extract = num - number;

double numCompletion = 1 - extract;

 double result = num + numCompletion ;

return result;


}
}