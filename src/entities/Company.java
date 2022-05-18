package entities;

public class Company extends TaxPayer{
	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		Double tax = 0.0;
		if (numberOfEmployees > 10) {
			tax = anualIncome * 0.14;
		}else {
			tax = anualIncome * 16;
		}
		return tax;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
}
