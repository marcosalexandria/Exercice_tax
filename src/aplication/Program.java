package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int numFor = sc.nextInt();
		
		List<TaxPayer> tax = new ArrayList<>();
		for (int i = 1; i<=numFor; i++) {
			System.out.printf("Tax payer %d data:",i);
			System.out.print("\nIndividual or company (i/c)? ");
			char type = sc.next().charAt(0);
			
			if (type == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				
				TaxPayer individual = new Individual(name, anualIncome, healthExpenditures);
				tax.add(individual);
			}else if (type == 'c') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Number of Empçoyees: ");
				Integer numberOfEmployees = sc.nextInt();
				
				TaxPayer company = new Company(name, anualIncome, numberOfEmployees);
				tax.add(company);
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer taxs: tax) {
			System.out.printf(taxs.getName() + " $ %.2f", taxs.tax());
			System.out.println();
		}
		sc.close();
	}

}
