package com.example.demo;

import javax.persistence.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name="PRODUCTMASTER")
public class ProductMaster {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productid;
	private String name;
	private String description;
	private String category;
	private String subcategory;
	private long unitprice;
	private String imageref;
	private long quantity;
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public long getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(long unitprice) {
		this.unitprice = unitprice;
	}
	public String getImageref() {
		return imageref;
	}
	public void setImageref(String imageref) {
		this.imageref = imageref;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
}
