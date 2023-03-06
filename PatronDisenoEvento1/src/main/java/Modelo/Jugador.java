package Modelo;

public abstract class Jugador {
    private final String nombre;
    private final char ficha;      

    public Jugador(String nombre, char ficha) {
        this.nombre = nombre;
        this.ficha = ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public char getFicha() {
        return ficha;
    }
    public abstract boolean jugar(Tablero tablero, int fila,int columna);
            
}
