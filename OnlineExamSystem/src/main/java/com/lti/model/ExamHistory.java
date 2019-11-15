package com.lti.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class ExamHistory {
	
	private int eid;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "userid", nullable = false)
	private Login login;
	
	private LocalDateTime dateTime;
	private int result;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "cid", nullable = false)
	private Course course;

}
