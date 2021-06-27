/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

/**
 *
 * @author DIEGO MALDONADO
 */
public class Dado {
    /**
     * Constructor por defecto para la clase dado
     */
    public Dado(){
        
    }
    
    /**
     * Metodo para lanzar un dado, el cual retorna el valor entero del dado,
     * entre 1 y 6
     * @return 
     */
    public int lanzarDado(){
        int resultadoDado = 0;
        resultadoDado = (int)(Math.random()*6+1);
        return resultadoDado;
    }
}
