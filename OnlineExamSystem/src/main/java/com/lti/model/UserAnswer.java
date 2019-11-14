package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="UserAnswer")
public class UserAnswer {
	
	private int uaid;
	
	@Column(name="qid")
	private QuestionBank questionBank;
	
	@Column(name="opid")
	private Options options;

	public QuestionBank getQuestionBank() {
		return questionBank;
	}

	public void setQuestionBank(QuestionBank questionBank) {
		this.questionBank = questionBank;
	}

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}
	
	

}
