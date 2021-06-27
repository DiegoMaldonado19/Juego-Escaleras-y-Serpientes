/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaArchivos;

import java.io.*;

/**
 *
 * @author DIEGO MALDONADO
 */
public class LecturaArchivo {
    public String lecturaArchivoTexto(String pathArchivo){
        String respuesta = "";
        File archivo = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        
        try{
            archivo = new File(pathArchivo);
            if(archivo.exists()){
                fileReader = new FileReader(archivo);
                bufferedReader = new BufferedReader(fileReader);
                
                String linea;
                
                linea = bufferedReader.readLine();
                
                while(linea!=null){
                    respuesta += "\n" + linea;
                    linea = bufferedReader.readLine();
                }
                
            }else{
                System.out.println("El archivo no existe");
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        
        return respuesta;
    }
    
    public static void escrituraArchivoTexto(String texto, String pathArchivo) {
        FileWriter fichero = null;
        PrintWriter printWriter = null;
        try {
            fichero = new FileWriter(pathArchivo);
            printWriter = new PrintWriter(fichero);

            printWriter.println(texto);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
