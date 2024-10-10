package com.miltonoscarflores.screenmatch.excepciones;

public class ErrorDuracionDePeliculaException extends RuntimeException {

    private String mensaje;

    public ErrorDuracionDePeliculaException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
