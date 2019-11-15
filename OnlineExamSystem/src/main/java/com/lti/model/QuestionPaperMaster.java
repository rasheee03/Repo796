package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="QuestionPaperMaster")
public class QuestionPaperMaster {
	
	private int qpmid;
	
	@JoinColumn(name = "cid", nullable = false)
	private Course course;

}
