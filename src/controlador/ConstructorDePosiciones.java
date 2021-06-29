/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.posicion.Posicion;

/**
 *
 * @author DIEGO MALDONADO
 */
public class ConstructorDePosiciones {
    /**
     * Clase que sirve como un controlador para crear las posiciones
     * @param campos Recive un parametro que son los campos obtenidos del archivo de texto
     * @return 
     */
    public static Posicion construirPosicion(String[] campos) {
        Posicion posicion = null;
        int contador=0;
        while(contador<campos.length-1){
            posicion = new Posicion(campos[contador], campos[contador+1]);
            contador++;
        }
        
        return posicion;
    }
}
