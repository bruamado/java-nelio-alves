package entities;

public class LegalPerson extends Taxpayer {
	
	private Integer employees;
	
	public LegalPerson() {
		super();
	}
	
	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	public LegalPerson(String name, double annualIncome, int employees) {
		super(name, annualIncome);
		this.employees = employees;
	}
	
	@Override
	public double paidTaxes() {
		double tax;
		if (getEmployees() > 10 ) { // Empresa possui mais de 10 funcionários
			tax = 0.14;
		}else {
			tax = 0.16;
		}
		return getAnnualIncome()*tax;
	}
}
