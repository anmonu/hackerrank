package com.hackerrank.practice;
import java.io.*;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        
        String rev="";
        for(int i=A.length()-1;i>=0;i--)
        	rev=rev+A.charAt(i);
        if(A.equals(rev)){
        	System.out.println("Yes");
        }
        else
        	System.out.println("No");
        
/*char[] s=A.toCharArray();
char[] s1=null;
for(int i=s.length-1,j=0;i>=0;i--,j++){
s1[j]=s[i];

}
if (s1.toString().equals(A)){
	System.out.println("Yes");
}
else
	System.out.println("No");*/

	}

}
