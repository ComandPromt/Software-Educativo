/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rompecabezas.rompecabezas;

import java.applet.AudioClip;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.edisoncor.gui.util.Avatar;
import principal.Ventana;

/**
 *
 * @author Rojeru San
 */
public class InicioR extends javax.swing.JFrame {

    int dsbl = 0, dsbl1 = 0, dsbl2 = 0, dsbl3 = 0, dsbl4 = 0, dsbl5 = 0;
    int ganas1 = 0, ganas2 = 0, ganas3 = 0, ganas4 = 0, ganas5 = 0, ganas6 = 0;
    AudioClip inicio, audio1, fondM;

    /**
     * Creates new form InicioP
     */
    public InicioR() {
        initComponents();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setTitle("CHILDREN'S GAME - ROMPECABEZAS");
        setIconImage(new ImageIcon(getClass().getResource("/principal/logoM.png")).getImage());
        setSize(1100, 600);
        setLocationRelativeTo(null);
        llenarMenu();

    }

    public void llenarMenu() {
        java.util.List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Nivel 1", loadImage("/rompecabezas/rompecabezas/inicio/a.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        av.setAvatars(avatars);
    }

    public void llenarMenu1() {
        ganas1 = 1;

        dsbl = 1;
        java.util.List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Nivel 1", loadImage("/rompecabezas/rompecabezas/inicio/a1.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/rompecabezas/rompecabezas/inicio/b.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        av.setAvatars(avatars);
    }

    public void llenarMenu2() {
        ganas1 = 1;
        ganas2 = 1;

        dsbl = 1;
        dsbl1 = 1;
        java.util.List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Nivel 1", loadImage("/rompecabezas/rompecabezas/inicio/a1.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/rompecabezas/rompecabezas/inicio/b1.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/rompecabezas/rompecabezas/inicio/c.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        av.setAvatars(avatars);
    }

    public void llenarMenu3() {
        ganas1 = 1;
        ganas2 = 1;
        ganas3 = 1;

        dsbl = 1;
        dsbl1 = 1;
        dsbl2 = 1;
        java.util.List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Nivel 1", loadImage("/rompecabezas/rompecabezas/inicio/a1.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/rompecabezas/rompecabezas/inicio/b1.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/rompecabezas/rompecabezas/inicio/c1.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/rompecabezas/rompecabezas/inicio/d.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        av.setAvatars(avatars);
    }

    public void llenarMenu4() {
        ganas1 = 1;
        ganas2 = 1;
        ganas3 = 1;
        ganas4 = 1;

        dsbl = 1;
        dsbl1 = 1;
        dsbl2 = 1;
        dsbl3 = 1;
        java.util.List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Nivel 1", loadImage("/rompecabezas/rompecabezas/inicio/a1.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/rompecabezas/rompecabezas/inicio/b1.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/rompecabezas/rompecabezas/inicio/c1.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/rompecabezas/rompecabezas/inicio/d1.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/rompecabezas/rompecabezas/inicio/e.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/rompecabezas/rompecabezas/pick/bloq.png")));
        av.setAvatars(avatars);
    }

    public void llenarMenu5() {
        ganas1 = 1;
        ganas2 = 1;
        ganas3 = 1;
        ganas4 = 1;
        ganas5 = 1;

        dsbl = 1;
        dsbl1 = 1;
        dsbl2 = 1;
        dsbl3 = 1;
        dsbl4 = 1;
        java.util.List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Nivel 1", loadImage("/rompecabezas/rompecabezas/inicio/a1.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/rompecabezas/rompecabezas/inicio/b1.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/rompecabezas/rompecabezas/inicio/c1.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/rompecabezas/rompecabezas/inicio/d1.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/rompecabezas/rompecabezas/inicio/e1.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/rompecabezas/rompecabezas/inicio/f.png")));
        av.setAvatars(avatars);
    }

    public void llenarMenu6() {
        ganas1 = 1;
        ganas2 = 1;
        ganas3 = 1;
        ganas4 = 1;
        ganas5 = 1;
        ganas6 = 1;

        dsbl = 1;
        dsbl1 = 1;
        dsbl2 = 1;
        dsbl3 = 1;
        dsbl4 = 1;
        dsbl5 = 1;
        java.util.List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Nivel 1", loadImage("/rompecabezas/rompecabezas/inicio/a1.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/rompecabezas/rompecabezas/inicio/b1.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/rompecabezas/rompecabezas/inicio/c1.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/rompecabezas/rompecabezas/inicio/d1.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/rompecabezas/rompecabezas/inicio/e1.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/rompecabezas/rompecabezas/inicio/f1.png")));
        av.setAvatars(avatars);
    }

    public static Image loadImage(String fileName) {
        try {
            return ImageIO.read(InicioR.class.getResource(fileName));
        } catch (Exception e) {
            return null;
        }
    }

    public void llamarMenuc() {

        if (av.getSelectedtitulo().equals("Nivel 1")) {
            if (dsbl == 0) {
                this.dispose();
                Puzzle3 p1 = new Puzzle3();
                p1.j1 = 1;
                p1.vis1(1);
                p1.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 0 && ganas3 == 0 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                this.dispose();
                Puzzle3 p2 = new Puzzle3();
                p2.j1 = 1;
                p2.vis1(1);
                p2.gana1 = 1;
                p2.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 0 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                this.dispose();
                Puzzle3 p3 = new Puzzle3();
                p3.j1 = 1;
                p3.vis1(1);
                p3.gana1 = 1;
                p3.gana2 = 1;
                p3.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                this.dispose();
                Puzzle3 p4 = new Puzzle3();
                p4.j1 = 1;
                p4.vis1(1);
                p4.gana1 = 1;
                p4.gana2 = 1;
                p4.gana3 = 1;
                p4.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 0 && ganas6 == 0) {
                this.dispose();
                Puzzle3 p5 = new Puzzle3();
                p5.j1 = 1;
                p5.vis1(1);
                p5.gana1 = 1;
                p5.gana2 = 1;
                p5.gana3 = 1;
                p5.gana4 = 1;
                p5.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 0) {
                this.dispose();
                Puzzle3 p6 = new Puzzle3();
                p6.j1 = 1;
                p6.vis1(1);
                p6.gana1 = 1;
                p6.gana2 = 1;
                p6.gana3 = 1;
                p6.gana4 = 1;
                p6.gana5 = 1;
                p6.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                this.dispose();
                Puzzle3 p6 = new Puzzle3();
                p6.j1 = 1;
                p6.vis1(1);
                p6.gana1 = 1;
                p6.gana2 = 1;
                p6.gana3 = 1;
                p6.gana4 = 1;
                p6.gana5 = 1;
                p6.gana6 = 1;
                p6.setVisible(true);
            }
        }
        if (av.getSelectedtitulo().equals("Nivel 2")) {
            if (dsbl == 0) {
                JOptionPane.showMessageDialog(null, "¡ Nivel Bloqueado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/bloqM.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio.play();
            } else {
                if (dsbl1 == 0) {
                    this.dispose();
                    Puzzle3 p2 = new Puzzle3();
                    p2.j1 = 2;
                    p2.vis1(2);
                    p2.setVisible(true);
                }
                if (dsbl1 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 0 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Puzzle3 p2 = new Puzzle3();
                    p2.j1 = 2;
                    p2.vis1(2);
                    p2.gana2 = 1;
                    p2.setVisible(true);
                }
                if (dsbl1 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Puzzle3 p2 = new Puzzle3();
                    p2.j1 = 2;
                    p2.vis1(2);
                    p2.gana2 = 1;
                    p2.gana3 = 1;
                    p2.setVisible(true);
                }
                if (dsbl1 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Puzzle3 p2 = new Puzzle3();
                    p2.j1 = 2;
                    p2.vis1(2);
                    p2.gana2 = 1;
                    p2.gana3 = 1;
                    p2.gana4 = 1;
                    p2.setVisible(true);
                }
                if (dsbl1 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 0) {
                    this.dispose();
                    Puzzle3 p2 = new Puzzle3();
                    p2.j1 = 2;
                    p2.vis1(2);
                    p2.gana2 = 1;
                    p2.gana3 = 1;
                    p2.gana4 = 1;
                    p2.gana5 = 1;
                    p2.setVisible(true);
                }
                if (dsbl1 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                    this.dispose();
                    Puzzle3 p2 = new Puzzle3();
                    p2.j1 = 2;
                    p2.vis1(2);
                    p2.gana2 = 1;
                    p2.gana3 = 1;
                    p2.gana4 = 1;
                    p2.gana5 = 1;
                    p2.gana6 = 1;
                    p2.setVisible(true);
                }
            }
        }
        if (av.getSelectedtitulo().equals("Nivel 3")) {
            if (dsbl1 == 0) {
                JOptionPane.showMessageDialog(null, "¡ Nivel Bloqueado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/bloqM.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio.play();
            } else {
                if (dsbl2 == 0) {
                    this.dispose();
                    Puzzle3 p3 = new Puzzle3();
                    p3.j1 = 3;
                    p3.vis1(3);
                    p3.setVisible(true);
                }
                if (dsbl2 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Puzzle3 p3 = new Puzzle3();
                    p3.j1 = 3;
                    p3.vis1(3);
                    p3.gana3 = 1;
                    p3.setVisible(true);
                }
                if (dsbl2 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Puzzle3 p3 = new Puzzle3();
                    p3.j1 = 3;
                    p3.vis1(3);
                    p3.gana3 = 1;
                    p3.gana4 = 1;
                    p3.setVisible(true);
                }
                if (dsbl2 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 0) {
                    this.dispose();
                    Puzzle3 p3 = new Puzzle3();
                    p3.j1 = 3;
                    p3.vis1(3);
                    p3.gana3 = 1;
                    p3.gana4 = 1;
                    p3.gana5 = 1;
                    p3.setVisible(true);
                }
                if (dsbl2 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                    this.dispose();
                    Puzzle3 p3 = new Puzzle3();
                    p3.j1 = 3;
                    p3.vis1(3);
                    p3.gana3 = 1;
                    p3.gana4 = 1;
                    p3.gana5 = 1;
                    p3.gana6 = 1;
                    p3.setVisible(true);
                }
            }
        }
        if (av.getSelectedtitulo().equals("Nivel 4")) {
            if (dsbl2 == 0) {
                JOptionPane.showMessageDialog(null, "¡ Nivel Bloqueado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/bloqM.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio.play();
            } else {
                if (dsbl3 == 0) {
                    this.dispose();
                    Puzzle3 p4 = new Puzzle3();
                    p4.j1 = 4;
                    p4.vis1(4);
                    p4.setVisible(true);
                }
                if (dsbl3 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Puzzle3 p4 = new Puzzle3();
                    p4.j1 = 4;
                    p4.vis1(4);
                    p4.gana4 = 1;
                    p4.setVisible(true);
                }
                if (dsbl3 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 0) {
                    this.dispose();
                    Puzzle3 p4 = new Puzzle3();
                    p4.j1 = 4;
                    p4.vis1(4);
                    p4.gana4 = 1;
                    p4.gana5 = 1;
                    p4.setVisible(true);
                }
                if (dsbl3 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                    this.dispose();
                    Puzzle3 p4 = new Puzzle3();
                    p4.j1 = 4;
                    p4.vis1(4);
                    p4.gana4 = 1;
                    p4.gana5 = 1;
                    p4.gana6 = 1;
                    p4.setVisible(true);
                }
            }
        }
        if (av.getSelectedtitulo().equals("Nivel 5")) {
            if (dsbl3 == 0) {
                JOptionPane.showMessageDialog(null, "¡ Nivel Bloqueado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rares/pick/bloqM.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio.play();
            } else {
                if (dsbl4 == 0) {
                    this.dispose();
                    Puzzle3 p5 = new Puzzle3();
                    p5.j1 = 5;
                    p5.vis1(5);
                    p5.setVisible(true);
                }
                if (dsbl4 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 0) {
                    this.dispose();
                    Puzzle3 p5 = new Puzzle3();
                    p5.j1 = 5;
                    p5.vis1(5);
                    p5.gana5 = 1;
                    p5.setVisible(true);
                }
                if (dsbl4 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                    this.dispose();
                    Puzzle3 p5 = new Puzzle3();
                    p5.j1 = 5;
                    p5.vis1(5);
                    p5.gana5 = 1;
                    p5.gana6 = 1;
                    p5.setVisible(true);
                }
            }
        }
        if (av.getSelectedtitulo().equals("Nivel 6")) {
            if (dsbl4 == 0) {
                JOptionPane.showMessageDialog(null, "¡ Nivel Bloqueado !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/bloqM.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio.play();
            } else {
                if (dsbl5 == 0) {
                    this.dispose();
                    Puzzle3 p6 = new Puzzle3();
                    p6.j1 = 6;
                    p6.vis1(6);
                    p6.setVisible(true);
                }
                if (dsbl5 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                    this.dispose();
                    Puzzle3 p6 = new Puzzle3();
                    p6.j1 = 6;
                    p6.vis1(6);
                    p6.gana6 = 1;
                    p6.setVisible(true);
                }
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

        av = new org.edisoncor.gui.panel.PanelAvatarChooser();
        ac = new org.edisoncor.gui.button.ButtonIpod();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        reiniciaN = new javax.swing.JMenuItem();
        regresa = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        av.setColorPrimario(new java.awt.Color(153, 102, 0));
        av.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                avKeyPressed(evt);
            }
        });

        ac.setText(" ");
        ac.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                acMouseMoved(evt);
            }
        });
        ac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acMouseClicked(evt);
            }
        });

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

        labelMetric1.setText("¡¡¡ Desbloquea Todos Los Niveles !!!");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        javax.swing.GroupLayout avLayout = new javax.swing.GroupLayout(av);
        av.setLayout(avLayout);
        avLayout.setHorizontalGroup(
            avLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avLayout.createSequentialGroup()
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panelCurves1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, avLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        avLayout.setVerticalGroup(
            avLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avLayout.createSequentialGroup()
                .addGroup(avLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelMetric1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/iniR.png"))); // NOI18N
        jMenu3.setText("Inicio");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        reiniciaN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        reiniciaN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reiniciaN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/reiniciar.png"))); // NOI18N
        reiniciaN.setText("Reiniciar Niveles");
        reiniciaN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reiniciaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciaNActionPerformed(evt);
            }
        });
        jMenu3.add(reiniciaN);

        regresa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        regresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/mas/inicio2.png"))); // NOI18N
        regresa.setText("Menú Principal");
        regresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresaActionPerformed(evt);
            }
        });
        jMenu3.add(regresa);

        jMenuBar2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/mas/mas.png"))); // NOI18N
        jMenu4.setText("Más");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/mas/in.png"))); // NOI18N
        jMenuItem2.setText("Inf. del juego");
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(av, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(av, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
        audio1.play();
        close();
    }//GEN-LAST:event_formWindowClosing

    private void avKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_avKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            audio1.play();
            llamarMenuc();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
                audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                audio1.play();
            }
        }
    }//GEN-LAST:event_avKeyPressed

    private void acMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acMouseClicked
        audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
        audio1.play();
        llamarMenuc();
    }//GEN-LAST:event_acMouseClicked

    private void acMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acMouseMoved
        ac.setCursor(new Cursor(12));
    }//GEN-LAST:event_acMouseMoved

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
        inicio.play();
        JOptionPane.showMessageDialog(null, "\n"
                + "Lo que se tiene que hacer en este juego es formar la imagen\n"
                + "a tiempo, para formar la imagen que esta descompuesta te puedes\n"
                + "basar en la que esta formada.\n\n"
                + "Este juego consta de 6 nivele que se tienen que ir desbloqueando,\n"
                + "en los primeros 3 niveles la imagen esta descompuesta en 3x3 y\n"
                + "en los niveles 4, 5 y 6 la imagen esta descompuesta en 4x4 con\n"
                + "un tiempo determinado que se te da para que logres formar la imagen.\n"
                + "\n"
                + "A la pieza de color blanco que contiene el logo del ITSC se le llama\n"
                + "casilla vacia, esta casilla es la que puedes mover hacia arriba,\n"
                + "abajo, a la derecha, izquierda y en diagonal, solo se puede mover a una\n"
                + "casilla por cada movimiento. En caso de que el tiempo términe antes\n"
                + "de formar la imagen puedes volver a reiniciar el nivel, si logras\n"
                + "formar la imagen a tiempo se desbloqueará un nuevo nivel.\n"
                + "\n\n"
                + "                                     !!! MUCHA SUERTE ¡¡¡", "Información",
                0, new javax.swing.ImageIcon(getClass().getResource("/principal/logoM.png")));
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void reiniciaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciaNActionPerformed
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
        inicio.play();
        if (dsbl == 1 || dsbl1 == 1 || dsbl2 == 1 || dsbl3 == 1 || dsbl4 == 1 || dsbl5 == 1) {
            int seleccion = JOptionPane.showConfirmDialog(null, "Se perderan los niveles superados.\n          ¿Reiniciar Niveles?",
                    "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/reiG.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio.play();
            if (seleccion == 0) {
                this.dispose();
                new InicioR().setVisible(true);
                JOptionPane.showMessageDialog(null, "¡ Reinicio Exitoso !", "Rompecabezas",
                        0, new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/reiG.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
                inicio.play();
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡ No hay niveles superados !", "Rompecabezas", 0,
                    new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/rompecabezas/pick/desbSM.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio.play();
        }
    }//GEN-LAST:event_reiniciaNActionPerformed

    private void regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresaActionPerformed
        regres();
    }//GEN-LAST:event_regresaActionPerformed

    private void regres() {
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
        inicio.play();
        if (dsbl == 1 || dsbl1 == 1 || dsbl2 == 1 || dsbl3 == 1 || dsbl4 == 1 || dsbl5 == 1) {
            int seleccion = JOptionPane.showConfirmDialog(null, "Se perderan los niveles superados.\n    ¿Regresar al menú principal?",
                    "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/mas/inicio1.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio.play();
            if (seleccion == 0) {
                this.dispose();
                new Ventana().setVisible(true);
            }
        } else {
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú principal?",
                    "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    new javax.swing.ImageIcon(getClass().getResource("/rompecabezas/mas/inicio1.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            inicio.play();
            if (seleccion == 0) {
                this.dispose();
                new Ventana().setVisible(true);
            }
        }
    }
    private void close() {
        if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Rompecabezas", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
            audio1.play();
            System.exit(0);
        } else {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/rompecabezas/tonos/2.mp3"));
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
            java.util.logging.Logger.getLogger(InicioR.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioR.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioR.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioR.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod ac;
    private org.edisoncor.gui.panel.PanelAvatarChooser av;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JMenuItem regresa;
    private javax.swing.JMenuItem reiniciaN;
    // End of variables declaration//GEN-END:variables

}
