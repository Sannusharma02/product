package com.oehm3.basics.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "movies")
public class Movies implements Serializable {
	
	@Id
	@GenericGenerator(name = "m_auto", strategy = "increment")
	@GeneratedValue(generator = "m_auto")
	@Column(name ="m_id")
	private Long mId;
	
	@Column(name ="name")
	private String name;
	
	@Column(name ="rating")
	private Double rating;
	
	@Column(name ="release_date")
	private Date releaseDate;

	@Column(name ="grossCollection")
	private Double grossCollection;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="fk_id")
	private  Hero hero;

	@Override
	public String toString() {
		return "Movies [mId=" + mId + ", name=" + name + ", rating=" + rating + ", releaseDate=" + releaseDate
				+ ", grossCollection=" + grossCollection + ", hero=" + hero + "]";
	}

	public Long getmId() {
		return mId;
	}

	public void setmId(Long mId) {
		this.mId = mId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Double getGrossCollection() {
		return grossCollection;
	}

	public void setGrossCollection(Double grossCollection) {
		this.grossCollection = grossCollection;
	}

	public Hero getHero() {
		return hero;
	}

	public void setHero(Hero hero) {
		this.hero = hero;
	}

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
}
