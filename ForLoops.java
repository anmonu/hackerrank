package com.hackerrank.practice;
import java.util.*;
import java.io.*;


public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s=a;
                for(int j=0;j<n;j++){
                   
                	/*int p=(int)Math.pow(2, j)*b;
                    s=p+s;
                    System.out.print(" "+s);*/
                    
                    a+=b;
                    if(j>0)
                    	System.out.print(" ");
                    System.out.print(a);
                    
                    b=b*2;
                }
        System.out.println();
        }
        in.close();

	}

}
