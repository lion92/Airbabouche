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
public class Vol extends javax.swing.JFrame {
Connection con;
        PreparedStatement pst;
    /**
     * Creates new form Vol
     */
    public Vol() {
        initComponents();
    try {
        tableUpdateCompagnie();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        tableUpdateVol();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        tableUpdateAeroportArrive();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
        tableUpdateAeroportDepart();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
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

        placevol = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        intitulevol = new javax.swing.JTextField();
        datededepart = new javax.swing.JTextField();
        dateArrivee = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        voltable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        compagnieTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        aeroportdeparttable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        aeroportarriveetable = new javax.swing.JTable();
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
        setTitle("Vol");

        placevol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placevolActionPerformed(evt);
            }
        });

        jLabel2.setText("Intitule");

        jLabel3.setText("Place");

        jLabel6.setText("Date d arrivee");

        jLabel7.setText("Date de depart");

        intitulevol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intitulevolActionPerformed(evt);
            }
        });

        datededepart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datededepartActionPerformed(evt);
            }
        });

        dateArrivee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateArriveeActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(voltable);

        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modifier");

        jButton3.setText("Supprimer");

        compagnieTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "idCompagnie", "nom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        compagnieTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compagnieTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(compagnieTable);

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

        aeroportarriveetable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(aeroportarriveetable);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateArrivee, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datededepart, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(intitulevol, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(placevol, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(258, 258, 258))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(placevol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(intitulevol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datededepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateArrivee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableUpdateAeroportArrive() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
            
             pst=con.prepareStatement("Select * from aeroport"); 
             ResultSet rs = pst.executeQuery();
                   ResultSetMetaData rsmd= rs.getMetaData();
                   int cpt=rsmd.getColumnCount();
                   DefaultTableModel dtm=(DefaultTableModel)aeroportarriveetable.getModel();
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
    private void tableUpdateAeroportDepart() throws ClassNotFoundException, SQLException{
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
    private void placevolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placevolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placevolActionPerformed

    private void intitulevolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intitulevolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_intitulevolActionPerformed

    private void datededepartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datededepartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datededepartActionPerformed

    private void dateArriveeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateArriveeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateArriveeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             try {
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
             } catch (SQLException ex) {
                 Logger.getLogger(Vol.class.getName()).log(Level.SEVERE, null, ex);
             }
            pst=con.prepareStatement("insert into vol(place, intitule, aeroport_depart, aeroport_arrive, date_depart, date_arrive, idcompagnie)"
                     + "values(?,?,?,?,?,?,?)");
                  DefaultTableModel dtmaeroprtdepart=(DefaultTableModel)aeroportdeparttable.getModel();
                   int selectedIndexAD=aeroportdeparttable.getSelectedRow();
                   DefaultTableModel dtmaeroportarrivee=(DefaultTableModel)aeroportarriveetable.getModel();
                    int selectedIndexAR=aeroportarriveetable.getSelectedRow();
                  
                     pst.setInt(1,Integer.parseInt(placevol.getText()));
                     pst.setString(2, intitulevol.getText());
                     pst.setString(3, dtmaeroprtdepart.getValueAt(selectedIndexAD,0).toString());
                     pst.setString(4,dtmaeroportarrivee.getValueAt(selectedIndexAR,0).toString() );
                     System.out.println("test");
                     pst.setString(5,datededepart.getText() );
                     pst.setString(6, dateArrivee.getText());
                     DefaultTableModel dtm=(DefaultTableModel)compagnieTable.getModel();
                     int selectedIndex=compagnieTable.getSelectedRow();
                     pst.setInt(7, Integer.parseInt(dtm.getValueAt(selectedIndex,0).toString()));
                     
                     
                     
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
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private void tableUpdateCompagnie() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airbabouche?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "" );
            
             pst=con.prepareStatement("Select * from compagnie"); 
             ResultSet rs = pst.executeQuery();
                   ResultSetMetaData rsmd= rs.getMetaData();
                   int cpt=rsmd.getColumnCount();
                   DefaultTableModel dtm=(DefaultTableModel)compagnieTable.getModel();
                   dtm.setRowCount(0);
                   while(rs.next()){
                   Vector vect= new Vector();
                   for(int i=0; i<=cpt;i++){
                   vect.add(rs.getString("idcompagnie"));
                   vect.add(rs.getString("nom"));
                   
                   
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
    private void compagnieTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compagnieTableMouseClicked
        // TODO add your handling code here:
         DefaultTableModel dtm=(DefaultTableModel)compagnieTable.getModel();
        int selectedIndex=compagnieTable.getSelectedRow();
     
    }//GEN-LAST:event_compagnieTableMouseClicked

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
            java.util.logging.Logger.getLogger(Vol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vol().setVisible(true);
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
    private javax.swing.JTable aeroportarriveetable;
    private javax.swing.JTable aeroportdeparttable;
    private javax.swing.JTable compagnieTable;
    private javax.swing.JTextField dateArrivee;
    private javax.swing.JTextField datededepart;
    private javax.swing.JTextField intitulevol;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField placevol;
    private javax.swing.JTable voltable;
    // End of variables declaration//GEN-END:variables
}
