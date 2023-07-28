package com.gurukul.day8;

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="aeiouaeioueeeeeeeeeeeeeeee";
       
      int count=0;
      for(int i=0;i<s.length();i++)
      {
    	  char  ch=s.charAt(i);
    	  if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o' || ch=='u') {
    		  count++;
    	  }
    	   
      }
      System.out.println(count);
    		  
	}

}
