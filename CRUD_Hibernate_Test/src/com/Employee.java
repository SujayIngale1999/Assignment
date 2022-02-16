package com;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private int sl_no;
	private String employee_name;
	private String mibil_no;
	
	public int getSl_no() {
		return sl_no;
	}
	public void setSl_no(int sl_no) {
		this.sl_no = sl_no;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getMibil_no() {
		return mibil_no;
	}
	public void setMibil_no(String mibil_no) {
		this.mibil_no = mibil_no;
	}
	@Override
	public int hashCode() {
		return Objects.hash(employee_name, mibil_no, sl_no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employee_name, other.employee_name) && Objects.equals(mibil_no, other.mibil_no)
				&& sl_no == other.sl_no;
	}
	@Override
	public String toString() {
		return "Employee [sl_no=" + sl_no + ", employee_name=" + employee_name + ", mibil_no=" + mibil_no + "]";
	}
	public Employee(int sl_no, String employee_name, String mibil_no) {
		super();
		this.sl_no = sl_no;
		this.employee_name = employee_name;
		this.mibil_no = mibil_no;
	}
	public Employee() {
		super();
	}
	
	
}
