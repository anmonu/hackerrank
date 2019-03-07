package com.hackerrank.practice;

public class OddPairArray {

	public static int getOddOneOutFromArray(int[] arr){
		//int x=0;
		/*boolean flag=true;
		 * int n=arr.length;
		for(int i=0;i<n;i++){
			flag=true;
			for(int j=0;j<n;j++)
				if(arr[i]==arr[j] && i!=j)
					{
					flag=false;
					break;

			
					
					}
				if(flag)
				{return arr[i];
					}
					
			
		}
		
		return 0;
		 * 
		 */
		
		for (int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i]==arr[j] && i!=j){
					arr[i]=-1;
					arr[j]=-1;
					break;
				}
			}}
		
			for(int k=0;k<arr.length;k++){
				if(arr[k]!=-1){
					return arr[k];
					
				}
			}
			return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr=new int[] {4,3,5,3,4,7,5,6,6};
System.out.println("Odd one out is "+getOddOneOutFromArray(arr));
	}

}
