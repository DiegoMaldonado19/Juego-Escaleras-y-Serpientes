/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tablero;

import controlador.CreadorDeCasilla;

/**
 *
 * @author DIEGO MALDONADO
 */
public class Tablero {
    /**
     * Clase tablero que tiene como unico atributo una matriz de casillas
     */
    private Casilla[][] casilla;
    
    /**
     * Constructor de la clase
     * @param cantidadCasillasX Almacena la cantidad de casillas en X
     * @param cantidadCasillasY Almacena la cantidad de casillas en Y
     */
    public Tablero(int cantidadCasillasX, int cantidadCasillasY) {
        this.casilla = CreadorDeCasilla.crearCasillaInicial(cantidadCasillasX, cantidadCasillasY);
    }

    /**
     * Metodo para obtener el arreglo de casillas
     * @return 
     */
    public Casilla[][] getCasilla() {
        return casilla;
    }

    /**
     * Metodo para settear el arreglo de casillas
     * @param casilla 
     */
    public void setCasilla(Casilla[][] casilla) {
        this.casilla = casilla;
    }
}
