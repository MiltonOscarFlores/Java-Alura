package com.miltonoscarflores.screenmatch.principal;

import com.miltonoscarflores.screenmatch.calculos.CalculadoraDeTiempo;
import com.miltonoscarflores.screenmatch.calculos.Recomendacion;
import com.miltonoscarflores.screenmatch.modelos.Episodio;
import com.miltonoscarflores.screenmatch.modelos.Pelicula;
import com.miltonoscarflores.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Matrix", 1999);
        miPelicula.setDuracionEnMinutos(136);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.fichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("House of the dragon", 2022);
        casaDragon.setTemporadas(2);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporadas(10);
        casaDragon.fichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Terminator 2", 1991);
        otraPelicula.setDuracionEnMinutos(137);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println("Tiempo necesario para ver todos tus titulos: " + calculadora.getTiempoTotal() + " minutos");

        Recomendacion recomendacion = new Recomendacion();
        recomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Rahenyra Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        recomendacion.filtra(episodio);

        var peliculaDeMilton = new Pelicula("El señor de los anillos", 2001);
        peliculaDeMilton.setDuracionEnMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeMilton);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula de la lista es: " + listaDePeliculas.get(0).getNombre());

        System.out.println("averrr" + listaDePeliculas);
        System.out.println(listaDePeliculas.toString());






    }
}
