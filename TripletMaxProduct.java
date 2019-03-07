package com.hackerrank.practice;

import java.util.Arrays;

public class TripletMaxProduct {
	
	public static int tripletProduct(int[] A) {
Arrays.sort(A);
        
        int maxTriplet = 0;
        int N = A.length;
        

        if(A[0]*A[1]>0 && A[0]<0) {
            if(A[0]*A[1]*A[N-1]>A[N-3]*A[N-2]*A[N-1]){
                maxTriplet = A[0]*A[1]*A[N-1];
            }
            else{
                maxTriplet = A[N-3]*A[N-2]*A[N-1];
            }    
        }
        else{
            maxTriplet = A[N-3]*A[N-2]*A[N-1];
        }
        
        return maxTriplet;
		
		/*Arrays.sort(arr);
		int p=0;
		int q=1;
		int r=2;
		int max=-999999999;
		for (int i = 0; i < arr.length-2; i++) {
			max=Math.max(max, arr[p+i]*arr[q+i]*arr[r+i]);
		}
		return max;
		*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {2,4,5,-1,2,9,-3,5,6,7,8};
		System.out.println(tripletProduct(arr));
	}

}
