package com.hackerrank.practice;
import java.io.*;
import java.util.*;

public class Anagrams {

	static boolean isAnagram(String a, String b) {
        // Complete the function
		if(a.length()!=b.length())
			return false;
		else{
			char[] a1=a.toLowerCase().toCharArray();
			char[] b1=b.toLowerCase().toCharArray();
			Arrays.sort(a1);
			Arrays.sort(b1);
			return Arrays.equals(a1, b1);
		}
			
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        String a = scan.next().trim();
	        String b = scan.next().trim();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}
