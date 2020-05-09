/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pares.pares;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Rojeru San
 */
public class Pares2 extends javax.swing.JFrame {

    AudioClip audio, audio1, clic, inicio, acierto, agotado, perdio, victoria, paresC;
    int gana2 = 0, gana3 = 0, gana4 = 0, gana5 = 0, gana6 = 0, termina = 0;
    int tiempo1 = 50, reg = 0;
    int a = 0, play = 0;
    private Logica log = new Logica();
    private boolean caraUp = false;
    private ImageIcon im1;
    private ImageIcon im2;
    private JButton[] pbtn = new JButton[2];
    private boolean primerc = false;
    private int puntaje = 0;

    /**
     * Creates new form Pares1
     */
    public Pares2() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("CHILDREN'S GAME - PARES (NIVEL 2)");
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource("/principal/logoM.png")).getImage());
        t = new Timer(10, acciones);
        bloqs();
    }

    private void setCards() {
        int[] numbers = log.getNumeros();

        btnC1.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[0] + ".png")));
        btnC2.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[1] + ".png")));
        btnC3.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[2] + ".png")));
        btnC4.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[3] + ".png")));
        btnC5.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[4] + ".png")));
        btnC6.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[5] + ".png")));
        btnC7.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[6] + ".png")));
        btnC8.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[7] + ".png")));
        btnC9.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[8] + ".png")));
        btnC10.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[9] + ".png")));
        btnC11.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[10] + ".png")));
        btnC12.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[11] + ".png")));
        btnC13.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[12] + ".png")));
        btnC14.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[13] + ".png")));
        btnC15.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[14] + ".png")));
        btnC16.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[15] + ".png")));
        btnC17.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[16] + ".png")));
        btnC18.setDisabledIcon(new ImageIcon(getClass().getResource("/pares/pares/imagenes1/c" + numbers[17] + ".png")));
    }

    private void btnEnabled(JButton btn) {

        if (!caraUp) {
            btn.setEnabled(false);
            im1 = (ImageIcon) btn.getDisabledIcon();
            pbtn[0] = btn;
            caraUp = true;
            primerc = false;
        } else {
            btn.setEnabled(false);
            im2 = (ImageIcon) btn.getDisabledIcon();
            pbtn[1] = btn;
            primerc = true;
            puntaje += 20;
            pregwin();
        }
    }

    public void compare() {
        if (termina == 1) {
            if (caraUp && primerc) {

                if (im1.getDescription().compareTo(im2.getDescription()) != 0) {
                    pbtn[0].setEnabled(false);
                    pbtn[1].setEnabled(false);
                    if (puntaje > 10) {
                        puntaje -= 10;
                    }
                } else {
                    acierto = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/acierto.wav"));
                    acierto.play();
                }
                caraUp = false;
            }
        } else {
            if (caraUp && primerc) {

                if (im1.getDescription().compareTo(im2.getDescription()) != 0) {
                    pbtn[0].setEnabled(true);
                    pbtn[1].setEnabled(true);
                    if (puntaje > 10) {
                        puntaje -= 10;
                    }
                } else {
                    acierto = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/acierto.wav"));
                    acierto.play();
                }
                caraUp = false;
            }
        }
    }

    void tiempo(int x) {
        if (x == tiempo1) {
            t.stop();
            paresC.stop();
            agotado = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/agotadoT.wav"));
            agotado.play();
            if (gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                perdio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/fallo.wav"));
                perdio.play();
                JOptionPane.showMessageDialog(null, "¡ Tu Tiempo Termino !\n ¡ Nivel No Superado !", "Pares",
                        0, new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/blueR.png")));
                reiniciar.setIcon(new ImageIcon(getClass().getResource("/pares/pares/pick/reiniciar.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
                inicio.play();
                agotado.stop();
                cs = 0;
                s = 0;
                m = 0;
                String tiempo = ("00:00:00");
                etiquetaTiempo.setText(tiempo);
                bloqs();
                reiniciar.setEnabled(true);
                termina = 1;
            } else {
                JOptionPane.showMessageDialog(null, "¡ Tu Tiempo Termino !", "Pares",
                        0, new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/blueR.png")));
                reiniciar.setIcon(new ImageIcon(getClass().getResource("/pares/pares/pick/reiniciar.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
                inicio.play();
                agotado.stop();
                cs = 0;
                s = 0;
                m = 0;
                String tiempo = ("00:00:00");
                etiquetaTiempo.setText(tiempo);
                bloqs();
                reiniciar.setEnabled(true);
                termina = 1;
            }
        }
    }

    void bloqs() {
        btnPlay.setEnabled(false);
        controlM.setEnabled(false);
        
        btnC1.setEnabled(false);
        btnC2.setEnabled(false);
        btnC3.setEnabled(false);
        btnC4.setEnabled(false);
        btnC5.setEnabled(false);
        btnC6.setEnabled(false);
        btnC7.setEnabled(false);
        btnC8.setEnabled(false);
        btnC9.setEnabled(false);
        btnC10.setEnabled(false);
        btnC11.setEnabled(false);
        btnC12.setEnabled(false);
        btnC13.setEnabled(false);
        btnC14.setEnabled(false);
        btnC15.setEnabled(false);
        btnC16.setEnabled(false);
        btnC17.setEnabled(false);
        btnC18.setEnabled(false);
    }

    private void reiniciar() {
        termina = 0;
        btnC1.setEnabled(true);
        btnC2.setEnabled(true);
        btnC3.setEnabled(true);
        btnC4.setEnabled(true);
        btnC5.setEnabled(true);
        btnC6.setEnabled(true);
        btnC7.setEnabled(true);
        btnC8.setEnabled(true);
        btnC9.setEnabled(true);
        btnC10.setEnabled(true);
        btnC11.setEnabled(true);
        btnC12.setEnabled(true);
        btnC13.setEnabled(true);
        btnC14.setEnabled(true);
        btnC15.setEnabled(true);
        btnC16.setEnabled(true);
        btnC17.setEnabled(true);
        btnC18.setEnabled(true);

        setCards();
        JOptionPane.showMessageDialog(null, "                  (Nivel 2)\nEcuentra todos los pares antes de\nque el"
                + " cronometro llegue a 00:50:00.", "Pares", 0, new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/blueR.png")));
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
        t.start();
        paresC = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/pares.wav"));
        paresC.play();
        btnPlay.setEnabled(true);
        btnPlay.setText("Detener Musica");
        btnPlay.setIcon(new ImageIcon(getClass().getResource("/pares/mas/stop1.png")));
        controlM.setEnabled(true);
        controlM.setBackground(Color.red);
        controlM.setToolTipText("Detener");
        controlM.setIcon(new ImageIcon(getClass().getResource("/pares/mas/stop.png")));
        primerc = false;
        caraUp = false;
        puntaje = 0;
    }

    private void pregwin() {
        if (!btnC1.isEnabled() && !btnC2.isEnabled() && !btnC3.isEnabled() && !btnC4.isEnabled() && !btnC5.isEnabled() && !btnC6.isEnabled()
                && !btnC7.isEnabled() && !btnC8.isEnabled() && !btnC9.isEnabled() && !btnC10.isEnabled() && !btnC11.isEnabled()
                && !btnC12.isEnabled() && !btnC13.isEnabled() && !btnC14.isEnabled() && !btnC15.isEnabled() && !btnC16.isEnabled() && !btnC17.isEnabled() && !btnC18.isEnabled()) {
            acierto = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/acierto.wav"));
            acierto.play();
            t.stop();
            paresC.stop();
            victoria = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/victoria.wav"));
            victoria.play();
            JOptionPane.showMessageDialog(this, "¡Felicidades!, ¡Lo has logrado!\n            Puntaje: " + puntaje, "Pares",
                    0, new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/salvado.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            inicio.play();
            victoria.stop();
            if (gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioP ip = new InicioP();
                ip.llenarMenu2();
                ip.setVisible(true);
                JOptionPane.showMessageDialog(null, "¡ Nivel 3 Desbloqueado !", "Pares", 0,
                        new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/desbloqM.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
                inicio.play();
            }
            if (gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioP ip = new InicioP();
                ip.llenarMenu2();
                ip.setVisible(true);
            }
            if (gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioP ip = new InicioP();
                ip.llenarMenu3();
                ip.setVisible(true);
            }
            if (gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0) {
                this.dispose();
                InicioP ip = new InicioP();
                ip.llenarMenu4();
                ip.setVisible(true);
            }
            if (gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0) {
                this.dispose();
                InicioP ip = new InicioP();
                ip.llenarMenu5();
                ip.setVisible(true);
            }
            if (gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1) {
                this.dispose();
                InicioP ip = new InicioP();
                ip.llenarMenu6();
                ip.setVisible(true);
            }

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
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC16 = new javax.swing.JButton();
        btnC15 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC10 = new javax.swing.JButton();
        btnC12 = new javax.swing.JButton();
        btnC14 = new javax.swing.JButton();
        btnC13 = new javax.swing.JButton();
        btnC11 = new javax.swing.JButton();
        btnC9 = new javax.swing.JButton();
        btnC17 = new javax.swing.JButton();
        btnC18 = new javax.swing.JButton();
        panel2 = new org.edisoncor.gui.panel.Panel();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        etiquetaTiempo = new org.edisoncor.gui.label.LabelRound();
        controlM = new org.edisoncor.gui.button.ButtonIcon();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        reiniciar = new javax.swing.JMenuItem();
        regresars = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        btnPlay = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel1.setColorPrimario(new java.awt.Color(0, 51, 204));

        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC1.setBorder(null);
        btnC1.setBorderPainted(false);
        btnC1.setContentAreaFilled(false);
        btnC1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC1.setFocusable(false);
        btnC1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC1MouseExited(evt);
            }
        });
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });

        btnC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC2.setBorder(null);
        btnC2.setBorderPainted(false);
        btnC2.setContentAreaFilled(false);
        btnC2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC2.setFocusable(false);
        btnC2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC2MouseExited(evt);
            }
        });
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });

        btnC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC3.setBorder(null);
        btnC3.setBorderPainted(false);
        btnC3.setContentAreaFilled(false);
        btnC3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC3.setFocusable(false);
        btnC3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC3MouseExited(evt);
            }
        });
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });

        btnC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC4.setBorder(null);
        btnC4.setBorderPainted(false);
        btnC4.setContentAreaFilled(false);
        btnC4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC4.setFocusable(false);
        btnC4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC4MouseExited(evt);
            }
        });
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });

        btnC16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC16.setBorder(null);
        btnC16.setBorderPainted(false);
        btnC16.setContentAreaFilled(false);
        btnC16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC16.setFocusable(false);
        btnC16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC16MouseExited(evt);
            }
        });
        btnC16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC16ActionPerformed(evt);
            }
        });

        btnC15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC15.setBorder(null);
        btnC15.setBorderPainted(false);
        btnC15.setContentAreaFilled(false);
        btnC15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC15.setFocusable(false);
        btnC15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC15MouseExited(evt);
            }
        });
        btnC15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC15ActionPerformed(evt);
            }
        });

        btnC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC8.setBorder(null);
        btnC8.setBorderPainted(false);
        btnC8.setContentAreaFilled(false);
        btnC8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC8.setFocusable(false);
        btnC8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC8MouseExited(evt);
            }
        });
        btnC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC8ActionPerformed(evt);
            }
        });

        btnC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC7.setBorder(null);
        btnC7.setBorderPainted(false);
        btnC7.setContentAreaFilled(false);
        btnC7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC7.setFocusable(false);
        btnC7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC7MouseExited(evt);
            }
        });
        btnC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC7ActionPerformed(evt);
            }
        });

        btnC6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC6.setBorder(null);
        btnC6.setBorderPainted(false);
        btnC6.setContentAreaFilled(false);
        btnC6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC6.setFocusable(false);
        btnC6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC6MouseExited(evt);
            }
        });
        btnC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC6ActionPerformed(evt);
            }
        });

        btnC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC5.setBorder(null);
        btnC5.setBorderPainted(false);
        btnC5.setContentAreaFilled(false);
        btnC5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC5.setFocusable(false);
        btnC5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC5MouseExited(evt);
            }
        });
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });

        btnC10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC10.setBorder(null);
        btnC10.setBorderPainted(false);
        btnC10.setContentAreaFilled(false);
        btnC10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC10.setFocusable(false);
        btnC10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC10MouseExited(evt);
            }
        });
        btnC10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC10ActionPerformed(evt);
            }
        });

        btnC12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC12.setBorder(null);
        btnC12.setBorderPainted(false);
        btnC12.setContentAreaFilled(false);
        btnC12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC12.setFocusable(false);
        btnC12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC12MouseExited(evt);
            }
        });
        btnC12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC12ActionPerformed(evt);
            }
        });

        btnC14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC14.setBorder(null);
        btnC14.setBorderPainted(false);
        btnC14.setContentAreaFilled(false);
        btnC14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC14.setFocusable(false);
        btnC14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC14MouseExited(evt);
            }
        });
        btnC14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC14ActionPerformed(evt);
            }
        });

        btnC13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC13.setBorder(null);
        btnC13.setBorderPainted(false);
        btnC13.setContentAreaFilled(false);
        btnC13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC13.setFocusable(false);
        btnC13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC13MouseExited(evt);
            }
        });
        btnC13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC13ActionPerformed(evt);
            }
        });

        btnC11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC11.setBorder(null);
        btnC11.setBorderPainted(false);
        btnC11.setContentAreaFilled(false);
        btnC11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC11.setFocusable(false);
        btnC11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC11MouseExited(evt);
            }
        });
        btnC11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC11ActionPerformed(evt);
            }
        });

        btnC9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC9.setBorder(null);
        btnC9.setBorderPainted(false);
        btnC9.setContentAreaFilled(false);
        btnC9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC9.setFocusable(false);
        btnC9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC9MouseExited(evt);
            }
        });
        btnC9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC9ActionPerformed(evt);
            }
        });

        btnC17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC17.setBorder(null);
        btnC17.setBorderPainted(false);
        btnC17.setContentAreaFilled(false);
        btnC17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC17.setFocusable(false);
        btnC17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC17MouseExited(evt);
            }
        });
        btnC17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC17ActionPerformed(evt);
            }
        });

        btnC18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f00.png"))); // NOI18N
        btnC18.setBorder(null);
        btnC18.setBorderPainted(false);
        btnC18.setContentAreaFilled(false);
        btnC18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnC18.setFocusable(false);
        btnC18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/imagenes1/f0.png"))); // NOI18N
        btnC18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnC18MouseExited(evt);
            }
        });
        btnC18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC18ActionPerformed(evt);
            }
        });

        panel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panel2.setColorPrimario(new java.awt.Color(51, 51, 51));
        panel2.setColorSecundario(new java.awt.Color(0, 51, 204));

        labelMetric1.setText("¡¡¡ Encuentra Todos Los Pares !!!");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        etiquetaTiempo.setBackground(new java.awt.Color(51, 204, 255));
        etiquetaTiempo.setForeground(new java.awt.Color(0, 0, 0));
        etiquetaTiempo.setText("00:00:00");
        etiquetaTiempo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N

        controlM.setBackground(new java.awt.Color(0, 204, 0));
        controlM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        controlM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/mas/play.png"))); // NOI18N
        controlM.setText("buttonIcon1");
        controlM.setToolTipText("Iniciar");
        controlM.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                controlMMouseMoved(evt);
            }
        });
        controlM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(controlM, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 254, Short.MAX_VALUE)
                .addComponent(etiquetaTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controlM, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCurves1Layout = new javax.swing.GroupLayout(panelCurves1);
        panelCurves1.setLayout(panelCurves1Layout);
        panelCurves1Layout.setHorizontalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCurves1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC1)
                    .addComponent(btnC12)
                    .addComponent(btnC14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnC13)
                    .addComponent(btnC10)
                    .addComponent(btnC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnC11)
                    .addComponent(btnC3)
                    .addComponent(btnC5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC4)
                    .addComponent(btnC6)
                    .addComponent(btnC9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC7)
                    .addComponent(btnC16)
                    .addComponent(btnC17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnC15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnC18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(68, 68, 68))
            .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCurves1Layout.setVerticalGroup(
            panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCurves1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC2)
                    .addComponent(btnC1)
                    .addComponent(btnC3)
                    .addComponent(btnC4)
                    .addComponent(btnC16)
                    .addComponent(btnC15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC12)
                    .addComponent(btnC10)
                    .addComponent(btnC5)
                    .addComponent(btnC6)
                    .addComponent(btnC7)
                    .addComponent(btnC8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCurves1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnC14)
                    .addComponent(btnC13)
                    .addComponent(btnC11)
                    .addComponent(btnC9)
                    .addComponent(btnC17)
                    .addComponent(btnC18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/ini.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        reiniciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        reiniciar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/mas/nuevoJ.png"))); // NOI18N
        reiniciar.setText("Nuevo/Reiniciar");
        reiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        jMenu1.add(reiniciar);

        regresars.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        regresars.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regresars.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/regresar.png"))); // NOI18N
        regresars.setText("Regresar al menú");
        regresars.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarsActionPerformed(evt);
            }
        });
        jMenu1.add(regresars);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/mas/mas.png"))); // NOI18N
        jMenu2.setText("Más");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btnPlay.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        btnPlay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/mas/play1.png"))); // NOI18N
        btnPlay.setText("Iniciar Musica");
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        jMenu2.add(btnPlay);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private Timer t;
    private int m, s, cs;
    private ActionListener acciones = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent ae) {
            ++cs;
            if (cs == 100) {
                cs = 0;
                ++s;
                clic = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/cloc.wav"));
                clic.play();
            }
            if (s == 60) {
                s = 0;
                ++m;
            }
            actualizarLabel();
            if (m == 0 && s == 50) {
                tiempo(s);
            }
        }
    };

    private void actualizarLabel() {
        String tiempo = ((m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s + ":" + (cs <= 9 ? "0" : "") + cs);
        etiquetaTiempo.setText(tiempo);
    }
    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
        play=1;
        reiniciar();
        reiniciar.setEnabled(false);
        reg = 1;
    }//GEN-LAST:event_reiniciarActionPerformed

    private void btnC1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC1MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC1MouseExited

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        btnEnabled(btnC1);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnC2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC2MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC2MouseExited

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        btnEnabled(btnC2);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnC3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC3MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC3MouseExited

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        btnEnabled(btnC3);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnC4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC4MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC4MouseExited

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        btnEnabled(btnC4);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnC16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC16MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC16MouseExited

    private void btnC16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC16ActionPerformed
        btnEnabled(btnC16);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC16ActionPerformed

    private void btnC15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC15MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC15MouseExited

    private void btnC15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC15ActionPerformed
        btnEnabled(btnC15);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC15ActionPerformed

    private void btnC8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC8MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC8MouseExited

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        btnEnabled(btnC8);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnC7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC7MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC7MouseExited

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        btnEnabled(btnC7);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnC6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC6MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC6MouseExited

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        btnEnabled(btnC6);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnC5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC5MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC5MouseExited

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        btnEnabled(btnC5);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnC10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC10MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC10MouseExited

    private void btnC10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC10ActionPerformed
        btnEnabled(btnC10);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC10ActionPerformed

    private void btnC12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC12MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC12MouseExited

    private void btnC12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC12ActionPerformed
        btnEnabled(btnC12);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC12ActionPerformed

    private void btnC14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC14MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC14MouseExited

    private void btnC14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC14ActionPerformed
        btnEnabled(btnC14);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC14ActionPerformed

    private void btnC13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC13MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC13MouseExited

    private void btnC13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC13ActionPerformed
        btnEnabled(btnC13);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC13ActionPerformed

    private void btnC11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC11MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC11MouseExited

    private void btnC11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC11ActionPerformed
        btnEnabled(btnC11);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC11ActionPerformed

    private void btnC9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC9MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC9MouseExited

    private void btnC9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC9ActionPerformed
        btnEnabled(btnC9);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC9ActionPerformed

    private void btnC17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC17MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC17MouseExited

    private void btnC17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC17ActionPerformed
        btnEnabled(btnC17);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC17ActionPerformed

    private void btnC18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnC18MouseExited
        // TODO add your handling code here:
        compare();
    }//GEN-LAST:event_btnC18MouseExited

    private void btnC18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC18ActionPerformed
        btnEnabled(btnC18);
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_btnC18ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        audio1.play();
        if (reg == 1) {
            t.stop();
            close();
        } else {
            close1();
        }
    }//GEN-LAST:event_formWindowClosing

    private void regresarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarsActionPerformed
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
        if (reg == 1 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
            t.stop();
            int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el nivel\nsi regresa al menú.\n\n¿Deseas Continuar?", "Pares",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon(getClass().getResource("/pares/pares/pick/regreG.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            inicio.play();
            if (seleccion == 0) {
                t.removeActionListener(acciones);
                paresC.stop();
                metodo();
            } else {
                t.start();
            }
        }
        if (reg == 0 && gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
            int seleccion = JOptionPane.showConfirmDialog(null, " Se perdera el nivel\nsi regresa al menú.\n\n¿Deseas Continuar?", "Pares", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon(getClass().getResource("/pares/pares/pick/regreG.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            inicio.play();
            if (seleccion == 0) {
                metodo();
            }
        }
        if ((reg == 1 && gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                || (reg == 1 && gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                || (reg == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0)
                || (reg == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0)
                || (reg == 1 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1)) {
            t.stop();
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Pares", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon(getClass().getResource("/pares/pares/pick/regreG.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            inicio.play();
            if (seleccion == 0) {
                t.removeActionListener(acciones);
                paresC.stop();
                metodo();
            } else {
                t.start();
            }
        }
        if ((reg == 0 && gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                || (reg == 0 && gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0)
                || (reg == 0 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0)
                || (reg == 0 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0)
                || (reg == 0 && gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1)) {
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Pares",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon(getClass().getResource("/pares/pares/pick/regreG.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            inicio.play();
            if (seleccion == 0) {
                metodo();
            }
        }
    }//GEN-LAST:event_regresarsActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        controlMActionPerformed(evt);
    }//GEN-LAST:event_btnPlayActionPerformed

    private void controlMMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controlMMouseMoved
        controlM.setCursor(new Cursor(12));
    }//GEN-LAST:event_controlMMouseMoved

    private void controlMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlMActionPerformed
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
        if (play == 1) {
            btnPlay.setText("Iniciar Musica");
            btnPlay.setIcon(new ImageIcon(getClass().getResource("/pares/mas/play1.png")));
            controlM.setBackground(Color.green);
            controlM.setToolTipText("Iniciar");
            controlM.setIcon(new ImageIcon(getClass().getResource("/pares/mas/play.png")));
            paresC.stop();
            play = 0;
        } else {
            btnPlay.setText("Detener Musica");
            btnPlay.setIcon(new ImageIcon(getClass().getResource("/pares/mas/stop1.png")));
            controlM.setBackground(Color.red);
            controlM.setToolTipText("Detener");
            controlM.setIcon(new ImageIcon(getClass().getResource("/pares/mas/stop.png")));
            paresC.play();
            play = 1;
        }
    }//GEN-LAST:event_controlMActionPerformed
    void metodo() {
        if (gana2 == 0 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
            perdio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/fallo.wav"));
            perdio.play();
            JOptionPane.showMessageDialog(null, "¡ Nivel No Superado !", "Pares",
                    0, new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/trist.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            inicio.play();
            this.dispose();
            InicioP ip = new InicioP();
            ip.llenarMenu1();
            ip.setVisible(true);
        }
        if (gana2 == 1 && gana3 == 0 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
            this.dispose();
            InicioP ip = new InicioP();
            ip.llenarMenu2();
            ip.setVisible(true);
        }
        if (gana2 == 1 && gana3 == 1 && gana4 == 0 && gana5 == 0 && gana6 == 0) {
            this.dispose();
            InicioP ip = new InicioP();
            ip.llenarMenu3();
            ip.setVisible(true);
        }
        if (gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 0 && gana6 == 0) {
            this.dispose();
            InicioP ip = new InicioP();
            ip.llenarMenu4();
            ip.setVisible(true);
        }
        if (gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 0) {
            this.dispose();
            InicioP ip = new InicioP();
            ip.llenarMenu5();
            ip.setVisible(true);
        }
        if (gana2 == 1 && gana3 == 1 && gana4 == 1 && gana5 == 1 && gana6 == 1) {
            this.dispose();
            InicioP ip = new InicioP();
            ip.llenarMenu6();
            ip.setVisible(true);
        }
    }

    private void close() {
        if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Pares", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            audio1.play();
            System.exit(0);
        } else {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            audio1.play();
            t.start();
            setDefaultCloseOperation(0);
        }
    }

    private void close1() {
        if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Pares", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            audio1.play();
            System.exit(0);
        } else {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            audio1.play();
            setDefaultCloseOperation(0);
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
            java.util.logging.Logger.getLogger(Pares2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pares2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pares2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pares2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pares2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC1;
    private javax.swing.JButton btnC10;
    private javax.swing.JButton btnC11;
    private javax.swing.JButton btnC12;
    private javax.swing.JButton btnC13;
    private javax.swing.JButton btnC14;
    private javax.swing.JButton btnC15;
    private javax.swing.JButton btnC16;
    private javax.swing.JButton btnC17;
    private javax.swing.JButton btnC18;
    private javax.swing.JButton btnC2;
    private javax.swing.JButton btnC3;
    private javax.swing.JButton btnC4;
    private javax.swing.JButton btnC5;
    private javax.swing.JButton btnC6;
    private javax.swing.JButton btnC7;
    private javax.swing.JButton btnC8;
    private javax.swing.JButton btnC9;
    private javax.swing.JMenuItem btnPlay;
    private org.edisoncor.gui.button.ButtonIcon controlM;
    private org.edisoncor.gui.label.LabelRound etiquetaTiempo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private javax.swing.JMenuItem regresars;
    private javax.swing.JMenuItem reiniciar;
    // End of variables declaration//GEN-END:variables
}
