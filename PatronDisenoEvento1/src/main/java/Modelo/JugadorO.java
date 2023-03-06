package Modelo;

public class JugadorO extends Jugador{

    public JugadorO(String nombre) {
        super(nombre, 'O');
    }

    @Override
    public boolean jugar(Tablero tablero, int fila, int columna) {
        return tablero.marcarJugada(fila, columna, getFicha());
    }
    
}
/*private final char[][] celdas;
    private final Jugador jugador1;
    private final Jugador jugador2;
    

    public Tablero(char[][] celdas, Jugador jugador1, Jugador jugador2) {
        this.celdas = celdas;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.turnoActual = jugador1.getFicha();
    }

    public char[][] getCeldas() {
        return celdas;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public char getTurnoActual() {
        return turnoActual;
    }
    
        
    
    */