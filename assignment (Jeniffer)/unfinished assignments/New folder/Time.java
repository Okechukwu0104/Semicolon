import java.util.*;
public class Time{
public static void main(String args[]){
Date current = new Date();

System.out.println("CurrentTime: " + current);

compare();

}

public static void compare(){
long secondsCalc = 1000;
long minuteCalc = 60;
long hoursCalc = 3600;
long milliSeconds = System.currentTimeMillis();

long seconds = milliSeconds / secondsCalc;
long remainingSeconds = milliSeconds % secondsCalc;


long hours = remainingSeconds / hoursCalc;
long remainingHours =  seconds % hoursCalc;

long minutes = remainingHours/minuteCalc;
long realSeconds = remainingHours % minuteCalc;

System.out.println(hours +":"+ minutes +":"+ realSeconds);

}


}