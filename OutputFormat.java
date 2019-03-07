package com.hackerrank.practice;
import java.util.Scanner;

public class OutputFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
           System.out.printf("%-14s %03d",s1,x);
           System.out.println();
        }
        System.out.println("================================");
	}

}
