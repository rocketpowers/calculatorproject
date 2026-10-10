package calculatorPackages.controller;

public class CalcullatorController {
	
	public static void main(String[] args) {
		
	}

	public double suma(double a, double b) {
		return a + b;
	}

	public double multiplication(double a, double b) {
		
		
		
		return a * b;
	}

	public double sustraccion(double a, double b) {
		return a - b;

	}

	public double division(double a, double b) {
		if (b == 0) {

			throw new IllegalArgumentException("no es posible dividir por cero");

		}

		return a / b;

	}

}