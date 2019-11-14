package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Options")
public class Options {
	
	private int opid;
	private boolean isCorrectAns;
	
	@Column(name="qid")
	private QuestionBank questionBank;
	
	
	public int getOpid() {
		return opid;
	}
	public void setOpid(int opid) {
		this.opid = opid;
	}
	public boolean isCorrectAns() {
		return isCorrectAns;
	}
	public void setCorrectAns(boolean isCorrectAns) {
		this.isCorrectAns = isCorrectAns;
	}
	public QuestionBank getQuestionBank() {
		return questionBank;
	}
	public void setQuestionBank(QuestionBank questionBank) {
		this.questionBank = questionBank;
	}
	
	
	

}
