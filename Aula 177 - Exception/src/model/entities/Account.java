package model.entities;
import model.exceptions.DomainException;

public class Account {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number= number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double amount) throws DomainException {
		if (amount <= 0.0) {
			throw new DomainException("Deposit error: You can only deposit positive amount different of zero.");
		}
		balance += amount;
	}
	
	public void withdraw(double amount) throws DomainException {
		if (amount <= 0.0) {
			throw new DomainException("Withdraw error: You can only withdraw positive amount different of zero.");
		}
		
		if (amount > getBalance()) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		
		if (amount > getWithdrawLimit()) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit.");
		}
		
		
		balance -= amount;
	}
	
}
