package metodosnumericos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Errores extends javax.swing.JInternalFrame {

    public Errores() {
        setSize(400,200);
        initComponents();
        this.setClosable(true);
        this.setMaximizable(true);
        this.setResizable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btntrunc = new javax.swing.JRadioButton();
        btnredon = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ea = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        er = new javax.swing.JTextField();
        va = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        calcular = new javax.swing.JButton();
        vv = new javax.swing.JTextField();
        resultado1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        resultado2 = new javax.swing.JTextField();
        cd = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Porcental1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 255, 204));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecciona una opción"));

        buttonGroup1.add(btntrunc);
        btntrunc.setText("Truncamiento");

        buttonGroup1.add(btnredon);
        btnredon.setText("Redondeo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btntrunc)
                .addGap(18, 18, 18)
                .addComponent(btnredon)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntrunc)
                    .addComponent(btnredon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setText("Absoluto");

        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/iconos/reset.jpg"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jLabel4.setText("Error Absoluto");

        jLabel1.setText("Valor Verdadero ");

        jLabel5.setText("Error Relativo");

        jLabel2.setText("Valor Aproximado ");

        calcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/metodosnumericos/iconos/cal.png"))); // NOI18N
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad Decimales");

        jLabel7.setText("Relativo");

        jLabel6.setText("Porcentual");

        Porcental1.setText("      %");
        Porcental1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Porcental1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(vv, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(56, 56, 56))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(va, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(23, 23, 23)
                                                    .addComponent(jLabel7)))
                                            .addGap(13, 13, 13))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel5)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(er)
                                                .addComponent(ea)))))
                                .addGap(0, 11, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(calcular))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Porcental1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(vv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(va, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calcular)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(er, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Porcental1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(reset)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        vv.setText(null);
        va.setText(null);
        cd.setText(null);
        ea.setText(null);
        er.setText(null);
        resultado1.setText(null);
        resultado2.setText(null);
        Porcental1.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        double vreal = Double.parseDouble(vv.getText());     
        double vaproximado = Double.parseDouble(va.getText());
        double porcenta2=0;
        //Establecemos el numero de decimales
        if(btntrunc.isSelected()){   
            ea.setText("" + Math.abs(vreal-vaproximado));
            er.setText("" + Math.abs((vreal-vaproximado)/vreal));  
            
            //============ valor truncado de error absoluto
            //convirtiendo valor de decimales a entero
            int decimales=Integer.parseInt(cd.getText());
            //calculo de valor absoluto
            double calabs = Math.abs(vreal-vaproximado);
            double resulabs=calabs;
            String abs = "" + calabs;
            int absolut = abs.indexOf('.');
            if (absolut!=-1) {
                if (abs.length() > absolut+decimales) {
                    abs = abs.substring(0,absolut+decimales+1);
                    resulabs  = Double.parseDouble(abs);
                }
                resultado1.setText(""+resulabs);
            }
            //============ valor truncado de error relativo
            double calrel = Math.abs((vreal-vaproximado)/vreal);
            double resulrel=calrel;
            String relat = "" + calrel;
            int can = relat.indexOf('.');
            if (can!=-1) {
                if (relat.length() > can+decimales) {
                    relat = relat.substring(0,can+decimales+1);
                    resulrel  = Double.parseDouble(relat);
                }
                resultado2.setText(""+resulrel);
                Porcental1.setText(""+resulrel*100);
            }
        }else if(btnredon.isSelected()){
            ea.setText("" + Math.abs(vreal-vaproximado));
            er.setText("" + Math.abs((vreal-vaproximado)/vreal));
            //================
            int decimales=Integer.parseInt(cd.getText());
            //Double valorAbsoluto=Double.parseDouble(ea.getText());    
            
            //double redondear= new BigDecimal(valorAbsoluto).setScale(decimales, RoundingMode.HALF_EVEN).doubleValue();
            //resultado1.setText("" + redondear); 
            //=====
            Double valorabsoluto = Math.abs(vreal-vaproximado);
            BigDecimal vabs = new BigDecimal(valorabsoluto);
            vabs = vabs.setScale(decimales, RoundingMode.HALF_UP);
            //Impresion de resultado
            resultado1.setText("" + vabs); 
            
            Double valorrelativo = Math.abs(Math.abs((vreal-vaproximado)/vreal));
            BigDecimal vre = new BigDecimal(valorrelativo);
            vre = vre.setScale(decimales, RoundingMode.HALF_UP);
            //Impresion de resultado
            
            resultado2.setText("" + vre);
            porcenta2 = ( Math.abs((vreal-vaproximado)/vreal))*100;
            BigDecimal pc = new BigDecimal(porcenta2);
            pc = pc.setScale(decimales, RoundingMode.HALF_UP);
            
            Porcental1.setText("" + pc);
            
        }
        
    }//GEN-LAST:event_calcularActionPerformed

    private void Porcental1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Porcental1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Porcental1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Porcental1;
    private javax.swing.JRadioButton btnredon;
    private javax.swing.JRadioButton btntrunc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calcular;
    private javax.swing.JTextField cd;
    private javax.swing.JTextField ea;
    private javax.swing.JTextField er;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reset;
    private javax.swing.JTextField resultado1;
    private javax.swing.JTextField resultado2;
    private javax.swing.JTextField va;
    private javax.swing.JTextField vv;
    // End of variables declaration//GEN-END:variables
}
