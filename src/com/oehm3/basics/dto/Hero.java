package com.oehm3.basics.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name = "hero")
public class Hero implements Serializable{
	@Id
	@GenericGenerator(name = "h_auto", strategy = "increment")
	@GeneratedValue(generator = "h_auto")
	@Column(name ="h_id")
	private Long hId;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="number_of_movies")
	private Long numberOfMovies;
	
	@Column(name ="debut_date")
	private Date debutDate;

	public Hero() {
		super();
	}

	@Override
	public String toString() {
		return "Hero [hId=" + hId + ", name=" + name + ", numberOfMovies=" + numberOfMovies + ", debutDate=" + debutDate
				+ "]";
	}

	public Long gethId() {
		return hId;
	}

	public void sethId(Long hId) {
		this.hId = hId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumberOfMovies() {
		return numberOfMovies;
	}

	public void setNumberOfMovies(Long numberOfMovies) {
		this.numberOfMovies = numberOfMovies;
	}

	public Date getDebutDate() {
		return debutDate;
	}

	public void setDebutDate(Date debutDate) {
		this.debutDate = debutDate;
	}

	
}
