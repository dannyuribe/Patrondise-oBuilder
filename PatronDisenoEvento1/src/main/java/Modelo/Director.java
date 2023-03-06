package Modelo;

import Interfaces.ITriquiBuilder;

public class Director {
    private final ITriquiBuilder builder;
    
    public Director(ITriquiBuilder builder) {
    this.builder = builder;
}
    public void crearJugador(String nombreJugador1,String nombreJugador2){
        builder.crearJugadores(nombreJugador1, nombreJugador2);
    }    
    
    public Tablero crearTablero(){
        return builder.crearTablero();
    }
    
    public ReglasTriqui crearReglas(){
        return builder.crearReglas();
    }
}
