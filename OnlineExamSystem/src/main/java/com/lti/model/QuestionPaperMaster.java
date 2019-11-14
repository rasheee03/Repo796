package com.lti.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="QuestionPaperMaster")
public class QuestionPaperMaster {
	
	private int qpmid;
	
	@Column(name="cid")
	private Course course;

}
