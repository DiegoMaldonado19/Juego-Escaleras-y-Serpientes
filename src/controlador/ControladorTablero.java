/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JPanel;
import modelo.tablero.Casilla;

/**
 *
 * @author DIEGO MALDONADO
 */
public class ControladorTablero {
    /**
     * Clase que sirve como controlador del tablero
     */
    
    /**
     * Atributos de la clase
     */
    private JPanel tableroPanel;
    private Casilla[][] distribucionDeCasillas;
    private int cantidadCasillasX;
    private int cantidadCasillasY;

    /**
     * Constructor de la clase
     * @param tableroPanel Almacena un panel que contiene los labels
     * @param distribucionDeCasillas Almacena un arreglo de casillas
     * @param cantidadCasillasX Almacena la cantidad de casillas en x
     * @param cantidadCasillasY Almacena la cantidad de casillas en Y
     */
    public ControladorTablero(JPanel tableroPanel, Casilla[][] distribucionDeCasillas, int cantidadCasillasX, int cantidadCasillasY){
        this.tableroPanel = tableroPanel;
        this.distribucionDeCasillas = distribucionDeCasillas;
        this.cantidadCasillasX = cantidadCasillasX;
        this.cantidadCasillasY = cantidadCasillasY;
        dibujarTablero();
    }
    
    /**
     * Metodo para dibujar el tablero en la GUI
     */
    public void dibujarTablero(){
        for (int i = 0; i < cantidadCasillasX; i++) {
            for (int j = 0; j < cantidadCasillasY; j++) {
                Casilla casilla = this.distribucionDeCasillas[i][j];
                this.tableroPanel.add(casilla.getSuperficieJLabel());
            }
            
        }
    }
}
