package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="UserAnswer")
public class UserAnswer {
	
	private int uaid;
	
	@JoinColumn(name = "qid", nullable = false)
	private QuestionBank questionBank;
	
	@JoinColumn(name = "opid", nullable = false)
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
