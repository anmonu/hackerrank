package com.hackerrank.practice;

public class Question2 {
 public static int  solution(int A) {
	 String number = String.valueOf(A);
		int length = number.length();
		StringBuilder sb = new StringBuilder(length);
		int limit = length % 2 == 0 ? length / 2 : length / 2 + 1;
		for (int i = 0, j = length - 1; i < limit; i++, j--) {
			if (i == j) {
				sb.append(number.charAt(i));
			} else {
				sb.append(number.charAt(i));
				sb.append(number.charAt(j));
			}
		}
		return Integer.parseInt(sb.toString());
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solution(123456));

	}

}
