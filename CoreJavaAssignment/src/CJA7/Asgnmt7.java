package CJA7;

import java.util.Scanner;

public class Asgnmt7 {

 Integer  [] a =new Integer[15];



  void array() {
	   int i;
	  Scanner obj=new Scanner(System.in);
	  System.out.println("Please size of an array");
	 int n= obj.nextInt();
	 
	  System.out.println("Please Enter array");
	  for(i=0;i<n;i++) {
		  a[i]=obj.nextInt();
		  }
	  System.out.println("Please Enter the element to search");
		int search=obj.nextInt();
	    
		 for(i=0;i<n;i++)
    	   if(a[i].equals(search)) {
    		   System.out.println("Search is successfull");
    		   break;
    	   }
    	   else {
    		   System.out.println("Search is unsuccessfull");
    		   break;
    	   }
       }
	  

  public static void main(String args[]) {
	  
	  Asgnmt7 obj=new Asgnmt7();
	  obj.array();
			  
  }
}
