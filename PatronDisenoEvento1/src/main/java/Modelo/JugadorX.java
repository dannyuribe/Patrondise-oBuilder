
package Modelo;

/**
 *
 * @author Atkasky
 */
public class JugadorX extends Jugador{
    
    public JugadorX(String nombre) {
        super(nombre, 'X');
    }
    @Override
    public boolean jugar(Tablero tablero,int fila,int columna){
      return tablero.marcarJugada(fila, columna, getFicha());  
    }
}
