/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tablero;

import enums.TipoDeCasilla;

/**
 *
 * @author DIEGO MALDONADO
 */
public class Casilla {
    /**
     * Clase Casilla 
     */
    
    /**
     * Atributos de la clase Casilla
     */
    private TipoDeCasilla tipoDeCasilla;
    private SuperficieJLabel superficieJLabel;
    private boolean vacia;

    /**
     * Constructor de la clase casilla
     * @param tipoDeCasilla Almacena el tipo de casilla
     * @param superficieJLabel Almacena la superficieJLabel
     * @param vacia Almacena un valor booleano para saber si es vacia
     */
    public Casilla(TipoDeCasilla tipoDeCasilla, SuperficieJLabel superficieJLabel, boolean vacia) {
        this.tipoDeCasilla = tipoDeCasilla;
        this.superficieJLabel = superficieJLabel;
        this.vacia = vacia;
    }

    /**
     * Metodo para obtener el tipo de casilla
     * @return 
     */
    public TipoDeCasilla getTipoDeCasilla() {
        return tipoDeCasilla;
    }

    /**
     * Metodo para settear el tipo de casilla
     * @param tipoDeCasilla 
     */
    public void setTipoDeCasilla(TipoDeCasilla tipoDeCasilla) {
        this.tipoDeCasilla = tipoDeCasilla;
    }

    /**
     * Metodo para obtener la superficie de la casilla
     * @return 
     */
    public SuperficieJLabel getSuperficieJLabel() {
        return superficieJLabel;
    }

    /**
     * Metodo para settear la superficie de la casilla
     * @param superficieJLabel 
     */
    public void setSuperficieJLabel(SuperficieJLabel superficieJLabel) {
        this.superficieJLabel = superficieJLabel;
    }

    /**
     * Metodo para saber si está vacia
     * @return 
     */
    public boolean isVacia() {
        return vacia;
    }

    /**
     * Metodo para settear si está vacia
     * @param vacia 
     */
    public void setVacia(boolean vacia) {
        this.vacia = vacia;
    }
    
    
}
