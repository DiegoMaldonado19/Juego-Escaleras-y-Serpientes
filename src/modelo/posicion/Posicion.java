/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.posicion;

/**
 *
 * @author DIEGO MALDONADO
 */
public class Posicion {
    /**
     * Objeto de tipo posicion para almacenar la posicion en X y en Y
     */
    private String posicionX;
    private String posicionY;

    /**
     * Constructor de la clase 
     * @param posicionX Almacena la posicion en X
     * @param posicionY Almacena la posicion en Y
     */
    public Posicion(String posicionX, String posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }

    /**
     * Metodo para obtener la posicion en X
     * @return 
     */
    public String getPosicionX() {
        return posicionX;
    }

    /**
     * Metodo para obtener la posicion en Y
     * @return 
     */
    public String getPosicionY() {
        return posicionY;
    }
}
