/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.tablero;

import java.awt.Component;
import javax.accessibility.AccessibleContext;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;
import javax.swing.JLabel;

/**
 *
 * @author DIEGO MALDONADO
 */
public class SuperficieJLabel extends JLabel{
    /**
     * Clase modelo para las superficies JLabel
     */
    
    /**
     * Atributos de la clase 
     */
    private int numeroFila;
    private int numeroColumna;

    /**
     * Constructor de la clase 
     * @param numeroFila Almacena el numero de fila de la superficie
     * @param numeroColumna Almacena el numero de columna de la superficie
     * @param text Almacena el texto que tendra el JLabel
     */
    public SuperficieJLabel(int numeroFila, int numeroColumna, String text) {
        super(text);
        this.numeroFila = numeroFila;
        this.numeroColumna = numeroColumna;
    }

    /**
     * Metodo para obtener el numero de fila
     * @return 
     */
    public int getNumeroFila() {
        return numeroFila;
    }

    /**
     * Metodo para settear el numero de fila
     * @param numeroFila 
     */
    public void setNumeroFila(int numeroFila) {
        this.numeroFila = numeroFila;
    }

    /**
     * Metodo para obtener el numero de columna
     * @return 
     */
    public int getNumeroColumna() {
        return numeroColumna;
    }

    /**
     * Metodo para settear el numero de colummna
     * @param numeroColumna 
     */
    public void setNumeroColumna(int numeroColumna) {
        this.numeroColumna = numeroColumna;
    }

    /**
     * Metodos propios de los Labels
     * @return 
     */
    
    
    @Override
    public Component getLabelFor() {
        return labelFor;
    }

    @Override
    public void setLabelFor(Component labelFor) {
        this.labelFor = labelFor;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    @Override
    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
    
    /**
     * Final de metodos propios de los Labels
     */
}
