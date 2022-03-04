package com.example.Demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Currencies {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int currencyid;
	
	@OneToOne
	
	CountryCurrency CountryCurrency ;
	
	
	public int getCurrencyid() {
		return currencyid;
	}
	public void setCurrencyid(int currencyid) {
		this.currencyid = currencyid;
	}
	public Currencies(int currencyid) {
		super();
		this.currencyid = currencyid;
		
	}
	public Currencies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CountryCurrency getCountryCurrency() {
		return CountryCurrency;
	}
	public void setCountryCurrency(CountryCurrency countryCurrency) {
		CountryCurrency = countryCurrency;
	}
	@Override
	public String toString() {
		return "Currencies [currencyid=" + currencyid + "]";
	}
	
	
}
