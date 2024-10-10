package com.miltonoscarflores.screenmatch.calculos;
import com.miltonoscarflores.screenmatch.modelos.Pelicula;
import com.miltonoscarflores.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal = tiempoTotal + titulo.getDuracionEnMinutos();
    }
}
