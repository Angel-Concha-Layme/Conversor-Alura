package com.alura.conversor.modelo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class CurrencyConverter {

    private static final String API_KEY = "c1daa6de8fa45ebc8e0fa98f831b85c0";
    private static final String API_URL = "http://apilayer.net/api/live";

    public Map<String, Double> convert(int value, String[] monedas) throws Exception {
        // Construir la URL de la API
        String ListaMonedas = "";
        for (String moneda : monedas) {
            ListaMonedas += moneda + ",";
        }
        String apiURL = API_URL + "?access_key=" + API_KEY + "&currencies=" + ListaMonedas + "&source=USD"
                + "&format=1";

        // Realizar la solicitud de la API
        String apiResponse = getAPIResponse(apiURL);

        // Devolver las conversiones
        return parseConversions(apiResponse, value);
    }

    private String getAPIResponse(String apiURL) throws Exception {
        URI uri = new URI(apiURL);
        URL url = uri.toURL();

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        while ((line = in.readLine()) != null) {
            response.append(line);
        }
        in.close();
        return response.toString();
    }

    private Map<String, Double> parseConversions(String apiResponse, int value) {
        Map<String, Double> conversions = new HashMap<>();
        JSONObject response = new JSONObject(apiResponse);
        if (response.getBoolean("success")) {
            JSONObject quotes = response.getJSONObject("quotes");
            for (String key : quotes.keySet()) {
                conversions.put(key, quotes.getDouble(key) * value);
            }
        }
        return conversions;
    }
}
