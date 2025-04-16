public class PG026A00 extends javax.swing.JFrame { 

    public PG026A00() { 
        initComponents(); 
    } 
     
     
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                           
    private void initComponents() { 
     
        jComboBox1 = new javax.swing.JComboBox<>(); 
        jScrollPane1 = new javax.swing.JScrollPane(); 
        jTextArea1 = new javax.swing.JTextArea(); 
        jButton1 = new javax.swing.JButton(); 
        jButton2 = new javax.swing.JButton(); 
        jButton3 = new javax.swing.JButton(); 
        jPanel1 = new javax.swing.JPanel(); 
        jRadioButton4 = new javax.swing.JRadioButton(); 
        jRadioButton5 = new javax.swing.JRadioButton(); 
        jRadioButton6 = new javax.swing.JRadioButton(); 
        jPanel2 = new javax.swing.JPanel(); 
        jCheckBox1 = new javax.swing.JCheckBox(); 
        jCheckBox2 = new javax.swing.JCheckBox(); 
        jCheckBox3 = new javax.swing.JCheckBox(); 
     
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
        setTitle("PG026A00"); 
     
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cruze", "Hb20", "Corsa", "Civic" })); 
        jComboBox1.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jComboBox1ActionPerformed(evt); 
            } 
        }); 
     
        jScrollPane1.setAutoscrolls(true); 
     
        jTextArea1.setColumns(20); 
        jTextArea1.setRows(5); 
        jScrollPane1.setViewportView(jTextArea1); 
     
        jButton1.setText("OK"); 
        jButton1.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jButton1ActionPerformed(evt); 
            } 
        }); 
     
        jButton2.setText("Limpar"); 
        jButton2.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jButton2ActionPerformed(evt); 
            } 
        }); 
     
        jButton3.setText("Fim"); 
        jButton3.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jButton3ActionPerformed(evt); 
            } 
        }); 
     
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Combustíveis")); 
     
        jRadioButton4.setText("Gasolina"); 
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jRadioButton4ActionPerformed(evt); 
            } 
        }); 
     
        jRadioButton5.setText("Álcool"); 
     
        jRadioButton6.setText("Flex"); 
     
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1); 
        jPanel1.setLayout(jPanel1Layout); 
        jPanel1Layout.setHorizontalGroup( 
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(jPanel1Layout.createSequentialGroup() 
                .addContainerGap() 
                .addComponent(jRadioButton4) 
                .addGap(29, 29, 29) 
                .addComponent(jRadioButton5) 
                .addGap(36, 36, 36) 
                .addComponent(jRadioButton6) 
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) 
        ); 
        jPanel1Layout.setVerticalGroup( 
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(jPanel1Layout.createSequentialGroup() 
                .addGap(40, 40, 40) 
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                    .addComponent(jRadioButton4) 
                    .addComponent(jRadioButton6) 
                    .addComponent(jRadioButton5)) 
                .addContainerGap(39, Short.MAX_VALUE)) 
        ); 
     
        jCheckBox1.setText("Direção Hidráulica"); 
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jCheckBox1ActionPerformed(evt); 
            } 
        }); 
     
        jCheckBox2.setText("Bancos de couro"); 
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jCheckBox2ActionPerformed(evt); 
            } 
        }); 
     
        jCheckBox3.setText("Vidros Elétricos"); 
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jCheckBox3ActionPerformed(evt); 
            } 
        }); 
     
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2); 
        jPanel2.setLayout(jPanel2Layout); 
        jPanel2Layout.setHorizontalGroup( 
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(jPanel2Layout.createSequentialGroup() 
                .addContainerGap() 
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
                    .addComponent(jCheckBox2) 
                    .addComponent(jCheckBox3) 
                    .addComponent(jCheckBox1)) 
                .addContainerGap(45, Short.MAX_VALUE)) 
        ); 
        jPanel2Layout.setVerticalGroup( 
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup() 
                .addContainerGap(25, Short.MAX_VALUE) 
                .addComponent(jCheckBox1) 
                .addGap(20, 20, 20) 
                .addComponent(jCheckBox2) 
                .addGap(18, 18, 18) 
                .addComponent(jCheckBox3) 
                .addGap(21, 21, 21)) 
        ); 
     
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
        getContentPane().setLayout(layout); 
        layout.setHorizontalGroup( 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(layout.createSequentialGroup() 
                .addGap(102, 102, 102) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
                    .addGroup(layout.createSequentialGroup() 
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE) 
                        .addGap(47, 47, 47)) 
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() 
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
                        .addGap(78, 78, 78))) 
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) 
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup() 
                .addContainerGap(162, Short.MAX_VALUE) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
                    .addGroup(layout.createSequentialGroup() 
                        .addComponent(jButton1) 
                        .addGap(130, 130, 130) 
                        .addComponent(jButton2) 
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, javax.swing.GroupLayout.PREFERRED_SIZE)) 
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING) 
                        .addComponent(jButton3) 
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))) 
                .addGap(127, 127, 127)) 
        ); 
        layout.setVerticalGroup( 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(layout.createSequentialGroup() 
                .addGap(81, 81, 81) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING) 
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
                    .addGroup(layout.createSequentialGroup() 
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
                        .addGap(27, 27, 27) 
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))) 
                .addGap(18, 18, 18) 
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addGap(18, 18, 18) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                    .addComponent(jButton1) 
                    .addComponent(jButton3) 
                    .addComponent(jButton2)) 
                .addContainerGap(36, Short.MAX_VALUE)) 
        ); 
     
        pack(); 
    }// </editor-fold>                         
     
    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here: 
    }                                              
     
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here: 
    }                                           
     
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here: 
    }                                           
     
    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here: 
    }                                           
     
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jRadioButton4.setSelected(false); 
        jRadioButton5.setSelected(false); 
        jRadioButton6.setSelected(false); 
        jCheckBox1.setSelected(false); 
        jCheckBox2.setSelected(false); 
        jCheckBox3.setSelected(false); 
        jTextArea1.setText(""); 
        jComboBox1.setSelectedIndex(0); 
    }                                         
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String Automovel = (String) jComboBox1.getSelectedItem(); 
        String Texto; 
        Texto = "Automóvel = " + Automovel; 
     
        if (jRadioButton4.isSelected()) { 
            Texto = Texto + ", Combustível = Gasolina"; 
        } else if (jRadioButton5.isSelected()) { 
            Texto = Texto + ", Combustível = Alcool"; 
        } else { 
            Texto = Texto + ", Combustível = Flex"; 
        } 
     
        if (jCheckBox1.isSelected()) { 
            Texto = Texto + ", Acessório 1 = Direção Hidráulica"; 
        } 
     
        if (jCheckBox2.isSelected()) { 
            Texto = Texto + ", Acessório 2 = Banco de Couro"; 
        } 
        if (jCheckBox3.isSelected()) { 
            Texto = Texto + ", Acessório 3 = Vidros Elétricos"; 
        } 
     
        jTextArea1.setText(Texto); 
    }                                         
     
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
    }                                           
     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        dispose(); 
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
            java.util.logging.Logger.getLogger(PG026A00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        } catch (InstantiationException ex) { 
            java.util.logging.Logger.getLogger(PG026A00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        } catch (IllegalAccessException ex) { 
            java.util.logging.Logger.getLogger(PG026A00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        } catch (javax.swing.UnsupportedLookAndFeelException ex) { 
            java.util.logging.Logger.getLogger(PG026A00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        } 
        //</editor-fold> 
     
        /* Create and display the form */ 
        java.awt.EventQueue.invokeLater(new Runnable() { 
            public void run() { 
                new PG026A00().setVisible(true); 
            } 
        }); 
    } 
     
    // Variables declaration - do not modify                      
    private javax.swing.JButton jButton1; 
    private javax.swing.JButton jButton2; 
    private javax.swing.JButton jButton3; 
    private javax.swing.JCheckBox jCheckBox1; 
    private javax.swing.JCheckBox jCheckBox2; 
    private javax.swing.JCheckBox jCheckBox3; 
    private javax.swing.JComboBox<String> jComboBox1; 
    private javax.swing.JPanel jPanel1; 
    private javax.swing.JPanel jPanel2; 
    private javax.swing.JRadioButton jRadioButton4; 
    private javax.swing.JRadioButton jRadioButton5; 
    private javax.swing.JRadioButton jRadioButton6; 
    private javax.swing.JScrollPane jScrollPane1; 
    private javax.swing.JTextArea jTextArea1; 
    // End of variables declaration                    
      
    
    } 
    
     
    
     