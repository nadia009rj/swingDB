/*
 * update delete et create et le connexion
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.nadia.swingBd.frame;

import fr.nadia.database.utils.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.TableView;

/**
 *
 * @author Administrateur
 */
public class AuthorInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form AuthorInternalFrame
     */
    public AuthorInternalFrame() {
        initComponents();
        initTable();
    }

    private void initTable() {
        //recuperation du modele de la jtable
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        //SUPPRESSION des lignes exisitant sur la table
        model.setRowCount(0);

        //recuperation des données depuis la base de données
        //la requete SQL
        String sql = "SELECT * FROM auteurs";
        try {
            //CONNEXION DELA BASE DE DONNEE
            Connection cn = DatabaseConnection.getIntance();
            //le statement
            Statement stm = cn.createStatement();
            //execution de la requete
            ResultSet rs = stm.executeQuery(sql);
            // tbleau d objet qui represent une ligne de la table
            Object[] tableRow;

            //boucle sur le resultSet
            while (rs.next()) {
                //constitution du tableau des données
                tableRow = new Object[3];
                tableRow[0] = rs.getObject("id");
                tableRow[1] = rs.getObject("prenom");
                tableRow[2] = rs.getObject("nom");

                //ajout du tableau dans une nouvelle ligne du modele
                model.addRow(tableRow);

            }
            //fermeture des objets de connexion
            rs.close();
            stm.close();

        } catch (SQLException ex) {
            Logger.getLogger(AuthorInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        idField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        razButton = new javax.swing.JButton();

        setTitle("Gestion des auteurs");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "prenom", "nom"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel1.setText("id");

        jLabel2.setText("prenom");

        jLabel3.setText("nom");

        updateButton.setBackground(new java.awt.Color(255, 255, 153));
        updateButton.setText("mise a jour");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(255, 255, 102));
        createButton.setText("creation");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(255, 255, 102));
        deleteButton.setText("supprimer");
        deleteButton.setActionCommand("");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        razButton.setBackground(new java.awt.Color(255, 255, 102));
        razButton.setText("RAZ");
        razButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(firstNameField)
                                .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                .addComponent(idField))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(updateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createButton)
                        .addGap(47, 47, 47)
                        .addComponent(deleteButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(razButton)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(createButton)
                    .addComponent(deleteButton)
                    .addComponent(razButton))
                .addGap(0, 163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        //la ligne selectionnée
        int selectedIndex = jTable1.getSelectedRow();
        //redefinition de l'index pour une bonne selection en cas de tri sur la table
        selectedIndex = jTable1.convertRowIndexToModel(selectedIndex);

        //recuperation du modele
        TableModel model = jTable1.getModel();

        //recuperation des données de la ligne selectionnée
        String id = model.getValueAt(selectedIndex, 0).toString();
        String name = model.getValueAt(selectedIndex, 2).toString();
        //raha null ny prenom 
        String firstName = String.valueOf(model.getValueAt(selectedIndex, 1));
        //si firstName est null
        if(firstName == null){
            firstName = "";
        }

        //insertion des données dans textField
        idField.setText(id);
        nameField.setText(name);
        firstNameField.setText(firstName);
    }//GEN-LAST:event_jTable1MouseClicked

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        //recuperation de saisie
        String name = nameField.getText();
        String firstName = firstNameField.getText();
        //transformation de chaine vide en null
        if (!name.equals("")) {
            
            if(firstName.equals("")){
                firstName = null;
            }
            try {
                //recuperation de la connexion
                Connection cn = DatabaseConnection.getIntance();
                String sql = "INSERT INTO auteurs (nom, prenom) VALUES ( ?, ?)";
                PreparedStatement pstm = cn.prepareStatement(sql);
                pstm.setString(1, name);
                pstm.setString(2, firstName);
                pstm.executeUpdate();
                //mise a jour de la date
                initTable();

            } catch (SQLException ex) {
                Logger.getLogger(AuthorInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_createButtonActionPerformed

    private void razButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razButtonActionPerformed
        idField.setText("");
        nameField.setText("");
        firstNameField.setText("");
    }//GEN-LAST:event_razButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        //recuperation de l'identifiant
        Integer id = Integer.valueOf(idField.getText());
        //suppression uniquement si l'indentifiant est vide
        if (id > 0) {
            try {
                //requete sql de supression
                String sql = "DELETE FROM auteurs WHERE id=?";
                //recuperation de la connexion
                Connection cn = DatabaseConnection.getIntance();
                PreparedStatement pstm = cn.prepareStatement(sql);
                pstm.setInt(1, id);
                pstm.executeUpdate();
                initTable();
            } catch (SQLException ex) {
                Logger.getLogger(AuthorInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
          //recuperation de saisie
        String name = nameField.getText();
        String firstName = firstNameField.getText();
        Integer id = Integer.valueOf(idField.getText());
        //transformation de chaine vide en null
        if (!name.equals("") && id>0) {
            
            if(firstName.equals("")){
                firstName = null;
            }
            try {
                //recuperation de la connexion
                Connection cn = DatabaseConnection.getIntance();
                String sql = "UPDATE  auteurs SET nom=?, prenom=? WHERE ID=?";
                PreparedStatement pstm = cn.prepareStatement(sql);
                pstm.setString(1, name);
                pstm.setString(2, firstName);
                pstm.setInt(3, id);
                pstm.executeUpdate();
                //mise a jour de la date
                initTable();

            } catch (SQLException ex) {
                Logger.getLogger(AuthorInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
              
    }//GEN-LAST:event_updateButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JButton razButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}