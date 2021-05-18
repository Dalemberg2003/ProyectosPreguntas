package ventanas;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class frm_test extends javax.swing.JFrame {

    frm_info info;
    frm_principal principal;
    String tema, tiempo = "", respuesta = "";
    int acumulador = 0, validar = 0;
    String[] pjava;
    String[] phyton;
    String[] javascript;
    String[] c1;
    String[] c2;

    public frm_test() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        pjava = new String[5];
        phyton = new String[5];
        javascript = new String[5];
        c1 = new String[5];
        c2 = new String[5];

        pjava[0] = " Pregunta #1\n"
                + " ¿Instanciar una clase es conectar dos\n"
                + " clases entre si?";
        pjava[1] = " Pregunta #2\n"
                + " ¿Sobrecargar un metodo significa crear\n"
                + " un metodo con el mismo nombre pero\n"
                + " diferentes argumentos?";
        pjava[2] = " Pregunta #3\n"
                + " Una excepcion es un objeto que no puede\n"
                + " ser instanciado?";
        pjava[3] = " Pregunta #4\n"
                + " ¿Una clase es un modelo o plantilla a\n"
                + " partir de la cual creamos objetos?";
        pjava[4] = " Pregunta #5\n"
                + " ¿Los elementos que definen a un objeto\n"
                + " son sus atributos y sus metodos?";

        phyton[0] = " Pregunta #1\n"
                + " ¿El siguiente error se genera al intentar\n"
                + " modificar el contenido de una tupla?"
                + " TypeError: 'xxxxx' object does not support\n"
                + " item assignment";
        phyton[1] = " Pregunta #2\n"
                + " ¿Las tuplas suelen contener una secuencia\n"
                + " heterogenea de elementos?";
        phyton[2] = " Pregunta #3\n"
                + " ¿El metodo .append() es utilizado en las\n"
                + " tuplas?";
        phyton[3] = " Pregunta #4\n"
                + " ¿Los strings en phyton son inmutables?";
        phyton[4] = " Pregunta #5\n"
                + " ¿El metodo clear se utiliza para borrar\n"
                + " todos los elementos de la lista?";

        javascript[0] = " Pregunta #1\n"
                + " ¿El siguiente error se genera al intentar\n"
                + " modificar el contenido de una tupla?"
                + " TypeError: 'xxxxx' object does not support\n"
                + " item assignment";
        javascript[1] = " Pregunta #2\n"
                + " ¿Las tuplas suelen contener una secuencia\n"
                + " heterogenea de elementos?";
        javascript[2] = " Pregunta #3\n"
                + " ¿El metodo .append() es utilizado en las\n"
                + " tuplas?";
        javascript[3] = " Pregunta #4\n"
                + " ¿Los strings en phyton son inmutables?";
        javascript[4] = " Pregunta #5\n"
                + " ¿El metodo clear se utiliza para borrar\n"
                + " todos los elementos de la lista?";

        c1[0] = " Pregunta #1\n"
                + " ¿El siguiente error se genera al intentar\n"
                + " modificar el contenido de una tupla?"
                + " TypeError: 'xxxxx' object does not support\n"
                + " item assignment";
        c1[1] = " Pregunta #2\n"
                + " ¿Las tuplas suelen contener una secuencia\n"
                + " heterogenea de elementos?";
        c1[2] = " Pregunta #3\n"
                + " ¿El metodo .append() es utilizado en las\n"
                + " tuplas?";
        c1[3] = " Pregunta #4\n"
                + " ¿Los strings en phyton son inmutables?";
        c1[4] = " Pregunta #5\n"
                + " ¿El metodo clear se utiliza para borrar\n"
                + " todos los elementos de la lista?";

        c2[0] = " Pregunta #1\n"
                + " ¿El siguiente error se genera al intentar\n"
                + " modificar el contenido de una tupla?"
                + " TypeError: 'xxxxx' object does not support\n"
                + " item assignment";
        c2[1] = " Pregunta #2\n"
                + " ¿Las tuplas suelen contener una secuencia\n"
                + " heterogenea de elementos?";
        c2[2] = " Pregunta #3\n"
                + " ¿El metodo .append() es utilizado en las\n"
                + " tuplas?";
        c2[3] = " Pregunta #4\n"
                + " ¿Los strings en phyton son inmutables?";
        c2[4] = " Pregunta #5\n"
                + " ¿El metodo clear se utiliza para borrar\n"
                + " todos los elementos de la lista?";

        info = new frm_info();
        principal = new frm_principal();
        tema = info.tema;
        t = new Timer(1000, acciones);
        t.start();

        if (tema.equalsIgnoreCase("Java")) {
            text_area.setText(pjava[0]);
            respuesta = "falso";
            validar = 1;

        } else if (tema.equalsIgnoreCase("Phyton")) {
            text_area.setText(phyton[0]);
            respuesta = "verdadero";
            validar = 1;
        } else if (tema.equalsIgnoreCase("Javascript")) {
            text_area.setText(javascript[0]);
            respuesta = "verdadero";
            validar = 1;
        } else if (tema.equalsIgnoreCase("C#")) {
            text_area.setText(c1[0]);
            respuesta = "falso";
            validar = 1;
        } else if (tema.equalsIgnoreCase("C++")) {
            text_area.setText(c2[0]);
            respuesta = "verdadero";
            validar = 1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl_t = new javax.swing.JLabel();
        btn_terminar = new javax.swing.JButton();
        btn_principal = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
        radio_verdadero = new javax.swing.JRadioButton();
        radio_falso = new javax.swing.JRadioButton();
        lbl_puntos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_area = new javax.swing.JTextArea();
        lbl_tiempo = new javax.swing.JLabel();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_t.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_t.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_time_25px.png"))); // NOI18N
        lbl_t.setText("Tiempo:");
        jPanel1.add(lbl_t, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 25));

        btn_terminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_task_completed_40px.png"))); // NOI18N
        btn_terminar.setText("Terminar test");
        btn_terminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_terminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_terminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 160, 50));

        btn_principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_menu_40px_2.png"))); // NOI18N
        btn_principal.setText("Menú principal");
        btn_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principalActionPerformed(evt);
            }
        });
        jPanel1.add(btn_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 65, 160, 50));

        btn_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_next_page_40px.png"))); // NOI18N
        btn_siguiente.setText("Siguiente");
        btn_siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_siguiente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 130, 50));

        buttonGroup1.add(radio_verdadero);
        radio_verdadero.setText("Verdadero");
        jPanel1.add(radio_verdadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 278, -1, -1));

        buttonGroup1.add(radio_falso);
        radio_falso.setText("Falso");
        jPanel1.add(radio_falso, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 278, 76, -1));

        lbl_puntos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_puntos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_puntos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_game_controller_25px.png"))); // NOI18N
        lbl_puntos.setText("Puntos:");
        jPanel1.add(lbl_puntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 150, 25));

        text_area.setEditable(false);
        text_area.setBackground(new java.awt.Color(204, 204, 204));
        text_area.setColumns(20);
        text_area.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        text_area.setRows(5);
        text_area.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(text_area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 84, 387, 164));

        lbl_tiempo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_tiempo.setText("00:00:00");
        jPanel1.add(lbl_tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 41, 70, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 665, 373));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Timer t;
    private int h, m, s;
    private ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {

            s++;
            if (s == 60) {
                s = 0;
                ++m;
            }
            if (m == 60) {
                m = 0;
                ++h;
            }
            actualizarLabel();
        }
    };

    private void actualizarLabel() {
        tiempo = (h <= 9 ? "0" : "") + h + ":" + (m <= 9 ? "0" : "") + m + ":" + (s <= 9 ? "0" : "") + s;
        lbl_tiempo.setText(tiempo);
    }

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed

        //validamos si se selecciono verdadero o falso
        if (radio_verdadero.isSelected()) {
            if (respuesta.equals("verdadero")) {
                acumulador++;
                lbl_puntos.setText("Puntos: " + acumulador);
            } else {
                if (acumulador <= 0) {
                    acumulador = 0;
                    lbl_puntos.setText("Puntos: " + acumulador);
                } else {
                    acumulador--;
                    lbl_puntos.setText("Puntos: " + acumulador);
                }
            }

        } else if (radio_falso.isSelected()) {
            if (respuesta.equals("falso")) {
                acumulador++;
                lbl_puntos.setText("Puntos: " + acumulador);
            } else {
                if (acumulador <= 0) {
                    acumulador = 0;
                    lbl_puntos.setText("Puntos: " + acumulador);
                } else {
                    acumulador--;
                    lbl_puntos.setText("Puntos: " + acumulador);
                }
            }

        }

        //reiniciamos el radiobuttom
        buttonGroup1.clearSelection();

        //aqui cambiamos la pregunta
        if (validar == 1) {
            if (tema.equalsIgnoreCase("Java")) {
                text_area.setText(pjava[1]);
                respuesta = "verdadero";
                validar = 2;

            } else if (tema.equalsIgnoreCase("Phyton")) {
                text_area.setText(phyton[1]);
                respuesta = "verdadero";
                validar = 2;
            } else if (tema.equalsIgnoreCase("Javascript")) {
                text_area.setText(javascript[1]);
                respuesta = "verdadero";
                validar = 2;
            } else if (tema.equalsIgnoreCase("C#")) {
                text_area.setText(c1[1]);
                respuesta = "falso";
                validar = 2;
            } else if (tema.equalsIgnoreCase("C++")) {
                text_area.setText(c2[1]);
                respuesta = "verdadero";
                validar = 2;
            }
        } else if (validar == 2) {
            if (tema.equalsIgnoreCase("Java")) {
                text_area.setText(pjava[2]);
                respuesta = "verdadero";
                validar = 3;

            } else if (tema.equalsIgnoreCase("Phyton")) {
                text_area.setText(phyton[2]);
                respuesta = "falso";
                validar = 3;
            } else if (tema.equalsIgnoreCase("Javascript")) {
                text_area.setText(javascript[2]);
                respuesta = "verdadero";
                validar = 3;
            } else if (tema.equalsIgnoreCase("C#")) {
                text_area.setText(c1[2]);
                respuesta = "falso";
                validar = 3;
            } else if (tema.equalsIgnoreCase("C++")) {
                text_area.setText(c2[2]);
                respuesta = "verdadero";
                validar = 3;
            }
        } else if (validar == 3) {
            if (tema.equalsIgnoreCase("Java")) {
                text_area.setText(pjava[3]);
                respuesta = "verdadero";
                validar = 4;

            } else if (tema.equalsIgnoreCase("Phyton")) {
                text_area.setText(phyton[3]);
                respuesta = "verdadero";
                validar = 4;
            } else if (tema.equalsIgnoreCase("Javascript")) {
                text_area.setText(javascript[3]);
                respuesta = "verdadero";
                validar = 4;
            } else if (tema.equalsIgnoreCase("C#")) {
                text_area.setText(c1[3]);
                respuesta = "falso";
                validar = 4;
            } else if (tema.equalsIgnoreCase("C++")) {
                text_area.setText(c2[3]);
                respuesta = "verdadero";
                validar = 4;
            }
        } else if (validar == 4) {
            if (tema.equalsIgnoreCase("Java")) {
                text_area.setText(pjava[4]);
                respuesta = "verdadero";
                validar = 5;

            } else if (tema.equalsIgnoreCase("Phyton")) {
                text_area.setText(phyton[4]);
                respuesta = "verdadero";
                validar = 5;
            } else if (tema.equalsIgnoreCase("Javascript")) {
                text_area.setText(javascript[4]);
                respuesta = "verdadero";
                validar = 5;
            } else if (tema.equalsIgnoreCase("C#")) {
                text_area.setText(c1[4]);
                respuesta = "falso";
                validar = 5;
            } else if (tema.equalsIgnoreCase("C++")) {
                text_area.setText(c2[4]);
                respuesta = "verdadero";
                validar = 5;
            }
        } else if (validar == 5) {
            if (tema.equalsIgnoreCase("Java")) {
                validar = 6;
                //aqui terminamos el test
                if (validar == 6) {
                    t.stop();
                    JOptionPane.showMessageDialog(this, "Puntuacion final: " + acumulador + "\nTiempo transcurrido: " + tiempo);
                    h = 0;
                    m = 0;
                    s = 0;
                    actualizarLabel();
                    principal.setVisible(true);
                    this.setVisible(false);
                }
            } else if (tema.equalsIgnoreCase("Phyton")) {
                validar = 6;
                //aqui terminamos el test
                if (validar == 6) {
                    t.stop();
                    JOptionPane.showMessageDialog(this, "Puntuacion final: " + acumulador + "\nTiempo transcurrido: " + tiempo);
                    h = 0;
                    m = 0;
                    s = 0;
                    actualizarLabel();
                    principal.setVisible(true);
                    this.setVisible(false);
                }
            } else if (tema.equalsIgnoreCase("Javascript")) {
                validar = 6;
                //aqui terminamos el test
                if (validar == 6) {
                    t.stop();
                    JOptionPane.showMessageDialog(this, "Puntuacion final: " + acumulador + "\nTiempo transcurrido: " + tiempo);
                    h = 0;
                    m = 0;
                    s = 0;
                    actualizarLabel();
                    principal.setVisible(true);
                    this.setVisible(false);
                }
            } else if (tema.equalsIgnoreCase("C#")) {
                validar = 6;
                //aqui terminamos el test
                if (validar == 6) {
                    t.stop();
                    JOptionPane.showMessageDialog(this, "Puntuacion final: " + acumulador + "\nTiempo transcurrido: " + tiempo);
                    h = 0;
                    m = 0;
                    s = 0;
                    actualizarLabel();
                    principal.setVisible(true);
                    this.setVisible(false);
                }
            } else if (tema.equalsIgnoreCase("C++")) {
                validar = 6;
                //aqui terminamos el test
                if (validar == 6) {
                    t.stop();
                    JOptionPane.showMessageDialog(this, "Puntuacion final: " + acumulador + "\nTiempo transcurrido: " + tiempo);
                    h = 0;
                    m = 0;
                    s = 0;
                    actualizarLabel();
                    principal.setVisible(true);
                    this.setVisible(false);
                }
            }
        }

    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void btn_terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_terminarActionPerformed

        t.stop();
        JOptionPane.showMessageDialog(this, "Puntuacion final: " + acumulador + "\nTiempo transcurrido: " + tiempo);
        h = 0;
        m = 0;
        s = 0;
        actualizarLabel();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_terminarActionPerformed

    private void btn_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principalActionPerformed
        t.stop();
        h = 0;
        m = 0;
        s = 0;
        actualizarLabel();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_principalActionPerformed

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
            java.util.logging.Logger.getLogger(frm_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_principal;
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JButton btn_terminar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_puntos;
    private javax.swing.JLabel lbl_t;
    private javax.swing.JLabel lbl_tiempo;
    private javax.swing.JRadioButton radio_falso;
    private javax.swing.JRadioButton radio_verdadero;
    private javax.swing.JTextArea text_area;
    // End of variables declaration//GEN-END:variables

}
