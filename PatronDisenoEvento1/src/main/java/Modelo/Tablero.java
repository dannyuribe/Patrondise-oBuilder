package Modelo;

public final class Tablero {

    private final char[][] celdas;

    public Tablero() {
        this.celdas = new char[3][3];
        reiniciar();
    }

    public char[][] getCeldas() {
        return celdas;
    }
    
    public void reiniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                celdas[i][j] = ' ';
            }
        }
    }

    public boolean marcarJugada(int fila, int columna, char ficha) {
        if (celdas[fila][columna] == ' ') {
            celdas[fila][columna] = ficha;
            return true;
        }
        return false;
    }

}
