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
public class Escale extends javax.swing.JFrame {
Connection con;
        PreparedStatement pst;
    /**
     * Creates new form Escale
     */
    public Escale() {
        initComponents();
    try {
        tableUpdateAeroport();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Escale.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Escale.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        tableUpdateVol();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Escale.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Escale.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        tableUpdatescale();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Escale.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Escale.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    private void tableUpdateAeroport() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
            
             pst=con.prepareStatement("Select * from aeroport"); 
             ResultSet rs = pst.executeQuery();
                   ResultSetMetaData rsmd= rs.getMetaData();
                   int cpt=rsmd.getColumnCount();
                   DefaultTableModel dtm=(DefaultTableModel)aeroportdeparttable.getModel();
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
    private void tableUpdatescale() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
            
             pst=con.prepareStatement("Select * from escale"); 
             ResultSet rs = pst.executeQuery();
                   ResultSetMetaData rsmd= rs.getMetaData();
                   int cpt=rsmd.getColumnCount();
                   DefaultTableModel dtm=(DefaultTableModel)escaletable.getModel();
                   dtm.setRowCount(0);
                   while(rs.next()){
                   Vector vect= new Vector();
                   for(int i=0; i<=cpt;i++){
                   vect.add(rs.getString("vol_idvol"));
                   vect.add(rs.getString("aeroport_idaeroport"));
                   vect.add(rs.getString("date_depart"));
                   vect.add(rs.getString("date_arrive"));
                   
                   
                   
                   
                   }
                   
                   dtm.addRow(vect);
                   
                   
                   }  
        
     }
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
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        date_depart = new javax.swing.JTextField();
        date_arrive = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        escaletable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        aeroportdeparttable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        voltable = new javax.swing.JTable();
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
        setTitle("Escale");

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modifier");

        jButton3.setText("Supprimer");

        jLabel4.setText("date_depart");

        escaletable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "vol_idvol", "aeroport_idaeroport", "date_depart", "date_arrive"
            }
        ));
        jScrollPane1.setViewportView(escaletable);

        jLabel5.setText("date_arrive");

        aeroportdeparttable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(aeroportdeparttable);

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
        jScrollPane2.setViewportView(voltable);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(date_arrive, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(date_depart)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_depart, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_arrive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       
        try {                                         
            // TODO add your handling code here:

            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
                try {
                    pst=con.prepareStatement("insert into escale(vol_idvol,aeroport_idaeroport, date_depart, date_arrive)"
                            + "values(?,?,?,?)");
                } catch (SQLException ex) {
                    Logger.getLogger(Escale.class.getName()).log(Level.SEVERE, null, ex);
                }
                DefaultTableModel dtmaeroprtdepart=(DefaultTableModel)aeroportdeparttable.getModel();
                int selectedIndexAD=aeroportdeparttable.getSelectedRow();
                DefaultTableModel dtmvol=(DefaultTableModel)voltable.getModel();
                int selectedVol=voltable.getSelectedRow();
                pst.setInt(1,Integer.parseInt(dtmvol.getValueAt(selectedVol,0).toString()));
                pst.setString(2, dtmaeroprtdepart.getValueAt(selectedIndexAD,0).toString());
                pst.setString(3, date_depart.getText());
                pst.setString(4, date_arrive.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Donnée enregistrer");
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Personne.class.getName()).log(Level.SEVERE, null, ex);
            }
            tableUpdatescale();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Escale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
        Logger.getLogger(Escale.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Escale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escale().setVisible(true);
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
    private javax.swing.JTable aeroportdeparttable;
    private javax.swing.JTextField date_arrive;
    private javax.swing.JTextField date_depart;
    private javax.swing.JTable escaletable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable voltable;
    // End of variables declaration//GEN-END:variables
}
