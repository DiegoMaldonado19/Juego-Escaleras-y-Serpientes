/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import archivos.LectorDeArchivosEnTexto;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.posicion.Posicion;

/**
 *
 * @author DIEGO MALDONADO
 */
public class ControladorJuego {
    /**
     * Clase que sirve para controlar toda la logica del juego en general
     */
    
    /**
     * Objeto del lector de archivos de texto
     */
    private LectorDeArchivosEnTexto lectorArchivo;
    
    /**
     * Constructor de la clase donde instanciamos un nuevo objeto
     */
    public ControladorJuego(){
        this.lectorArchivo = new LectorDeArchivosEnTexto();
    }
    
    /**
     * Metodo que sirve para la carga inicial de los archivos del tablero, 
     * por medio de la clase posicion que almacena las coordenadas que 
     * contiene el archivo de texto
     * @return 
     */
    public Posicion[] cargaInicial(){
        Posicion[] posiciones;
        Posicion[] arregloAux = new Posicion[1];
        File fichero = new File("C:/Users/acer/Desktop/IPC I - JUNIO 2021/EscalerasYSerpientes/files/cargaTablero.txt");
        try {
            posiciones = this.lectorArchivo.leerArchivo(fichero);
            return posiciones;
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return arregloAux;
    }
}
