
package Interfaces;

import Modelo.Jugador;
import Modelo.ReglasTriqui;
import Modelo.Tablero;

public interface ITriquiBuilder {

    void crearJugadores(String nombreJudaor1,String nombreJudaor2);
    
    Jugador obtenerJugadorX();
    Jugador obtenerJugadorO();
    ReglasTriqui crearReglas();
    char getTurnoActual();
    Tablero crearTablero();    
    void cambiaTurno();
}