package com.lti.model;

import java.time.LocalDateTime;

import javax.persistence.Column;

public class ExamHistory {
	
	private int eid;
	
	@Column(name="uid")
	private Login login;
	private LocalDateTime dateTime;
	private int result;
	
	@Column(name="cid")
	private Course course;

}
