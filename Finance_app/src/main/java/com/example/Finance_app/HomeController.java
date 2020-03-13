package com.example.Finance_app;

import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.ViewResolversBeanDefinitionParser;

@Controller
public class HomeController {
	
	
	@RequestMapping("/inputform")
	public ModelAndView display(){
		return new ModelAndView("inputform", "command", new Home());
	}
	
	ArrayList<Loan> outputList=new ArrayList<>();
	
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView calcualte(@ModelAttribute("inputs") Home inputs){
		
		double interest_months;
		interest_months=inputs.getRate()/12;
		
		
		
		double payment_months;
		int payment_no;
		double interest_paid;
		double principal_paid;
		double outstandingBal;
		double principal_updated;
		int noOfMonths;
		
		noOfMonths=inputs.getPeriod()*12;
		
		principal_updated=inputs.getAmount();
		
		interest_months=interest_months/100;
		
		
		payment_months= (principal_updated*interest_months*Math.pow(1+interest_months,noOfMonths))/(Math.pow(1+interest_months,noOfMonths)-1);
		
		payment_months=Math.round(payment_months*100.0)/100.0;
		
		System.out.println(payment_months);
		for(int i=1;i<=noOfMonths;i++){
			
			//calculation part
			payment_no=i;
			interest_paid=Math.round((principal_updated*interest_months)*100.0)/100.0;
			principal_paid=Math.round((payment_months-interest_paid)*100.0)/100.0;
			outstandingBal=Math.round((principal_updated-principal_paid)*100.0)/100.0;
			
			//append to loan bean and list output
			
			Loan l=new Loan();
			
			l.setPaymentno(payment_no);
			
			l.setPaymentamount(payment_months);
			
			l.setInterestAmtPaid(interest_paid);
			
			l.setPrincipalAmtPaid(principal_paid);
			
			l.setOutstandingbal(outstandingBal);
			
			
			outputList.add(l);
			
			principal_updated=l.getOutstandingbal();		
			
			
		}
		
		
		
		return new ModelAndView("redirect:/viewpage");
	}
	
	@RequestMapping("/viewpage")
	public ModelAndView viewoutput(){
		return new ModelAndView("viewpage","outputList",outputList);
	}
	
		
	
	
}
