package Modelo;
import Interfaces.IReglasTriqui;

public class ReglasTriqui implements IReglasTriqui{
    
    @Override
    public boolean ganador(char[][] tablero) {
        char marca;
        // Horizontal
        for (int i = 0; i < 3 ; i++){
            marca= tablero[i][0];
            if(marca != ' ' && marca == tablero[i][1] && marca == tablero [i][2]){
                return true;
            }
        }
        // Vertical
        for (int j = 0; j < 3 ; j++){
            marca= tablero[0][j];
            if(marca != ' ' && marca == tablero[1][j] && marca == tablero [2][j]){
                return true;
            }
        }
        // diagonal
            marca = tablero[0][0];
        if (marca != ' ' && marca == tablero[1][1] && marca == tablero[2][2]) {
            return true;
        } else if (marca != ' ' && marca == tablero[1][1] && marca == tablero[2][0]) {
            return true;
        }        
        return false;
    }

    @Override
    public boolean empate(char[][] tablero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}