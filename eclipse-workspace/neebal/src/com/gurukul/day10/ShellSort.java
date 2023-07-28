package com.gurukul.day10;

public class ShellSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {6,3,9,5,6,4,11,14};
      
      for(int g=arr.length/2;g>=1;g=g/2) {
    	  int t=0,i,j;
          for( i=g;i<arr.length;i++) {
        	  t=arr[i];
        	  for(j=i;j>=g&&arr[j-g]>t;j=j-g) {
        		  arr[j]=arr[j-g];
        	  }
        	  arr[j]=t;
          }
          
          }
      for(int i=0;i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
	}

}
