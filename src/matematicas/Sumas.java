/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

import static java.applet.Applet.newAudioClip;
import java.applet.AudioClip;
import static java.awt.EventQueue.invokeLater;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;

/**
 *
 * @author Rojeru San
 */
public class Sumas extends javax.swing.JFrame {

    AudioClip audio, inicio;
    double res, contc = 0, conti = 0;
    int correcto = 0, clic1 = 0, clic2 = 0, clic3 = 0, sig = 0;

    /**
     * Creates new form Sumas
     */
    public Sumas() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/principal/logoM.png")).getImage());
        setLocationRelativeTo(null);
        setResizable(false);
        bloqLinea2();
        bloqLinea3();
        next.setEnabled(false);
        l1p1.setText("");
        l2p2.setText("");
        l3p3.setText("");
    }

    void limPiar() {
        opA.setSelected(false);
        opB.setSelected(false);
        opC.setSelected(false);
        opD.setSelected(false);

        opA2.setSelected(false);
        opB2.setSelected(false);
        opC2.setSelected(false);
        opD2.setSelected(false);

        opA3.setSelected(false);
        opB3.setSelected(false);
        opC3.setSelected(false);
        opD3.setSelected(false);
    }

    void bloqLinea1() {
        opA.setEnabled(false);
        opB.setEnabled(false);
        opC.setEnabled(false);
        opD.setEnabled(false);
    }

    void bloqLinea2() {
        opA2.setEnabled(false);
        opB2.setEnabled(false);
        opC2.setEnabled(false);
        opD2.setEnabled(false);
    }

    void bloqLinea3() {
        opA3.setEnabled(false);
        opB3.setEnabled(false);
        opC3.setEnabled(false);
        opD3.setEnabled(false);
    }

    void desBloqLinea1() {
        opA.setEnabled(true);
        opB.setEnabled(true);
        opC.setEnabled(true);
        opD.setEnabled(true);
    }

    void desBloqLinea2() {
        opA2.setEnabled(true);
        opB2.setEnabled(true);
        opC2.setEnabled(true);
        opD2.setEnabled(true);
    }

    void desBloqLinea3() {
        opA3.setEnabled(true);
        opB3.setEnabled(true);
        opC3.setEnabled(true);
        opD3.setEnabled(true);
    }

    void respuestaC1Linea1(int correcto) {
        if (correcto == 1) {
            opA.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/rc.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Correcta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/bi.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            contc++;
            String con = valueOf(contc);
            this.cor.setText(con);
        }
        if (correcto == 2) {
            opB.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 3) {
            opC.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 4) {
            opD.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
    }

    void respuestaC2Linea1(int correcto) {
        if (correcto == 1) {
            opA.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 2) {
            opB.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/rc.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Correcta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/bi.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            contc++;
            String con = valueOf(contc);
            this.cor.setText(con);
        }
        if (correcto == 3) {
            opC.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 4) {
            opD.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
    }

    void respuestaC3Linea1(int correcto) {
        if (correcto == 1) {
            opA.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 2) {
            opB.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 3) {
            opC.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 4) {
            opD.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/rc.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Correcta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/bi.png")));
            audio.stop();
            bloqLinea1();
            desBloqLinea2();
            contc++;
            String con = valueOf(contc);
            this.cor.setText(con);
        }
    }

    void respuestaC1Line2(int correcto) {
        if (correcto == 1) {
            opA2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 2) {
            opB2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 3) {
            opC2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 4) {
            opD2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/rc.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Correcta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/bi.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            contc++;
            String con = valueOf(contc);
            this.cor.setText(con);
        }
    }

    void respuestaC2Line2(int correcto) {
        if (correcto == 1) {
            opA2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 2) {
            opB2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 3) {
            opC2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/rc.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Correcta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/bi.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            contc++;
            String con = valueOf(contc);
            this.cor.setText(con);
        }
        if (correcto == 4) {
            opD2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
    }

    void respuestaC3Line2(int correcto) {
        if (correcto == 1) {
            opA2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 2) {
            opB2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
        if (correcto == 3) {
            opC2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/rc.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Correcta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/bi.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            contc++;
            String con = valueOf(contc);
            this.cor.setText(con);
        }
        if (correcto == 4) {
            opD2.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea2();
            desBloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
        }
    }

    void respuestaC1Line3(int correcto) {
        if (correcto == 1) {
            opA3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/rc.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Correcta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/bi.png")));
            audio.stop();
            bloqLinea3();
            contc++;
            String con = valueOf(contc);
            this.cor.setText(con);
            next.setEnabled(true);
        }
        if (correcto == 2) {
            opB3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
            next.setEnabled(true);
        }
        if (correcto == 3) {
            opC3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
            next.setEnabled(true);
        }
        if (correcto == 4) {
            opD3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
            next.setEnabled(true);
        }
    }

    void respuestaC2Line3(int correcto) {
        if (correcto == 1) {
            opA3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
            next.setEnabled(true);
        }
        if (correcto == 2) {
            opB3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/rc.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Correcta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/bi.png")));
            audio.stop();
            bloqLinea3();
            contc++;
            String con = valueOf(contc);
            this.cor.setText(con);
            next.setEnabled(true);
        }
        if (correcto == 3) {
            opC3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
            next.setEnabled(true);
        }
        if (correcto == 4) {
            opD3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
            next.setEnabled(true);
        }
    }

    void respuestaC3Line3(int correcto) {
        if (correcto == 1) {
            opA3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
            res = (contc * 10) / 9;
            inicioMat m = new inicioMat();
            m.resultado(res, contc, conti);
            dispose();
            m.setVisible(true);
        }
        if (correcto == 2) {
            opB3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
            res = (contc * 10) / 9;
            inicioMat m = new inicioMat();
            m.resultado(res, contc, conti);
            dispose();
            m.setVisible(true);
        }
        if (correcto == 3) {
            opC3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/ri.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Incorrecta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png")));
            audio.stop();
            bloqLinea3();
            conti++;
            String con = valueOf(conti);
            this.incor.setText(con);
            res = (contc * 10) / 9;
            inicioMat m = new inicioMat();
            m.resultado(res, contc, conti);
            dispose();
            m.setVisible(true);
        }
        if (correcto == 4) {
            opD3.setSelected(true);
            audio = newAudioClip(getClass().getResource("/matematicas/rc.wav"));
            audio.play();
            showMessageDialog(null, "¡ Respuesta Correcta !", "Mensaje", 0, new javax.swing.ImageIcon(getClass().getResource("/matematicas/bi.png")));           
            audio.stop();
            bloqLinea3();
            contc++;
            String con = valueOf(contc);
            this.cor.setText(con);
            res = (contc * 10) / 9;
            inicioMat m = new inicioMat();
            m.resultado(res, contc, conti);
            dispose();
            m.setVisible(true);
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

        cuerpo = new jcMousePanel.jcMousePanel();
        jPanel3 = new javax.swing.JPanel();
        incor = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cor = new javax.swing.JLabel();
        ri = new javax.swing.JLabel();
        rc = new javax.swing.JLabel();
        linea1 = new javax.swing.JLabel();
        linea2 = new javax.swing.JLabel();
        linea3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        l1ImagenC = new javax.swing.JLabel();
        opC = new javax.swing.JCheckBox();
        opD = new javax.swing.JCheckBox();
        l1ImagenD = new javax.swing.JLabel();
        l1ImagenA = new javax.swing.JLabel();
        opA = new javax.swing.JCheckBox();
        opB = new javax.swing.JCheckBox();
        l1ImagenB = new javax.swing.JLabel();
        l2ImagenC = new javax.swing.JLabel();
        opC2 = new javax.swing.JCheckBox();
        opD2 = new javax.swing.JCheckBox();
        l2ImagenD = new javax.swing.JLabel();
        l2ImagenA = new javax.swing.JLabel();
        opA2 = new javax.swing.JCheckBox();
        opB2 = new javax.swing.JCheckBox();
        l2ImagenB = new javax.swing.JLabel();
        l3ImagenC = new javax.swing.JLabel();
        opC3 = new javax.swing.JCheckBox();
        opD3 = new javax.swing.JCheckBox();
        l3ImagenD = new javax.swing.JLabel();
        l3ImagenA = new javax.swing.JLabel();
        opA3 = new javax.swing.JCheckBox();
        opB3 = new javax.swing.JCheckBox();
        l3ImagenB = new javax.swing.JLabel();
        l3p3 = new javax.swing.JLabel();
        l1p1 = new javax.swing.JLabel();
        l2p2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        regresars = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cuerpo.setColor1(new java.awt.Color(255, 255, 255));
        cuerpo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/fondoMate1.png"))); // NOI18N
        cuerpo.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/principal/logoM.png"))); // NOI18N
        cuerpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        incor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        incor.setText("0.0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(incor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(incor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cuerpo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(749, 42, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cor.setText("0.0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cuerpo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 42, -1, -1));

        ri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/ma.png"))); // NOI18N
        cuerpo.add(ri, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 30, -1));

        rc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/bi.png"))); // NOI18N
        cuerpo.add(rc, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        linea1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linea1.setText("1.- Juan tiene 1 manzana y su mamá le regala 1, ¿cuántas manzanas tiene ahora Juan?.");
        cuerpo.add(linea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        linea2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linea2.setText("2.- Pablo tiene 1 platano pero quiere tener 2 platanos, ¿cuántos platanos le hacen falta para tener los 2?.");
        cuerpo.add(linea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        linea3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        linea3.setText("3.- Maria tiene 4 peras y Jose 2. Si Maria y Jose juntan lo que tienen, ¿cuántas peras tendrian en total?");
        cuerpo.add(linea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CONTESTA CORRECTAMENTE LO QUE SE TE PIDE... ¡¡¡ SUERTE !!!");
        cuerpo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        next.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/numeros/next.png"))); // NOI18N
        next.setToolTipText("Siguiente");
        next.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        cuerpo.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 60, 40));

        l1ImagenC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/manzanas/4.png"))); // NOI18N
        cuerpo.add(l1ImagenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        opC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opC.setText("C)");
        opC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCActionPerformed(evt);
            }
        });
        cuerpo.add(opC, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        opD.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opD.setText("D)");
        opD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opDActionPerformed(evt);
            }
        });
        cuerpo.add(opD, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        l1ImagenD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/manzanas/1.png"))); // NOI18N
        cuerpo.add(l1ImagenD, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        l1ImagenA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/manzanas/2.png"))); // NOI18N
        cuerpo.add(l1ImagenA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        opA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opA.setText("A)");
        opA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAActionPerformed(evt);
            }
        });
        cuerpo.add(opA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        opB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opB.setText("B)");
        opB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBActionPerformed(evt);
            }
        });
        cuerpo.add(opB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        l1ImagenB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/manzanas/7.png"))); // NOI18N
        cuerpo.add(l1ImagenB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        l2ImagenC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/platano/2.png"))); // NOI18N
        cuerpo.add(l2ImagenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        opC2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opC2.setText("C)");
        opC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opC2ActionPerformed(evt);
            }
        });
        cuerpo.add(opC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        opD2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opD2.setText("D)");
        opD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opD2ActionPerformed(evt);
            }
        });
        cuerpo.add(opD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        l2ImagenD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/platano/1.png"))); // NOI18N
        cuerpo.add(l2ImagenD, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, -1));

        l2ImagenA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/platano/6.png"))); // NOI18N
        cuerpo.add(l2ImagenA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

        opA2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opA2.setText("A)");
        opA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opA2ActionPerformed(evt);
            }
        });
        cuerpo.add(opA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        opB2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opB2.setText("B)");
        opB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opB2ActionPerformed(evt);
            }
        });
        cuerpo.add(opB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        l2ImagenB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/platano/4.png"))); // NOI18N
        cuerpo.add(l2ImagenB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        l3ImagenC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/peras/5.png"))); // NOI18N
        cuerpo.add(l3ImagenC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, -1, -1));

        opC3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opC3.setText("C)");
        opC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opC3ActionPerformed(evt);
            }
        });
        cuerpo.add(opC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        opD3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opD3.setText("D)");
        opD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opD3ActionPerformed(evt);
            }
        });
        cuerpo.add(opD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 570, -1, -1));

        l3ImagenD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/peras/2.png"))); // NOI18N
        cuerpo.add(l3ImagenD, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, -1, -1));

        l3ImagenA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/peras/6.png"))); // NOI18N
        cuerpo.add(l3ImagenA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, -1, -1));

        opA3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opA3.setText("A)");
        opA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opA3ActionPerformed(evt);
            }
        });
        cuerpo.add(opA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        opB3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        opB3.setText("B)");
        opB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opB3ActionPerformed(evt);
            }
        });
        cuerpo.add(opB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, -1, -1));

        l3ImagenB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/peras/5.png"))); // NOI18N
        cuerpo.add(l3ImagenB, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, -1, -1));

        l3p3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l3p3.setText("jLabel2");
        cuerpo.add(l3p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 700, -1));

        l1p1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l1p1.setText("jLabel2");
        cuerpo.add(l1p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 560, -1));

        l2p2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l2p2.setText("jLabel2");
        cuerpo.add(l2p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 700, -1));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alfabeto/inicio.png"))); // NOI18N
        jMenu1.setText("Inicio");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cuerpo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 void siguienteP(int sigt) {
        if (sigt == 1) {
            this.linea1.setText("4.- Jose compro 2 naranjas y ya tenia 2, ¿cuántas naranjas tiene Jose en total?.");
            l1ImagenA.setIcon(new ImageIcon(getClass().getResource("/matematicas/naranjas/6.png")));
            l1ImagenB.setIcon(new ImageIcon(getClass().getResource("/matematicas/naranjas/4.png")));
            l1ImagenC.setIcon(new ImageIcon(getClass().getResource("/matematicas/naranjas/9.png")));
            l1ImagenD.setIcon(new ImageIcon(getClass().getResource("/matematicas/naranjas/7.png")));
            this.linea2.setText("5.- Pablo tiene 1 fresa, Jose 2 y Pepe 5. Si Pablo y Jose le dan sus fresas a Pepe, ¿cuántas fresas tendria Pepe?.");
            l2ImagenA.setIcon(new ImageIcon(getClass().getResource("/matematicas/fresas/1.png")));
            l2ImagenB.setIcon(new ImageIcon(getClass().getResource("/matematicas/fresas/7.png")));
            l2ImagenC.setIcon(new ImageIcon(getClass().getResource("/matematicas/fresas/8.png")));
            l2ImagenD.setIcon(new ImageIcon(getClass().getResource("/matematicas/fresas/2.png")));
            this.linea3.setText("6.- Maria tiene una piña y Pepe le regala 2, ¿cuántas piñas tiene Maria ahora?.");
            l3ImagenA.setIcon(new ImageIcon(getClass().getResource("/matematicas/piña/7.png")));
            l3ImagenB.setIcon(new ImageIcon(getClass().getResource("/matematicas/piña/3.png")));
            l3ImagenC.setIcon(new ImageIcon(getClass().getResource("/matematicas/piña/5.png")));
            l3ImagenD.setIcon(new ImageIcon(getClass().getResource("/matematicas/piña/1.png")));
        }
        if (sigt == 2) {
            this.linea1.setText("7.- Jesús y Manuel tienen 2 manzanas cada uno, Jesús compro 2 más y Manuel solo 1,");
            this.l1p1.setText("¿cuántas manzanas tiene Manuel?.");
            l1ImagenA.setIcon(new ImageIcon(getClass().getResource("/matematicas/manzanas/m5.png")));
            l1ImagenB.setIcon(new ImageIcon(getClass().getResource("/matematicas/manzanas/m9.png")));
            l1ImagenC.setIcon(new ImageIcon(getClass().getResource("/matematicas/manzanas/m2.png")));
            l1ImagenD.setIcon(new ImageIcon(getClass().getResource("/matematicas/manzanas/m3.png")));
            this.linea2.setText("8.- Si Jesús tiene 2 peras, Manuel 1 y Pablo 9, Pablo le regala 2 a Manuel, Jesús 1 a Pablo y Manuel 1 a Jesús,");
            this.l2p2.setText("¿cuántas peras tiene Manuel?.");
            l2ImagenA.setIcon(new ImageIcon(getClass().getResource("/matematicas/peras/1.png")));
            l2ImagenB.setIcon(new ImageIcon(getClass().getResource("/matematicas/peras/5.png")));
            l2ImagenC.setIcon(new ImageIcon(getClass().getResource("/matematicas/peras/2.png")));
            l2ImagenD.setIcon(new ImageIcon(getClass().getResource("/matematicas/peras/7.png")));
            this.linea3.setText("9.- Mario compro una sandia y la rebano en 20 partes, le regalo 3 rebanadas a Miguel, 4 a Fabian, 6 a Manuel,");
            this.l3p3.setText("1 a Maria y por último Manuel le regalo una rebanada a Maria, ¿cuántas rebanadas le tocarón a Maria?.");
            l3ImagenA.setIcon(new ImageIcon(getClass().getResource("/matematicas/sandia/7.png")));
            l3ImagenB.setIcon(new ImageIcon(getClass().getResource("/matematicas/sandia/3.png")));
            l3ImagenC.setIcon(new ImageIcon(getClass().getResource("/matematicas/sandia/5.png")));
            l3ImagenD.setIcon(new ImageIcon(getClass().getResource("/matematicas/sandia/2.png")));
        }
    }
    private void opAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAActionPerformed
        correcto = 1;
        clic1++;
        if (clic1 == 1) {
            respuestaC1Linea1(correcto);
        }
        if (clic1 == 2) {
            respuestaC2Linea1(correcto);
        }
        if (clic1 == 3) {
            respuestaC3Linea1(correcto);
        }
    }//GEN-LAST:event_opAActionPerformed

    private void opBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBActionPerformed
        correcto = 2;
        clic1++;
        if (clic1 == 1) {
            respuestaC1Linea1(correcto);
        }
        if (clic1 == 2) {
            respuestaC2Linea1(correcto);
        }
        if (clic1 == 3) {
            respuestaC3Linea1(correcto);
        }
    }//GEN-LAST:event_opBActionPerformed

    private void opCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCActionPerformed
        correcto = 3;
        clic1++;
        if (clic1 == 1) {
            respuestaC1Linea1(correcto);
        }
        if (clic1 == 2) {
            respuestaC2Linea1(correcto);
        }
        if (clic1 == 3) {
            respuestaC3Linea1(correcto);
        }
    }//GEN-LAST:event_opCActionPerformed

    private void opDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opDActionPerformed
        correcto = 4;
        clic1++;
        if (clic1 == 1) {
            respuestaC1Linea1(correcto);
        }
        if (clic1 == 2) {
            respuestaC2Linea1(correcto);
        }
        if (clic1 == 3) {
            respuestaC3Linea1(correcto);
        }
    }//GEN-LAST:event_opDActionPerformed

    private void opA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opA2ActionPerformed
        correcto = 1;
        clic2++;
        if (clic2 == 1) {
            respuestaC1Line2(correcto);
        }
        if (clic2 == 2) {
            respuestaC2Line2(correcto);
        }
        if (clic2 == 3) {
            respuestaC3Line2(correcto);
        }
    }//GEN-LAST:event_opA2ActionPerformed

    private void opB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opB2ActionPerformed
        correcto = 2;
        clic2++;
        if (clic2 == 1) {
            respuestaC1Line2(correcto);
        }
        if (clic2 == 2) {
            respuestaC2Line2(correcto);
        }
        if (clic2 == 3) {
            respuestaC3Line2(correcto);
        }
    }//GEN-LAST:event_opB2ActionPerformed

    private void opD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opD2ActionPerformed
        correcto = 4;
        clic2++;
        if (clic2 == 1) {
            respuestaC1Line2(correcto);
        }
        if (clic2 == 2) {
            respuestaC2Line2(correcto);
        }
        if (clic2 == 3) {
            respuestaC3Line2(correcto);
        }
    }//GEN-LAST:event_opD2ActionPerformed

    private void opC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opC2ActionPerformed
        correcto = 3;
        clic2++;
        if (clic2 == 1) {
            respuestaC1Line2(correcto);
        }
        if (clic2 == 2) {
            respuestaC2Line2(correcto);
        }
        if (clic2 == 3) {
            respuestaC3Line2(correcto);
        }
    }//GEN-LAST:event_opC2ActionPerformed

    private void opA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opA3ActionPerformed
        correcto = 1;
        clic3++;
        if (clic3 == 1) {
            respuestaC1Line3(correcto);
        }
        if (clic3 == 2) {
            respuestaC2Line3(correcto);
        }
        if (clic3 == 3) {
            respuestaC3Line3(correcto);
        }
    }//GEN-LAST:event_opA3ActionPerformed

    private void opC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opC3ActionPerformed
        correcto = 3;
        clic3++;
        if (clic3 == 1) {
            respuestaC1Line3(correcto);
        }
        if (clic3 == 2) {
            respuestaC2Line3(correcto);
        }
        if (clic3 == 3) {
            respuestaC3Line3(correcto);
        }
    }//GEN-LAST:event_opC3ActionPerformed

    private void opD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opD3ActionPerformed
        correcto = 4;
        clic3++;
        if (clic3 == 1) {
            respuestaC1Line3(correcto);
        }
        if (clic3 == 2) {
            respuestaC2Line3(correcto);
        }
        if (clic3 == 3) {
            respuestaC3Line3(correcto);
        }
    }//GEN-LAST:event_opD3ActionPerformed

    private void opB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opB3ActionPerformed
        correcto = 2;
        clic3++;
        if (clic3 == 1) {
            respuestaC1Line3(correcto);
        }
        if (clic3 == 2) {
            respuestaC2Line3(correcto);
        }
        if (clic3 == 3) {
            respuestaC3Line3(correcto);
        }
    }//GEN-LAST:event_opB3ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        desBloqLinea1();
        next.setEnabled(false);
        limPiar();
        sig++;
        if (sig == 1) {
            siguienteP(sig);
        }
        if (sig == 2) {
            siguienteP(sig);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/gato/2.mp3"));
        inicio.play();
        if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Matemáticas", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION) {
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/gato/2.mp3"));
            inicio.play();
            System.exit(0);
        } else {
            inicio = java.applet.Applet.newAudioClip(getClass().getResource("/gato/2.mp3"));
            inicio.play();
            setDefaultCloseOperation(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void regresarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarsActionPerformed
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
        int seleccion = JOptionPane.showConfirmDialog(null, "¿Regresar al menú?", "Matemáticas",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            new ImageIcon(getClass().getResource("/pares/pares/pick/regreG.png")));
        inicio = java.applet.Applet.newAudioClip(getClass().getResource("/pares/tonos/2.mp3"));
        inicio.play();
        if (seleccion == 0) {
            this.dispose();
            new inicioMat().setVisible(true);
        }
    }//GEN-LAST:event_regresarsActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sumas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        invokeLater(new Runnable() {
            public void run() {
                new Sumas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cor;
    private jcMousePanel.jcMousePanel cuerpo;
    private javax.swing.JLabel incor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel l1ImagenA;
    private javax.swing.JLabel l1ImagenB;
    private javax.swing.JLabel l1ImagenC;
    private javax.swing.JLabel l1ImagenD;
    private javax.swing.JLabel l1p1;
    private javax.swing.JLabel l2ImagenA;
    private javax.swing.JLabel l2ImagenB;
    private javax.swing.JLabel l2ImagenC;
    private javax.swing.JLabel l2ImagenD;
    private javax.swing.JLabel l2p2;
    private javax.swing.JLabel l3ImagenA;
    private javax.swing.JLabel l3ImagenB;
    private javax.swing.JLabel l3ImagenC;
    private javax.swing.JLabel l3ImagenD;
    private javax.swing.JLabel l3p3;
    private javax.swing.JLabel linea1;
    private javax.swing.JLabel linea2;
    private javax.swing.JLabel linea3;
    private javax.swing.JButton next;
    private javax.swing.JCheckBox opA;
    private javax.swing.JCheckBox opA2;
    private javax.swing.JCheckBox opA3;
    private javax.swing.JCheckBox opB;
    private javax.swing.JCheckBox opB2;
    private javax.swing.JCheckBox opB3;
    private javax.swing.JCheckBox opC;
    private javax.swing.JCheckBox opC2;
    private javax.swing.JCheckBox opC3;
    private javax.swing.JCheckBox opD;
    private javax.swing.JCheckBox opD2;
    private javax.swing.JCheckBox opD3;
    private javax.swing.JLabel rc;
    private javax.swing.JMenuItem regresars;
    private javax.swing.JLabel ri;
    // End of variables declaration//GEN-END:variables
}
