package com.gurukul.day10;

public class StraightInsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {8,15,7,2,11,4};
       int i,j,s=0,t;
       
      for(i=0;i<arr.length;i++){
    	  s=i;
    	  for(j=i+1;j<arr.length;j++)
    		  
    	   {
    	     if( arr[j] < arr[s] )
    		  
    			  s=j;		  
    		  
    	  }
    	  t=arr[i];
		  arr[i]=arr[s];
		  arr[s]=t;
    	  
    	  
      }
      for( i=0;i<arr.length-1;i++)
      
    	  System.out.print(arr[i]+" ");
      
      
	}

}
