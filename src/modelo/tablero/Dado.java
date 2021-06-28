/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tablero;

/**
 *
 * @author DIEGO MALDONADO
 */
public class Dado {
    /**
     * Clase dado para generar los numeros aleatorios para le movimiento
     */
    
    /**
     * Constructor por defecto
     */
    public Dado(){
    
    }
    
    /**
     * Metodo para lanzar un dado y retornar el valor de ese dado
     * @return 
     */
    public int lanzarDado(){
        int resultadoDado = 0;
        resultadoDado = (int)(Math.random()*6+1);
        return resultadoDado;
    }
}
