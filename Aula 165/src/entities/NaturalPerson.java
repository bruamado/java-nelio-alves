package entities;

public class NaturalPerson extends Taxpayer {
	
	private Double healthExpenditures = 0.0;
	
	public NaturalPerson() {
		super();
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	public NaturalPerson(String name, double annualIncome, double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double paidTaxes() {
		double tax;
		if (getAnnualIncome() < 20000.0) { // Renda abaixo de 20 mil
			tax = 0.15;
		}else {
			tax = 0.25;
		}
		double paidTaxes = (getAnnualIncome()*tax) - (getHealthExpenditures()*0.5);
		return paidTaxes;
	}
}
