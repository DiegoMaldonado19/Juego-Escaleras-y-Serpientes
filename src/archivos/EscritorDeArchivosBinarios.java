/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import modelo.jugador.Jugador;

/**
 *
 * @author DIEGO MALDONADO
 */
public class EscritorDeArchivosBinarios {
    /**
     * Clase que se encarga de escribir archivos binarios
     */
    
    /**
     * Constante donde defino la ruta donde se guardaran los objetos binarios
     */
    public static final File  FILE_JUGADORES = new File("C:/Users/acer/Desktop/IPC I - JUNIO 2021/EscalerasYSerpientes/files/archivosBinarios/Objetos");
    
    /**
     * Metodo para escribir el archivo binario
     * @param jugadores Almacena un arraylist de los jugadores en el juego
     * @throws IOException
     * @throws FileNotFoundException 
     */
    public void guardarJugadores (ArrayList<Jugador> jugadores) throws IOException,FileNotFoundException{
        
        FileOutputStream fileOutput; 
        ObjectOutputStream salida;
        for (Jugador jugador : jugadores) {
            fileOutput = new FileOutputStream(FILE_JUGADORES+"/"+jugador.getNombre());
            salida = new ObjectOutputStream(fileOutput);
            salida.writeObject(jugador);
            salida.close();
        }
    }
}
