/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pares.pares;

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

/**
 *
 * @author Rojeru San
 */
public class InicioP extends javax.swing.JFrame {

    int dsbl = 0, dsbl1 = 0, dsbl2 = 0, dsbl3 = 0, dsbl4 = 0, dsbl5 = 0;
    int ganas1 = 0, ganas2 = 0, ganas3 = 0, ganas4 = 0, ganas5 = 0, ganas6 = 0;
    AudioClip inicio, audio1;

    /**
     * Creates new form InicioP
     */
    public InicioP() {
        initComponents();
        setTitle("CHILDREN'S GAME - PARES");
        setIconImage(new ImageIcon(getClass().getResource("/principal/logoM.png")).getImage());
        setSize(1100, 600);
        setLocationRelativeTo(null);
        llenarMenu();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    public void llenarMenu() {
        java.util.List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Nivel 1", loadImage("/pares/pares/pick/desb.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/pares/pares/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/pares/pares/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/pares/pares/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/pares/pares/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/pares/pares/pick/bloq.png")));
        av.setAvatars(avatars);
    }

    public void llenarMenu1() {
        ganas1 = 1;

        dsbl = 1;
        java.util.List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Nivel 1", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/pares/pares/pick/desb.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/pares/pares/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/pares/pares/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/pares/pares/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/pares/pares/pick/bloq.png")));
        av.setAvatars(avatars);
    }

    public void llenarMenu2() {
        ganas1 = 1;
        ganas2 = 1;

        dsbl = 1;
        dsbl1 = 1;
        java.util.List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Nivel 1", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/pares/pares/pick/desb.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/pares/pares/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/pares/pares/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/pares/pares/pick/bloq.png")));
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
        avatars.add(new Avatar("Nivel 1", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/pares/pares/pick/desb.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/pares/pares/pick/bloq.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/pares/pares/pick/bloq.png")));
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
        avatars.add(new Avatar("Nivel 1", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/pares/pares/pick/desb.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/pares/pares/pick/bloq.png")));
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
        avatars.add(new Avatar("Nivel 1", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/pares/pares/pick/desb.png")));
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
        avatars.add(new Avatar("Nivel 1", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 2", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 3", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 4", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 5", loadImage("/pares/pares/pick/desbS.png")));
        avatars.add(new Avatar("Nivel 6", loadImage("/pares/pares/pick/desbS.png")));
        av.setAvatars(avatars);
    }

    public static Image loadImage(String fileName) {
        try {
            return ImageIO.read(InicioP.class.getResource(fileName));
        } catch (Exception e) {
            return null;
        }
    }

    public void llamarMenuc() {

        if (av.getSelectedtitulo().equals("Nivel 1")) {
            if (dsbl == 0) {
                this.dispose();
                Pares1 p1 = new Pares1();
                p1.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 0 && ganas3 == 0 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                this.dispose();
                Pares1 p1 = new Pares1();
                p1.gana1 = 1;
                p1.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 0 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                this.dispose();
                Pares1 p1 = new Pares1();
                p1.gana1 = 1;
                p1.gana2 = 1;
                p1.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                this.dispose();
                Pares1 p1 = new Pares1();
                p1.gana1 = 1;
                p1.gana2 = 1;
                p1.gana3 = 1;
                p1.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 0 && ganas6 == 0) {
                this.dispose();
                Pares1 p1 = new Pares1();
                p1.gana1 = 1;
                p1.gana2 = 1;
                p1.gana3 = 1;
                p1.gana4 = 1;
                p1.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 0) {
                this.dispose();
                Pares1 p1 = new Pares1();
                p1.gana1 = 1;
                p1.gana2 = 1;
                p1.gana3 = 1;
                p1.gana4 = 1;
                p1.gana5 = 1;
                p1.setVisible(true);
            }
            if (dsbl == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                this.dispose();
                Pares1 p1 = new Pares1();
                p1.gana1 = 1;
                p1.gana2 = 1;
                p1.gana3 = 1;
                p1.gana4 = 1;
                p1.gana5 = 1;
                p1.gana6 = 1;
                p1.setVisible(true);
            }
        }
        if (av.getSelectedtitulo().equals("Nivel 2")) {
            if (dsbl == 0) {
                JOptionPane.showMessageDialog(null, "¡ Nivel Bloqueado !", "Pares",
                        0, new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/bloqM.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
                inicio.play();
            } else {
                if (dsbl1 == 0) {
                    this.dispose();
                    Pares2 p2 = new Pares2();
                    p2.setVisible(true);
                }
                if (dsbl1 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 0 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Pares2 p2 = new Pares2();
                    p2.gana2 = 1;
                    p2.setVisible(true);
                }
                if (dsbl1 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Pares2 p2 = new Pares2();
                    p2.gana2 = 1;
                    p2.gana3 = 1;
                    p2.setVisible(true);
                }
                if (dsbl1 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Pares2 p2 = new Pares2();
                    p2.gana2 = 1;
                    p2.gana3 = 1;
                    p2.gana4 = 1;
                    p2.setVisible(true);
                }
                if (dsbl1 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 0) {
                    this.dispose();
                    Pares2 p2 = new Pares2();
                    p2.gana2 = 1;
                    p2.gana3 = 1;
                    p2.gana4 = 1;
                    p2.gana5 = 1;
                    p2.setVisible(true);
                }
                if (dsbl1 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                    this.dispose();
                    Pares2 p2 = new Pares2();
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
                JOptionPane.showMessageDialog(null, "¡ Nivel Bloqueado !", "Pares",
                        0, new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/bloqM.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
                inicio.play();
            } else {
                if (dsbl2 == 0) {
                    this.dispose();
                    Pares3 p3 = new Pares3();
                    p3.setVisible(true);
                }
                if (dsbl2 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 0 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Pares3 p3 = new Pares3();;
                    p3.gana3 = 1;
                    p3.setVisible(true);
                }
                if (dsbl2 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Pares3 p3 = new Pares3();
                    p3.gana3 = 1;
                    p3.gana4 = 1;
                    p3.setVisible(true);
                }
                if (dsbl2 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 0) {
                    this.dispose();
                    Pares3 p3 = new Pares3();
                    p3.gana3 = 1;
                    p3.gana4 = 1;
                    p3.gana5 = 1;
                    p3.setVisible(true);
                }
                if (dsbl2 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                    this.dispose();
                    Pares3 p3 = new Pares3();
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
                JOptionPane.showMessageDialog(null, "¡ Nivel Bloqueado !", "Pares",
                        0, new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/bloqM.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
                inicio.play();
            } else {
                if (dsbl3 == 0) {
                    this.dispose();
                    Pares4 p4 = new Pares4();
                    p4.setVisible(true);
                }
                if (dsbl3 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 0 && ganas6 == 0) {
                    this.dispose();
                    Pares4 p4 = new Pares4();
                    p4.gana4 = 1;
                    p4.setVisible(true);
                }
                if (dsbl3 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 0) {
                    this.dispose();
                    Pares4 p4 = new Pares4();
                    p4.gana4 = 1;
                    p4.gana5 = 1;
                    p4.setVisible(true);
                }
                if (dsbl3 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                    this.dispose();
                    Pares4 p4 = new Pares4();
                    p4.gana4 = 1;
                    p4.gana5 = 1;
                    p4.gana6 = 1;
                    p4.setVisible(true);
                }
            }
        }
        if (av.getSelectedtitulo().equals("Nivel 5")) {
            if (dsbl3 == 0) {
                JOptionPane.showMessageDialog(null, "¡ Nivel Bloqueado !", "Pares",
                        0, new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/bloqM.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
                inicio.play();
            } else {
                if (dsbl4 == 0) {
                    this.dispose();
                    Pares5 p5 = new Pares5();
                    p5.setVisible(true);
                }
                if (dsbl4 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 0) {
                    this.dispose();
                    Pares5 p5 = new Pares5();
                    p5.gana5 = 1;
                    p5.setVisible(true);
                }
                if (dsbl4 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                    this.dispose();
                    Pares5 p5 = new Pares5();
                    p5.gana5 = 1;
                    p5.gana6 = 1;
                    p5.setVisible(true);
                }
            }
        }
        if (av.getSelectedtitulo().equals("Nivel 6")) {
            if (dsbl4 == 0) {
                JOptionPane.showMessageDialog(null, "¡ Nivel Bloqueado !", "Pares",
                        0, new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/bloqM.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
                inicio.play();
            } else {
                if (dsbl5 == 0) {
                    this.dispose();
                    Pares6 p6 = new Pares6();
                    p6.setVisible(true);
                }
                if (dsbl5 == 1 && ganas1 == 1 && ganas2 == 1 && ganas3 == 1 && ganas4 == 1 && ganas5 == 1 && ganas6 == 1) {
                    this.dispose();
                    Pares6 p6 = new Pares6();
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
        labelMetric1 = new org.edisoncor.gui.label.LabelMetric();
        panelCurves1 = new org.edisoncor.gui.panel.PanelCurves();
        panelImage3 = new org.edisoncor.gui.panel.PanelImage();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        regresa = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        av.setColorPrimario(new java.awt.Color(204, 204, 0));
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

        labelMetric1.setText("¡¡¡ Desbloquea Todos Los Niveles !!!");
        labelMetric1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N

        panelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/logoM.png"))); // NOI18N

        javax.swing.GroupLayout panelImage3Layout = new javax.swing.GroupLayout(panelImage3);
        panelImage3.setLayout(panelImage3Layout);
        panelImage3Layout.setHorizontalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );
        panelImage3Layout.setVerticalGroup(
            panelImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 53, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout avLayout = new javax.swing.GroupLayout(av);
        av.setLayout(avLayout);
        avLayout.setHorizontalGroup(
            avLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(avLayout.createSequentialGroup()
                .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
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
                    .addComponent(panelImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ac, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/inicioP.png"))); // NOI18N
        jMenu3.setText("Inicio");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/reiniciar.png"))); // NOI18N
        jMenuItem1.setText("Reiniciar Niveles");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        regresa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        regresa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/mas/inicio2.png"))); // NOI18N
        regresa.setText("Menú Principal");
        regresa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresaActionPerformed(evt);
            }
        });
        jMenu3.add(regresa);

        jMenuBar2.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/mas/mas.png"))); // NOI18N
        jMenu4.setText("Más");
        jMenu4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/mas/in.png"))); // NOI18N
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
        audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        audio1.play();
        close();
    }//GEN-LAST:event_formWindowClosing

    private void avKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_avKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            audio1.play();
            llamarMenuc();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
                audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
                audio1.play();
            } else {
                Toolkit.getDefaultToolkit().beep();
            }

        }
    }//GEN-LAST:event_avKeyPressed

    private void acMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acMouseClicked
        audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        audio1.play();
        llamarMenuc();
    }//GEN-LAST:event_acMouseClicked

    private void acMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acMouseMoved
        ac.setCursor(new Cursor(12));
    }//GEN-LAST:event_acMouseMoved

    private void regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresaActionPerformed
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
        regres();
    }//GEN-LAST:event_regresaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
        if (dsbl == 1 || dsbl1 == 1 || dsbl2 == 1 || dsbl3 == 1 || dsbl4 == 1 || dsbl5 == 1) {
            int seleccion = JOptionPane.showConfirmDialog(null, "Se perderan los niveles superados.\n          ¿Reiniciar Niveles?",
                "Pares", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/reiG.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            inicio.play();
            if (seleccion == 0) {
                this.dispose();
                new InicioP().setVisible(true);
                JOptionPane.showMessageDialog(null, "¡ Reinicio Exitoso !", "Pares",
                    0, new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/reiG.png")));
                inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
                inicio.play();
            }
        } else {
            JOptionPane.showMessageDialog(null, "¡ No hay niveles superados !", "Pares", 0,
                new javax.swing.ImageIcon(getClass().getResource("/pares/pares/pick/desbSM.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            inicio.play();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
        JOptionPane.showMessageDialog(null, "\n"
            + "Este juego consta de 6 niveles, lo que se\n"
            + "tiene que hacer aquí es encontrar todos los\n"
            + "pares en el tiempo que se pide para ir desblo-\n"
            + "queando los niveles.\n\n"
            + "Cada nivel tiene imágenes diferentes y no siem-\n"
            + "pre estan en la misma posición. La dificultad\n"
            + "del juego consiste en el tiempo, ya que cada que\n"
            + "vas avanzando de nivel, el tiempo que se te da para\n"
            + "encontrar todos los pares va disminuyendo.\n\n"
            + "                          !!! MUCHA SUERTE ¡¡¡", "Información",
            0, new javax.swing.ImageIcon(getClass().getResource("/principal/logoM.png")));
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    private void regres() {
        if (dsbl == 1 || dsbl1 == 1 || dsbl2 == 1 || dsbl3 == 1 || dsbl4 == 1 || dsbl5 == 1) {
            int seleccion = JOptionPane.showConfirmDialog(null, "Se perderan los niveles superados.\n    ¿Regresar al menú principal?",
                    "Pares", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    new javax.swing.ImageIcon(getClass().getResource("/pares/mas/inicio1.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            inicio.play();
            if (seleccion == 0) {
                this.dispose();
                new principal.Ventana().setVisible(true);
            }
        } else {
            int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú principal?",
                    "Pares", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    new javax.swing.ImageIcon(getClass().getResource("/pares/mas/inicio1.png")));
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            inicio.play();
            if (seleccion == 0) {
                this.dispose();
                new principal.Ventana().setVisible(true);
            }
        }
    }

    private void close() {
        if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Pares", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            audio1.play();
            System.exit(0);
        } else {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/pares/tonos/2.mp3"));
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
            java.util.logging.Logger.getLogger(InicioP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioP.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod ac;
    private org.edisoncor.gui.panel.PanelAvatarChooser av;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private javax.swing.JMenuItem regresa;
    // End of variables declaration//GEN-END:variables

}
