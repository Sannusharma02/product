package com.oehm3.basics.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "company")
public class Company implements Serializable{
	@Id
	@GenericGenerator(name = "c_auto", strategy = "increment")
	@GeneratedValue(generator = "c_auto")
	@Column(name = "c_id")
	private Long cId;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;

	@Column(name = "c_size")
	private Long companySize;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "ceo_id")
	private Ceo ceo;

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getCompanySize() {
		return companySize;
	}

	public void setCompanySize(Long companySize) {
		this.companySize = companySize;
	}

	public Ceo getCeo() {
		return ceo;
	}

	public void setCeo(Ceo ceo) {
		this.ceo = ceo;
	}

	@Override
	public String toString() {
		return "Company [cId=" + cId + ", name=" + name + ", type=" + type + ", companySize=" + companySize + ", ceo="
				+ ceo + "]";
	}
}
