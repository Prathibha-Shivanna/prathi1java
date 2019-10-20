package CJA9;

import java.util.Scanner;

public class Asgnmt9 {
	
	public static void main(String args[]) {
		int a,b,c,i;
		int j=1;
		double avg=0;
		int[] s= new int[15];
		float total;
		Scanner scan=new Scanner(System.in);
		while(j<4) {
		System.out.println("Enter marks of " +j+ " student" +"in 3 subject");
		for(i=1;i<=3;i++)
		
		{
			s[i]=scan.nextInt();
		}
		j++;
		}
//		
//		System.out.println("Toal scored by each student is \n");
//		for(int i=0;i<3;i++) {
//			System.out.println("Sum of Student"+i+ " is"+ avg+s[i]);
//		}
		//for( i=0;i<3;i++)
		System.out.println(s[2]);
}
}
