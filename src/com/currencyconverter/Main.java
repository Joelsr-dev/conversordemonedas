package com.currencyconverter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtiene la respuesta del API
            String jsonResponse = CurrencyClient.sendRequest().body();
            CurrencyResponse currencyResponse = new CurrencyResponse(jsonResponse);

            // Comienza la conversión
            CurrencyConverter.startConversion(currencyResponse);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
