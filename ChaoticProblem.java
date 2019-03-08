package com.hackerrank.practice;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ChaoticProblem {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
         int i=0;
         int sum=0;
         int [] c=new int[q.length];
         boolean flag=true;
while(i<q.length-1){
    
    
    for(int j=i+1;j<=q.length-1;j++){
    if(q[i]>q[j]){ 
        //System.out.println("I am here");
        c[i]=c[i]+1;
        //System.out.println("on "+i+"Itreation"+c[i]);
        }
    }
i++;
if(i==q.length-1){
    //System.out.println("Here");
    for (int k=0;k<c.length;k++){
        sum=sum+c[k];
    }
    for (int k=0;k<c.length;k++){
        if(c[k]>2){
            flag=false;}
    }
    if(flag)
System.out.println(sum);
    else
 System.out.println("Too Chaotic");
    		}
}


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
