/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compagnieaerienneswing.principal;

/**
 *
 * @author kriss
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Bienvenue chez Airbabouche");

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
                .addGap(159, 159, 159)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
