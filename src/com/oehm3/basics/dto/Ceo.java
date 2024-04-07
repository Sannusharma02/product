package com.oehm3.basics.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ceo")
public class Ceo implements Serializable{
	
	@Id
	@GenericGenerator(name = "ceo_auto", strategy = "increment")
	@GeneratedValue(generator = "ceo_auto")
	@Column(name = "ceo_id")
	private Long ceoId;
	
	@Column(name = "name")
	private String name;

	@Column(name = "age")
	private Long age;
	
	@Column(name = "nationality")
	private String nationality;
	
	public Ceo() {
		// TODO Auto-generated constructor stub
	}

	public Long getCeoId() {
		return ceoId;
	}

	public void setCeoId(Long ceoId) {
		this.ceoId = ceoId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Override
	public String toString() {
		return "Ceo [ceoId=" + ceoId + ", name=" + name + ", age=" + age + ", nationality=" + nationality + "]";
	}
}
