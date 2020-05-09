/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematicas;

import static java.applet.Applet.newAudioClip;
import java.applet.AudioClip;
import java.awt.Color;
import static java.awt.EventQueue.invokeLater;
import static java.util.logging.Level.SEVERE;
import static java.util.logging.Logger.getLogger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import principal.Ventana;

/**
 *
 * @author Rojeru San
 */
public class Numeros extends javax.swing.JFrame {

    AudioClip num, clic = newAudioClip(getClass().getResource("/gato/2.mp3")), inicio;
    int bnum, nada;

    /**
     * Creates new form Numeros
     */
    public Numeros() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/principal/logoM.png")).getImage());
        setSize(767, 528);
        setLocationRelativeTo(null);
        setResizable(false);
        bloq();
        bloqTodos();
    }

    void bloqTodos() {
//        uno0.setEnabled(false);
//        dos0.setEnabled(false);
        cero1.setEnabled(false);
        uno1.setEnabled(false);
        dos1.setEnabled(false);
        tres1.setEnabled(false);
        cuatro1.setEnabled(false);
        cinco1.setEnabled(false);
        seis1.setEnabled(false);
        siete1.setEnabled(false);
        ocho1.setEnabled(false);
        nueve1.setEnabled(false);
        cero2.setEnabled(false);
        uno2.setEnabled(false);
        dos2.setEnabled(false);
        tres2.setEnabled(false);
        cuatro2.setEnabled(false);
        cinco2.setEnabled(false);
        seis2.setEnabled(false);
        siete2.setEnabled(false);
        ocho2.setEnabled(false);
        nueve2.setEnabled(false);

        cero3.setEnabled(false);
        uno3.setEnabled(false);
        dos3.setEnabled(false);
        tres3.setEnabled(false);
        cuatro3.setEnabled(false);
        cinco3.setEnabled(false);
        seis3.setEnabled(false);
        siete3.setEnabled(false);
        ocho3.setEnabled(false);
        nueve3.setEnabled(false);
        cero4.setEnabled(false);
        uno4.setEnabled(false);
        dos4.setEnabled(false);
        tres4.setEnabled(false);
        cuatro4.setEnabled(false);
        cinco4.setEnabled(false);
        seis4.setEnabled(false);
        siete4.setEnabled(false);
        ocho4.setEnabled(false);
        nueve4.setEnabled(false);
        nueve5.setEnabled(false);
    }

    void desbloqTodos() {
//        uno0.setEnabled(true);
//        dos0.setEnabled(true);
        cero1.setEnabled(true);
        uno1.setEnabled(true);
        dos1.setEnabled(true);
        tres1.setEnabled(true);
        cuatro1.setEnabled(true);
        cinco1.setEnabled(true);
        seis1.setEnabled(true);
        siete1.setEnabled(true);
        ocho1.setEnabled(true);
        nueve1.setEnabled(true);
        cero2.setEnabled(true);
        uno2.setEnabled(true);
        dos2.setEnabled(true);
        tres2.setEnabled(true);
        cuatro2.setEnabled(true);
        cinco2.setEnabled(true);
        seis2.setEnabled(true);
        siete2.setEnabled(true);
        ocho2.setEnabled(true);
        nueve2.setEnabled(true);

        cero3.setEnabled(true);
        uno3.setEnabled(true);
        dos3.setEnabled(true);
        tres3.setEnabled(true);
        cuatro3.setEnabled(true);
        cinco3.setEnabled(true);
        seis3.setEnabled(true);
        siete3.setEnabled(true);
        ocho3.setEnabled(true);
        nueve3.setEnabled(true);

        cero4.setEnabled(true);
        uno4.setEnabled(true);
        dos4.setEnabled(true);
        tres4.setEnabled(true);
        cuatro4.setEnabled(true);
        cinco4.setEnabled(true);
        seis4.setEnabled(true);
        siete4.setEnabled(true);
        ocho4.setEnabled(true);
        nueve4.setEnabled(true);
        nueve5.setEnabled(true);
    }

    void formNum10() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/10.wav"));
        num.play();
        uno0.setText("1");
        dos0.setText("0");
        bnum = 10;
    }

    void formNum11() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/11.wav"));
        num.play();
        uno0.setText("1");
        dos0.setText("1");
        bnum = 11;
    }

    void formNum12() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/12.wav"));
        num.play();
        uno0.setText("1");
        dos0.setText("2");
        bnum = 12;
    }

    void formNum13() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/13.wav"));
        num.play();
        uno0.setText("1");
        dos0.setText("3");
        bnum = 13;
    }

    void formNum14() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/14.wav"));
        num.play();
        uno0.setText("1");
        dos0.setText("4");
        bnum = 14;
    }

    void formNum15() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/15.wav"));
        num.play();
        uno0.setText("1");
        dos0.setText("5");
        bnum = 15;
    }

    void formNum16() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/16.wav"));
        num.play();
        uno0.setText("1");
        dos0.setText("6");
        bnum = 16;
    }

    void formNum17() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/17.wav"));
        num.play();
        uno0.setText("1");
        dos0.setText("7");
        bnum = 17;
    }

    void formNum18() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/18.wav"));
        num.play();
        uno0.setText("1");
        dos0.setText("8");
        bnum = 18;
    }

    void formNum19() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/19.wav"));
        num.play();
        uno0.setText("1");
        dos0.setText("9");
        bnum = 19;
    }

    void formNum20() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/20.wav"));
        num.play();
        uno0.setText("2");
        dos0.setText("0");
        bnum = 20;
    }

    void formNum21() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/21.wav"));
        num.play();
        uno0.setText("2");
        dos0.setText("1");
        bnum = 21;
    }

    void formNum22() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/22.wav"));
        num.play();
        uno0.setText("2");
        dos0.setText("2");
        bnum = 22;
    }

    void formNum23() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/23.wav"));
        num.play();
        uno0.setText("2");
        dos0.setText("3");
        bnum = 23;
    }

    void formNum24() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/24.wav"));
        num.play();
        uno0.setText("2");
        dos0.setText("4");
        bnum = 24;
    }

    void formNum25() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/25.wav"));
        num.play();
        uno0.setText("2");
        dos0.setText("5");
        bnum = 25;
    }

    void formNum26() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/26.wav"));
        num.play();
        uno0.setText("2");
        dos0.setText("6");
        bnum = 26;
    }

    void formNum27() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/27.wav"));
        num.play();
        uno0.setText("2");
        dos0.setText("7");
        bnum = 27;
    }

    void formNum28() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/28.wav"));
        num.play();
        uno0.setText("2");
        dos0.setText("8");
        bnum = 28;
    }

    void formNum29() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/29.wav"));
        num.play();
        uno0.setText("2");
        dos0.setText("9");
        bnum = 29;
    }

    void formNum30() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/30.wav"));
        num.play();
        uno0.setText("3");
        dos0.setText("0");
        bnum = 30;
    }

    void formNum31() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/31.wav"));
        num.play();
        uno0.setText("3");
        dos0.setText("1");
        bnum = 31;
    }

    void formNum32() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/32.wav"));
        num.play();
        uno0.setText("3");
        dos0.setText("2");
        bnum = 32;
    }

    void formNum33() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/33.wav"));
        num.play();
        uno0.setText("3");
        dos0.setText("3");
        bnum = 33;
    }

    void formNum34() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/34.wav"));
        num.play();
        uno0.setText("3");
        dos0.setText("4");
        bnum = 34;
    }

    void formNum35() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/35.wav"));
        num.play();
        uno0.setText("3");
        dos0.setText("5");
        bnum = 35;
    }

    void formNum36() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/36.wav"));
        num.play();
        uno0.setText("3");
        dos0.setText("6");
        bnum = 36;
    }

    void formNum37() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/37.wav"));
        num.play();
        uno0.setText("3");
        dos0.setText("7");
        bnum = 37;
    }

    void formNum38() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/38.wav"));
        num.play();
        uno0.setText("3");
        dos0.setText("8");
        bnum = 38;
    }

    void formNum39() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/39.wav"));
        num.play();
        uno0.setText("3");
        dos0.setText("9");
        bnum = 39;
    }

    void formNum40() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/40.wav"));
        num.play();
        uno0.setText("4");
        dos0.setText("0");
        bnum = 40;
    }

    void formNum41() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/41.wav"));
        num.play();
        uno0.setText("4");
        dos0.setText("1");
        bnum = 41;
    }

    void formNum42() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/42.wav"));
        num.play();
        uno0.setText("4");
        dos0.setText("2");
        bnum = 42;
    }

    void formNum43() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/43.wav"));
        num.play();
        uno0.setText("4");
        dos0.setText("3");
        bnum = 43;
    }

    void formNum44() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/44.wav"));
        num.play();
        uno0.setText("4");
        dos0.setText("4");
        bnum = 44;
    }

    void formNum45() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/45.wav"));
        num.play();
        uno0.setText("4");
        dos0.setText("5");
        bnum = 45;
    }

    void formNum46() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/46.wav"));
        num.play();
        uno0.setText("4");
        dos0.setText("6");
        bnum = 46;
    }

    void formNum47() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/47.wav"));
        num.play();
        uno0.setText("4");
        dos0.setText("7");
        bnum = 47;
    }

    void formNum48() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/48.wav"));
        num.play();
        uno0.setText("4");
        dos0.setText("8");
        bnum = 48;
    }

    void formNum49() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/49.wav"));
        num.play();
        uno0.setText("4");
        dos0.setText("9");
        bnum = 49;
    }

    void formNum50() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/50.wav"));
        num.play();
        uno0.setText("5");
        dos0.setText("0");
        bnum = 50;
    }

    void bloq() {
        rei.setEnabled(false);
        nex.setEnabled(false);
        anex.setEnabled(false);
        cero.setEnabled(true);
        uno.setEnabled(false);
        dos.setEnabled(false);
        tres.setEnabled(false);
        cuatro.setEnabled(false);
        cinco.setEnabled(false);
        seis.setEnabled(false);
        siete.setEnabled(false);
        ocho.setEnabled(false);
        nueve.setEnabled(false);
    }

    void bloq1() {
        cero.setEnabled(false);
        uno.setEnabled(true);
        dos.setEnabled(false);
        tres.setEnabled(false);
        cuatro.setEnabled(false);
        cinco.setEnabled(false);
        seis.setEnabled(false);
        siete.setEnabled(false);
        ocho.setEnabled(false);
        nueve.setEnabled(false);
    }

    void bloq2() {
        cero.setEnabled(false);
        uno.setEnabled(false);
        dos.setEnabled(true);
        tres.setEnabled(false);
        cuatro.setEnabled(false);
        cinco.setEnabled(false);
        seis.setEnabled(false);
        siete.setEnabled(false);
        ocho.setEnabled(false);
        nueve.setEnabled(false);
    }

    void bloq3() {
        cero.setEnabled(false);
        uno.setEnabled(false);
        dos.setEnabled(false);
        tres.setEnabled(true);
        cuatro.setEnabled(false);
        cinco.setEnabled(false);
        seis.setEnabled(false);
        siete.setEnabled(false);
        ocho.setEnabled(false);
        nueve.setEnabled(false);
    }

    void bloq4() {
        cero.setEnabled(false);
        uno.setEnabled(false);
        dos.setEnabled(false);
        tres.setEnabled(false);
        cuatro.setEnabled(true);
        cinco.setEnabled(false);
        seis.setEnabled(false);
        siete.setEnabled(false);
        ocho.setEnabled(false);
        nueve.setEnabled(false);
    }

    void bloq5() {
        cero.setEnabled(false);
        uno.setEnabled(false);
        dos.setEnabled(false);
        tres.setEnabled(false);
        cuatro.setEnabled(false);
        cinco.setEnabled(true);
        seis.setEnabled(false);
        siete.setEnabled(false);
        ocho.setEnabled(false);
        nueve.setEnabled(false);
    }

    void bloq6() {
        cero.setEnabled(false);
        uno.setEnabled(false);
        dos.setEnabled(false);
        tres.setEnabled(false);
        cuatro.setEnabled(false);
        cinco.setEnabled(false);
        seis.setEnabled(true);
        siete.setEnabled(false);
        ocho.setEnabled(false);
        nueve.setEnabled(false);
    }

    void bloq7() {
        cero.setEnabled(false);
        uno.setEnabled(false);
        dos.setEnabled(false);
        tres.setEnabled(false);
        cuatro.setEnabled(false);
        cinco.setEnabled(false);
        seis.setEnabled(false);
        siete.setEnabled(true);
        ocho.setEnabled(false);
        nueve.setEnabled(false);
    }

    void bloq8() {
        cero.setEnabled(false);
        uno.setEnabled(false);
        dos.setEnabled(false);
        tres.setEnabled(false);
        cuatro.setEnabled(false);
        cinco.setEnabled(false);
        seis.setEnabled(false);
        siete.setEnabled(false);
        ocho.setEnabled(true);
        nueve.setEnabled(false);
    }

    void bloq9() {
        cero.setEnabled(false);
        uno.setEnabled(false);
        dos.setEnabled(false);
        tres.setEnabled(false);
        cuatro.setEnabled(false);
        cinco.setEnabled(false);
        seis.setEnabled(false);
        siete.setEnabled(false);
        ocho.setEnabled(false);
        nueve.setEnabled(true);
    }

    void bloq10() {
        cero.setEnabled(false);
        uno.setEnabled(false);
        dos.setEnabled(false);
        tres.setEnabled(false);
        cuatro.setEnabled(false);
        cinco.setEnabled(false);
        seis.setEnabled(false);
        siete.setEnabled(false);
        ocho.setEnabled(false);
        nueve.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        panel = new javax.swing.JPanel();
        cuerpo = new javax.swing.JPanel();
        cero1 = new javax.swing.JButton();
        uno1 = new javax.swing.JButton();
        dos1 = new javax.swing.JButton();
        tres1 = new javax.swing.JButton();
        cuatro1 = new javax.swing.JButton();
        cinco1 = new javax.swing.JButton();
        seis1 = new javax.swing.JButton();
        siete1 = new javax.swing.JButton();
        ocho1 = new javax.swing.JButton();
        nueve1 = new javax.swing.JButton();
        cuerpo1 = new javax.swing.JPanel();
        cero2 = new javax.swing.JButton();
        uno2 = new javax.swing.JButton();
        dos2 = new javax.swing.JButton();
        tres2 = new javax.swing.JButton();
        cuatro2 = new javax.swing.JButton();
        cinco2 = new javax.swing.JButton();
        seis2 = new javax.swing.JButton();
        siete2 = new javax.swing.JButton();
        ocho2 = new javax.swing.JButton();
        nueve2 = new javax.swing.JButton();
        uno0 = new javax.swing.JButton();
        dos0 = new javax.swing.JButton();
        cuerpo2 = new javax.swing.JPanel();
        cero3 = new javax.swing.JButton();
        uno3 = new javax.swing.JButton();
        dos3 = new javax.swing.JButton();
        tres3 = new javax.swing.JButton();
        cuatro3 = new javax.swing.JButton();
        cinco3 = new javax.swing.JButton();
        seis3 = new javax.swing.JButton();
        siete3 = new javax.swing.JButton();
        ocho3 = new javax.swing.JButton();
        nueve3 = new javax.swing.JButton();
        cuerpo3 = new javax.swing.JPanel();
        cero4 = new javax.swing.JButton();
        uno4 = new javax.swing.JButton();
        dos4 = new javax.swing.JButton();
        tres4 = new javax.swing.JButton();
        cuatro4 = new javax.swing.JButton();
        cinco4 = new javax.swing.JButton();
        seis4 = new javax.swing.JButton();
        siete4 = new javax.swing.JButton();
        ocho4 = new javax.swing.JButton();
        nueve4 = new javax.swing.JButton();
        nueve5 = new javax.swing.JButton();
        anex = new javax.swing.JButton();
        nex = new javax.swing.JButton();
        rei = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        regresars = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/fondoMate3.png"))); // NOI18N
        jcMousePanel1.setIconLogo(new javax.swing.ImageIcon(getClass().getResource("/principal/logoM.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("¡¡¡ A P R E N D I E N D O   L O S   N Ú M E R O S !!!");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        uno.setBackground(new java.awt.Color(51, 102, 255));
        uno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });

        dos.setBackground(new java.awt.Color(51, 102, 255));
        dos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setBackground(new java.awt.Color(51, 102, 255));
        tres.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        cuatro.setBackground(new java.awt.Color(51, 102, 255));
        cuatro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setBackground(new java.awt.Color(51, 102, 255));
        cinco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setBackground(new java.awt.Color(51, 102, 255));
        seis.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        siete.setBackground(new java.awt.Color(51, 102, 255));
        siete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setBackground(new java.awt.Color(51, 102, 255));
        ocho.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        cero.setBackground(new java.awt.Color(51, 102, 255));
        cero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });

        nueve.setBackground(new java.awt.Color(51, 102, 255));
        nueve.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocho, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cero, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nueve, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(siete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panel.setBackground(new java.awt.Color(255, 255, 153));
        panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cuerpo.setBackground(new java.awt.Color(153, 255, 153));
        cuerpo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cero1.setBackground(new java.awt.Color(0, 255, 0));
        cero1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cero1.setText("10");
        cero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cero1ActionPerformed(evt);
            }
        });

        uno1.setBackground(new java.awt.Color(0, 255, 0));
        uno1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uno1.setText("11");
        uno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno1ActionPerformed(evt);
            }
        });

        dos1.setBackground(new java.awt.Color(0, 255, 0));
        dos1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dos1.setText("12");
        dos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos1ActionPerformed(evt);
            }
        });

        tres1.setBackground(new java.awt.Color(0, 255, 0));
        tres1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tres1.setText("13");
        tres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres1ActionPerformed(evt);
            }
        });

        cuatro1.setBackground(new java.awt.Color(0, 255, 0));
        cuatro1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cuatro1.setText("14");
        cuatro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatro1ActionPerformed(evt);
            }
        });

        cinco1.setBackground(new java.awt.Color(0, 255, 0));
        cinco1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cinco1.setText("15");
        cinco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinco1ActionPerformed(evt);
            }
        });

        seis1.setBackground(new java.awt.Color(0, 255, 0));
        seis1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seis1.setText("16");
        seis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seis1ActionPerformed(evt);
            }
        });

        siete1.setBackground(new java.awt.Color(0, 255, 0));
        siete1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        siete1.setText("17");
        siete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siete1ActionPerformed(evt);
            }
        });

        ocho1.setBackground(new java.awt.Color(0, 255, 0));
        ocho1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ocho1.setText("18");
        ocho1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocho1ActionPerformed(evt);
            }
        });

        nueve1.setBackground(new java.awt.Color(0, 255, 0));
        nueve1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nueve1.setText("19");
        nueve1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueve1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cuerpoLayout = new javax.swing.GroupLayout(cuerpo);
        cuerpo.setLayout(cuerpoLayout);
        cuerpoLayout.setHorizontalGroup(
            cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cero1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uno1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dos1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tres1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuatro1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cinco1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seis1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siete1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ocho1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nueve1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        cuerpoLayout.setVerticalGroup(
            cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuerpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocho1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nueve1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cuatro1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cinco1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seis1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(siete1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cero1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uno1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dos1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tres1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        cuerpo1.setBackground(new java.awt.Color(255, 153, 255));
        cuerpo1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cero2.setBackground(new java.awt.Color(204, 0, 255));
        cero2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cero2.setText("20");
        cero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cero2ActionPerformed(evt);
            }
        });

        uno2.setBackground(new java.awt.Color(204, 0, 255));
        uno2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uno2.setText("21");
        uno2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno2ActionPerformed(evt);
            }
        });

        dos2.setBackground(new java.awt.Color(204, 0, 255));
        dos2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dos2.setText("22");
        dos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos2ActionPerformed(evt);
            }
        });

        tres2.setBackground(new java.awt.Color(204, 0, 255));
        tres2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tres2.setText("23");
        tres2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres2ActionPerformed(evt);
            }
        });

        cuatro2.setBackground(new java.awt.Color(204, 0, 255));
        cuatro2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cuatro2.setText("24");
        cuatro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatro2ActionPerformed(evt);
            }
        });

        cinco2.setBackground(new java.awt.Color(204, 0, 255));
        cinco2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cinco2.setText("25");
        cinco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinco2ActionPerformed(evt);
            }
        });

        seis2.setBackground(new java.awt.Color(204, 0, 255));
        seis2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seis2.setText("26");
        seis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seis2ActionPerformed(evt);
            }
        });

        siete2.setBackground(new java.awt.Color(204, 0, 255));
        siete2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        siete2.setText("27");
        siete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siete2ActionPerformed(evt);
            }
        });

        ocho2.setBackground(new java.awt.Color(204, 0, 255));
        ocho2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ocho2.setText("28");
        ocho2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocho2ActionPerformed(evt);
            }
        });

        nueve2.setBackground(new java.awt.Color(204, 0, 255));
        nueve2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nueve2.setText("29");
        nueve2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueve2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cuerpo1Layout = new javax.swing.GroupLayout(cuerpo1);
        cuerpo1.setLayout(cuerpo1Layout);
        cuerpo1Layout.setHorizontalGroup(
            cuerpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuerpo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cero2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uno2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dos2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tres2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuatro2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cinco2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seis2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siete2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ocho2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nueve2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        cuerpo1Layout.setVerticalGroup(
            cuerpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuerpo1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cuerpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuerpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocho2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nueve2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cuerpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cuatro2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cinco2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seis2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(siete2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cuerpo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cero2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uno2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dos2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tres2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        uno0.setBackground(new java.awt.Color(51, 102, 255));
        uno0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uno0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno0ActionPerformed(evt);
            }
        });

        dos0.setBackground(new java.awt.Color(51, 102, 255));
        dos0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dos0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos0ActionPerformed(evt);
            }
        });

        cuerpo2.setBackground(new java.awt.Color(255, 153, 153));
        cuerpo2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cero3.setBackground(new java.awt.Color(255, 0, 0));
        cero3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cero3.setText("30");
        cero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cero3ActionPerformed(evt);
            }
        });

        uno3.setBackground(new java.awt.Color(255, 0, 0));
        uno3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uno3.setText("31");
        uno3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno3ActionPerformed(evt);
            }
        });

        dos3.setBackground(new java.awt.Color(255, 0, 0));
        dos3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dos3.setText("32");
        dos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos3ActionPerformed(evt);
            }
        });

        tres3.setBackground(new java.awt.Color(255, 0, 0));
        tres3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tres3.setText("33");
        tres3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres3ActionPerformed(evt);
            }
        });

        cuatro3.setBackground(new java.awt.Color(255, 0, 0));
        cuatro3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cuatro3.setText("34");
        cuatro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatro3ActionPerformed(evt);
            }
        });

        cinco3.setBackground(new java.awt.Color(255, 0, 0));
        cinco3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cinco3.setText("35");
        cinco3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinco3ActionPerformed(evt);
            }
        });

        seis3.setBackground(new java.awt.Color(255, 0, 0));
        seis3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seis3.setText("36");
        seis3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seis3ActionPerformed(evt);
            }
        });

        siete3.setBackground(new java.awt.Color(255, 0, 0));
        siete3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        siete3.setText("37");
        siete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siete3ActionPerformed(evt);
            }
        });

        ocho3.setBackground(new java.awt.Color(255, 0, 0));
        ocho3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ocho3.setText("38");
        ocho3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocho3ActionPerformed(evt);
            }
        });

        nueve3.setBackground(new java.awt.Color(255, 0, 0));
        nueve3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nueve3.setText("39");
        nueve3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueve3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cuerpo2Layout = new javax.swing.GroupLayout(cuerpo2);
        cuerpo2.setLayout(cuerpo2Layout);
        cuerpo2Layout.setHorizontalGroup(
            cuerpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuerpo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cero3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uno3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dos3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tres3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuatro3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cinco3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seis3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siete3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ocho3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nueve3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        cuerpo2Layout.setVerticalGroup(
            cuerpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuerpo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cuerpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuerpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocho3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nueve3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cuerpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cuatro3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cinco3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seis3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(siete3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cuerpo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cero3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uno3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dos3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tres3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        cuerpo3.setBackground(new java.awt.Color(255, 204, 255));
        cuerpo3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cero4.setBackground(new java.awt.Color(255, 153, 153));
        cero4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cero4.setText("40");
        cero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cero4ActionPerformed(evt);
            }
        });

        uno4.setBackground(new java.awt.Color(255, 153, 153));
        uno4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uno4.setText("41");
        uno4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uno4ActionPerformed(evt);
            }
        });

        dos4.setBackground(new java.awt.Color(255, 153, 153));
        dos4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dos4.setText("42");
        dos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dos4ActionPerformed(evt);
            }
        });

        tres4.setBackground(new java.awt.Color(255, 153, 153));
        tres4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tres4.setText("43");
        tres4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tres4ActionPerformed(evt);
            }
        });

        cuatro4.setBackground(new java.awt.Color(255, 153, 153));
        cuatro4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cuatro4.setText("44");
        cuatro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatro4ActionPerformed(evt);
            }
        });

        cinco4.setBackground(new java.awt.Color(255, 153, 153));
        cinco4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cinco4.setText("45");
        cinco4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cinco4ActionPerformed(evt);
            }
        });

        seis4.setBackground(new java.awt.Color(255, 153, 153));
        seis4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        seis4.setText("46");
        seis4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seis4ActionPerformed(evt);
            }
        });

        siete4.setBackground(new java.awt.Color(255, 153, 153));
        siete4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        siete4.setText("47");
        siete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siete4ActionPerformed(evt);
            }
        });

        ocho4.setBackground(new java.awt.Color(255, 153, 153));
        ocho4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ocho4.setText("48");
        ocho4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocho4ActionPerformed(evt);
            }
        });

        nueve4.setBackground(new java.awt.Color(255, 153, 153));
        nueve4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nueve4.setText("49");
        nueve4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueve4ActionPerformed(evt);
            }
        });

        nueve5.setBackground(new java.awt.Color(255, 153, 153));
        nueve5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nueve5.setText("50");
        nueve5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueve5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cuerpo3Layout = new javax.swing.GroupLayout(cuerpo3);
        cuerpo3.setLayout(cuerpo3Layout);
        cuerpo3Layout.setHorizontalGroup(
            cuerpo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuerpo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cero4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uno4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dos4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tres4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuatro4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cinco4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(seis4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siete4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ocho4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nueve4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nueve5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cuerpo3Layout.setVerticalGroup(
            cuerpo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuerpo3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cuerpo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuerpo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ocho4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nueve4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nueve5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cuerpo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cuatro4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cinco4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seis4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(siete4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cuerpo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cero4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(uno4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dos4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tres4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        anex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/numeros/anex.png"))); // NOI18N
        anex.setToolTipText("Anterior");
        anex.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        anex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anexActionPerformed(evt);
            }
        });

        nex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/numeros/next1.png"))); // NOI18N
        nex.setToolTipText("Siguiente");
        nex.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cuerpo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(anex, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(203, 203, 203)
                                .addComponent(uno0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dos0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(230, 230, 230)
                                .addComponent(nex, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cuerpo2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuerpo1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nex)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(uno0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dos0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(anex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuerpo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuerpo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuerpo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rei.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicas/numeros/sig1.png"))); // NOI18N
        rei.setToolTipText("Reiniciar");
        rei.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        rei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jcMousePanel1Layout.createSequentialGroup()
                        .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jcMousePanel1Layout.createSequentialGroup()
                        .addComponent(rei, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jcMousePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rei, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcMousePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        clic.play();
        num = newAudioClip(getClass().getResource("/matematicas/numeros/0.wav"));
        num.play();
        bloq1();
    }//GEN-LAST:event_ceroActionPerformed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        clic.play();
        num = newAudioClip(getClass().getResource("/matematicas/numeros/1.wav"));
        num.play();
        bloq2();
    }//GEN-LAST:event_unoActionPerformed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        clic.play();
        num = newAudioClip(getClass().getResource("/matematicas/numeros/2.wav"));
        num.play();
        bloq3();
    }//GEN-LAST:event_dosActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        clic.play();
        num = newAudioClip(getClass().getResource("/matematicas/numeros/3.wav"));
        num.play();
        bloq4();
    }//GEN-LAST:event_tresActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        clic.play();
        num = newAudioClip(getClass().getResource("/matematicas/numeros/4.wav"));
        num.play();
        bloq5();
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        clic.play();
        num = newAudioClip(getClass().getResource("/matematicas/numeros/5.wav"));
        num.play();
        bloq6();
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        clic.play();
        num = newAudioClip(getClass().getResource("/matematicas/numeros/6.wav"));
        num.play();
        bloq7();
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        clic.play();
        num = newAudioClip(getClass().getResource("/matematicas/numeros/7.wav"));
        num.play();
        bloq8();
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        clic.play();
        num = newAudioClip(getClass().getResource("/matematicas/numeros/8.wav"));
        num.play();
        bloq9();
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        clic.play();
        num = newAudioClip(getClass().getResource("/matematicas/numeros/9.wav"));
        num.play();
        bloq10();
        rei.setEnabled(true);
        nex.setEnabled(true);
    }//GEN-LAST:event_nueveActionPerformed

    private void reiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiActionPerformed
        clic.play();
        bloq();
    }//GEN-LAST:event_reiActionPerformed

    private void nueve2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueve2ActionPerformed
        clic.play();
        formNum29();
    }//GEN-LAST:event_nueve2ActionPerformed

    private void ocho2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocho2ActionPerformed
        clic.play();
        formNum28();
    }//GEN-LAST:event_ocho2ActionPerformed

    private void siete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siete2ActionPerformed
        clic.play();
        formNum27();
    }//GEN-LAST:event_siete2ActionPerformed

    private void seis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seis2ActionPerformed
        clic.play();
        formNum26();
    }//GEN-LAST:event_seis2ActionPerformed

    private void cinco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinco2ActionPerformed
        clic.play();
        formNum25();
    }//GEN-LAST:event_cinco2ActionPerformed

    private void cuatro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatro2ActionPerformed
        clic.play();
        formNum24();
    }//GEN-LAST:event_cuatro2ActionPerformed

    private void tres2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres2ActionPerformed
        clic.play();
        formNum23();
    }//GEN-LAST:event_tres2ActionPerformed

    private void dos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos2ActionPerformed
        clic.play();
        formNum22();
    }//GEN-LAST:event_dos2ActionPerformed

    private void uno2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno2ActionPerformed
        clic.play();
        formNum21();
    }//GEN-LAST:event_uno2ActionPerformed

    private void cero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cero2ActionPerformed
        clic.play();
        formNum20();
    }//GEN-LAST:event_cero2ActionPerformed

    private void nueve1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueve1ActionPerformed
        clic.play();
        formNum19();
    }//GEN-LAST:event_nueve1ActionPerformed

    private void ocho1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocho1ActionPerformed
        clic.play();
        formNum18();
    }//GEN-LAST:event_ocho1ActionPerformed

    private void siete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siete1ActionPerformed
        clic.play();
        formNum17();
    }//GEN-LAST:event_siete1ActionPerformed

    private void seis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seis1ActionPerformed
        clic.play();
        formNum16();
    }//GEN-LAST:event_seis1ActionPerformed

    private void cinco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinco1ActionPerformed
        clic.play();
        formNum15();
    }//GEN-LAST:event_cinco1ActionPerformed

    private void cuatro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatro1ActionPerformed
        clic.play();
        formNum14();
    }//GEN-LAST:event_cuatro1ActionPerformed

    private void tres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres1ActionPerformed
        clic.play();
        formNum13();
    }//GEN-LAST:event_tres1ActionPerformed

    private void dos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos1ActionPerformed
        clic.play();
        formNum12();
    }//GEN-LAST:event_dos1ActionPerformed

    private void uno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno1ActionPerformed
        clic.play();
        formNum11();
    }//GEN-LAST:event_uno1ActionPerformed

    private void cero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cero1ActionPerformed
        clic.play();
        formNum10();
    }//GEN-LAST:event_cero1ActionPerformed

    private void nexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nexActionPerformed
        clic.play();
        desbloqTodos();
        rei.setEnabled(false);
        nex.setEnabled(false);
        anex.setEnabled(true);
        nada = 0;
        bnum = 0;
    }//GEN-LAST:event_nexActionPerformed

    private void anexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anexActionPerformed
        clic.play();
        bloq();
        bloqTodos();
        uno0.setText("");
        dos0.setText("");
        nada = 1;
        bnum = 0;
    }//GEN-LAST:event_anexActionPerformed

    private void cero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cero3ActionPerformed
        clic.play();
        formNum30();
    }//GEN-LAST:event_cero3ActionPerformed

    private void uno3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno3ActionPerformed
        clic.play();
        formNum31();
    }//GEN-LAST:event_uno3ActionPerformed

    private void dos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos3ActionPerformed
        clic.play();
        formNum32();
    }//GEN-LAST:event_dos3ActionPerformed

    private void tres3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres3ActionPerformed
        clic.play();
        formNum33();
    }//GEN-LAST:event_tres3ActionPerformed

    private void cuatro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatro3ActionPerformed
        clic.play();
        formNum34();
    }//GEN-LAST:event_cuatro3ActionPerformed

    private void cinco3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinco3ActionPerformed
        clic.play();
        formNum35();
    }//GEN-LAST:event_cinco3ActionPerformed

    private void seis3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seis3ActionPerformed
  
        clic.play();
        formNum36();
    }//GEN-LAST:event_seis3ActionPerformed

    private void siete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siete3ActionPerformed
        
        clic.play();
        formNum37();
    }//GEN-LAST:event_siete3ActionPerformed

    private void ocho3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocho3ActionPerformed
        clic.play();
        formNum38();
    }//GEN-LAST:event_ocho3ActionPerformed

    private void nueve3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueve3ActionPerformed
        clic.play();
        formNum39();
    }//GEN-LAST:event_nueve3ActionPerformed

    private void cero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cero4ActionPerformed
        clic.play();
        formNum40();
    }//GEN-LAST:event_cero4ActionPerformed

    private void uno4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno4ActionPerformed
        clic.play();
        formNum41();
    }//GEN-LAST:event_uno4ActionPerformed

    private void dos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos4ActionPerformed
        clic.play();
        formNum42();
    }//GEN-LAST:event_dos4ActionPerformed

    private void tres4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tres4ActionPerformed
        clic.play();
        formNum43();
    }//GEN-LAST:event_tres4ActionPerformed

    private void cuatro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatro4ActionPerformed
        clic.play();
        formNum44();
    }//GEN-LAST:event_cuatro4ActionPerformed

    private void cinco4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cinco4ActionPerformed
        clic.play();
        formNum45();
    }//GEN-LAST:event_cinco4ActionPerformed

    private void seis4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seis4ActionPerformed
        clic.play();
        formNum46();
    }//GEN-LAST:event_seis4ActionPerformed

    private void siete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siete4ActionPerformed
        clic.play();
        formNum47();
    }//GEN-LAST:event_siete4ActionPerformed

    private void ocho4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocho4ActionPerformed
        clic.play();
        formNum48();
    }//GEN-LAST:event_ocho4ActionPerformed

    private void nueve4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueve4ActionPerformed
        clic.play();
        formNum49();
    }//GEN-LAST:event_nueve4ActionPerformed

    private void nueve5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueve5ActionPerformed
        clic.play();
        formNum50();
    }//GEN-LAST:event_nueve5ActionPerformed

    private void uno0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uno0ActionPerformed
        clic.play();
        if (nada == 1) {
            nada();
        } else {
            if (bnum == 10 || bnum == 11 || bnum == 12 || bnum == 13 || bnum == 14 || bnum == 15 || bnum == 16 || bnum == 17 || bnum == 18 || bnum == 19) {
                num = newAudioClip(getClass().getResource("/matematicas/numeros/1.wav"));
                num.play();
            }
            if (bnum == 20 || bnum == 21 || bnum == 22 || bnum == 23 || bnum == 24 || bnum == 25 || bnum == 26 || bnum == 27 || bnum == 28 || bnum == 29) {
                num = newAudioClip(getClass().getResource("/matematicas/numeros/2.wav"));
                num.play();
            }
            if (bnum == 30 || bnum == 31 || bnum == 32 || bnum == 33 || bnum == 34 || bnum == 35 || bnum == 36 || bnum == 37 || bnum == 38 || bnum == 39) {
                num = newAudioClip(getClass().getResource("/matematicas/numeros/3.wav"));
                num.play();
            }
            if (bnum == 40 || bnum == 41 || bnum == 42 || bnum == 43 || bnum == 44 || bnum == 45 || bnum == 46 || bnum == 47 || bnum == 48 || bnum == 49) {
                num = newAudioClip(getClass().getResource("/matematicas/numeros/4.wav"));
                num.play();
            }
            if (bnum == 50) {
                num = newAudioClip(getClass().getResource("/matematicas/numeros/5.wav"));
                num.play();
            }
        }
    }//GEN-LAST:event_uno0ActionPerformed

    private void dos0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dos0ActionPerformed
        clic.play();
        if (nada == 1) {
            nada();
        } else {
            correr();
        }

    }//GEN-LAST:event_dos0ActionPerformed

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
    void correr() {
        if (bnum == 10 || bnum == 20 || bnum == 30 || bnum == 40 || bnum == 50) {
            num = newAudioClip(getClass().getResource("/matematicas/numeros/0.wav"));
            num.play();
        }
        if (bnum == 11 || bnum == 21 || bnum == 31 || bnum == 41) {
            num = newAudioClip(getClass().getResource("/matematicas/numeros/1.wav"));
            num.play();
        }
        if (bnum == 12 || bnum == 22 || bnum == 32 || bnum == 42) {
            num = newAudioClip(getClass().getResource("/matematicas/numeros/2.wav"));
            num.play();
        }
        if (bnum == 13 || bnum == 23 || bnum == 33 || bnum == 43) {
            num = newAudioClip(getClass().getResource("/matematicas/numeros/3.wav"));
            num.play();
        }
        if (bnum == 14 || bnum == 24 || bnum == 34 || bnum == 44) {
            num = newAudioClip(getClass().getResource("/matematicas/numeros/4.wav"));
            num.play();
        }
        if (bnum == 15 || bnum == 25 || bnum == 35 || bnum == 45) {
            num = newAudioClip(getClass().getResource("/matematicas/numeros/5.wav"));
            num.play();
        }
        if (bnum == 16 || bnum == 26 || bnum == 36 || bnum == 46) {
            num = newAudioClip(getClass().getResource("/matematicas/numeros/6.wav"));
            num.play();
        }
        if (bnum == 17 || bnum == 27 || bnum == 37 || bnum == 47) {
            num = newAudioClip(getClass().getResource("/matematicas/numeros/7.wav"));
            num.play();
        }
        if (bnum == 18 || bnum == 28 || bnum == 38 || bnum == 48) {
            num = newAudioClip(getClass().getResource("/matematicas/numeros/8.wav"));
            num.play();
        }
        if (bnum == 19 || bnum == 29 || bnum == 39 || bnum == 49) {
            num = newAudioClip(getClass().getResource("/matematicas/numeros/9.wav"));
            num.play();
        }
    }

    void nada() {
        num = newAudioClip(getClass().getResource("/matematicas/numeros/nada.wav"));
        num.play();
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
            for (javax.swing.UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Numeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        invokeLater(new Runnable() {
            public void run() {
                new Numeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anex;
    private javax.swing.JButton cero;
    private javax.swing.JButton cero1;
    private javax.swing.JButton cero2;
    private javax.swing.JButton cero3;
    private javax.swing.JButton cero4;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cinco1;
    private javax.swing.JButton cinco2;
    private javax.swing.JButton cinco3;
    private javax.swing.JButton cinco4;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton cuatro1;
    private javax.swing.JButton cuatro2;
    private javax.swing.JButton cuatro3;
    private javax.swing.JButton cuatro4;
    private javax.swing.JPanel cuerpo;
    private javax.swing.JPanel cuerpo1;
    private javax.swing.JPanel cuerpo2;
    private javax.swing.JPanel cuerpo3;
    private javax.swing.JButton dos;
    private javax.swing.JButton dos0;
    private javax.swing.JButton dos1;
    private javax.swing.JButton dos2;
    private javax.swing.JButton dos3;
    private javax.swing.JButton dos4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JButton nex;
    private javax.swing.JButton nueve;
    private javax.swing.JButton nueve1;
    private javax.swing.JButton nueve2;
    private javax.swing.JButton nueve3;
    private javax.swing.JButton nueve4;
    private javax.swing.JButton nueve5;
    private javax.swing.JButton ocho;
    private javax.swing.JButton ocho1;
    private javax.swing.JButton ocho2;
    private javax.swing.JButton ocho3;
    private javax.swing.JButton ocho4;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem regresars;
    private javax.swing.JButton rei;
    private javax.swing.JButton seis;
    private javax.swing.JButton seis1;
    private javax.swing.JButton seis2;
    private javax.swing.JButton seis3;
    private javax.swing.JButton seis4;
    private javax.swing.JButton siete;
    private javax.swing.JButton siete1;
    private javax.swing.JButton siete2;
    private javax.swing.JButton siete3;
    private javax.swing.JButton siete4;
    private javax.swing.JButton tres;
    private javax.swing.JButton tres1;
    private javax.swing.JButton tres2;
    private javax.swing.JButton tres3;
    private javax.swing.JButton tres4;
    private javax.swing.JButton uno;
    private javax.swing.JButton uno0;
    private javax.swing.JButton uno1;
    private javax.swing.JButton uno2;
    private javax.swing.JButton uno3;
    private javax.swing.JButton uno4;
    // End of variables declaration//GEN-END:variables
}
