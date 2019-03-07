package com.hackerrank.practice;
import java.util.*;

public class TriangleTest {
	
	public static int triangleTest(int[] A) {
		 Arrays.sort(A);
	        int hasTriangular = 0;
	        // System.out.print(Arrays.toString(A));
	        
	        if (A.length < 3) {
	            hasTriangular = 0;
	        }
	        else {
	            int P = 0;
	            int Q = 1;
	            int R = 2;
	            
	            for(int i= 2; i<A.length; i++) {
	                if((long) A[P]+ (long) A[Q]> (long)A[R]) {
	                    hasTriangular = 1;
	                    break;
	                }
	                else {
	                    P++;
	                    Q++;
	                    R++;
	                }   
	            }
	        }
	        
	        return hasTriangular;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {3,4,5,1,2,3,12,13,16};
		System.out.println(triangleTest(arr));

	}

}
