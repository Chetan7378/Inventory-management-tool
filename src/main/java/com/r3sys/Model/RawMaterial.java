package com.r3sys.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="rawMaterial")
public class RawMaterial {
	@Id
	private int id;
	private String name;
	private int quantity;
	private String unit;
	private int costperunit;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getCostperunit() {
		return costperunit;
	}
	public void setCostperunit(int costperunit) {
		this.costperunit = costperunit;
	}
	public RawMaterial(int id, String name, int quantity, String unit, int costperunit) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unit = unit;
		this.costperunit = costperunit;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public RawMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RawMaterial [id=" + id + ", name=" + name + ", quantity=" + quantity + ", unit=" + unit
				+ ", costperunit=" + costperunit + "]";
	}

}
