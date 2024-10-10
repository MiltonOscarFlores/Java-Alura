package com.miltonoscarflores.screenmatch.calculos;

public class Recomendacion {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() == 4){
            System.out.println("A mucha gente les gusta");
        } else if (clasificacion.getClasificacion() == 2) {
            System.out.println("A algunos les gusta");
        } else{
            System.out.println("Colocalo en tu lista para ver mas tarde");
        }
    }
}
