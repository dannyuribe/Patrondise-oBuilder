package Ejecutable;

import Modelo.Director;
import Modelo.ReglasTriqui;
import Modelo.Tablero;
import Modelo.TriquiBuilder;

public class PatronDisenoEvento1 {
    
    public static void main(String[] args){
        System.out.println("*******************************************");
        TriquiBuilder builder = new TriquiBuilder();     
        Director director = new Director(builder);
        System.out.println("Iniciando el Juego Triqui...");
         //INICIALIZAMOS LAS REGLAS DEL JUEGO.
        ReglasTriqui reglasTriqui = director.crearReglas();
        //iNICIALIZAMOS LOS JUGADORES
        director.crearJugador("danny", "oponente"); 
        //INICIALIZAMOS EL TABLERO
        Tablero tablero=director.crearTablero(); 
        
        System.out.println("*******************************************");
        System.out.println("        Turno de Jugadores");
        System.out.println("Jugador 1: \n   "+builder.obtenerJugadorX().getNombre());
        System.out.println("Ficha :  "+builder.obtenerJugadorX().getFicha());
        System.out.println("Jugador 2: \n   "+builder.obtenerJugadorO().getNombre());
        System.out.println("Ficha :  "+ builder.obtenerJugadorO().getFicha());
        
    }
}
