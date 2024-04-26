package HackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		
		
		NumberFormat numfUs = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
		NumberFormat numfIndia = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		NumberFormat numfChina = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
		NumberFormat numfFrance = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));

		String us = numfUs.format(payment);
		String india = numfIndia.format(payment);
		String china = numfChina.format(payment);
		String france = numfFrance.format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
