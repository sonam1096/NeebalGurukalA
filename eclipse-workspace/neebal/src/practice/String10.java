package practice;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class String10 {

	public static void main(String[] args) {
		// Validate IP Address: Implement a program to validate whether a given string is a valid IP address or not
       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ip address");
		String str=sc.nextLine();
		boolean flag=false;
		if(str==null ) {
			System.out.println("Enter correct one");
		}else
		{
			String rege="(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
			
			String regex=rege+"\'"+rege+"\'"+rege+"\'"+rege;
			 Pattern pattern=Pattern.compile(regex);
			    Matcher matcher=pattern.matcher(str);
			    
			   /* for(int i=0;i<st.length;i++) {*/
			    	
			    	if(matcher.matches()) {
			    	  System.out.println("String matches");
			         }
			         else {
			    	  System.out.println("String not matches");
			        
			    }   

			
		}
		
		
		
		
		
		
		
		
	}

	 

}
