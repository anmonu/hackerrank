package com.hackerrank.practice;
import java.util.*;

public class UniqueElementsInArray {
	
	public static int getUniqueNumbeOfElementsinArray(int[] arr){
		//int x=0;
		ArrayList<Integer> array=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			array.add(arr[i]);
		}
		ArrayList<Integer> uniqueArray=new ArrayList<>();
	 for (Integer integer : array) {
		if(!uniqueArray.contains(integer)){
			uniqueArray.add(integer);
		}
	}
		
return uniqueArray.size();		/*
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]!=arr[j] && i!=j){
				 x++;
				}
				else
				{
					x++;
				}
			}
		}
		/*for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=-1)
				x++;
		}*/
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr =new int[] {1,2,2,3,4,2,3,5,6};
System.out.println(getUniqueNumbeOfElementsinArray(arr));
	}

}
