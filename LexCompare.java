package com.hackerrank.practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LexCompare {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest = s.substring(0,k);
        for(int i=0;i<s.length()-k;i++){
        	if (smallest.compareTo(s.substring(i+1, i+k+1))>0){
        		smallest=s.substring(i+1, i+k+1);
        	}
        	if (largest.compareTo(s.substring(i+1, i+k+1))<0){
        		largest=s.substring(i+1, i+k+1);
        	}
        	
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}