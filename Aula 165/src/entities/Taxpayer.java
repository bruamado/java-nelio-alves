package entities;

public abstract class Taxpayer {
	
	protected String name;
	protected Double annualIncome;
	
	public Taxpayer() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public Taxpayer(String name, double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	public abstract double paidTaxes();
	
	@Override
	public String toString() {
		return 	name +
				": $ " +
				String.format("%.2f", paidTaxes());
	}
}
