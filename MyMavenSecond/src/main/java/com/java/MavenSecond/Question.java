package com.java.MavenSecond;

public class Question {
 
	int qstnId;
	String qstn;
	String [] answer;

	Question(int id, String qstn, String [] a){
		this.qstnId=id;
		this.qstn=qstn;
		this.answer=a;
	}
	
	void display() {
		System.out.println("ID is:" +qstnId);
		System.out.println("Question is:" +qstn);
		System.out.println("Answer is");
		for(int i =1;i<answer.length;i++) {
			System.out.println(answer[i]);
			
		}
		
		// using set
		
		
	}

}
