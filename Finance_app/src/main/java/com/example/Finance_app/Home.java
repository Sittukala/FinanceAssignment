package com.example.Finance_app;

public class Home {
	public double amount;
	public int period;
	public double rate;
	
	public Home() {
		super();
	}
	public Home(double amount, int period, double rate) {
		super();
		this.amount = amount;
		this.period = period;
		this.rate = rate;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
}
