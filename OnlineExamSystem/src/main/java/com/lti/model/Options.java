package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Options")
public class Options {
	
	@Id
	@GeneratedValue
	private int opid;
	
	private String value;
	private boolean isCorrectAns;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="qid")
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
