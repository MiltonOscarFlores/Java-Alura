package com.miltonoscarflores.starwars;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        List<Pelicula> peliculas = new ArrayList<>();

        //Menu
        Scanner lectura = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (true) {
            System.out.println("Escribe el número de la película: (o escribe 'salir' para terminar)");

            var busqueda = lectura.nextLine();

            if (busqueda.equalsIgnoreCase("salir")) {
                break;
            }

            String direccion = "https://swapi.dev/api/films/" + busqueda;

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);
                Pelicula pelicula = gson.fromJson(json, Pelicula.class);

                peliculas.add(pelicula); // Agrego la pelicula al array de peliculas


            }catch (Exception e) {
                System.out.println("ALGO FALLO");
            }

        }

        try {
            FileWriter escritura = new FileWriter("Pelis.json");
            escritura.write(gson.toJson(peliculas));
            escritura.close();
            System.out.println("Películas guardadas en Pelis.json");
        }catch (Exception e) {
            System.out.println("ALGO FALLO");
        }

    }
}
