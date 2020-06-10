/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Joueurs.EnsJoueurs;
import Questions.*;
import Questions.Type.QCM;
import Questions.Type.RC;
import Questions.Type.VF;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lilian
 */
public class Lancement extends javax.swing.JFrame {
    DefaultTableModel modelQuestions;
        
    public Lancement() {
        Themes themes = Themes.instance;
        
        initComponents();
        modelQuestions =(DefaultTableModel) table_questions.getModel();
        
        Arrays.stream(themes.getThemes()).forEach(t -> comboBox_theme.addItem(t.toString()));
        /*
        try {
            fillArray();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lancement.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_theme = new javax.swing.JLabel();
        comboBox_theme = new javax.swing.JComboBox<>();
        btn_jeu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_questions = new javax.swing.JTable();
        btn_newQST = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_theme.setText("Thème de la question :");

        comboBox_theme.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBox_themeItemStateChanged(evt);
            }
        });

        btn_jeu.setText("Commencer le jeu");
        btn_jeu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_jeuMouseClicked(evt);
            }
        });

        table_questions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Niveau", "Question", "Réponse 1", "Réponse 2", "Réponse 3", "Réponse 4", "Solution"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_questions);
        if (table_questions.getColumnModel().getColumnCount() > 0) {
            table_questions.getColumnModel().getColumn(0).setResizable(false);
            table_questions.getColumnModel().getColumn(0).setPreferredWidth(7);
            table_questions.getColumnModel().getColumn(1).setResizable(false);
            table_questions.getColumnModel().getColumn(2).setResizable(false);
            table_questions.getColumnModel().getColumn(3).setResizable(false);
            table_questions.getColumnModel().getColumn(4).setResizable(false);
            table_questions.getColumnModel().getColumn(5).setResizable(false);
            table_questions.getColumnModel().getColumn(6).setResizable(false);
        }

        btn_newQST.setText("Ajouter une question");
        btn_newQST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_newQSTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_newQST, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btn_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_theme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_theme)
                    .addComponent(comboBox_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_newQST, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_jeuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jeuMouseClicked
        
        
    }//GEN-LAST:event_btn_jeuMouseClicked

    private void btn_newQSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newQSTMouseClicked
        CreationQST crea = new CreationQST();
        crea.setVisible(true);
    }//GEN-LAST:event_btn_newQSTMouseClicked

    private void comboBox_themeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBox_themeItemStateChanged
        Theme t = Themes.instance.getThemeNamed((String) comboBox_theme.getSelectedItem());
        
        modelQuestions.setRowCount(0);
        
        t.getListe().afficherListe(modelQuestions);
    }//GEN-LAST:event_comboBox_themeItemStateChanged

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
            java.util.logging.Logger.getLogger(Lancement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lancement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lancement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lancement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lancement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_jeu;
    private javax.swing.JButton btn_newQST;
    private javax.swing.JComboBox<String> comboBox_theme;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_theme;
    private javax.swing.JTable table_questions;
    // End of variables declaration//GEN-END:variables
}
