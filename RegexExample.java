package com.hackerrank.practice;
import java.util.regex.*;
import java.util.Scanner;
public class RegexExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		for(int i=0;i<testCases;i++){
			String pattern = in.nextLine();
			try{
			Pattern p=Pattern.compile(pattern);
			System.out.println("Valid");
			}
			catch(Exception e){
				System.out.println("Invalid");
			}
		}
		in.close();
	}

}
