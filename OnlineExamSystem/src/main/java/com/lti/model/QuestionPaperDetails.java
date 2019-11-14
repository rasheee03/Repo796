package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="QuestionPaperDetails")
public class QuestionPaperDetails {

	private int noOfQuestions;
	
	@Column(name="lvl")
	private QuestionBank questionBank;
	
	@Column(name="qpmid")
	private QuestionPaperMaster opm;

	public int getNoOfQuestions() {
		return noOfQuestions;
	}

	public void setNoOfQuestions(int noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}

	public QuestionBank getQuestionBank() {
		return questionBank;
	}

	public void setQuestionBank(QuestionBank questionBank) {
		this.questionBank = questionBank;
	}

	public QuestionPaperMaster getOpm() {
		return opm;
	}

	public void setOpm(QuestionPaperMaster opm) {
		this.opm = opm;
	}
	
	
	
}
