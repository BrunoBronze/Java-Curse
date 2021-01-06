 package principal;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price?");
		double p = sc.nextDouble();

		System.out.println("How many dollars will be bought?");
		double qtd = sc.nextDouble();

		System.out.printf("Amount to be paid = R$ %.2f", CurrencyConverter.converter(p, qtd));

		sc.close();
	}

}
