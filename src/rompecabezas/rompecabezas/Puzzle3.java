/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rompecabezas.rompecabezas;

import static java.applet.Applet.newAudioClip;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Cursor;
import static java.awt.Cursor.HAND_CURSOR;
import static java.awt.EventQueue.invokeLater;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Short.MAX_VALUE;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import static javax.swing.BorderFactory.createBevelBorder;
import static javax.swing.GroupLayout.Alignment.LEADING;
import static javax.swing.GroupLayout.Alignment.TRAILING;
import static javax.swing.GroupLayout.DEFAULT_SIZE;
import static javax.swing.GroupLayout.PREFERRED_SIZE;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.LayoutStyle.ComponentPlacement.RELATED;
import static javax.swing.LayoutStyle.ComponentPlacement.UNRELATED;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.Timer;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import static javax.swing.border.BevelBorder.LOWERED;

/**
 *
 * @author Rojeru San
 */
public class Puzzle3 extends javax.swing.JFrame {

    AudioClip agotado, clic, inicio1, victoria, perdio;
    int gana1 = 0, gana2 = 0, gana3 = 0, gana4 = 0, gana5 = 0, gana6 = 0, termina = 0;
    int tipV = 0, mirar = 0, reg = 0;
    boolean activo = false;
    int tiempo1 = 1, tiempo2 = 45, tiempo3 = 2, tiempo4 = 30;
    int j1 = 0;
    private Juego1 juego1 = new Juego1();
    private bPieza1 matriz1[] = new bPieza1[juego1.getFila() * juego1.getColumna()];
    private Juego2 juego2 = new Juego2();
    private bPieza2 matriz2[] = new bPieza2[juego2.getFila() * juego2.getColumna()];
    private Juego3 juego3 = new Juego3();
    private bPieza3 matriz3[] = new bPieza3[juego3.getFila() * juego3.getColumna()];
    private Juego4 juego4 = new Juego4();
    private bPieza4 matriz4[] = new bPieza4[juego4.getFila() * juego4.getColumna()];
    private Juego5 juego5 = new Juego5();
    private bPieza5 matriz5[] = new bPieza5[juego5.getFila() * juego5.getColumna()];
    private Juego6 juego6 = new Juego6();
    private bPieza6 matriz6[] = new bPieza6[juego6.getFila() * juego6.getColumna()];

    /**
     * Creates new form Puzzle
     */
    public Puzzle3() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setTitle("CHILDREN'S GAME - ROMPECABEZAS");
        setIconImage(new ImageIcon(getClass().getResource("/principal/logoM.png")).getImage());
        t = new Timer(10, acciones);
        t.start();
        bloqB();
    }

    void bloqB() {
        mirar = 0;
        nuevoJ.setEnabled(true);
        nuevo1.setBackground(Color.orange);
        nuevo1.setEnabled(true);

        juega1.setEnabled(false);
        juega1.setBackground(Color.black);
        juega.setEnabled(false);

        verIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/verC.png")));
        verI.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/vistaC.png")));
        verIm.setEnabled(false);
        verIm.setBackground(Color.black);
        verI.setEnabled(false);

        panelIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/logo/verN.png")));
    }

    void construirMatriz1() {
        for (int i = 0; i < (juego1.getFila() * juego1.getColumna()); i++) {
            matriz1[i] = new bPieza1();//Se crea la pieza
            matriz1[i].setActionCommand(valueOf(i));//se añade un nombre de accion
            matriz1[i].addActionListener(juego1);
            matriz1[i].setEnabled(false);
            this.CuerpoPuzzle.add(matriz1[i]);//se añade al tablero         
        }
    }

    void construirMatriz2() {
        for (int i = 0; i < (juego2.getFila() * juego2.getColumna()); i++) {
            matriz2[i] = new bPieza2();//Se crea la pieza
            matriz2[i].setActionCommand(String.valueOf(i));//se añade un nombre de accion
            matriz2[i].addActionListener(juego2);
            matriz2[i].setEnabled(false);
            this.CuerpoPuzzle.add(matriz2[i]);//se añade al tablero         
        }

    }

    void construirMatriz3() {
        for (int i = 0; i < (juego3.getFila() * juego3.getColumna()); i++) {
            matriz3[i] = new bPieza3();//Se crea la pieza
            matriz3[i].setActionCommand(String.valueOf(i));//se añade un nombre de accion
            matriz3[i].addActionListener(juego3);
            matriz3[i].setEnabled(false);
            this.CuerpoPuzzle.add(matriz3[i]);//se añade al tablero         
        }

    }

    void construirMatriz4() {
        for (int i = 0; i < (juego4.getFila() * juego4.getColumna()); i++) {
            matriz4[i] = new bPieza4();//Se crea la pieza
            matriz4[i].setActionCommand(String.valueOf(i));//se añade un nombre de accion
            matriz4[i].addActionListener(juego4);
            matriz4[i].setEnabled(false);
            this.CuerpoPuzzle.add(matriz4[i]);//se añade al tablero         
        }

    }

    void construirMatriz5() {
        for (int i = 0; i < (juego5.getFila() * juego5.getColumna()); i++) {
            matriz5[i] = new bPieza5();//Se crea la pieza
            matriz5[i].setActionCommand(String.valueOf(i));//se añade un nombre de accion
            matriz5[i].addActionListener(juego5);
            matriz5[i].setEnabled(false);
            this.CuerpoPuzzle.add(matriz5[i]);//se añade al tablero         
        }

    }

    void construirMatriz6() {
        for (int i = 0; i < (juego6.getFila() * juego6.getColumna()); i++) {
            matriz6[i] = new bPieza6();//Se crea la pieza
            matriz6[i].setActionCommand(String.valueOf(i));//se añade un nombre de accion
            matriz6[i].addActionListener(juego6);
            matriz6[i].setEnabled(false);
            this.CuerpoPuzzle.add(matriz6[i]);//se añade al tablero         
        }

    }

    void vis1(int a) {
        if (a == 1) {
            this.CuerpoPuzzle.setLayout(new java.awt.GridLayout(juego1.getFila(), juego1.getColumna(), 0, 0));//alineacion
            construirMatriz1();
            this.repaint();
            tipV = 1;
        }
        if (a == 2) {
            this.CuerpoPuzzle.setLayout(new java.awt.GridLayout(juego2.getFila(), juego2.getColumna(), 0, 0));//alineacion
            construirMatriz2();
            this.repaint();
            tipV = 2;
        }
        if (a == 3) {
            this.CuerpoPuzzle.setLayout(new java.awt.GridLayout(juego3.getFila(), juego3.getColumna(), 0, 0));//alineacion
            construirMatriz3();
            this.repaint();
            tipV = 3;
        }
        if (a == 4) {
            this.CuerpoPuzzle.setLayout(new java.awt.GridLayout(juego4.getFila(), juego4.getColumna(), 0, 0));//alineacion
            construirMatriz4();
            this.repaint();
            tipV = 4;
        }
        if (a == 5) {
            this.CuerpoPuzzle.setLayout(new java.awt.GridLayout(juego5.getFila(), juego5.getColumna(), 0, 0));//alineacion
            construirMatriz5();
            this.repaint();
            tipV = 5;
        }
        if (a == 6) {
            this.CuerpoPuzzle.setLayout(new java.awt.GridLayout(juego6.getFila(), juego6.getColumna(), 0, 0));//alineacion
            construirMatriz6();
            this.repaint();
            tipV = 6;
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

        panel1 = new org.edisoncor.gui.panel.Panel();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        CuerpoPuzzle = new javax.swing.JPanel();
        etiquetaTiempo = new org.edisoncor.gui.label.LabelRound();
        panelIm = new org.edisoncor.gui.panel.PanelImage();
        juega1 = new org.edisoncor.gui.button.ButtonIcon();
        nuevo1 = new org.edisoncor.gui.button.ButtonIcon();
        verIm = new org.edisoncor.gui.button.ButtonIcon();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        menu = new javax.swing.JMenuBar();
        inicio = new javax.swing.JMenu();
        nuevoJ = new javax.swing.JMenuItem();
        juega = new javax.swing.JMenuItem();
        Regresar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        verI = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel1.setColorPrimario(new java.awt.Color(102, 204, 255));

        CuerpoPuzzle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CuerpoPuzzle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        /*
        Programador: jc Mouse
        Pais: Bolivia
        */

        javax.swing.GroupLayout CuerpoPuzzleLayout = new javax.swing.GroupLayout(CuerpoPuzzle);
        CuerpoPuzzle.setLayout(CuerpoPuzzleLayout);
        CuerpoPuzzleLayout.setHorizontalGroup(
            CuerpoPuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        CuerpoPuzzleLayout.setVerticalGroup(
            CuerpoPuzzleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
        );

        etiquetaTiempo.setBackground(new java.awt.Color(0, 153, 255));
        etiquetaTiempo.setText("00:00:00");
        etiquetaTiempo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        panelIm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelIm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/logo/verN.png"))); // NOI18N

        javax.swing.GroupLayout panelImLayout = new javax.swing.GroupLayout(panelIm);
        panelIm.setLayout(panelImLayout);
        panelImLayout.setHorizontalGroup(
            panelImLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        panelImLayout.setVerticalGroup(
            panelImLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 391, Short.MAX_VALUE)
        );

        juega1.setBackground(new java.awt.Color(0, 204, 0));
        juega1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        juega1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/jugarG.png"))); // NOI18N
        juega1.setText("buttonIcon1");
        juega1.setToolTipText("Jugar");
        juega1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                juega1MouseMoved(evt);
            }
        });
        juega1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juega1ActionPerformed(evt);
            }
        });

        nuevo1.setBackground(new java.awt.Color(255, 51, 0));
        nuevo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/nuevoJG.png"))); // NOI18N
        nuevo1.setText("buttonIcon1");
        nuevo1.setToolTipText("Nuevo Juego");
        nuevo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                nuevo1MouseMoved(evt);
            }
        });
        nuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevo1ActionPerformed(evt);
            }
        });

        verIm.setBackground(new java.awt.Color(255, 51, 0));
        verIm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        verIm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/verC.png"))); // NOI18N
        verIm.setText("buttonIcon1");
        verIm.setToolTipText("Ver Imagen");
        verIm.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                verImMouseMoved(evt);
            }
        });
        verIm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verImActionPerformed(evt);
            }
        });

        labelMetric1.setText("¡¡¡ Forma La Imagen A Tiempo !!!");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/logoM.png"))); // NOI18N

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addComponent(panelIm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(juega1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(verIm, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(CuerpoPuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CuerpoPuzzle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelIm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(panelCurves1Layout.createSequentialGroup()
                        .addComponent(nuevo1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(juega1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(verIm, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/iniJ.png"))); // NOI18N
        inicio.setText("Inicio");
        inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        inicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        nuevoJ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        nuevoJ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nuevoJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/nuevoJ1.png"))); // NOI18N
        nuevoJ.setText("Nuevo Juego");
        nuevoJ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoJActionPerformed(evt);
            }
        });
        inicio.add(nuevoJ);

        juega.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.ALT_MASK));
        juega.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        juega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/jugar.png"))); // NOI18N
        juega.setText("Jugar");
        juega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juegaActionPerformed(evt);
            }
        });
        inicio.add(juega);

        Regresar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        Regresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/regresar.png"))); // NOI18N
        Regresar.setText("Regresar");
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        inicio.add(Regresar);

        menu.add(inicio);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/mas/mas.png"))); // NOI18N
        jMenu4.setText("Más");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        verI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        verI.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        verI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/vistaC.png"))); // NOI18N
        verI.setText("Ver Imagen");
        verI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verIActionPerformed(evt);
            }
        });
        jMenu4.add(verI);

        menu.add(jMenu4);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private Timer t;
    private ActionListener acciones = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (juego1.gano() == true && gana1 == 0 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                t.stop();
                t1.stop();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                victoria.play();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                victoria.play();
                showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                victoria.stop();
                dispose();
                InicioR in = new InicioR();
                in.llenarMenu1();
                in.setVisible(true);
                showMessageDialog(null, "¡ Nivel 2 Desbloqueado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/desbloqM.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
            } else {
                if (juego1.gano() == true && gana1 == 1 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu1();
                    in.setVisible(true);
                }
                if (juego1.gano() == true && gana1 == 1 && gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu2();
                    in.setVisible(true);
                }
                if (juego1.gano() == true && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu3();
                    in.setVisible(true);
                }
                if (juego1.gano() == true && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu4();
                    in.setVisible(true);
                }
                if (juego1.gano() == true && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu5();
                    in.setVisible(true);
                }
                if (juego1.gano() == true && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu6();
                    in.setVisible(true);
                }
            }
            if (juego2.gano() == true && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                t.stop();
                t1.stop();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                victoria.play();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                victoria.play();
                showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                victoria.stop();
                dispose();
                InicioR in = new InicioR();
                in.llenarMenu2();
                in.setVisible(true);
                showMessageDialog(null, "¡ Nivel 3 Desbloqueado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/desbloqM.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
            } else {
                if (juego2.gano() == true && gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu2();
                    in.setVisible(true);
                }
                if (juego2.gano() == true && gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu3();
                    in.setVisible(true);
                }
                if (juego2.gano() == true && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu4();
                    in.setVisible(true);
                }
                if (juego2.gano() == true && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu5();
                    in.setVisible(true);
                }
                if (juego2.gano() == true && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu6();
                    in.setVisible(true);
                }
            }
            if (juego3.gano() == true && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                t.stop();
                t1.stop();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                victoria.play();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                victoria.play();
                showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                victoria.stop();
                dispose();
                InicioR in = new InicioR();
                in.llenarMenu3();
                in.setVisible(true);
                showMessageDialog(null, "¡ Nivel 4 Desbloqueado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/desbloqM.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
            } else {
                if (juego3.gano() == true && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu3();
                    in.setVisible(true);
                }
                if (juego3.gano() == true && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu4();
                    in.setVisible(true);
                }
                if (juego3.gano() == true && gana3 == 1 && gana4 == 1 && gana5 == 5 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu5();
                    in.setVisible(true);
                }
                if (juego3.gano() == true && gana3 == 1 && gana4 == 1 && gana5 == 5 && gana6 == 1) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu6();
                    in.setVisible(true);
                }
            }
            if (juego4.gano() == true && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                t.stop();
                t1.stop();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                victoria.play();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                victoria.play();
                showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                victoria.stop();
                dispose();
                InicioR in = new InicioR();
                in.llenarMenu4();
                in.setVisible(true);
                showMessageDialog(null, "¡ Nivel 5 Desbloqueado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/desbloqM.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
            } else {
                if (juego4.gano() == true && gana4 == 1 && gana5 == 0 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu4();
                    in.setVisible(true);
                }
                if (juego4.gano() == true && gana4 == 1 && gana5 == 5 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu5();
                    in.setVisible(true);
                }
                if (juego4.gano() == true && gana4 == 1 && gana5 == 5 && gana6 == 6) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu6();
                    in.setVisible(true);
                }
            }
            if (juego5.gano() == true && gana5 == 0 && gana6 == 0) {
                t.stop();
                t1.stop();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                victoria.play();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                victoria.play();
                showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                victoria.stop();
                dispose();
                InicioR in = new InicioR();
                in.llenarMenu5();
                in.setVisible(true);
                showMessageDialog(null, "¡ Nivel 6 Desbloqueado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/desbloqM.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
            } else {
                if (juego5.gano() == true && gana5 == 1 && gana6 == 0) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu5();
                    in.setVisible(true);
                }
                if (juego5.gano() == true && gana5 == 1 && gana6 == 1) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu6();
                    in.setVisible(true);
                }
            }
            if (juego6.gano() == true && gana6 == 0) {
                t.stop();
                t1.stop();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                victoria.play();
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                victoria.play();
                showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                victoria.stop();
                dispose();
                InicioR in = new InicioR();
                in.llenarMenu6();
                in.setVisible(true);
                victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/superadosT.wav"));
                victoria.play();
                JOptionPane.showMessageDialog(null, "       ¡ MUCHAS FELICIDADES !\n¡ Has superado todos los niveles !\n                 1, 2, 3, 4, 5, 6", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/desbSM.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
            } else {
                if (juego6.gano() == true && gana6 == 1) {
                    t.stop();
                    t1.stop();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/acierto.wav"));
                    victoria.play();
                    victoria = newAudioClip(getClass().getResource("/rompecabezas/tonos/victoria.wav"));
                    victoria.play();
                    showMessageDialog(null, "¡ Felicidades ! Lo Has Logrado", "Rompecabezas",
                            0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/salvado.png")));
                    inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                    inicio1.play();
                    victoria.stop();
                    dispose();
                    InicioR in = new InicioR();
                    in.llenarMenu6();
                    in.setVisible(true);
                }
            }
        }
    };
    private Timer t1;
    private int m, s, cs;
    private ActionListener acciones1 = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs;
            if (cs == 100) {
                cs = 0;
                ++s;
                clic = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/cloc.wav"));
                clic.play();
            }
            if (s == 60) {
                s = 0;
                ++m;
            }
            actualizarLabel();
            if (j1 == 1 && (m == tiempo1 && s == 0)) {
                tiempo(m, s);
            }
            if (j1 == 2 && (m == tiempo1 && s == 0)) {
                tiempo(m, s);
            }
            if (j1 == 3 && (m == 0 && s == tiempo2)) {
                tiempo(m, s);
            }
            if (j1 == 4 && (m == tiempo3 && s == 0)) {
                tiempo(m, s);
            }
            if (j1 == 5 && (m == tiempo3 && s == 0)) {
                tiempo(m, s);
            }
            if (j1 == 6 && (m == tiempo1 && s == tiempo4)) {
                tiempo(m, s);
            }
        }
    };

    void tiempo(int x, int y) {
        if ((x == tiempo1 && y == 0) || (x == 0 && y == tiempo2) || (x == tiempo3 && y == 0) || (x == tiempo1 && y == tiempo4)) {
            t1.stop();
            activo = false;
            agotado = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/agotadoT.wav"));
            agotado.play();
            JOptionPane.showMessageDialog(null, "      ¡ Tiempo Agotado !.\n¡ Puedes Reiniciar El Nivel !", "Rompecabezas",
                    0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/trist.png")));
            inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio1.play();
            agotado.stop();
            bloqB();
            cs = 0;
            s = 0;
            m = 0;
            nuevoJ.setText("Reiniciar Juego");
            nuevo1.setToolTipText("Reiniciar Juego");
            String tiempo = ("00:00:00");
            etiquetaTiempo.setText(tiempo);
            if (tipV == 1) {
                juego1.Terminar();
                j1 = 1;
            }
            if (tipV == 2) {
                juego2.Terminar();
                j1 = 2;
            }
            if (tipV == 3) {
                juego3.Terminar();
                j1 = 3;
            }
            if (tipV == 4) {
                juego4.Terminar();
                j1 = 4;
            }
            if (tipV == 5) {
                juego5.Terminar();
                j1 = 5;
            }
            if (tipV == 6) {
                juego6.Terminar();
                j1 = 6;
            }
        }
    }

    private void actualizarLabel() {
        String tiempo = ((m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s + ":" + (cs <= 9 ? "0" : "") + cs);
        etiquetaTiempo.setText(tiempo);
    }
    private void nuevoJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoJActionPerformed
        inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
        inicio1.play();
        if (tipV == 1) {
            juego1.NewGame(matriz1);
        }
        if (tipV == 2) {
            juego2.NewGame(matriz2);
        }
        if (tipV == 3) {
            juego3.NewGame(matriz3);
        }
        if (tipV == 4) {
            juego4.NewGame(matriz4);
        }
        if (tipV == 5) {
            juego5.NewGame(matriz5);
        }
        if (tipV == 6) {
            juego6.NewGame(matriz6);
        }
        nuevoJ.setEnabled(false);
        nuevo1.setBackground(Color.black);
        nuevo1.setEnabled(false);

        juega1.setBackground(Color.green);
        juega.setEnabled(true);
        juega1.setEnabled(true);

    }//GEN-LAST:event_nuevoJActionPerformed

    private void juegaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juegaActionPerformed
        inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
        inicio1.play();
        activo = true;
        jugarP();

        juega1.setBackground(Color.black);
        juega.setEnabled(false);
        juega1.setEnabled(false);

        verIm.setBackground(Color.orange);
        verI.setEnabled(true);
        verIm.setEnabled(true);

        reg = 1;
    }//GEN-LAST:event_juegaActionPerformed

    private void juega1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_juega1MouseMoved
        juega1.setCursor(new Cursor(12));
    }//GEN-LAST:event_juega1MouseMoved

    private void juega1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juega1ActionPerformed
        juegaActionPerformed(evt);
    }//GEN-LAST:event_juega1ActionPerformed

    private void nuevo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevo1MouseMoved
        nuevo1.setCursor(new Cursor(12));
    }//GEN-LAST:event_nuevo1MouseMoved

    private void nuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevo1ActionPerformed
        nuevoJActionPerformed(evt);
    }//GEN-LAST:event_nuevo1ActionPerformed

    private void verIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verIActionPerformed
        verImActionPerformed(evt);
    }//GEN-LAST:event_verIActionPerformed

    private void verImMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verImMouseMoved
        verIm.setCursor(new Cursor(12));
    }//GEN-LAST:event_verImMouseMoved

    private void verImActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verImActionPerformed
        inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
        inicio1.play();
        if (mirar == 0) {
            if (tipV == 1) {
                panelIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/inicio/" + tipV + ".png")));
                verIm.setToolTipText("Ocultar Imagen");
                verIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/ver1.png")));
                verI.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/vista.png")));
                verI.setText("Ocultar Imagen");
                mirar = 1;
            }
            if (tipV == 2) {
                panelIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/inicio/" + tipV + ".png")));
                verIm.setToolTipText("Ocultar Imagen");
                verIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/ver1.png")));
                verI.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/vista.png")));
                verI.setText("Ocultar Imagen");
                mirar = 1;
            }
            if (tipV == 3) {
                panelIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/inicio/" + tipV + ".png")));
                verIm.setToolTipText("Ocultar Imagen");
                verIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/ver1.png")));
                verI.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/vista.png")));
                verI.setText("Ocultar Imagen");
                mirar = 1;
            }
            if (tipV == 4) {
                panelIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/inicio/" + tipV + ".png")));
                verIm.setToolTipText("Ocultar Imagen");
                verIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/ver1.png")));
                verI.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/vista.png")));
                verI.setText("Ocultar Imagen");
                mirar = 1;
            }
            if (tipV == 5) {
                panelIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/inicio/" + tipV + ".png")));
                verIm.setToolTipText("Ocultar Imagen");
                verIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/ver1.png")));
                verI.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/vista.png")));
                verI.setText("Ocultar Imagen");
                mirar = 1;
            }
            if (tipV == 6) {
                panelIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/inicio/" + tipV + ".png")));
                verIm.setToolTipText("Ocultar Imagen");
                verIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/ver1.png")));
                verI.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/vista.png")));
                verI.setText("Ocultar Imagen");
                mirar = 1;
            }
        } else {
            panelIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/logo/verN.png")));
            verIm.setToolTipText("Ver Imagen");
            verIm.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/verC.png")));
            verI.setIcon(new ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/vistaC.png")));
            verI.setText("Ver Imagen");
            mirar = 0;
        }
    }//GEN-LAST:event_verImActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
        inicio1.play();
        if (tipV == 1) {
            if (reg == 1 && gana1 == 0 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t1.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if (reg == 0 && gana1 == 0 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
            if ((reg == 1 && gana1 == 1 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 1 && gana1 == 1 && gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 1 && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 1 && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0)
                    || (reg == 1 && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0)
                    || (reg == 1 && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1)) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if ((reg == 0 && gana1 == 1 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 0 && gana1 == 1 && gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 0 && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 0 && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0)
                    || (reg == 0 && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0)
                    || (reg == 0 && gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1)) {
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
        }
        if (tipV == 2) {
            if (reg == 1 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t1.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if (reg == 0 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
            if ((reg == 1 && gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 1 && gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0)
                    || (reg == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0)
                    || (reg == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1)) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if ((reg == 0 && gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 0 && gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 0 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0)
                    || (reg == 0 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0)
                    || (reg == 0 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1)) {
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
        }
        if (tipV == 3) {
            if (reg == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t1.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if (reg == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
            if ((reg == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0)
                    || (reg == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0)
                    || (reg == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1)) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if ((reg == 0 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                    || (reg == 0 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0)
                    || (reg == 0 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0)
                    || (reg == 0 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1)) {
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
        }
        if (tipV == 4) {
            if (reg == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t1.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if (reg == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
            if ((reg == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0)
                    || (reg == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0)
                    || (reg == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1)) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if ((reg == 0 && gana4 == 1 && gana5 == 0 && gana6 == 0)
                    || (reg == 0 && gana4 == 1 && gana5 == 1 && gana6 == 0)
                    || (reg == 0 && gana4 == 1 && gana5 == 1 && gana6 == 1)) {
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
        }
        if (tipV == 5) {
            if (reg == 1 && gana5 == 0 && gana6 == 0) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t1.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if (reg == 0 && gana5 == 0 && gana6 == 0) {
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
            if ((reg == 1 && gana5 == 1 && gana6 == 0)
                    || (reg == 1 && gana5 == 1 && gana6 == 1)) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if ((reg == 0 && gana5 == 1 && gana6 == 0)
                    || (reg == 0 && gana5 == 1 && gana6 == 1)) {
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
        }
        if (tipV == 6) {
            if (reg == 1 && gana6 == 0) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t1.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if (reg == 0 && gana6 == 0) {
                int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el Nivel.\n¿Deseas Continuar?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
            if (reg == 1 && gana6 == 1) {
                t1.stop();
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    t.removeActionListener(acciones);
                    metodo();
                } else {
                    t1.start();
                }
            }
            if (reg == 0 && gana6 == 1) {
                int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                if (seleccion == 0) {
                    metodo();
                }
            }
        }
    }//GEN-LAST:event_RegresarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
        inicio1.play();
        if (reg == 1) {
            t1.stop();
            close();
        } else {
            close1();
        }
    }//GEN-LAST:event_formWindowClosing
    private void close() {
        if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
            inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio1.play();
            System.exit(0);
        } else {
            inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio1.play();
            t1.start();
            setDefaultCloseOperation(0);
        }
    }

    private void close1() {
        if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
            inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio1.play();
            System.exit(0);
        } else {
            inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio1.play();
            setDefaultCloseOperation(0);
        }
    }

    void metodo() {
        if (tipV == 1) {
            if (gana1 == 0 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                perdio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/fallo.wav"));
                perdio.play();
                JOptionPane.showMessageDialog(null, "¡ Nivel No Superado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/trist.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu();
                ip.setVisible(true);
            }
            if (gana1 == 1 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu1();
                ip.setVisible(true);
            }
            if (gana1 == 1 && gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu2();
                ip.setVisible(true);
            }
            if (gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu3();
                ip.setVisible(true);
            }
            if (gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu4();
                ip.setVisible(true);
            }
            if (gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu5();
                ip.setVisible(true);
            }
            if (gana1 == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu6();
                ip.setVisible(true);
            }
        }
        if (tipV == 2) {
            if (gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                perdio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/fallo.wav"));
                perdio.play();
                JOptionPane.showMessageDialog(null, "¡ Nivel No Superado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/trist.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu1();
                ip.setVisible(true);
            }
            if (gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu2();
                ip.setVisible(true);
            }
            if (gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu3();
                ip.setVisible(true);
            }
            if (gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu4();
                ip.setVisible(true);
            }
            if (gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu5();
                ip.setVisible(true);
            }
            if (gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu6();
                ip.setVisible(true);
            }
        }
        if (tipV == 3) {
            if (gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                perdio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/fallo.wav"));
                perdio.play();
                JOptionPane.showMessageDialog(null, "¡ Nivel No Superado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/trist.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu2();
                ip.setVisible(true);
            }
            if (gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu3();
                ip.setVisible(true);
            }
            if (gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu4();
                ip.setVisible(true);
            }
            if (gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu5();
                ip.setVisible(true);
            }
            if (gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu6();
                ip.setVisible(true);
            }
        }
        if (tipV == 4) {
            if (gana4 == 0 && gana5 == 0 && gana6 == 0) {
                perdio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/fallo.wav"));
                perdio.play();
                JOptionPane.showMessageDialog(null, "¡ Nivel No Superado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/trist.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu3();
                ip.setVisible(true);
            }
            if (gana4 == 1 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu4();
                ip.setVisible(true);
            }
            if (gana4 == 1 && gana5 == 1 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu5();
                ip.setVisible(true);
            }
            if (gana4 == 1 && gana5 == 1 && gana6 == 1) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu6();
                ip.setVisible(true);
            }
        }
        if (tipV == 5) {
            if (gana5 == 0 && gana6 == 0) {
                perdio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/fallo.wav"));
                perdio.play();
                JOptionPane.showMessageDialog(null, "¡ Nivel No Superado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/trist.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu4();
                ip.setVisible(true);
            }
            if (gana5 == 1 && gana6 == 0) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu5();
                ip.setVisible(true);
            }
            if (gana5 == 1 && gana6 == 1) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu6();
                ip.setVisible(true);
            }
        }
        if (tipV == 6) {
            if (gana5 == 0 && gana6 == 0) {
                perdio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/fallo.wav"));
                perdio.play();
                JOptionPane.showMessageDialog(null, "¡ Nivel No Superado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/trist.png")));
                inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio1.play();
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu5();
                ip.setVisible(true);
            }
            if (gana6 == 1) {
                this.dispose();
                InicioR ip = new InicioR();
                ip.llenarMenu6();
                ip.setVisible(true);
            }
        }
    }

    void jugarP() {
        if (tipV == 1) {
            t1 = new Timer(10, acciones1);
            JOptionPane.showMessageDialog(null ,"                   (Nivel 1)\nForma la imagen antes de que el\n"
                    + "   cronometro llegue a 01:00:00.", "Rompecabezas",
                    0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/blueR.png")));
            inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio1.play();
            t1.start();
            juego1.Comenzar();
        }
        if (tipV == 2) {
            t1 = new Timer(10, acciones1);
            JOptionPane.showMessageDialog(null, "                   (Nivel 2)\nForma la imagen antes de que el\n"
                    + "   cronometro llegue a 01:00:00.", "Rompecabezas",
                    0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/grayR.png")));
            inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio1.play();
            t1.start();
            juego2.Comenzar();
        }
        if (tipV == 3) {
            t1 = new Timer(10, acciones1);
            JOptionPane.showMessageDialog(null, "                   (Nivel 3)\nForma la imagen antes de que el\n"
                    + "   cronometro llegue a 00:45:00.", "Rompecabezas",
                    0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/greenR.png")));
            inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio1.play();
            t1.start();
            juego3.Comenzar();
        }
        if (tipV == 4) {
            t1 = new Timer(10, acciones1);
            JOptionPane.showMessageDialog(null, "                   (Nivel 4)\nForma la imagen antes de que el\n"
                    + "   cronometro llegue a 02:00:00.", "Rompecabezas",
                    0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/morR.png")));
            inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio1.play();
            t1.start();
            juego4.Comenzar();
        }
        if (tipV == 5) {
            t1 = new Timer(10, acciones1);
            JOptionPane.showMessageDialog(null, "                   (Nivel 5)\nForma la imagen antes de que el\n"
                    + "   cronometro llegue a 02:00:00.", "Rompecabezas",
                    0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/narR.png")));
            inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio1.play();
            t1.start();
            juego5.Comenzar();
        }
        if (tipV == 6) {
            t1 = new Timer(10, acciones1);
            JOptionPane.showMessageDialog(null, "                   (Nivel 6)\nForma la imagen antes de que el\n"
                    + "   cronometro llegue a 01:30:00.", "Rompecabezas",
                    0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/rosaR.png")));
            inicio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio1.play();
            t1.start();
            juego6.Comenzar();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Puzzle3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Puzzle3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Puzzle3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Puzzle3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Puzzle3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CuerpoPuzzle;
    private javax.swing.JMenuItem Regresar;
    private org.edisoncor.gui.label.LabelRound etiquetaTiempo;
    private javax.swing.JMenu inicio;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem juega;
    private org.edisoncor.gui.button.ButtonIcon juega1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private javax.swing.JMenuBar menu;
    private org.edisoncor.gui.button.ButtonIcon nuevo1;
    public javax.swing.JMenuItem nuevoJ;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelImage panelIm;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JMenuItem verI;
    private org.edisoncor.gui.button.ButtonIcon verIm;
    // End of variables declaration//GEN-END:variables

}
