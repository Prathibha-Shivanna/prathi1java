package CJA6;

import java.util.Scanner;

public class Asgnmt6 {


	public static void main(String[] args) {
		
		String username="Prathibha";
		String pwd="Prathi**";
		 
	        
            int attempt=0;
            while(attempt<3)
            {
            	System.out.println("Login Here ! ");
    	        Scanner scanner = new Scanner(System.in);
    	        System.out.println("Username : ");
    	        username = scanner.next();
    	        System.out.println("Password : ");
    	        pwd = scanner.next();
    	        
            	if((username.equals("Prathibha")) && (pwd.equals("Prathi**")))
            	{
            		System.out.println("welcome " + username);
            		break;
            	}
            	else
            	{
            		System.out.println("Invalid credentials");
            		attempt++;
            	}       	
            	 
           }
            if(attempt==3) {
          		 System.out.println("Contact admin");     
          		
            	
            
      	}
           
	}
	}
	

