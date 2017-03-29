/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicazione_biblioteca;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author 3-5AINF
 */
public class StartJFrame extends javax.swing.JFrame {

    private static Boolean login = false;

    /**
     * Creates new form StartJFrame
     */
    public StartJFrame() {
        initComponents();
          
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B_ric_e_pren = new javax.swing.JButton();
        B_login = new javax.swing.JButton();
        B_gestione = new javax.swing.JButton();
        Text_login_ben = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bibliteca 2.0");

        B_ric_e_pren.setText("Ricerca e prenota un libro");

        B_login.setBackground(new java.awt.Color(0, 0, 0));
        B_login.setForeground(new java.awt.Color(240, 240, 240));
        B_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account.png"))); // NOI18N
        B_login.setToolTipText("Login");
        B_login.setBorderPainted(false);
        B_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        B_login.setDefaultCapable(false);
        B_login.setFocusPainted(false);
        B_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_loginMouseClicked(evt);
            }
        });

        B_gestione.setText("Gestione sistema");

        Text_login_ben.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_ric_e_pren)
                        .addGap(18, 18, 18)
                        .addComponent(B_gestione))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Text_login_ben)))
                .addGap(100, 100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(B_login, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Text_login_ben)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_ric_e_pren)
                    .addComponent(B_gestione))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_loginMouseClicked
       /* 
        http://www.zentut.com/java-swing/joptionpane/
        http://www.java2s.com/Tutorial/Java/0240__Swing/CustomizingaJOptionPaneLookandFeel.htm
        
        */
       
       
       if(login){
           //FINESTRA PER CHI HA GIA ESEGUITO IL LOGIN
            AccountJFrame AJF = new AccountJFrame();
            AJF.setVisible(true);
       }else{       
           try{     //FINESTRA PER LOGIN
                LoginJFrame j =new LoginJFrame ();
                j.dispose(); 
                j.setUndecorated(true);

                j.setLocation(DimensioneSchermo.larghezza_schermoCentro() , DimensioneSchermo.altezza_schermoCentro());
                j.setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
       }
       
       
    }//GEN-LAST:event_B_loginMouseClicked

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
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartJFrame().setVisible(true);
            }
        });
    }
    
    public static void setLogin(Boolean login){
        StartJFrame.login = login;
    }
    
  /*  public static void setBen(String l){
        Text_login_ben.setText(l);
    }*/
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_gestione;
    private javax.swing.JButton B_login;
    private javax.swing.JButton B_ric_e_pren;
    public static javax.swing.JLabel Text_login_ben;
    // End of variables declaration//GEN-END:variables
}
