package com.hackerrank.practice;
import java.util.*;

public class CalendarExample  {
public static String getDay(String day, String month, String year){
	 Calendar cal = Calendar.getInstance();
     cal.set(Calendar.YEAR, Integer.parseInt(year));
     cal.set(Calendar.MONTH, Integer.parseInt(month) - 1);
     cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
     int weekDay = cal.get(Calendar.DAY_OF_WEEK);
     String dayName = "";
     switch (weekDay) {
         case Calendar.MONDAY: dayName = "MONDAY"; break;
         case Calendar.TUESDAY: dayName = "TUESDAY"; break;
         case Calendar.WEDNESDAY: dayName = "WEDNESDAY"; break;
         case Calendar.THURSDAY: dayName = "THURSDAY"; break;
         case Calendar.FRIDAY: dayName = "FRIDAY"; break;
         case Calendar.SATURDAY: dayName = "SATURDAY"; break;
         case Calendar.SUNDAY: dayName = "SUNDAY"; break;
     }
	
	return dayName;
}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));

	}

}
