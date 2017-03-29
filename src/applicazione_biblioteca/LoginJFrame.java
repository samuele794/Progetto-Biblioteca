/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicazione_biblioteca;

import java.sql.*;
import java.awt.Frame;
import java.sql.DriverManager;

/**
 *
 * @author 3-5AINF
 */
public class LoginJFrame extends javax.swing.JFrame {

    private String nome_utente= "5a_pc3";
    private String pass = "5a_pc3";
    private String url = "jdbc:mysql://serverlab5:3307/5a_pc3";
    private String query = null;
    private Connection con = null;
    private Statement st = null;
    private ResultSet rs = null;
    
    
    public LoginJFrame() {
        initComponents();
            
    }

    /*
    creo un boolean e uso il metodo rs.isLast()
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TF_utente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        B_login = new javax.swing.JButton();
        B_annulla = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        PS_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(185, 165));

        jLabel1.setText("Nome Utente");

        TF_utente.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel2.setText("Password");

        B_login.setText("Login");
        B_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_loginMouseClicked(evt);
            }
        });

        B_annulla.setText("Annulla");
        B_annulla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_annullaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B_login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(B_annulla))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PS_password)
                            .addComponent(TF_utente, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TF_utente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PS_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B_login)
                            .addComponent(B_annulla)))
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_loginMouseClicked
       try{
            //1 caricare del driver
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException caffee){
            System.out.println(caffee);
        }
       
       	//2 creazione della connessione
        try{
            con = DriverManager.getConnection(url, nome_utente, pass);
        }catch(SQLException sqle){
            System.out.println(sqle);
        }
        
        try{
            query = "SELECT * from UTENTI WHERE ID_UTENTE= '" + TF_utente.getText() + "' AND PASS= '" + PS_password.getText() + "'";
            
            st = con.createStatement();
            //4esecuzione statement
            rs = st.executeQuery(query); //usato per eseguire delle SELECT
            

            //5 elaborazione risultati
            
            while(rs.next()){
                if(rs.wasNull()){
                    System.out.println("vuoto2");
                }
                int perm_pren1 = rs.getInt(5);
                int perm_agg1 = rs.getInt(6);
                int perm_rim1 = rs.getInt(7);
                
                Boolean perm_pren;
                Boolean perm_agg;
                Boolean perm_rim;
                
                if(perm_pren1==0) 
                    perm_pren=false;
                        else
                     perm_pren=true;
                if(perm_agg1==0)
                    perm_agg=false;
                        else
                    perm_agg=false;
                
                if(perm_rim1==0)
                    perm_rim=false;
                        else
                    perm_rim=true;
              User utente = new User(rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(9), perm_pren, perm_agg, perm_rim);
              User.saveUser(utente);
              StartJFrame.setLogin(true);
              //StartJFrame.setBen("Benvenuto "+ rs.getString(2));
              StartJFrame.Text_login_ben.setText("Benvenuto " + rs.getString(2) + " "+ rs.getString(3));
            }

            //6 chiusura
            
            if(rs.wasNull()){
                System.out.println("vuoto");
            }
            
            rs.close();
            st.close();
            con.close();
            
            dispose();
        }catch(SQLException sqle2){

        }

        
        
       
    }//GEN-LAST:event_B_loginMouseClicked

    private void B_annullaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_annullaMouseClicked
        this.dispose();
    }//GEN-LAST:event_B_annullaMouseClicked

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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_annulla;
    private javax.swing.JButton B_login;
    private javax.swing.JPasswordField PS_password;
    private javax.swing.JTextField TF_utente;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
