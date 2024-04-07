 package com.oehm3.basics.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "question")
public class Question implements Serializable{
	
	@Id
	@GenericGenerator(name = "q_auto", strategy = "increment")
	@GeneratedValue(generator = "q_auto")
	@Column(name ="q_id")
	private Long qId;
	
	@Column(name ="details")
	private String details;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "q_a_intermediate", 
	joinColumns = { @JoinColumn(name = "q_id") }, 
	inverseJoinColumns = { @JoinColumn(name = "a_id") }
	)
	private List<Answer> answers;

	public Question() {
		super();
	}

	public Long getqId() {
		return qId;
	}

	public void setqId(Long qId) {
		this.qId = qId;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [qId=" + qId + ", details=" + details + ", answers=" + answers + "]";
	}
}
