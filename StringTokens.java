package com.hackerrank.practice;
import java.util.*;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine().trim();
/*String regex="[ !,?._'@]+";
String[] tokens=s.split(regex);
System.out.println(tokens.length);
for(int i=0;i<tokens.length;i++)
	System.out.println(tokens[i]);
*/
sc.close();

if(s.length() == 0){
    System.out.println(0);
}
else{
    // Strip out non-word characters and replace with whitespace, trim leading/trailing whitespace
    s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();
    
    if(s.isEmpty()) {
        // String contains no valid tokens
        System.out.println(0);
    }
    else {
        // Split the string into valid tokens
        String[] strings = s.split("\\p{Space}+");
        
        // Print number of tokens
        System.out.println(strings.length);
        
        // Print each token
        for(String str : strings){
            System.out.println(str);
        }
    }
}

	}

}
