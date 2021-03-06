package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="QuestionPaper")
public class QuestionPaper {
	
	@Id
	@GeneratedValue
	private int qpid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="eid")
	private ExamHistory examHistory;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="qid")
	private QuestionBank questionBank;
	
	public int getQpid() {
		return qpid;
	}
	public void setQpid(int qpid) {
		this.qpid = qpid;
	}
	public ExamHistory getExamHistory() {
		return examHistory;
	}
	public void setExamHistory(ExamHistory examHistory) {
		this.examHistory = examHistory;
	}
	public QuestionBank getQuestionBank() {
		return questionBank;
	}
	public void setQuestionBank(QuestionBank questionBank) {
		this.questionBank = questionBank;
	}
	
	

}
