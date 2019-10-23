package com.java.MavenSecond;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class QuestionMap {

	
	int qstnId;
	String qstn;
	Map< Integer,String> ans;

	QuestionMap(int id, String qstn,Map<Integer,String> ans){
		this.qstnId=id;
		this.qstn=qstn;
		this.ans=ans;
	}
	
	void display() {
		System.out.println("ID is:" +qstnId);
		System.out.println("Question is:" +qstn);
		System.out.println("Answer is"+ans);
		
}
}