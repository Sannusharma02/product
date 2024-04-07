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
@Table(name = "model")
public class Model implements Serializable{

	@Id
	@GenericGenerator(name = "m_auto", strategy = "increment")
	@GeneratedValue(generator = "m_auto")
	@Column(name = "m_id")
	private Long mId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "version")
	private String version;
	
	@Column(name = "manufacture_date")
	private Date manufactureDate;
	
	@Column(name = "price")
	private Double price;

	public Model() {
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Model [mId=" + mId + ", name=" + name + ", version=" + version + ", manufactureDate=" + manufactureDate
				+ ", price=" + price + "]";
	}

}
