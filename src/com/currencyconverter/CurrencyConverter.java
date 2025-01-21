package com.currencyconverter;

import java.util.Scanner;

public class CurrencyConverter {

    private static final String[] SUPPORTED_CURRENCIES = {"USD", "ARS", "BOB", "BRL", "CLP", "COP"};

    public static void displayMenu() {
        System.out.println("Seleccione la moneda de origen:");
        for (int i = 0; i < SUPPORTED_CURRENCIES.length; i++) {
            System.out.printf("%d. %s%n", i + 1, SUPPORTED_CURRENCIES[i]);
        }
    }

    public static String getCurrencyChoice(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            displayMenu();
            int choice = scanner.nextInt();
            if (choice >= 1 && choice <= SUPPORTED_CURRENCIES.length) {
                return SUPPORTED_CURRENCIES[choice - 1];
            }
            System.out.println("Selección no válida. Intente de nuevo.");
        }
    }

    public static void startConversion(CurrencyResponse currencyResponse) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nConversor de Monedas");
            System.out.println("1. Realizar una conversión");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();

            if (option == 2) {
                System.out.println("Saliendo...");
                break;
            } else if (option == 1) {
                String fromCurrency = getCurrencyChoice(scanner, "Seleccione la moneda de origen:");
                String toCurrency = getCurrencyChoice(scanner, "Seleccione la moneda de destino:");

                System.out.print("Ingrese la cantidad en " + fromCurrency + ": ");
                double amount = scanner.nextDouble();

                double fromRate = currencyResponse.getRate(fromCurrency);
                double toRate = currencyResponse.getRate(toCurrency);

                double result = convert(amount, fromRate, toRate);
                System.out.printf("El valor convertido de %s a %s es: %.2f%n", fromCurrency, toCurrency, result);
            } else {
                System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }

    public static double convert(double amount, double fromRate, double toRate) {
        return amount / fromRate * toRate;
    }
}
