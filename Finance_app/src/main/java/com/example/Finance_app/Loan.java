package com.example.Finance_app;

public class Loan {
	public int paymentno;
	public double paymentamount;
	public double principalAmtPaid;
	public double interestAmtPaid;
	public double outstandingbal;
	
	//constructors
	public Loan()  {
		super();
	}

	public Loan(int paymentno, double paymentamount, double principalAmtPaid, double interestAmtPaid,
			double outstandingbal) {
		super();
		this.paymentno = paymentno;
		this.paymentamount = paymentamount;
		this.principalAmtPaid = principalAmtPaid;
		this.interestAmtPaid = interestAmtPaid;
		this.outstandingbal = outstandingbal;
	}
	
	//getters and setters
	public int getPaymentno() {
		return paymentno;
	}
	public void setPaymentno(int paymentno) {
		this.paymentno = paymentno;
	}
	public double getPaymentamount() {
		return paymentamount;
	}
	public void setPaymentamount(double paymentamount) {
		this.paymentamount = paymentamount;
	}
	public double getPrincipalAmtPaid() {
		return principalAmtPaid;
	}
	public void setPrincipalAmtPaid(double principalAmtPaid) {
		this.principalAmtPaid = principalAmtPaid;
	}
	public double getInterestAmtPaid() {
		return interestAmtPaid;
	}
	public void setInterestAmtPaid(double interestAmtPaid) {
		this.interestAmtPaid = interestAmtPaid;
	}
	public double getOutstandingbal() {
		return outstandingbal;
	}
	public void setOutstandingbal(double outstandingbal) {
		this.outstandingbal = outstandingbal;
	}
	
	
	@Override
	public String toString() {
		return "Loan [paymentno=" + paymentno + ", paymentamount=" + paymentamount + ", principalAmtPaid="
				+ principalAmtPaid + ", interestAmtPaid=" + interestAmtPaid + ", outstandingbal=" + outstandingbal
				+ "]";
	}

}
