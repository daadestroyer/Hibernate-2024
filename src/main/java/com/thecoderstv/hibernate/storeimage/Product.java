package com.thecoderstv.hibernate.storeimage;

import java.sql.Date;

import org.hibernate.boot.model.relational.Database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	int pid;

	@Column(name = "product_name")
	String pName;

	@Lob
	@Column(columnDefinition = "LONGBLOB")
	byte[] image;

	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	Date date;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pName, byte[] image, Date date) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.image = image;
		this.date = date;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	// Additional method to set date using java.util.Date
    public void setUtilDate(java.util.Date utilDate) {
        this.date = new Date(utilDate.getTime());
    }

}
