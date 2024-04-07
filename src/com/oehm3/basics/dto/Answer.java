package com.oehm3.basics.dto;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "answer")
public class Answer implements Serializable{
	
	@Id
	@GenericGenerator(name = "a_auto", strategy = "increment")
	@GeneratedValue(generator = "a_auto")
	@Column(name ="a_id")
	private Long aId;
	
	@Column(name ="details")
	private String details;
	
	
	public Answer() {
	}

	public Long getaId() {
		return aId;
	}

	public void setaId(Long aId) {
		this.aId = aId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Answer [aId=" + aId + ", details=" + details + "]";
	}
}
