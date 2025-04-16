public class PG025A00 extends javax.swing.JFrame { 
    public PG025A00() { 
        initComponents(); 
    } 
     
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                           
    private void initComponents() { 
     
        jLabel1 = new javax.swing.JLabel(); 
        jLabel2 = new javax.swing.JLabel(); 
        jTextField1 = new javax.swing.JTextField(); 
        jComboBox1 = new javax.swing.JComboBox<>(); 
        jScrollPane1 = new javax.swing.JScrollPane(); 
        jTextArea1 = new javax.swing.JTextArea(); 
        jButton1 = new javax.swing.JButton(); 
        jButton2 = new javax.swing.JButton(); 
        jButton3 = new javax.swing.JButton(); 
     
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
     
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N 
        jLabel1.setText("Nome"); 
     
        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N 
        jLabel2.setText("Profissão"); 
     
        jTextField1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N 
        jTextField1.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jTextField1ActionPerformed(evt); 
            } 
        }); 
     
        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N 
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar...", "Desenvolvedor BackEnd", "Desenvolvedor FrontEnd", "Desenvolvedor FullStack", "Analista de Dados" })); 
        jComboBox1.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jComboBox1ActionPerformed(evt); 
            } 
        }); 
     
        jTextArea1.setColumns(20); 
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N 
        jTextArea1.setRows(5); 
        jScrollPane1.setViewportView(jTextArea1); 
     
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N 
        jButton1.setText("OK"); 
        jButton1.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jButton1ActionPerformed(evt); 
            } 
        }); 
     
        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N 
        jButton2.setText("FIM"); 
        jButton2.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jButton2ActionPerformed(evt); 
            } 
        }); 
     
        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N 
        jButton3.setText("LIMPAR"); 
        jButton3.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jButton3ActionPerformed(evt); 
            } 
        }); 
     
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
        getContentPane().setLayout(layout); 
        layout.setHorizontalGroup( 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(layout.createSequentialGroup() 
                .addGap(95, 95, 95) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false) 
                    .addGroup(layout.createSequentialGroup() 
                        .addComponent(jButton1) 
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 
                        .addComponent(jButton3) 
                        .addGap(100, 100, 100) 
                        .addComponent(jButton2)) 
                    .addComponent(jScrollPane1) 
                    .addGroup(layout.createSequentialGroup() 
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
                            .addComponent(jLabel1) 
                            .addComponent(jLabel2)) 
                        .addGap(67, 67, 67) 
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false) 
                            .addComponent(jTextField1) 
                            .addComponent(jComboBox1, 0, 251, Short.MAX_VALUE)))) 
                .addContainerGap(88, Short.MAX_VALUE)) 
        ); 
        layout.setVerticalGroup( 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(layout.createSequentialGroup() 
                .addGap(108, 108, 108) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                    .addComponent(jLabel1) 
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
                .addGap(40, 40, 40) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                    .addComponent(jLabel2) 
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)) 
                .addGap(55, 55, 55) 
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                    .addComponent(jButton1) 
                    .addComponent(jButton3) 
                    .addComponent(jButton2)) 
                .addGap(46, 46, 46)) 
        ); 
     
        pack(); 
    }// </editor-fold>                         
     
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here: 
        dispose(); 
    }                                         
     
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here: 
    }                                            
     
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here: 
    }                                           
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here: 
        String Nome = jTextField1.getText(); 
        String Profissao = (String) jComboBox1.getSelectedItem(); 
     
        jTextArea1.setText(Nome + " é " + Profissao); 
    }                                         
     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here: 
        jTextField1.setText(""); 
        jComboBox1.setSelectedIndex(0); 
        jTextArea1.setText(""); 
         
        jTextField1.requestFocus(); 
     
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
            java.util.logging.Logger.getLogger(PG025A00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        } catch (InstantiationException ex) { 
            java.util.logging.Logger.getLogger(PG025A00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        } catch (IllegalAccessException ex) { 
            java.util.logging.Logger.getLogger(PG025A00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        } catch (javax.swing.UnsupportedLookAndFeelException ex) { 
            java.util.logging.Logger.getLogger(PG025A00.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); 
        } 
        //</editor-fold> 
     
        /* Create and display the form */ 
        java.awt.EventQueue.invokeLater(new Runnable() { 
            public void run() { 
                new PG025A00().setVisible(true); 
            } 
        }); 
    } 
     
    // Variables declaration - do not modify                      
    private javax.swing.JButton jButton1; 
    private javax.swing.JButton jButton2; 
    private javax.swing.JButton jButton3; 
    private javax.swing.JComboBox<String> jComboBox1; 
    private javax.swing.JLabel jLabel1; 
    private javax.swing.JLabel jLabel2; 
    private javax.swing.JScrollPane jScrollPane1; 
    private javax.swing.JTextArea jTextArea1; 
    private javax.swing.JTextField jTextField1; 
    // End of variables declaration                    
      
    
    } 