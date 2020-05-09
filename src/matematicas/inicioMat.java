/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.List;
import static java.awt.SystemColor.menu;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.edisoncor.gui.util.Avatar;

/**
 *
 * @author Rojeru San
 */
public class inicioMat extends javax.swing.JFrame {

    /**
     * Creates new form inicioMat
     */
    AudioClip inicio, victoria, perdio, audio1;

    public inicioMat() {
        initComponents();
        setTitle("CHILDREN'S GAME - MATEMÁTICAS");
        setIconImage(new ImageIcon(getClass().getResource("/principal/logoM.png")).getImage());
        setSize(1100, 600);
        setLocationRelativeTo(null);
        llenarMenu();
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    public void llenarMenu() {
        java.util.List<Avatar> avatars = new ArrayList<Avatar>();
        avatars.add(new Avatar("Números", loadImage("/matematicas/tablas/num.png")));
        avatars.add(new Avatar("Tablas", loadImage("/matematicas/tablas/tab.png")));
        avatars.add(new Avatar("Ejercicios 1", loadImage("/matematicas/tablas/e1.png")));
        avatars.add(new Avatar("Ejercicios 2", loadImage("/matematicas/tablas/e2.png")));
        av.setAvatars(avatars);
    }

    public static Image loadImage(String fileName) {
        try {
            return ImageIO.read(inicioMat.class.getResource(fileName));
        } catch (Exception e) {
            return null;
        }
    }

    public void llamarMenu() {
        if (av.getSelectedtitulo().equals("Números")) {
            this.dispose();
            new Numeros().setVisible(true);
        }
        if (av.getSelectedtitulo().equals("Tablas")) {
            this.dispose();
            new Tablas().setVisible(true);
        }
        if (av.getSelectedtitulo().equals("Ejercicios 1")) {
            this.dispose();
            new Sumas().setVisible(true);
        }
        if (av.getSelectedtitulo().equals("Ejercicios 2")) {
            this.dispose();
            new Restas().setVisible(true);
        }
    }

    void resultado(double res, double contc, double conti) {
        double redondeo = Math.rint((contc * 10) / 9);
        if (redondeo >= 6) {
            victoria = java.applet.Applet.newAudioClip(getClass().getResource("/matematicas/completa1.wav"));
            victoria.play();
            JOptionPane.showMessageDialog(null, "Respuestas correctas: " + contc + "\nRespuestas incorrectas: " + conti + ""
                    + "\n\nResultado: " + res + "\nRedondeando......\nCalificación: " + redondeo + "\n\n              ¡ FELICIDADES !", "Matemáticas", 0,
                    new javax.swing.ImageIcon(getClass().getResource("/matematicas/bi.png")));
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            audio1.play();
            victoria.stop();
        } else {
            perdio = java.applet.Applet.newAudioClip(getClass().getResource("/ahorcado/tonos/fallo.wav"));
            perdio.play();
            JOptionPane.showMessageDialog(null, "Respuestas correctas: " + contc + "\nRespuestas incorrectas: " + conti + ""
                    + "\n\nResultado = " + res + "\nRedondeando......\nCalificación: " + redondeo + "\n\n             ¡ NO SUPERADO !", "Matemáticas", 0,
                    new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            audio1.play();
            perdio.stop();
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
        regresa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        av.setColorPrimario(new java.awt.Color(204, 204, 0));
        av.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/numer.jpg"))); // NOI18N
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

        labelMetric1.setText("¡¡¡ E L I G E   U N A   O P C I Ó N !!!");
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
                .addGap(31, 31, 31)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelCurves1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pares/pares/inicioP.png"))); // NOI18N
        jMenu3.setText("Inicio");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

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

    private void acMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acMouseMoved
        ac.setCursor(new Cursor(12));
    }//GEN-LAST:event_acMouseMoved

    private void acMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acMouseClicked
        audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        audio1.play();
        llamarMenu();
    }//GEN-LAST:event_acMouseClicked

    private void avKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_avKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
            audio1.play();
            llamarMenu();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_LEFT || evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
                audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
                audio1.play();
            } else {
                Toolkit.getDefaultToolkit().beep();
            }

        }
    }//GEN-LAST:event_avKeyPressed

    private void regresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresaActionPerformed
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
        regres();
    }//GEN-LAST:event_regresaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/gato/2.mp3"));
        audio1.play();
        if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Matemáticas", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/gato/2.mp3"));
            audio1.play();
            System.exit(0);
        } else {
            audio1 = java.applet.Applet.newAudioClip(getClass().getResource("/gato/2.mp3"));
            audio1.play();
            setDefaultCloseOperation(0);
        }
    }//GEN-LAST:event_formWindowClosing
    private void regres() {
        int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú principal?",
                "Matemáticas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                new javax.swing.ImageIcon(getClass().getResource("/pares/mas/inicio1.png")));
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
        if (seleccion == 0) {
            this.dispose();
            new principal.Ventana().setVisible(true);
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
            java.util.logging.Logger.getLogger(inicioMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioMat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioMat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIpod ac;
    private org.edisoncor.gui.panel.PanelAvatarChooser av;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private org.edisoncor.gui.label.LabelMetric labelMetric1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves1;
    private org.edisoncor.gui.panel.PanelImage panelImage3;
    private javax.swing.JMenuItem regresa;
    // End of variables declaration//GEN-END:variables
}
