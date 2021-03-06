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
public class Aeroport extends javax.swing.JFrame {
 Connection con;
        PreparedStatement pst;
    
     private void tableUpdate() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
            
             pst=con.prepareStatement("Select * from aeroport"); 
             ResultSet rs = pst.executeQuery();
                   ResultSetMetaData rsmd= rs.getMetaData();
                   int cpt=rsmd.getColumnCount();
                   DefaultTableModel dtm=(DefaultTableModel)aeroporttable.getModel();
                   dtm.setRowCount(0);
                   while(rs.next()){
                   Vector vect= new Vector();
                   for(int i=0; i<=cpt;i++){
                   vect.add(rs.getString("idaeroport"));
                   vect.add(rs.getString("nom"));
                   vect.add(rs.getString("ville"));
                   vect.add(rs.getString("pays"));
                   
                   
                   
                   
                   }
                   
                   dtm.addRow(vect);
                   
                   
                   }  
        
     }
    /**
     * Creates new form Aeroport
     */
    public Aeroport() {
        
        System.out.println("ouvert aeroport");
     try {
         initComponents();
         tableUpdate();
         tableUpdatePays();
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Aeroport.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(Aeroport.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        aeroporttable = new javax.swing.JTable();
        nomaeroport = new javax.swing.JTextField();
        villeaeroport = new javax.swing.JTextField();
        paysaeroport = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        idaeroport = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        paystable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Aeroport = new javax.swing.JMenu();
        Client = new javax.swing.JMenu();
        Compagnie = new javax.swing.JMenu();
        Escale = new javax.swing.JMenu();
        Passager = new javax.swing.JMenu();
        Pays = new javax.swing.JMenu();
        Personne = new javax.swing.JMenu();
        Reservation = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        Vol = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aeroport");

        jLabel1.setText("nom");

        jLabel2.setText("pays");

        jLabel3.setText("ville");

        aeroporttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idAeroport", "nom", "ville", "pays"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(aeroporttable);

        jButton1.setText("Ajouter");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modifier");

        jButton3.setText("Supprimer");

        jLabel4.setText("id");

        paystable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nom"
            }
        ));
        paystable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paystableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(paystable);

        jLabel5.setText("Sélectionner un pays en cliquant sur le tableau");

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

        Reservation.setText("Reservation");
        Reservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservationMouseClicked(evt);
            }
        });
        Reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservationActionPerformed(evt);
            }
        });
        jMenuBar1.add(Reservation);
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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomaeroport, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(villeaeroport, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paysaeroport, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idaeroport, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomaeroport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idaeroport, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(villeaeroport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paysaeroport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String idaeroport=this.idaeroport.getText();
            String nomaeroport=this.nomaeroport.getText();
       String villeaeroport=this.villeaeroport.getText();
       int paysaeroport=Integer.parseInt(this.idaeroport.getText());
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
            pst=con.prepareStatement("insert into aeroport(idaeroport,nom, ville, pays)"
                     + "values(?,?,?,?)");
                  
                     pst.setString(1,idaeroport);
                     pst.setString(2, nomaeroport);
                     pst.setString(3, villeaeroport);
                     pst.setInt(4,paysaeroport );
                     pst.executeUpdate();
                     JOptionPane.showMessageDialog(this, "Donnée enregistrer");
                     
                     } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Personne.class.getName()).log(Level.SEVERE, null, ex);
        }
        
               
    }//GEN-LAST:event_jButton1ActionPerformed

                                           

    private void tableUpdatePays() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
            
             pst=con.prepareStatement("Select * from pays"); 
             ResultSet rs = pst.executeQuery();
                   ResultSetMetaData rsmd= rs.getMetaData();
                   int cpt=rsmd.getColumnCount();
                   DefaultTableModel dtm=(DefaultTableModel)paystable.getModel();
                   dtm.setRowCount(0);
                   while(rs.next()){
                   Vector vect= new Vector();
                   for(int i=0; i<=cpt;i++){
                   vect.add(rs.getString("idPays"));
                   vect.add(rs.getString("nom"));
                   
                   
                      }
                   
                   dtm.addRow(vect);
                   
                   
                   }  
                     
                   }
    private void paystableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paystableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm=(DefaultTableModel)paystable.getModel();
        int selectedIndex=paystable.getSelectedRow();
      idaeroport.setText(dtm.getValueAt(selectedIndex,0).toString());
        paysaeroport.setText(dtm.getValueAt(selectedIndex,1).toString());
    }//GEN-LAST:event_paystableMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            // TODO add your handling code here:
            tableUpdate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Aeroport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Aeroport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

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

    private void ReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservationMouseClicked
        // TODO add your handling code here:
        new Reservation().setVisible(true);
    }//GEN-LAST:event_ReservationMouseClicked

    private void ReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservationActionPerformed
        // TODO add your handling code here:
        new Reservation().setVisible(true);
    }//GEN-LAST:event_ReservationActionPerformed

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
            java.util.logging.Logger.getLogger(Aeroport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aeroport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aeroport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aeroport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aeroport().setVisible(true);
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
    private javax.swing.JMenu Reservation;
    private javax.swing.JMenu Vol;
    private javax.swing.JTable aeroporttable;
    private javax.swing.JTextField idaeroport;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nomaeroport;
    private javax.swing.JTextField paysaeroport;
    private javax.swing.JTable paystable;
    private javax.swing.JTextField villeaeroport;
    // End of variables declaration//GEN-END:variables
}
