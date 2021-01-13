package entities;

public class CurrencyConverter {
	
	public double dollar;
	public double iof;
	public double real;
	
	public double valorEmReal() {
		double totalEmReal = dollar * real;
		return totalEmReal += totalEmReal * 6 / 100;
	}
	
	
}
