package com.hackerrank.practice;
import java.util.Scanner;
import java.util.regex.*;
public class RegexIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
		 final Pattern PATTERN = Pattern.compile(
			        "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
		 
	        while(in.hasNext()){
	            String IP = in.next();
	            Matcher m=PATTERN.matcher(IP);
	            System.out.println(m.matches());
	           // System.out.println(IP.matches(new MyRegex().pattern));
	        }

	}

}
class MyRegex{
	 	/* final Pattern PATTERN = Pattern.compile(
		        "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
*/
	static final String zeroTo255= "([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";

static final String pattern = zeroTo255 + "\\." + zeroTo255 + "\\."+ zeroTo255 + "\\." + zeroTo255;

}