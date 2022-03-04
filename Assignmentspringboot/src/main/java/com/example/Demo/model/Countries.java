package com.example.Demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Countries {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	private String name;
	@OneToOne
	Currencies currencie;
	@OneToOne
	CountryCurrency  countrycurrency;
	
	
	public CountryCurrency getCountrycurrency() {
		return countrycurrency;
	}
	public void setCountrycurrency(CountryCurrency countrycurrency) {
		this.countrycurrency = countrycurrency;
	}
	public Currencies getCurrencie() {
		return currencie;
	}
	public void setCurrencie(Currencies currencie) {
		this.currencie = currencie;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public Countries(String name, int rid) {
		super();
		this.name = name;
		this.rid = rid;
	}
	public Countries() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Countries [name=" + name + ", rid=" + rid + "]";
	}
	
}
