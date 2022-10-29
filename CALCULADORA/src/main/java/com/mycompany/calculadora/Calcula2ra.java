package com.mycompany.calculadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Calcula2ra extends javax.swing.JFrame {
        
    private double numero1;
    private double numero2;
    private String operador;
    
    /**
     * Creates new form Calcula2ra
     */
    public Calcula2ra() {
        initComponents();
        this.setLocationRelativeTo(null);
        
     
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        letrero1 = new javax.swing.JTextField();
        botonC = new javax.swing.JButton();
        botDiv = new javax.swing.JButton();
        mult = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        bot7 = new javax.swing.JButton();
        bot8 = new javax.swing.JButton();
        bot9 = new javax.swing.JButton();
        bot4 = new javax.swing.JButton();
        bot5 = new javax.swing.JButton();
        bot6 = new javax.swing.JButton();
        bot3 = new javax.swing.JButton();
        bot1 = new javax.swing.JButton();
        bot2 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        decimal = new javax.swing.JButton();
        agrega = new javax.swing.JButton();
        total = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        letrero1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });

        botDiv.setText("/");
        botDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDivActionPerformed(evt);
            }
        });

        mult.setText("*");
        mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multActionPerformed(evt);
            }
        });

        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        bot7.setText("7");
        bot7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot7ActionPerformed(evt);
            }
        });

        bot8.setText("8");
        bot8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot8ActionPerformed(evt);
            }
        });

        bot9.setText("9");
        bot9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot9ActionPerformed(evt);
            }
        });

        bot4.setText("4");
        bot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot4ActionPerformed(evt);
            }
        });

        bot5.setText("5");
        bot5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot5ActionPerformed(evt);
            }
        });

        bot6.setText("6");
        bot6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot6ActionPerformed(evt);
            }
        });

        bot3.setText("3");
        bot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot3ActionPerformed(evt);
            }
        });

        bot1.setText("1");
        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot1ActionPerformed(evt);
            }
        });

        bot2.setText("2");
        bot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot2ActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        decimal.setText(".");
        decimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalActionPerformed(evt);
            }
        });

        agrega.setText("+");
        agrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregaActionPerformed(evt);
            }
        });

        total.setText("=");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bot7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bot8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bot9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bot6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bot1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bot2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bot3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(decimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(agrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(letrero1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(letrero1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(agrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(decimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multActionPerformed
        this.numero1=Double.parseDouble(this.letrero1.getText()); 
        this.operador="*";
        this.letrero1.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_multActionPerformed

    private void bot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot2ActionPerformed
        this.letrero1.setText(this.letrero1.getText()+"2");        // TODO add your handling code here:
    }//GEN-LAST:event_bot2ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        this.letrero1.setText(this.letrero1.getText()+"0");        // TODO add your handling code here:
    }//GEN-LAST:event_num0ActionPerformed

    private void bot8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot8ActionPerformed
        this.letrero1.setText(this.letrero1.getText()+"8");        // TODO add your handling code here:
    }//GEN-LAST:event_bot8ActionPerformed

    private void bot7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot7ActionPerformed
        this.letrero1.setText(this.letrero1.getText()+"7");        // TODO add your handling code here:
    }//GEN-LAST:event_bot7ActionPerformed

    private void bot9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot9ActionPerformed
        this.letrero1.setText(this.letrero1.getText()+"9");        // TODO add your handling code here:
    }//GEN-LAST:event_bot9ActionPerformed

    private void bot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot4ActionPerformed
        this.letrero1.setText(this.letrero1.getText()+"4");        // TODO add your handling code here:
    }//GEN-LAST:event_bot4ActionPerformed

    private void bot5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot5ActionPerformed
        this.letrero1.setText(this.letrero1.getText()+"5");        // TODO add your handling code here:
    }//GEN-LAST:event_bot5ActionPerformed

    private void bot6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot6ActionPerformed
        this.letrero1.setText(this.letrero1.getText()+"6");        // TODO add your handling code here:
    }//GEN-LAST:event_bot6ActionPerformed

    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        this.letrero1.setText(this.letrero1.getText()+"1");        // TODO add your handling code here:
    }//GEN-LAST:event_bot1ActionPerformed

    private void bot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot3ActionPerformed
        this.letrero1.setText(this.letrero1.getText()+"3");        // TODO add your handling code here:
    }//GEN-LAST:event_bot3ActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        this.letrero1.setText("");         // TODO add your handling code here:
    }//GEN-LAST:event_botonCActionPerformed

    private void agregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregaActionPerformed
        this.numero1=Double.parseDouble(this.letrero1.getText()); 
        this.operador="+";
        this.letrero1.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_agregaActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        this.numero2=Double.parseDouble(this.letrero1.getText()); 
        
        switch(this.operador){
            case "+" -> this.letrero1.setText(Double.toString(this.numero1+this.numero2));
            case "-" -> this.letrero1.setText(Double.toString(this.numero1-this.numero2));
            case "*" -> this.letrero1.setText(Double.toString(this.numero1*this.numero2));
            case "/" -> this.letrero1.setText(Double.toString(this.numero1/this.numero2));}
                
           // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        this.numero1=Double.parseDouble(this.letrero1.getText()); 
        this.operador="-";
        this.letrero1.setText("");    
    }//GEN-LAST:event_restaActionPerformed

    private void botDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDivActionPerformed
        this.numero1=Double.parseDouble(this.letrero1.getText()); 
        this.operador="/";
        this.letrero1.setText("");            // TODO add your handling code here:
    }//GEN-LAST:event_botDivActionPerformed

    private void decimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalActionPerformed
        if(this.letrero1.getText().contains(".")){
            this.letrero1.setText(this.letrero1.getText()+"3");
        
      } else {     
        }     
    }//GEN-LAST:event_decimalActionPerformed

        public String sincero(float resultado){
            String retorno="";
            
            retorno=Float.toString(resultado);
            
            if(resultado%1==0){
               retorno=retorno.substring(0,retorno.length()-2);
            }
            
            return retorno;
        
            
    }
                
                
        public static void main(String[]args) {
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
            java.util.logging.Logger.getLogger(Calcula2ra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calcula2ra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calcula2ra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calcula2ra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calcula2ra().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agrega;
    private javax.swing.JButton bot1;
    private javax.swing.JButton bot2;
    private javax.swing.JButton bot3;
    private javax.swing.JButton bot4;
    private javax.swing.JButton bot5;
    private javax.swing.JButton bot6;
    private javax.swing.JButton bot7;
    private javax.swing.JButton bot8;
    private javax.swing.JButton bot9;
    private javax.swing.JButton botDiv;
    private javax.swing.JButton botonC;
    private javax.swing.JButton decimal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField letrero1;
    private javax.swing.JButton mult;
    private javax.swing.JButton num0;
    private javax.swing.JButton resta;
    private javax.swing.JButton total;
    // End of variables declaration//GEN-END:variables
}