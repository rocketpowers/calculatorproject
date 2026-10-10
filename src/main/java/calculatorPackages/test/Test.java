package calculatorPackages.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double result;
        double numero;
        char operation;

        result = response(scanner," insert first value ");

        while (true) {

            System.out.print("choose operation (+, -, *, / ou =): ");
            operation = scanner.next().charAt(0);

            if (operation == '=') {
                break;
            }

            if (operation != '+' && operation != '-'
                    && operation != '*' && operation != '/') {

                System.out.println("invalid operation!");
                continue;
            }

            numero = response(scanner, "insert next value ");

            if (operation == '+') {
                result += numero;

            } else if (operation == '-') {
                result -= numero;

            } else if (operation == '*') {
                result *= numero;

            } else if (operation == '/') {

                if (numero != 0) {
                    result /= numero;
                } else {
                    System.out.println("Error: division by zero");
                    continue;
                }
            }

            System.out.println("Parcial: " + result);
        }

        System.out.println("result final: " + result);

        scanner.close();
    }

    public static double response(Scanner scanner, String mensagem) {

        while (true) {

            System.out.print(mensagem);

            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();

            } else {
                System.out.println("invalid entry, number only");
                scanner.next();
            }
        }
    }
}