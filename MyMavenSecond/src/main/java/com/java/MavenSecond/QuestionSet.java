package com.java.MavenSecond;

import java.util.HashSet;
import java.util.Set;

public class QuestionSet {

	int qstnId;
	String qstn;
	Set<String> set=new HashSet<String>();

	QuestionSet(int id, String qstn,Set<String> a){
		this.qstnId=id;
		this.qstn=qstn;
		this.set=a;
	}
	
	void display() {
		System.out.println("ID is:" +qstnId);
		System.out.println("Question is:" +qstn);
		System.out.println("Answer is"+set);
		
		
		
	}

}
