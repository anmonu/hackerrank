package com.hackerrank.practice;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class BinaryGap {

	public static int binaryGap(int n){
		int gap=0;
		String binary=Integer.toBinaryString(n);
		int i=binary.length()-1;
		while(binary.charAt(i)=='0'){
			i--;
		}
		int counter=0;
		for(;i>=0;i--){
			if(binary.charAt(i)=='1'){
				gap=Math.max(gap, counter);
				counter=0;
			}
			else{
				counter++;
			}
				
		}
		
		return Math.max(gap, counter);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
System.out.println("Binary Gap for "+n+" is "+binaryGap(n));
	}

}
