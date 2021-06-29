/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import archivos.EscritorDeArchivosBinarios;
import controlador.ControladorTablero;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import modelo.jugador.Jugador;
import modelo.tablero.Tablero;

/**
 *
 * @author DIEGO MALDONADO
 */
public class TableroFrame extends javax.swing.JFrame {
    /**
     * Atributos del frame
     */
    private InicioFrame ventanaPapa;
    private ControladorTablero controladorDeTablero;
    private Tablero tablero;
    private ArrayList<Jugador> jugadores;
    private int cantidadJugadores;
    private EscritorDeArchivosBinarios escritorArchivos;
    /**
     * Creates new form TableroFrame
     */
    
    /**
     * Constructor del frame tablero
     * @param cantidadCasillasX Almacena la cantidad de casillas en X
     * @param cantidadCasillasY Almacena la cantidad de casillas en Y
     * @param ventanaPapa Almacena una referencia del frame anterior
     * @param jugadores Almacena los jugadores dentro de un array list
     * @param cantidadJugadores Almacena la cantidad de jugadores en el juego
     */
    public TableroFrame(int cantidadCasillasX, int cantidadCasillasY, InicioFrame ventanaPapa, ArrayList<Jugador> jugadores,
    int cantidadJugadores) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.escritorArchivos = new EscritorDeArchivosBinarios();
        this.ventanaPapa = ventanaPapa;
        this.cantidadJugadores = cantidadJugadores;
        this.jugadores = jugadores;
        this.tableroPanel.setLayout(new GridLayout(cantidadCasillasX, cantidadCasillasY));
        asignarDato(cantidadCasillasX, cantidadCasillasY,jugadores);
    }
    
    /**
     * Metodo para asignar los datos a los atributos que se encuentran en este frame
     * @param cantidadX Almacena la cantidad de casillas en X
     * @param cantidadY Almacena la cantidad de casillas en Y
     * @param jugadores Almacena un array list de jugadores
     */
    public void asignarDato(int cantidadX, int cantidadY, ArrayList<Jugador> jugadores){
        this.tablero = new Tablero(cantidadX, cantidadY);
        controladorDeTablero = new ControladorTablero(tableroPanel, tablero.getCasilla(), cantidadX, cantidadY);
        for(int i=0; i<cantidadJugadores-1; i++){
            this.jugadoresTextArea.append("\n"+String.valueOf(jugadores.get(i).getId())+" "+jugadores.get(i).getNombre()+" "+
                   jugadores.get(i).getApellido());
        }
        try{
            this.escritorArchivos.guardarJugadores(jugadores);
        }
        catch(Exception ex){
           ex.printStackTrace();
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jugadoresTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout tableroPanelLayout = new javax.swing.GroupLayout(tableroPanel);
        tableroPanel.setLayout(tableroPanelLayout);
        tableroPanelLayout.setHorizontalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );
        tableroPanelLayout.setVerticalGroup(
            tableroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jugadoresTextArea.setColumns(20);
        jugadoresTextArea.setRows(5);
        jScrollPane1.setViewportView(jugadoresTextArea);

        jLabel1.setText("Jugadores:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableroPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jugadoresTextArea;
    public javax.swing.JPanel tableroPanel;
    // End of variables declaration//GEN-END:variables
}
