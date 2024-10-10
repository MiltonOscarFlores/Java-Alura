package com.miltonoscarflores.screenmatch.principal;

import com.miltonoscarflores.screenmatch.modelos.Pelicula;
import com.miltonoscarflores.screenmatch.modelos.Serie;
import com.miltonoscarflores.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Matrix", 1999);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Terminator 2", 1991);
        otraPelicula.evalua(10);
        var peliculaDeMilton = new Pelicula("El señor de los anillos", 2001);
        peliculaDeMilton.evalua(8);
        Serie casaDragon = new Serie("House of the dragon", 2022);

        List<Titulo> lista = new LinkedList<>();
        lista.add(peliculaDeMilton);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() < 2){
            System.out.println(pelicula.getClasificacion());
            }
        }

        System.out.println("lista NO ordenada: " + lista);
        Collections.sort(lista);
        System.out.println("lista ordenada por Nombre: " + lista);

        //Ordenando por fecha
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por Fecha: " + lista);
    }
}
