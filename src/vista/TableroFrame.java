/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorTablero;
import java.awt.GridLayout;
import javax.swing.WindowConstants;
import modelo.tablero.Tablero;

/**
 *
 * @author DIEGO MALDONADO
 */
public class TableroFrame extends javax.swing.JFrame {
    /**
     * Atributos del frame
     */
    private ControladorTablero controladorDeTablero;
    private Tablero tablero;
    /**
     * Creates new form TableroFrame
     */
    
    /**
     * Constructor del frame tablero
     * @param cantidadCasillasX Almacena la cantidad de casillas en X
     * @param cantidadCasillasY Almacena la cantidad de casillas en Y
     */
    public TableroFrame(int cantidadCasillasX, int cantidadCasillasY) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.tableroPanel.setLayout(new GridLayout(cantidadCasillasX, cantidadCasillasY));
        asignarDato(cantidadCasillasX, cantidadCasillasY);
    }
    
    /**
     * Metodo para asignar los datos a los atributos que se encuentran en este frame
     * @param cantidadX Almacena la cantidad de casillas en X
     * @param cantidadY Almacena la cantidad de casillas en Y
     */
    public void asignarDato(int cantidadX, int cantidadY){
        this.tablero = new Tablero(cantidadX, cantidadY);
        controladorDeTablero = new ControladorTablero(tableroPanel,tablero.getCasilla(), cantidadX, cantidadY);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableroPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout tableroPanelLayout = new javax.swing.GroupLayout(tableroPanel);
        tableroPanel.setLayout(tableroPanelLayout);
        tableroPanelLayout.setHorizontalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );
        tableroPanelLayout.setVerticalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(tableroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(tableroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel tableroPanel;
    // End of variables declaration//GEN-END:variables
}
