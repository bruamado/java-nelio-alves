package util;

public class CurrencyConverter {
		public static double IOF = 0.06;
		
		public static double convert(double value, double amount) {
			double reais = (value*amount);
			return reais + (reais*IOF);
		}
}
