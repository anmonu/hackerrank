package com.hackerrank.practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringReview {

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i=0;i<t;i++){
           
            String s=sc.next();
            char [] c= s.toCharArray();
            for (int j = 0;j<c.length;j=j+2){
                System.out.print(c[j]);
            }
            System.out.print(" ");
            for (int j=1;j<c.length;j=j+2){
                System.out.print(c[j]);
                
            }
            System.out.println();

        
        }
    }
}