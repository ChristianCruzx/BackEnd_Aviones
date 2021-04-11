/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Chris
 */
public class Matriz_Asientos {
    
    private int fila;
    private int columna;
    private Asiento matriz[][];
    
    public Matriz_Asientos( int fila, int columna){
    this.matriz= new Asiento[fila][columna];
    }
    
    public Asiento[][]getMatriz(){
    return this.matriz;
    }
    
    public void reservaAsiento(Asiento asiento){
        matriz[asiento.getFila()][asiento.getNumero_col()].setOcupado(true);
    
    }
     public void reservaAsiento(int fila, int columna){
        matriz[fila][columna].setOcupado(true);
    
    }
    
    
}
