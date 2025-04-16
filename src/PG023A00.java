public class PG023A00 extends javax.swing.JFrame { public PG023A00() { 
    initComponents(); 
} 
 
@SuppressWarnings("unchecked") 
 
private void initComponents() { 
 
    jLabel1 = new javax.swing.JLabel(); 
    jLabel2 = new javax.swing.JLabel(); 
    jTextField2 = new javax.swing.JTextField(); 
    jTextField3 = new javax.swing.JTextField(); 
    jButton1 = new javax.swing.JButton(); 
    jButton2 = new javax.swing.JButton(); 
    jButton3 = new javax.swing.JButton(); 
 
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE); 
    setTitle("PG023A00"); 
 
    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); 
    jLabel1.setText("Fahrenheit"); 
 
    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); 
    jLabel2.setText("Celsius"); 
 
    jTextField2.addActionListener(new java.awt.event.ActionListener() { 
        public void actionPerformed(java.awt.event.ActionEvent evt) { 
            jTextField2ActionPerformed(evt); 
        } 
    }); 
 
    jTextField3.addActionListener(new java.awt.event.ActionListener() { 
        public void actionPerformed(java.awt.event.ActionEvent evt) { 
            jTextField3ActionPerformed(evt); 
        } 
    }); 
 
    jButton1.setText("Calcular"); 
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
 
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane()); 
    getContentPane().setLayout(layout); 
    layout.setHorizontalGroup( 
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
        .addGroup(layout.createSequentialGroup() 
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
                .addGroup(layout.createSequentialGroup() 
                    .addGap(63, 63, 63) 
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
                        .addComponent(jLabel1) 
                        .addComponent(jLabel2)) 
                    .addGap(59, 59, 59) 
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false) 
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE) 
                        .addComponent(jTextField2))) 
                .addGroup(layout.createSequentialGroup() 
                    .addGap(178, 178, 178) 
                    .addComponent(jButton1) 
                    .addGap(18, 18, 18) 
                    .addComponent(jButton2) 
                    .addGap(18, 18, 18) 
                    .addComponent(jButton3))) 
            .addContainerGap(169, Short.MAX_VALUE)) 
    ); 
    layout.setVerticalGroup( 
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) 
        .addGroup(layout.createSequentialGroup() 
            .addGap(72, 72, 72) 
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)) 
            .addGap(39, 39, 39) 
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE) 
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)) 
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE) 
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE) 
                .addComponent(jButton3) 
                .addComponent(jButton1) 
                .addComponent(jButton2)) 
            .addGap(106, 106, 106)) 
    ); 
 
    pack(); 
}                        
 
private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                             
 
}                                            
 
private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {                                             
     
}                                            
 
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                          
      int Celsius; 
    double Fahrenheit; 
     
    Celsius = Integer.parseInt(jTextField3.getText()); 
    Fahrenheit = Celsius * 1.8 + 32; 
     
    jTextField2.setText(Fahrenheit + "Graus"); 
}                                         
 
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                          
    jTextField3.setText(""); 
    jTextField2.setText(""); 
    jTextField3.requestFocus(); 
}                                         
 
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                          
    dispose(); 
}                                         
 
 
public static void main(String args[]) { 
    
    java.awt.EventQueue.invokeLater(new Runnable() { 
        public void run() { 
            new PG023A00().setVisible(true); 
        } 
    }); 
} 
                 
private javax.swing.JButton jButton1; 
private javax.swing.JButton jButton2; 
private javax.swing.JButton jButton3; 
private javax.swing.JLabel jLabel1; 
private javax.swing.JLabel jLabel2; 
private javax.swing.JTextField jTextField2; 
private javax.swing.JTextField jTextField3; 
                 
  

} 