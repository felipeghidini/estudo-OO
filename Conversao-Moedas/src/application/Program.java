package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter converter = new CurrencyConverter();
		
		System.out.print("What is the dollar price ?  ");
		converter.real = sc.nextDouble();
		
		System.out.println("How many dollars will be bought ?  ");
		converter.dollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n " , converter.valorEmReal());
		
		
		
		
		sc.close();
	}

}
