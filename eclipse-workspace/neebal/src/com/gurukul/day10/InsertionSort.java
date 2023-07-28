package com.gurukul.day10;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int arr[]= {8,7,11,2,9,4};
              int t=0,j;
             for(int i=0;i<arr.length;i++){
            	 
            	  t=arr[i];
            	  for( j=i;j>0 && arr[j-1]>t;j--)
            	  {
            		  arr[j]=arr[j-1];
            	  }
            	  arr[j]=t;
                }
             for(int i=0;i<arr.length;i++) {
            	 System.out.print(arr[i]+" ");
             }
            		   
            			 
            		   
	}

}
