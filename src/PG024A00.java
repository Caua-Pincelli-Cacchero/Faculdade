public class PG024A00 extends javax.swing.JFrame { 
    public PG024A00() { 
        initComponents(); 
    } 
     
    @SuppressWarnings("unchecked") 
                        
    private void initComponents() { 
     
        jLabel1 = new javax.swing.JLabel(); 
        jLabel2 = new javax.swing.JLabel(); 
        jTextField3 = new javax.swing.JTextField(); 
        jButton1 = new javax.swing.JButton(); 
        jButton2 = new javax.swing.JButton(); 
        jButton3 = new javax.swing.JButton(); 
        jScrollPane1 = new javax.swing.JScrollPane(); 
        jTextArea1 = new javax.swing.JTextArea(); 
        jScrollPane2 = new javax.swing.JScrollPane(); 
        jList1 = new javax.swing.JList<>(); 
     
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
        setTitle("PG024A00"); 
     
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N 
        jLabel1.setText("Naturalidade"); 
     
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N 
        jLabel2.setText("Nome"); 
     
        jTextField3.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jTextField3ActionPerformed(evt); 
            } 
        }); 
     
        jButton1.setText("Ok"); 
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
     
        jButton3.setText("Fechar"); 
        jButton3.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) { 
                jButton3ActionPerformed(evt); 
            } 
        }); 
     
        jTextArea1.setColumns(20); 
        jTextArea1.setRows(5); 
        jScrollPane1.setViewportView(jTextArea1); 
     
        jList1.setModel(new javax.swing.AbstractListModel<String>() { 
            String[] strings = { "Santo André", "São Bernardo do Campo", "São Caetano do Sul", "Diadema" }; 
            public int getSize() { return strings.length; } 
            public String getElementAt(int i) { return strings[i]; } 
        }); 
        jList1.setToolTipText(""); 
        jScrollPane2.setViewportView(jList1); 
     
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
        getContentPane().setLayout(layout); 
        layout.setHorizontalGroup( 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(layout.createSequentialGroup() 
                .addGap(75, 75, 75) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false) 
                    .addGroup(layout.createSequentialGroup() 
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
                            .addComponent(jLabel2) 
                            .addComponent(jLabel1)) 
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE) 
                            .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))) 
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE) 
                    .addGroup(layout.createSequentialGroup() 
                        .addComponent(jButton1) 
                        .addGap(115, 115, 115) 
                        .addComponent(jButton2) 
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) 
                        .addComponent(jButton3))) 
                .addContainerGap(74, Short.MAX_VALUE)) 
        ); 
        layout.setVerticalGroup( 
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
            .addGroup(layout.createSequentialGroup() 
                .addGap(72, 72, 72) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE) 
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)) 
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE) 
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)) 
                .addGap(28, 28, 28) 
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addGap(18, 18, 18) 
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                    .addComponent(jButton1) 
                    .addComponent(jButton2) 
                    .addComponent(jButton3)) 
                .addGap(31, 31, 31)) 
        ); 
     
        pack(); 
    }// </editor-fold>                         
     
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here: 
    }                                            
     
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String Nome = jTextField3.getText(); 
      
    
    String Cidade = jList1.getSelectedValue().toString(); 
    
    jTextArea1.setText(Nome + " nasceu em " + Cidade); }  
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        jTextField3.setText(""); 
        jTextArea1.setText(""); 
        jTextField3.requestFocus(); 
    }                                         
     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        dispose(); 
    }                                         
     
    /** 
     * @param args the command line arguments 
     */ 
    public static void main(String args[]) { 
     
        java.awt.EventQueue.invokeLater(new Runnable() { 
            public void run() { 
                new PG024A00().setVisible(true); 
            } 
        }); 
    } 
     
    // Variables declaration - do not modify                      
    private javax.swing.JButton jButton1; 
    private javax.swing.JButton jButton2; 
    private javax.swing.JButton jButton3; 
    private javax.swing.JLabel jLabel1; 
    private javax.swing.JLabel jLabel2; 
    private javax.swing.JList<String> jList1; 
    private javax.swing.JScrollPane jScrollPane1; 
    private javax.swing.JScrollPane jScrollPane2; 
    private javax.swing.JTextArea jTextArea1; 
    private javax.swing.JTextField jTextField3; 
}