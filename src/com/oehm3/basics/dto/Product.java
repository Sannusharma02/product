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
@Table(name = "product")
public class Product implements Serializable{

	@Id
	@GenericGenerator(name = "p_auto", strategy = "com.oehm3.basics.utils.CustomIdGenerator")
	@GeneratedValue(generator = "p_auto")
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "manufacture_date")
	private Date  manufactureDate;
	@Column(name = "product_type")
	private String productType;
	@Column(name = "price")
	private Double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", manufactureDate=" + manufactureDate + ", productType="
				+ productType + ", price=" + price + "]";
	}

	
}
