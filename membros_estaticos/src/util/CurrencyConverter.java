package util;

public class CurrencyConverter {

	public static final double IOF = 0.06;
	
	public static double converter(double dolar, double qtd) {
		return (dolar * qtd) + (dolar*IOF*qtd);
	}
}
