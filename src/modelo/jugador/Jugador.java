/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.jugador;

import java.io.Serializable;

/**
 *
 * @author DIEGO MALDONADO
 */
public class Jugador implements Serializable{
    /**
     * Atributos de la clase jugador
     */
    private int id; 
    private String nombre;
    private String apellido;
    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasPerdidas;
    
    /**
     * Constructor de la clase jugador
     * @param id Almacena el id del jugador
     * @param nombre Almacena el nombre del jugador
     * @param apellido Almacena el apellido del jugador
     */
    public Jugador(int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.partidasGanadas = 0;
        this.partidasJugadas = 0;
        this.partidasPerdidas = 0;
    }

    /**
     * Metodo para obtener el id del jugador
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para obtener el nombre del jugador
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener el apellido del jugador
     * @return 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Metodo para obtener las partidas jugadas por el jugador
     * @return 
     */
    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    /**
     * Metodo settear las partidas jugadas por el jugador
     * @param partidasJugadas 
     */
    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    /**
     * Metodo para obtener las partidas ganads por el jugador
     * @return 
     */
    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    /**
     * Metodo para setear las partidas ganadas por el jugador
     * @param partidasGanadas 
     */
    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    /**
     * Metodo para obtener las partidas perdidas por el jugador
     * @return 
     */
    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    /**
     * Metodo para obtener las partidas perdidas del jugador
     * @param partidasPerdidas 
     */
    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    /**
     * Metodo to string
     * @return 
     */
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
    
}
