package com.Rakesh.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SdfcBank 
{
  @Id
  private int accno;
  private String name;
  private String password;
  private String cnfpassword;
  private double amount;
  private String address;
  private String mobilenumber;
  private String status;
  
public SdfcBank() 
{
	super();
}

public SdfcBank(int accno, String name, String password, String cnfpassword, double amount, String address,
		String mobilenumber, String status) {
	super();
	this.accno = accno;
	this.name = name;
	this.password = password;
	this.cnfpassword = cnfpassword;
	this.amount = amount;
	this.address = address;
	this.mobilenumber = mobilenumber;
	this.status = status;
}

public int getAccno() {
	return accno;
}

public void setAccno(int accno) {
	this.accno = accno;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getCnfpassword() {
	return cnfpassword;
}

public void setCnfpassword(String cnfpassword) {
	this.cnfpassword = cnfpassword;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getMobilenumber() {
	return mobilenumber;
}

public void setMobilenumber(String mobilenumber) {
	this.mobilenumber = mobilenumber;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

@Override
public String toString() {
	return "SdfcBank [accno=" + accno + ", name=" + name + ", password=" + password + ", cnfpassword=" + cnfpassword
			+ ", amount=" + amount + ", address=" + address + ", mobilenumber=" + mobilenumber + ", status=" + status
			+ "]";
}
}
