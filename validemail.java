package validemail;
import java.util.regex.*;    
import java.util.*;
public class validemail {
	    
	 
	    public static void main(String args[]){  
	        ArrayList<String> emails = new ArrayList<String>();  
	        emails.add("2user@gmail.co.in");  
	        emails.add("user&gmail.com");  
	        emails.add("user2@gmail.com");  
	        emails.add("user@gmailcom");    
	        emails.add("user#gmail.com");  
	        //regular expression
	        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";  
	        
	        Pattern pattern = Pattern.compile(regex);  
	         
	        for(String email : emails){  
	               
	            Matcher matcher = pattern.matcher(email);  
	            System.out.println(email +" : "+ matcher.matches()+"\n");  
	        }  
	    }  
	} 




