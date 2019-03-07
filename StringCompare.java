package com.hackerrank.practice;
import java.io.*;
import java.util.*;

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
        System.out.println(A.toUpperCase().charAt(0)+A.substring(1)+ " "+B.toUpperCase().charAt(0)+B.substring(1));        
       /* char[] s1=A.toCharArray();
        char[] s2=B.toCharArray();
        System.out.print(String.valueOf(s1[0]-32));
     for(int i=1;i<=s1.length;i++){
    	 System.out.print(s1[i]);
     }
     System.out.print(" "+String.valueOf(s2[0]-32));
      for(int j=1;j<=s2.length;j++){
    	  System.out.print(s2[j]);
      }*/
	}

}
