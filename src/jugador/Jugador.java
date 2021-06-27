/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

/**
 *
 * @author DIEGO MALDONADO
 */
public class Jugador {
    /**
     * Atributos de la clase Jugador
     */
    private int id; 
    private String nombre;
    private String apellido;
    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasPerdidas;

    /**
     * Constructor por defecto de la clase Jugador
     * @param id Almacena el id de cada jugador
     * @param nombre Almacena el nombre de cada jugador
     * @param apellido Almacena el apellido de cada jugador
     * @param partidasJugadas Almacena la cantidad de partidas jugadas
     * @param partidasGanadas Almacena la cantidad de partidas ganadas
     * @param partidasPerdidas Almacena la cantidad de partidas perdidas
     */
    public Jugador(int id, String nombre, String apellido, int partidasJugadas, int partidasGanadas, int partidasPerdidas) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.partidasJugadas = partidasJugadas;
        this.partidasGanadas = partidasGanadas;
        this.partidasPerdidas = partidasPerdidas;
    }
    
    /**
     * Constructor que solo solicita el id, el nombre y el apellido
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
     * Metodo para obtener las partidas jugadas del jugador
     * @return 
     */
    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    /**
     * Metodo para settear las partidas jugadas por el jugador
     * @param partidasJugadas Partidas jugadas
     */
    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    /**
     * Metodo para obtener las partidas ganadas por un jugador
     * @return 
     */
    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    /**
     * Metodo para settear las partidas ganadas por un jugador
     * @param partidasGanadas Partidas ganadas
     */
    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    /**
     * Metodo para obtener las partidas perdidas por un jugador
     * @return 
     */
    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    /**
     * Metodo para settear las partidas perdidas por un jugador 
     * @param partidasPerdidas Partidas perdidas
     */
    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }
    
    
}
