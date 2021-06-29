/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import controlador.ConstructorDePosiciones;
import java.io.*;
import modelo.posicion.Posicion;

/**
 *
 * @author DIEGO MALDONADO
 */
public class LectorDeArchivosEnTexto {
    /**
     * Constructor de la clase 
     * @param archivo Pide como parametro un archivo de texto
     * @return retorna un arreglo de posiciones
     * @throws FileNotFoundException 
     * @throws IOException 
     */
    public Posicion[] leerArchivo (File archivo) throws FileNotFoundException, IOException{
        Posicion[] arregloPosiciones = new Posicion[10];
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);
        int contador=0;
        String linea;
        while ((linea = br.readLine()) != null) {
            //con la linea leida, separamos los campos
            String[] campos=separarCampos(linea);
            //pasamos el texto a objeto
            Posicion posicion = ConstructorDePosiciones.construirPosicion(campos);
            if(posicion!=null){
                arregloPosiciones[contador] = posicion;
                contador++;
            }
        }
        fr.close(); 
        return arregloPosiciones;
    }
    
    /**
     * Metodo para separar los campos de las lineas en el archivo de texto
     * @param linea pide una linea de texto de tipo String
     * @return 
     */
    private String[] separarCampos(String linea) {
        String inicioTablero = "tablero(";
        String lineaDeCampos = linea.substring(inicioTablero.length(), linea.length() - 2);
        System.out.println(lineaDeCampos);
        String[] campos = lineaDeCampos.split(",");
        return campos;
    }
}
