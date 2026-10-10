package calculatorPackages.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("insert first value");

		double a = scan.nextDouble();

		System.out.println("insert operation");

		char operation = scan.next().charAt(0);

		System.out.println("insert second value");

		double b = scan.nextDouble();

		if (operation == '+') {
			System.out.println("Resultado: " + (a + b));

		} else if (operation == '-') {
			System.out.println("Resultado: " + (a - b));

		} else if (operation == '*') {
			System.out.println("Resultado: " + (a * b));

		} else if (operation == '/') {
			if (b != 0) {
				System.out.println("Resultado: " + (a / b));
			} else {
				System.out.println("Erro: divisao por zero!");
			}

		} else {
			System.out.println("operation invalida!");
		}

		scan.close();
	}

}
