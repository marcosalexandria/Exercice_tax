package entities;

public class Individual extends TaxPayer{
	private Double healthSpending;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthSpending) {
		super(name, anualIncome);
		this.healthSpending = healthSpending;
	}

	@Override
	public Double tax() {
		Double tax = 0.0;
		if (anualIncome < 20000 && healthSpending != 0.0) {
			tax = (anualIncome * 0.15) - (healthSpending - 0.5);
		}else if (anualIncome < 20000) {
			tax = (anualIncome * 0.15);
		}else if (anualIncome >= 20000 && healthSpending != 0.0) {
			tax = (anualIncome * 0.25) - (healthSpending - 0.5);
		}else if (anualIncome >= 20000) {
			tax = (anualIncome * 0.25);
		}
		return tax;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
}
