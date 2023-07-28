package com.gurukul.day10;

public class HeapSort {
    static void HeapSort(int a[],int p,int n) {
    	 int t=a[p];
    	 int i;
    	for( i=2*p+1;i<n;i=2*i+1) {
    		if((i+1)<n && a[i]<a[i+1])
    			i++;
    		if(a[i]>t)
    			a[(i-1)/2]=a[i];
    		else
    			break;
    	}
    	a[(i-1)/2]=t;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[]= {8,9,7,20,12,3};
       int n=a.length;
       int t;
       
		for(int i=(n/2)-1;i>=0;i--)
		{
			HeapSort(a,i,n);
		}
			for(int i=n-1;i>0;i--)
			{
				t=a[0];
				a[0]=a[i];
				a[i]=t;
				HeapSort(a,0,i);
			}
			
		
		for(int a1:a)
			System.out.print(a1+" ");
		
		
		
	}

}
