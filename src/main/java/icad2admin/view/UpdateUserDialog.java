/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package icad2admin.view;

import icad2admin.HashTool;
import icad2admin.controller.AddController;
import icad2admin.controller.UpdateController;
import icad2admin.model.Utilisateur;

import icad2admin.model.UtilisateurDAO;

import java.sql.SQLException;

import javax.swing.JFrame;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author t.combarieu
 */
public class UpdateUserDialog extends javax.swing.JDialog {

    private static Utilisateur selectedUser;

    MainFrame mainFrame = null;
    UtilisateurDAO dao = new UtilisateurDAO();
    UpdateController updateUser = new UpdateController(dao, this);

    public UpdateUserDialog(java.awt.Frame parent, boolean modal, Utilisateur selectedUser) {
        super(parent, modal);
        initComponents();
        this.mainFrame = (MainFrame) parent;
        this.selectedUser = selectedUser;
        setNom(selectedUser.getNom());
        setPrenom(selectedUser.getPrenom());
        setMetier(selectedUser.getFonction());
        setAdresse(selectedUser.getAdresse());
        setTelephone(selectedUser.getTel());
        setPassword(selectedUser.getMdp());
        setMail(selectedUser.getEmail());

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextPrenom = new javax.swing.JTextField();
        metierLabel = new javax.swing.JLabel();
        jTextTelephone = new javax.swing.JTextField();
        jBoxMetier = new javax.swing.JComboBox<>();
        telephoneLabel = new javax.swing.JLabel();
        mailLabel = new javax.swing.JLabel();
        jTextMail = new javax.swing.JTextField();
        mdpLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        jTextMdp = new javax.swing.JTextField();
        adresseLabel = new javax.swing.JLabel();
        jTextNom = new javax.swing.JTextField();
        nomLabel = new javax.swing.JLabel();
        prenomLabel = new javax.swing.JLabel();
        jTextAdresse = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextPrenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPrenomActionPerformed(evt);
            }
        });

        metierLabel.setText("Métier :");

        jTextTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelephoneActionPerformed(evt);
            }
        });

        jBoxMetier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veterinaire", "Policier", "Eleveur" }));
        jBoxMetier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBoxMetierActionPerformed(evt);
            }
        });

        telephoneLabel.setText("Téléphone :");

        mailLabel.setText("Mail :");

        jTextMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMailActionPerformed(evt);
            }
        });

        mdpLabel.setText("Mot de passe :");

        titleLabel.setText("Modifier un utilisateur");

        jTextMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMdpActionPerformed(evt);
            }
        });

        adresseLabel.setText("Adresse :");

        jTextNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomActionPerformed(evt);
            }
        });

        nomLabel.setText("Nom :");

        prenomLabel.setText("Prénom :");

        jTextAdresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAdresseActionPerformed(evt);
            }
        });

        updateButton.setText("Modifier");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(prenomLabel)
                                            .addComponent(nomLabel)
                                            .addComponent(metierLabel)
                                            .addComponent(mailLabel))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextNom, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBoxMetier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextMail, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(telephoneLabel)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(adresseLabel)
                                        .addComponent(mdpLabel))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextMdp, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titleLabel)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomLabel)
                    .addComponent(jTextNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomLabel)
                    .addComponent(jTextPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(metierLabel)
                    .addComponent(jBoxMetier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailLabel)
                    .addComponent(jTextMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mdpLabel)
                    .addComponent(jTextMdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresseLabel)
                    .addComponent(jTextAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telephoneLabel)
                    .addComponent(jTextTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextPrenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPrenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPrenomActionPerformed

    private void jTextTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTelephoneActionPerformed

    private void jTextMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMailActionPerformed

    private void jTextNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomActionPerformed

    private void jTextAdresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAdresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAdresseActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed

        updateUser.updateButtonAction();
        this.mainFrame.updateUI();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jBoxMetierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBoxMetierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBoxMetierActionPerformed

    private void jTextMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextMdpActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUserDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateUserDialog dialog = new UpdateUserDialog(new javax.swing.JFrame(), true, selectedUser);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adresseLabel;
    private javax.swing.JComboBox<String> jBoxMetier;
    private javax.swing.JTextField jTextAdresse;
    private javax.swing.JTextField jTextMail;
    private javax.swing.JTextField jTextMdp;
    private javax.swing.JTextField jTextNom;
    private javax.swing.JTextField jTextPrenom;
    private javax.swing.JTextField jTextTelephone;
    private javax.swing.JLabel mailLabel;
    private javax.swing.JLabel mdpLabel;
    private javax.swing.JLabel metierLabel;
    private javax.swing.JLabel nomLabel;
    private javax.swing.JLabel prenomLabel;
    private javax.swing.JLabel telephoneLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
public String getNom() {
        return jTextNom.getText();
    }

    public int getId() {
        return selectedUser.getId();
    }

    public String getPrenom() {
        return jTextPrenom.getText();
    }

    public String getMail() {
        return jTextMail.getText();
    }

    public String getMetier() {
        return jBoxMetier.getSelectedItem().toString();
    }

    public String getAdresse() {
        return jTextAdresse.getText();
    }

    public String getTelephone() {
        return jTextTelephone.getText();
    }

    public String getPassword() {
        return new String(HashTool.hash(String.valueOf(jTextMdp.getText())));
    }

    public void setNom(String nom) {
        jTextNom.setText(nom);
    }

    public void setPrenom(String prenom) {
        jTextPrenom.setText(prenom);
    }

    public void setMail(String mail) {
        jTextMail.setText(mail);
    }

    public void setMetier(String fonction) {
        jBoxMetier.setSelectedItem(fonction);
    }

    public void setAdresse(String adresse) {
        jTextAdresse.setText(adresse);
    }

    public void setTelephone(String tel) {
        jTextTelephone.setText(tel);
    }

    public void setPassword(String mdp) {

        jTextMdp.setText(mdp);

    }
}
