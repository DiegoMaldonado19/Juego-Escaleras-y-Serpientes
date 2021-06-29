/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controlador.ControladorJuego;
import modelo.posicion.Posicion;
import vista.TableroFrame;

/**
 *
 * @author DIEGO MALDONADO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        ControladorJuego juego = new ControladorJuego();
        Posicion[] posicion = juego.cargaInicial();
        TableroFrame tableroJuego = new TableroFrame(Integer.parseInt(posicion[0].getPosicionX()),Integer.parseInt(posicion[0].getPosicionY()));
    }
}
