package com.hackerrank.practice;
import java.util.*;
import java.text.*;

public class CurrencyFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
       NumberFormat nfUS= NumberFormat.getCurrencyInstance(Locale.US);
       String us=nfUS.format(payment);
       NumberFormat nfIN= NumberFormat.getCurrencyInstance(new Locale("en","in"));
       String india=nfIN.format(payment);
       NumberFormat nfCH= NumberFormat.getCurrencyInstance(Locale.CHINA);
       String china=nfCH.format(payment);
       NumberFormat nfFR= NumberFormat.getCurrencyInstance(Locale.FRANCE);
       String france=nfFR.format(payment);

       

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

	}

}
