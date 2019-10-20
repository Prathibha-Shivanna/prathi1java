package CJA5;

import java.util.Scanner;

public class Asgnmt5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
     System.out.println("Please Enter your choice \n 1.Male 2. Female 3.citizen");
     int ch= sc.nextInt();
     System.out.println("Please Enter your Salary");
     int sal=sc.nextInt();
     if(sal<180000)
     {
    	 System.out.println("No tax below this salary");
     }
     
     else if(sal>181001 && sal<300000) {
    	 
    	 float afterCal=-(sal/100)*10;
    	 System.out.println(" tax:" +afterCal);
     }
     else if(sal>300001 && sal<50000) {
    	 
    	 float afterCal=(sal/100)*20;
    	 System.out.println(" tax:" +afterCal);
     }
     else if(sal>500001 && sal<1000000) {
    	 
    	 float afterCal=(sal/100)*30;
    	 System.out.println(" tax:" +afterCal);
     }

	}

}
