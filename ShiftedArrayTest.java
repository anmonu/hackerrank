package com.hackerrank.practice;

public class ShiftedArrayTest {
	
	public static int[] shiftArray(int[] arr, int k){
		int[] shiftedArray= new int[arr.length];
		
		int pos=-1;
		if(arr.length==1)
			return arr;
		if(k>arr.length)
			k=k%arr.length;
		for (int i=0;i<arr.length;i++){
			if((i+k)>arr.length-1){
				pos=Math.abs(arr.length-i-k);
			}
			else
				pos=i+k;
			shiftedArray[pos]=arr[i];
		}
		return shiftedArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] {1,2,3,4,5,6,7};
int[] shiftedArray=shiftArray(array, 9);

for(int i=0;i<shiftedArray.length;i++){
	System.out.println(shiftedArray[i]);
}
		
	}

}
