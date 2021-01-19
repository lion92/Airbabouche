/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compagnieaerienneswing.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kriss
 */
public class Reservation extends javax.swing.JFrame {

    /**
     * Creates new form Reservation
     */
    Connection con;
        PreparedStatement pst;
    private void tableUpdateVol() throws ClassNotFoundException, SQLException{
        
        Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
            
             pst=con.prepareStatement("Select * from vol"); 
             ResultSet rs = pst.executeQuery();
                   ResultSetMetaData rsmd= rs.getMetaData();
                   int cpt=rsmd.getColumnCount();
                   DefaultTableModel dtm=(DefaultTableModel)voltable.getModel();
                   dtm.setRowCount(0);
                   
                   while(rs.next()){
                   Vector vect= new Vector();
                   for(int i=0; i<=cpt;i++){
                   vect.add(rs.getString("idvol"));
                   vect.add(rs.getString("place"));
                   vect.add(rs.getString("intitule"));
                   vect.add(rs.getString("aeroport_depart"));
                   vect.add(rs.getString("aeroport_arrive"));
                   vect.add(rs.getString("date_depart"));
                   vect.add(rs.getString("date_arrive"));
                   vect.add(rs.getString("idcompagnie"));
                   
                      }
                   
                   dtm.addRow(vect);
                   
                   
                   }  
                     
            }
    private void tableUpdate() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
            
             pst=con.prepareStatement("Select * from personne"); 
             ResultSet rs = pst.executeQuery();
                   ResultSetMetaData rsmd= rs.getMetaData();
                   int cpt=rsmd.getColumnCount();
                   DefaultTableModel dtm=(DefaultTableModel)clientpersonne.getModel();
                   dtm.setRowCount(0);
                   while(rs.next()){
                   Vector vect= new Vector();
                   for(int i=0; i<=cpt;i++){
                   vect.add(rs.getString("idpersonne"));
                   vect.add(rs.getString("nom"));
                   vect.add(rs.getString("prenom"));
                   
                   
                   
                   }
                   
                   dtm.addRow(vect);
                   
                   
                   }  
                  
                   
                   
              
                    

        
     }
    private void tableUpdateReservation() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
            
             pst=con.prepareStatement("Select * from reservation"); 
             ResultSet rs = pst.executeQuery();
                   ResultSetMetaData rsmd= rs.getMetaData();
                   int cpt=rsmd.getColumnCount();
                   DefaultTableModel dtm=(DefaultTableModel)Reservation.getModel();
                   dtm.setRowCount(0);
                   while(rs.next()){
                   Vector vect= new Vector();
                   for(int i=0; i<=cpt;i++){
                   vect.add(rs.getString("idvol"));
                   vect.add(rs.getString("client_idpersonne"));
                   vect.add(rs.getString("confirmation"));
                   vect.add(rs.getString("personne_idpersonne")); 
                   
                   
                   }
                   
                   dtm.addRow(vect);
                   
                   
                   }  
                  
                   
                   
              
                    

        
     }
    public Reservation() {
        initComponents();
        try {
            tableUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            tableUpdateVol();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            tableUpdateReservation();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        confirmation = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Reservation = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientpersonne = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        voltable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Aeroport = new javax.swing.JMenu();
        Client = new javax.swing.JMenu();
        Compagnie = new javax.swing.JMenu();
        Escale = new javax.swing.JMenu();
        Passager = new javax.swing.JMenu();
        Pays = new javax.swing.JMenu();
        Personne = new javax.swing.JMenu();
        Reservation1 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        Vol = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reservation");

        jLabel4.setText("Confirmation");

        Reservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IdVol", "Client_idpersonne", "confirmation", "Personne_idpersonne"
            }
        ));
        jScrollPane1.setViewportView(Reservation);

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modifier");

        jButton3.setText("Supprimer");

        clientpersonne.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id", "Nom", "Prenom"
            }
        ));
        clientpersonne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientpersonneMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(clientpersonne);

        voltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "idvol", "place", "AeroportDepart", "AeroportArrivee", "Date de départ", "Date d'arrivee", "idCompagnie"
            }
        ));
        jScrollPane3.setViewportView(voltable);

        Aeroport.setText("Aeroport");
        Aeroport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AeroportMouseClicked(evt);
            }
        });
        Aeroport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AeroportActionPerformed(evt);
            }
        });
        jMenuBar1.add(Aeroport);

        Client.setText("Client");
        Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientMouseClicked(evt);
            }
        });
        Client.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientActionPerformed(evt);
            }
        });
        jMenuBar1.add(Client);

        Compagnie.setText("Compagnie");
        Compagnie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CompagnieMouseClicked(evt);
            }
        });
        Compagnie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompagnieActionPerformed(evt);
            }
        });
        jMenuBar1.add(Compagnie);

        Escale.setText("Escale");
        Escale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EscaleMouseClicked(evt);
            }
        });
        Escale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscaleActionPerformed(evt);
            }
        });
        jMenuBar1.add(Escale);

        Passager.setText("Passager");
        Passager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassagerMouseClicked(evt);
            }
        });
        Passager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassagerActionPerformed(evt);
            }
        });
        jMenuBar1.add(Passager);

        Pays.setText("Pays");
        Pays.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaysMouseClicked(evt);
            }
        });
        Pays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaysActionPerformed(evt);
            }
        });
        jMenuBar1.add(Pays);

        Personne.setText("Personne");
        Personne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PersonneMouseClicked(evt);
            }
        });
        Personne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonneActionPerformed(evt);
            }
        });
        jMenuBar1.add(Personne);

        Reservation1.setText("Reservation");
        Reservation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reservation1MouseClicked(evt);
            }
        });
        Reservation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reservation1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(Reservation1);
        jMenuBar1.add(jMenu10);

        Vol.setText("Vol");
        Vol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolMouseClicked(evt);
            }
        });
        Vol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolActionPerformed(evt);
            }
        });
        jMenuBar1.add(Vol);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             try {
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
             } catch (SQLException ex) {
                 Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
             }
            pst=con.prepareStatement("insert into reservation(idvol, client_idpersonne, confirmation, personne_idpersonne)"
                     + "values(?,?,?,?)");
                  DefaultTableModel dtmpersonne=(DefaultTableModel)clientpersonne.getModel();
                   int selectedIndexpersonne=clientpersonne.getSelectedRow();
                   DefaultTableModel dtmavol=(DefaultTableModel)voltable.getModel();
                    int selectedIndexvol=voltable.getSelectedRow();
                  
                     pst.setInt(1,Integer.parseInt(dtmavol.getValueAt(selectedIndexvol,0).toString()));
                     pst.setInt(2,Integer.parseInt(dtmpersonne.getValueAt(selectedIndexpersonne,0).toString()));
                     pst.setString(3, confirmation.getText());
                     pst.setInt(4,Integer.parseInt(dtmpersonne.getValueAt(selectedIndexpersonne,0).toString()));
                     System.out.println("test");
                   

                     
                     
                     
                     pst.executeUpdate();
                     JOptionPane.showMessageDialog(this, "Donnée enregistrer");
                     
                     } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Personne.class.getName()).log(Level.SEVERE, null, ex);
        }
    try {
        tableUpdateVol();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
    }
        try {
            tableUpdateReservation();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void clientpersonneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientpersonneMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm=(DefaultTableModel)clientpersonne.getModel();
        int selectedIndex=clientpersonne.getSelectedRow();
       

    }//GEN-LAST:event_clientpersonneMouseClicked

    private void AeroportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AeroportMouseClicked
        // TODO add your handling code here:
        new Aeroport().setVisible(true);

    }//GEN-LAST:event_AeroportMouseClicked

    private void AeroportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AeroportActionPerformed
        // TODO add your handling code here:
        new Aeroport().setVisible(true);
    }//GEN-LAST:event_AeroportActionPerformed

    private void ClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientMouseClicked
        // TODO add your handling code here:
        new Client().setVisible(true);
    }//GEN-LAST:event_ClientMouseClicked

    private void ClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientActionPerformed
        // TODO add your handling code here:
        new Client().setVisible(true);
    }//GEN-LAST:event_ClientActionPerformed

    private void CompagnieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CompagnieMouseClicked
        // TODO add your handling code here:
        new Compagnie().setVisible(true);
    }//GEN-LAST:event_CompagnieMouseClicked

    private void CompagnieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompagnieActionPerformed
        // TODO add your handling code here:
        new Compagnie().setVisible(true);
    }//GEN-LAST:event_CompagnieActionPerformed

    private void EscaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscaleMouseClicked
        // TODO add your handling code here:
        new Escale().setVisible(true);
    }//GEN-LAST:event_EscaleMouseClicked

    private void EscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscaleActionPerformed
        // TODO add your handling code here:
        new Escale().setVisible(true);
    }//GEN-LAST:event_EscaleActionPerformed

    private void PassagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassagerMouseClicked
        // TODO add your handling code here:
        new Passager().setVisible(true);
    }//GEN-LAST:event_PassagerMouseClicked

    private void PassagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassagerActionPerformed
        // TODO add your handling code here:
        new Passager().setVisible(true);
    }//GEN-LAST:event_PassagerActionPerformed

    private void PaysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaysMouseClicked
        // TODO add your handling code here:
        new Pays().setVisible(true);
    }//GEN-LAST:event_PaysMouseClicked

    private void PaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaysActionPerformed
        // TODO add your handling code here:
        new Pays().setVisible(true);
    }//GEN-LAST:event_PaysActionPerformed

    private void PersonneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PersonneMouseClicked
        // TODO add your handling code here:
        new Personne().setVisible(true);
    }//GEN-LAST:event_PersonneMouseClicked

    private void PersonneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonneActionPerformed
        // TODO add your handling code here:
        new Personne().setVisible(true);
    }//GEN-LAST:event_PersonneActionPerformed

    private void Reservation1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reservation1MouseClicked
        // TODO add your handling code here:
        new Reservation().setVisible(true);
    }//GEN-LAST:event_Reservation1MouseClicked

    private void Reservation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reservation1ActionPerformed
        // TODO add your handling code here:
        new Reservation().setVisible(true);
    }//GEN-LAST:event_Reservation1ActionPerformed

    private void VolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolMouseClicked
        // TODO add your handling code here:
        new Vol().setVisible(true);
    }//GEN-LAST:event_VolMouseClicked

    private void VolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolActionPerformed
        // TODO add your handling code here:
        new Vol().setVisible(true);
    }//GEN-LAST:event_VolActionPerformed

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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Aeroport;
    private javax.swing.JMenu Client;
    private javax.swing.JMenu Compagnie;
    private javax.swing.JMenu Escale;
    private javax.swing.JMenu Passager;
    private javax.swing.JMenu Pays;
    private javax.swing.JMenu Personne;
    private javax.swing.JTable Reservation;
    private javax.swing.JMenu Reservation1;
    private javax.swing.JMenu Vol;
    private javax.swing.JTable clientpersonne;
    private javax.swing.JTextField confirmation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable voltable;
    // End of variables declaration//GEN-END:variables
}
