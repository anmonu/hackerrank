package com.hackerrank.practice;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Sample s = new Sample();
		int[] A = {2,1,5,-6,9};
		System.out.println(s.solution("ABBCC"));
	}

	public String solution(String S) {
        // write your code in Java SE 8
		do{
			S = S.replaceAll("AB","AA");
			S = S.replaceAll("BA","AA");
			S = S.replaceAll("CB","CC");
			S = S.replaceAll("BC","CC");
			S = S.replaceAll("AA","A");
			S = S.replaceAll("CC","C");
			
		}while(S.contains("AB")||S.contains("BA")||S.contains("BC")||S.contains("CB")||S.contains("AA")||S.contains("CC"));
		return S;
    }
}
