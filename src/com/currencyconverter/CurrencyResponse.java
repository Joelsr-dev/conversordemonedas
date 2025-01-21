package com.currencyconverter;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class CurrencyResponse {
    private JsonObject rates;

    public CurrencyResponse(String jsonResponse) {
        JsonObject jsonObject = JsonParser.parseString(jsonResponse).getAsJsonObject();
        this.rates = jsonObject.getAsJsonObject("conversion_rates");
    }

    public double getRate(String currencyCode) {
        return rates.get(currencyCode).getAsDouble();
    }
}
