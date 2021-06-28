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
    public Posicion[] posicion (File archivo) throws FileNotFoundException, IOException{
        Posicion[] arregloPosiciones = new Posicion[100];
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
    
    private String[] separarCampos(String linea) {
        String inicioVehiculo = "tablero(";
        String lineaDeCampos = linea.substring(inicioVehiculo.length(), linea.length() - 2);
        System.out.println(lineaDeCampos);
        String[] campos = lineaDeCampos.split(",");
        return campos;
    }
}
