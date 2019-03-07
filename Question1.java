package com.hackerrank.practice;

public class Question1 {

	public static String solution(String s)
	{
		char c=s.charAt(0);
		if((int)c>=65 && (int)c<=90)
		{
			return "upper";
		}else if((int)c >=97 && (int)c <=122)
		{
			return "lower";
		}else if((int)c>=48 && (int)c<=57)
		{
			return "digit";
		}else {
			return "other";
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(solution("67"));
		
	}

}
