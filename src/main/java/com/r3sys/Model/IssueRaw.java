package com.r3sys.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="issueraw")
public class IssueRaw {
	@Id
	private int id;
	private int pid;
	private String productName;
	private int quantity;
	private String issuerName;
	private String datee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getIssuerName() {
		return issuerName;
	}
	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}
	public String getDatee() {
		return datee;
	}
	public void setDatee(String datee) {
		this.datee = datee;
	}
	public IssueRaw(int id, int pid, String productName, int quantity, String issuerName, String datee) {
		super();
		this.id = id;
		this.pid = pid;
		this.productName = productName;
		this.quantity = quantity;
		this.issuerName = issuerName;
		this.datee = datee;
	}
	public IssueRaw() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IssueRaw [id=" + id + ", pid=" + pid + ", productName=" + productName + ", quantity=" + quantity
				+ ", issuerName=" + issuerName + ", datee=" + datee + "]";
	}
	

}
