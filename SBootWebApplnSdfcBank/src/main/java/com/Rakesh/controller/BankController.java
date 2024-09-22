package com.Rakesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Rakesh.model.SdfcBank;
import com.Rakesh.service.SdfcBankServiceImp;

@Controller
public class BankController 
{
	@Autowired
	SdfcBankServiceImp service;
	
	@RequestMapping("/")
    public String homePage()
    {
    	return "home";
    }
	@RequestMapping("/newAcc")
	public String newAccForm()
	{
		return "newAccForm";
	}
	@RequestMapping("/newAccUrl")
	public String addNewAcc(SdfcBank sdfcbank,ModelMap model)
	{
		service.saveAccount(sdfcbank);
		return"success";
	}
	@RequestMapping("/balance")
	public String getBalance()
	{
		return "balanceForm";
	}
	@RequestMapping("/getAccUrl")
	public  String getAccount(@RequestParam int accno,@RequestParam String name,@RequestParam String password,ModelMap model,SdfcBank sdfcbank)
	{
		 model.put("acid",accno);
		 model.put("nme",name);
		 model.put("psw",password);
		 if(sdfcbank.getAccno()==accno && sdfcbank.getName().equals(name) && sdfcbank.getPassword().equals(password))
		 {
			 model.put("balance", service.getOneAccount(accno));
			 
		     return "viewBalance";
		 }
		 else
		 {
			 return "errors";
		 }
	}
	@RequestMapping("/deposite")
	public String depositeForm()
	{
		return "deposite";
	}
	@RequestMapping("/depositeUrl")
	public String deposite(@RequestParam int accno,@RequestParam double amount,SdfcBank sdfcbank,ModelMap model)
	{
		model.put("acno",accno);
		model.put("amt",amount);
		model.put("depoamt",service.depositeAmount(accno,amount));
		return "depositemsg";
	}
	
	@RequestMapping("/withdraw")
	public String withdrawForm()
	{
		return "withdraw";
	}
	@RequestMapping("/withdrawUrl")
	public String withdraw(@RequestParam int accno,@RequestParam double amount,SdfcBank sdfcbank,ModelMap model)
	{
		model.put("id", accno);
		model.put("amt", amount);
		model.put("withamt",service.withdrawAmount(accno, amount));
		return "withdrawmsg";
	}
	@RequestMapping("/transfer")
	public String transForm()
	{
		return "transfer";
	}
	@RequestMapping("/transferUrl")
	public String transfer(@RequestParam int accno,@RequestParam String name,@RequestParam double amount,@RequestParam int tracc,SdfcBank sdfcbank,ModelMap model)
	{
		model.put("id", accno);
		model.put("amt", amount);
		model.put("tac", tracc);
		model.put("trans",service.transferAmount(accno, amount, tracc));
		return "transfermsg";
	}
	
	@RequestMapping("/closeAcc")
	public String closeForm()
	{
		return "close";
	}
	@RequestMapping("/closeUrl")
	public String close(@RequestParam int accno,SdfcBank sdfcbank,ModelMap model)
	{
		model.put("id", accno);
		model.put("cls", service.closeAccount(accno));
		return "closemsg";
	}
}
