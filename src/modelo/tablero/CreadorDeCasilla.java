/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tablero;

import enums.TipoDeCasilla;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DIEGO MALDONADO
 */
public class CreadorDeCasilla {
   /**
    * Metodo de tipo matriz de casilla que retorna una matriz de casillas
    * @param cantidadCasillasX Almacena la cantidad de casillas en x
    * @param cantidadCasillasY Almacena la cantidad de casillas en y
    * @return
    */
   public static Casilla[][] crearCasillaInicial(int cantidadCasillasX, int cantidadCasillasY){
        Casilla tableroAux;
        Casilla[][] tablero = new Casilla[cantidadCasillasX][cantidadCasillasY];
        for (int i = 0; i < cantidadCasillasX; i++) {
            for (int j = 0; j < cantidadCasillasY; j++) {
                SuperficieJLabel jlabel = new SuperficieJLabel(i+1, j+1,"Casilla ("+(i+1)+","+(j+1)+")");
              
                tableroAux = new Casilla(TipoDeCasilla.VACIA, jlabel,false);
                tablero[i][j] = tableroAux;
            }
            
        }
        return tablero;
   }
}
