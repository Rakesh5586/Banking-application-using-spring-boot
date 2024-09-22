package com.Rakesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rakesh.model.SdfcBank;
import com.Rakesh.repo.SdfcBankRepo;
@Service
public class SdfcBankServiceImp implements SdfcBankService 
{
	@Autowired
    private SdfcBankRepo repo;
	
	@Override
	public SdfcBank saveAccount(SdfcBank sdfcbank) 
	{
		SdfcBank saveSdfcbank  = repo.save(sdfcbank);
		String sts = "Activated";
		saveSdfcbank.setStatus(sts);
		repo.save(saveSdfcbank);
		return saveSdfcbank;
	}

	@Override
	public SdfcBank getOneAccount(int accno) 
	{
		SdfcBank getBalance = repo.findById(accno).get();
		return getBalance;
	}
	@Override
	public SdfcBank depositeAmount(int accno,double amount)
	{
		SdfcBank deposite = repo.findById(accno).get();
		double oldAmt = deposite.getAmount();
		double newAmt=oldAmt+amount;
		deposite.setAmount(newAmt);
		repo.save(deposite);
		return deposite;
	}
       
	@Override
	public SdfcBank withdrawAmount(int accno,double amount)
	{
		SdfcBank withdraw = repo.findById(accno).get();
		double oldAmt = withdraw.getAmount();
		if(oldAmt>amount)
		{
		  double newAmt = oldAmt-amount;
		  withdraw.setAmount(newAmt);
		  repo.save(withdraw);
		}
		return withdraw;
	}
	 @Override
	 public SdfcBank transferAmount(int accno,double amount,int tracc)
	 {
		SdfcBank transfer  = repo.findById(accno).get();
		  double oldAmt = transfer.getAmount();
		  double newAmt = oldAmt-amount;
		  transfer.setAmount(newAmt);
		  repo.save(transfer);
		 
		 SdfcBank transfer1  = repo.findById(tracc).get();
		     transfer1.setAccno(tracc);
		   double oldmt = transfer1.getAmount();
		   double namt = oldmt+amount;
		   transfer1.setAmount(namt);
		   repo.save(transfer1);
		 return transfer;
	 }
	 @Override
	 public String closeAccount(int accno)
	 {
		 SdfcBank close = repo.findById(accno).get();
		 close.setStatus("Deactivated");
		 repo.save(close);
		 return "Welcome "+ close.getName() +" your account "+close.getAccno()+" is Closed.";
	 }
	@Override
	public List<SdfcBank> getAllAccount() {
		// TODO Auto-generated method stub
		return null;
	}

}
