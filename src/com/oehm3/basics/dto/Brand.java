package com.oehm3.basics.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "brand")
public class Brand implements Serializable{

	@Id
	@GenericGenerator(name = "b_auto",strategy = "increment")
	@GeneratedValue(generator = "b_auto")
	@Column(name = "b_id")
	private Long bId;
	@Column(name = "name")
	private String name;
	@Column(name = "startDate")
	private Date startDate;
	@Column(name = "rank")
	private Long rank;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "brand_id")
	private List<Model> models;
	
	public Brand() {
		super();
	}
	
	public Long getbId() {
		return bId;
	}

	public void setbId(Long bId) {
		this.bId = bId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Long getRank() {
		return rank;
	}

	public void setRank(Long rank) {
		this.rank = rank;
	}

	public List<Model> getModels() {
		return models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}

	@Override
	public String toString() {
		return "Brand [bId=" + bId + ", name=" + name + ", startDate=" + startDate + ", rank=" + rank + "]";
	}

	
	
}
