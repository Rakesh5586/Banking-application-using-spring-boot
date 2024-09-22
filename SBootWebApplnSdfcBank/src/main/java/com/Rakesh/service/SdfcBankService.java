package com.Rakesh.service;

import java.util.List;

import com.Rakesh.model.SdfcBank;

public interface SdfcBankService 
{
	//All Abstracted Methods....
  public SdfcBank saveAccount(SdfcBank sdfcbank);
  public SdfcBank getOneAccount(int accno);
  public List<SdfcBank> getAllAccount();
  public SdfcBank depositeAmount( int accno,double amount);
  public SdfcBank withdrawAmount( int accno,double amount);
  public SdfcBank transferAmount(int accno,double amount,int tracc);
  public String closeAccount(int accno);
}
