package Modelo;

import java.util.Random;
import Interfaces.ITriquiBuilder;

public class TriquiBuilder implements ITriquiBuilder {

    private Jugador jugadorX;
    private Jugador jugadorO;
    private char turnoActual;

    public TriquiBuilder() {
        turnoActual = 'X';
    }

    @Override
    public void crearJugadores(String nombreJugador1, String nombreJugador2) {
        // Asigna al azar los símbolos X y O a los jugadores
        Random r = new Random();
        int simbolo = r.nextInt(2);
        if (simbolo == 0) {
            jugadorX = new JugadorX(nombreJugador1);
            jugadorO = new JugadorO(nombreJugador2);
        } else {
            jugadorX = new JugadorX(nombreJugador2);
            jugadorO = new JugadorO(nombreJugador1);
        }
    }

    @Override
    public ReglasTriqui crearReglas(){
        return new ReglasTriqui();
    }
    
    @Override
    public Tablero crearTablero() {
        return new Tablero();
    }   
    
    @Override
    public void cambiaTurno(){
        if(turnoActual == jugadorX.getFicha()){
            turnoActual = jugadorO.getFicha();
        }else{
            turnoActual= jugadorX.getFicha();
        }
    }

    @Override
    public Jugador obtenerJugadorX() {
        return jugadorX;        
    }

    @Override
    public Jugador obtenerJugadorO() {
        return jugadorO;
    }

    @Override
    public char getTurnoActual() {
       return turnoActual;
    }
}