package com.hackerrank.practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticExample {
	static boolean flag=true;
	static int B;
	static int H;
	static{
		Scanner sc = new Scanner(System.in);
		B=sc.nextInt();
		H=sc.nextInt();
		if(B<=0 || H<=0) {
			flag=false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			
		}
	}	
		

		


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
		
		
	}

}
