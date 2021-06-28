/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tablero;

import enums.TipoDeCasilla;
import java.awt.Image;
import javax.swing.ImageIcon;
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
                int random = (int)(Math.random()*100);
                
                if(random>=50 && random<=60){
                    SuperficieJLabel jlabel = new SuperficieJLabel(i+1, j+1,String.valueOf(TipoDeCasilla.RETROCESO));
                    Image img= new ImageIcon("imagenes/cuadrado.png").getImage();
                    ImageIcon img2=new ImageIcon(img.getScaledInstance(20, 40, Image.SCALE_SMOOTH));
                    jlabel.setIcon(img2);

                    tableroAux = new Casilla(TipoDeCasilla.VACIA, jlabel,false);
                    tablero[i][j] = tableroAux;
                    
                }
                else if(random>60 && random<=70){
                    SuperficieJLabel jlabel = new SuperficieJLabel(i+1, j+1,String.valueOf(TipoDeCasilla.ADELANTO));
                    Image img= new ImageIcon("imagenes/cuadrado.png").getImage();
                    ImageIcon img2=new ImageIcon(img.getScaledInstance(20, 40, Image.SCALE_SMOOTH));
                    jlabel.setIcon(img2);
                    tableroAux = new Casilla(TipoDeCasilla.VACIA, jlabel,false);
                    tablero[i][j] = tableroAux;
                     
                }
                else if(random>70 && random<=80){
                    SuperficieJLabel jlabel = new SuperficieJLabel(i+1, j+1,String.valueOf(TipoDeCasilla.ESCALERA));
                    Image img= new ImageIcon("imagenes/cuadrado.png").getImage();
                    ImageIcon img2=new ImageIcon(img.getScaledInstance(20, 40, Image.SCALE_SMOOTH));
                    jlabel.setIcon(img2);
                    tableroAux = new Casilla(TipoDeCasilla.VACIA, jlabel,false);
                    tablero[i][j] = tableroAux;
                }
                else if(random>80 && random<=90){
                    SuperficieJLabel jlabel = new SuperficieJLabel(i+1, j+1,String.valueOf(TipoDeCasilla.SERPIENTE));
                    Image img= new ImageIcon("imagenes/cuadrado.png").getImage();
                    ImageIcon img2=new ImageIcon(img.getScaledInstance(20, 40, Image.SCALE_SMOOTH));
                    jlabel.setIcon(img2);
                    tableroAux = new Casilla(TipoDeCasilla.VACIA, jlabel,false);
                     tablero[i][j] = tableroAux;
                }
                else if(random>=0 && random<50){
                    SuperficieJLabel jlabel = new SuperficieJLabel(i+1, j+1,String.valueOf(TipoDeCasilla.VACIA));
                    Image img= new ImageIcon("imagenes/cuadrado.png").getImage();
                    ImageIcon img2=new ImageIcon(img.getScaledInstance(20, 40, Image.SCALE_SMOOTH));
                    jlabel.setIcon(img2);
                    tableroAux = new Casilla(TipoDeCasilla.VACIA, jlabel,false);
                    tablero[i][j] = tableroAux;
                }
                else if(random>90 && random<=100){
                    SuperficieJLabel jlabel = new SuperficieJLabel(i+1, j+1,String.valueOf(TipoDeCasilla.PIERDE_TURNO)+" ");
                    Image img= new ImageIcon("imagenes/cuadrado.png").getImage();
                    ImageIcon img2=new ImageIcon(img.getScaledInstance(20, 40, Image.SCALE_SMOOTH));
                    jlabel.setIcon(img2);
                    tableroAux = new Casilla(TipoDeCasilla.VACIA, jlabel,false);
                    tablero[i][j] = tableroAux;
                }
               
            }
            
        }
        return tablero;
   }
}
