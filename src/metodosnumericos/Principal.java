package metodosnumericos;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.*;

public class Principal extends javax.swing.JFrame {
Errores tema1 = new Errores();

    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Errores = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 690));
        setPreferredSize(new java.awt.Dimension(343, 654));
        getContentPane().setLayout(null);

        desktopPane.setBackground(new java.awt.Color(153, 153, 255));
        desktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/iconos/OnePlusX.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, Short.MAX_VALUE)
                .addContainerGap())
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(desktopPane);
        desktopPane.setBounds(0, 0, 360, 600);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/iconos/Point.png"))); // NOI18N
        jMenu1.setText("MetodosNumericos");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenu3.setText("Tema1");

        Errores.setText("Errores");
        Errores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErroresActionPerformed(evt);
            }
        });
        jMenu3.add(Errores);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErroresActionPerformed
        //Error absoluto y error relativo
            if (!desktopPane.isAncestorOf(tema1)) {
            int x = (desktopPane.getWidth() / 2) - (tema1.getWidth() / 2);
            int y = (desktopPane.getHeight() / 2) - (tema1.getHeight() / 2);
            desktopPane.add(tema1);
            tema1.toFront();
            tema1.setLocation(x , y + 50);
            tema1.setVisible(true);
        } else {
            desktopPane.setSelectedFrame(tema1);
        }
    }//GEN-LAST:event_ErroresActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Errores;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
