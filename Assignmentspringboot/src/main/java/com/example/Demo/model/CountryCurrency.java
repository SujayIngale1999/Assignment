package com.example.Demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class CountryCurrency {

	 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
private int cid;
	private String cname;
	@OneToOne(cascade = CascadeType.ALL)
	  // column to connect with posts
	 Currencies currence;
	@OneToOne(cascade = CascadeType.ALL)

	Countries countries;
	
	public Countries getCountries() {
		return countries;
	}
	public void setCountries(Countries countries) {
		this.countries = countries;
	}
	public Currencies getCurrence() {
		return currence;
	}
	public void setCurrence(Currencies currence) {
		this.currence = currence;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public CountryCurrency(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	public CountryCurrency() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "CountryCurrency [cid=" + cid + ", cname=" + cname + "]";
	}
	
	
}
