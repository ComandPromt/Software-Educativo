/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rompecabezas.rompecabezas;

import static java.applet.Applet.newAudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.applet.AudioClip;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Integer.valueOf;
import static java.lang.Math.random;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Rojeru San
 */
public class Juego2 implements ActionListener {

    AudioClip mov, victoria;
    int a = 0, b = 0;
    boolean termina = false;
    private String juego2 = "juego2";
//    private String juego2 = "juego2";
    private int fila = 3;
    private int columna = 3;
    //posicion ganador del juego
    //Posicion ganadora "game1"
    //private int[] win = {1,2,3,4,5,6,7,8,-1}; // -1 = casilla vacia
    //Posicion ganadora "game2"
    private int[] win = {1, 2, 3, 4, 5, 6, 7, 8, -1}; // -1 = casilla vacia
    //array para controlar el desarrollo del juego
    int[] pos_juego = new int[win.length];
    //matriz de controles
    /* 0 | 1 | 2
     * 3 | 4 | 5
     * 6 | 7 | 8
     */
    private bPieza2 matriz2[] = new bPieza2[fila * columna];

//carga imagenes de nuevo juego
    public void NewGame(bPieza2 m[]) {
        this.matriz2 = m;
        llenar_tablero(win, true);
    }

//Inicia el juego
    public void Comenzar() {
        //habilita controles
        for (int i = 0; i < win.length; i++) {
            matriz2[i].setEnabled(true);
        }
        //desordena puzzle
        int[] tmp = win;
        int count = 0;
        int numRandom;
        for (int i = 0; i < pos_juego.length; i++) {
            pos_juego[i] = 0;
        }
        do {
            //obtiene numero aleatorio
            numRandom = (int) (random() * win.length);
            //Si elemento en la posicion de numRandom es diferente de 0
            if (pos_juego[numRandom] == 0) {
                pos_juego[numRandom] = tmp[count];
                count++;
            }
        } while (count < pos_juego.length);

        llenar_tablero(pos_juego, false);
    }

//Finaliza el juego :)
    public void Terminar() {
        for (int i = 0; i < win.length; i++) {
            matriz2[i].setDisabledIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/logo/logoNG.png")));
            matriz2[i].setEnabled(false);
        }
    }

//Llena la matriz de controles con imagenes dado un array numerico con las posiciones de las mismas ¿se entendio?
    void llenar_tablero(int[] m, boolean band) {
        for (int i = 0; i < win.length; i++) {
            if (m[i] > -1) {
                matriz2[i].setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/puzzle/" + juego2 + "/" + m[i] + ".png")));
                matriz2[i].setDisabledIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/puzzle/" + juego2 + "/" + m[i] + ".png")));
            } else if (band) {
                matriz2[i].setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/puzzle/" + juego2 + "/" + (i + 1) + ".png")));
                matriz2[i].setDisabledIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/puzzle/" + juego2 + "/" + (i + 1) + ".png")));
            } else {
                matriz2[i].setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/logo/logoBG.png")));
                matriz2[i].setDisabledIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/logo/logoBG.png")));
            }
        }
    }

    public int getFila() {
        return this.fila;
    }

    public int getColumna() {
        return this.columna;
    }

    //Atento a las acciones del usuario
    public void actionPerformed(ActionEvent ev) {
        //Captura en String el comando accionado por el usuario
        String comando = ev.getActionCommand();

        //Calcula posiciones de casillas vecinas y realiza movimiento
        /* a | b | c
         * d | _ | e
         * f | g | h
         */
        int[] pos = new int[8];
        if (valueOf(comando) == columna - 1)//esquina superior derecha
        {
            mov = newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            mov.play();
            pos[0] = -1;
            pos[1] = -1;
            pos[2] = -1;
            pos[3] = valueOf(comando) - 1;
            pos[4] = -1;
            pos[5] = valueOf(comando) + (columna - 1);
            pos[6] = valueOf(comando) + columna;
            pos[7] = -1;
        } else if (valueOf(comando) == (fila * columna - columna))//esquina inferior izquierda
        {
            mov = newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            mov.play();
            pos[0] = -1;
            pos[1] = valueOf(comando) - columna;
            pos[2] = valueOf(comando) - (columna - 1);
            pos[3] = -1;
            pos[4] = valueOf(comando) + 1;
            pos[5] = -1;
            pos[6] = -1;
            pos[7] = -1;
        } else if (valueOf(comando) == (fila * columna - 1))//esquina inferior derecha
        {
            mov = newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            mov.play();
            pos[0] = valueOf(comando) - (columna + 1);
            pos[1] = valueOf(comando) - columna;
            pos[2] = -1;
            pos[3] = valueOf(comando) - 1;
            pos[4] = -1;
            pos[5] = -1;
            pos[6] = -1;
            pos[7] = -1;
        } else if (valueOf(comando) % columna == 0)//primera columna
        {
            mov = newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            mov.play();
            pos[0] = -1;
            pos[1] = valueOf(comando) - columna;
            pos[2] = valueOf(comando) - (columna - 1);
            pos[3] = -1;
            pos[4] = valueOf(comando) + 1;
            pos[5] = -1;
            pos[6] = valueOf(comando) + columna;
            pos[7] = valueOf(comando) + (columna + 1);
        } else if ((valueOf(comando) + 1) % columna == 0)//ultima columna
        {
            mov = newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            mov.play();
            pos[0] = valueOf(comando) - (columna + 1);
            pos[1] = valueOf(comando) - columna;
            pos[2] = -1;
            pos[3] = valueOf(comando) - 1;
            pos[4] = -1;
            pos[5] = valueOf(comando) + (columna - 1);
            pos[6] = valueOf(comando) + columna;
            pos[7] = -1;
        } else //cualquier otra casilla
        {
            mov = newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            mov.play();
            pos[0] = valueOf(comando) - (columna + 1);
            pos[1] = valueOf(comando) - columna;
            pos[2] = valueOf(comando) - (columna - 1);
            pos[3] = valueOf(comando) - 1;
            pos[4] = valueOf(comando) + 1;
            pos[5] = valueOf(comando) + (columna - 1);
            pos[6] = valueOf(comando) + columna;
            pos[7] = valueOf(comando) + (columna + 1);
        }
        //realiza el movimiento
        for (int i = 0; i < pos.length; i++) {
            if (mover(pos[i], valueOf(comando))) {
                break;
            }
        }
        //vuelve a pintar las imagenes
        llenar_tablero(pos_juego, false);
        //Movimientos de las casillas en el juego
        //for ( int i=0; i < game.length ; i++ )
        //    System.out.print( game[i] + "," );
        //System.out.println(  );
        //despues de cada movida reviza si las casillas estan ordenadas
        if (gano()) {
            llenar_tablero(win, true);        
        }
    }

    private boolean mover(int value, int index) {
        int tmp;
        //si posicion existe dentro del array
        if (value >= 0 && value < fila * columna) {
            //si casilla esta vacia -> realiza el cambio
            if (pos_juego[value] == -1) {
                tmp = pos_juego[value];
                pos_juego[value] = pos_juego[index];
                pos_juego[index] = tmp;
                return true;
            }
        }
        return false;
    }
//funcion que recorre el array de juego y de movidas para determinar si son iguales

    public boolean gano() {
        for (int i = 0; i < win.length; i++) {
            if (win[i] != pos_juego[i]) {
                return false;
            }
        }
        return true;
    }
}
