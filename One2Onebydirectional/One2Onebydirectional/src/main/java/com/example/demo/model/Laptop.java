package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
 
@Entity
public class Laptop implements Serializable
{
 
    /**
     * 
     */
    private static final long serialVersionUID = 5762231962793190350L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lid;
    private String brand, cpu,hdd,ram;
    @OneToOne
    @JoinColumn(name = "emp_id")
    private Employee employee;
    
	public Long getLid() {
		return lid;
	}
	public void setLid(Long lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, cpu, hdd, lid, ram);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(cpu, other.cpu) && Objects.equals(hdd, other.hdd)
				&& Objects.equals(lid, other.lid) && Objects.equals(ram, other.ram);
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + "]";
	}
	public Laptop(Long lid, String brand, String cpu, String hdd, String ram, Employee employee) {
		super();
		this.lid = lid;
		this.brand = brand;
		this.cpu = cpu;
		this.hdd = hdd;
		this.ram = ram;
		this.employee = employee;
	}
	public Laptop() {
		super();
	}
    
    
}
