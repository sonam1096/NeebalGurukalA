package com.gurukul.day11;

public class nQueen {
	
  private 	static boolean check(int[]ch,int r) {
		for (int i=0;i<r;i++) 
		{
			if(ch[i]==ch[r] || Math.abs(r-i)==Math.abs(ch[r]-ch[i]))
		      return false;
		}
		return true;
		
  }
		
  public static void main(String[] args) {
		 
	   String s="abcde";
	   int ch[]= {2,3,5,5};
	   NQueen(ch,0);
		
	}
		
		
      private  static void NQueen(int[] ch,int r) {
    	   for(int c=0;c<ch.length;c++)
    	   {
    		   ch[r]=c;
    		   if(check(ch,r))
    		   {
    			   if(r+1<ch.length)
    				   NQueen(ch,r+1);
    			   else
    			   {
    				   for(int i=0;i<ch.length;i++)
    				   {
    					   System.out.print(i+" "+ch[i]+" "+i);
    					   
    				   }
    				   System.out.println(c);
    		   
    	   }
       
     }

}
}
}
