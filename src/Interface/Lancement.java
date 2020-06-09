/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Questions.*;
import Questions.Type.QCM;
import Questions.Type.RC;
import Questions.Type.VF;

/**
 *
 * @author lilian
 */
public class Lancement extends javax.swing.JFrame {
    ListeQuestions bio;
    ListeQuestions sport;
    ListeQuestions histoire;
    ListeQuestions info;
    ListeQuestions aerospatial;
    ListeQuestions aeronautique;
    ListeQuestions litterature;
    ListeQuestions musique;
    ListeQuestions film;
    ListeQuestions cultureG;
        
    public Lancement() {
        bio = new ListeQuestions();
        sport = new ListeQuestions();
        histoire = new ListeQuestions();
        info = new ListeQuestions();
        aerospatial = new ListeQuestions();
        aeronautique = new ListeQuestions();
        litterature = new ListeQuestions();
        musique = new ListeQuestions();
        film = new ListeQuestions();
        cultureG = new ListeQuestions();
        
        initComponents();
        
        
        Question<QCM> qcm= new Question<>(1, new QCM("répondez svp", 1, "hey", "ho", "let's", "go"));
        Question<RC> rc= new Question<>(1,new RC("un hotel?","trivago"));
        Question<VF> vf = new Question<>(3,new VF("vraiment?", true));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_nbJoueur = new javax.swing.JLabel();
        lbl_theme = new javax.swing.JLabel();
        comboBox_nbJoueur = new javax.swing.JComboBox<>();
        comboBox_theme = new javax.swing.JComboBox<>();
        comboBox_niveau = new javax.swing.JComboBox<>();
        lbl_niveau = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_questions = new javax.swing.JTable();
        lbl_creerSQT = new javax.swing.JLabel();
        comboBox_theme1 = new javax.swing.JComboBox<>();
        lbl_thematique = new javax.swing.JLabel();
        lbl_difficulte = new javax.swing.JLabel();
        comboBox_niveau1 = new javax.swing.JComboBox<>();
        lbl_qst = new javax.swing.JLabel();
        txtF_addQST = new javax.swing.JTextField();
        lbl_reponses = new javax.swing.JLabel();
        btn_jeu = new javax.swing.JButton();
        btn_qcm = new javax.swing.JButton();
        btn_rc = new javax.swing.JButton();
        btn_vf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_nbJoueur.setText("Nombre de joueur");

        lbl_theme.setText("Thème de la question :");

        comboBox_nbJoueur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4 joueurs", "5 joueurs", "6 joueurs", "7 joueurs", "8 joueurs", "9 joueurs", "10 joueurs", "11 joueurs", "12 joueurs", "13 joueurs", "14 joueurs", "15 joueurs", "16 joueurs", "17 joueurs", "18 joueurs", "19 joueurs", "20 joueurs" }));

        comboBox_theme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personnages importants", "Technologie", "Sport", "Géographie", "Culture générale", "Dates", "Internet", "Géopolitique", "Logique", "Thème surprise" }));

        comboBox_niveau.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Niveau 1", "Niveau 2", "Niveau 3" }));

        lbl_niveau.setText("Niveau :");

        table_questions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Question", "Réponse 1", "Réponse 2", "Réponse 3", "Réponse 4", "Solution"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_questions);

        lbl_creerSQT.setText("Créer une question :");

        comboBox_theme1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biologie", "Sport", "Histoire", "Informatique", "Aérospatial", "Aéronautique", "Litérature", "Musique", "Film", "Culture Générale" }));

        lbl_thematique.setText("1 : choisir le thème");

        lbl_difficulte.setText("2 : Choisir la difficultée");

        comboBox_niveau1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Niveau 1", "Niveau 2", "Niveau 3" }));
        comboBox_niveau1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_niveau1ActionPerformed(evt);
            }
        });

        lbl_qst.setText("3 : Ecrire la question");

        txtF_addQST.setText("une question...");

        lbl_reponses.setText("4 : Type de la question et réponses");

        btn_jeu.setText("Commencer le jeu");
        btn_jeu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_jeuMouseClicked(evt);
            }
        });

        btn_qcm.setText("QCM");
        btn_qcm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_qcmMouseClicked(evt);
            }
        });

        btn_rc.setText("Réponse courte");
        btn_rc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rcMouseClicked(evt);
            }
        });

        btn_vf.setText("Vrai / Faux");
        btn_vf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_vfMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_theme)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comboBox_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(lbl_niveau)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBox_niveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_nbJoueur)
                                .addGap(18, 18, 18)
                                .addComponent(comboBox_nbJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_creerSQT)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_qst)
                                    .addComponent(lbl_thematique)
                                    .addComponent(lbl_difficulte))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtF_addQST, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBox_theme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBox_niveau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(lbl_reponses))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_rc)
                                            .addComponent(btn_vf)
                                            .addComponent(btn_qcm))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nbJoueur)
                    .addComponent(comboBox_nbJoueur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_theme)
                    .addComponent(comboBox_theme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_niveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_niveau))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(comboBox_theme1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(comboBox_niveau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtF_addQST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_qst, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_creerSQT)
                            .addComponent(lbl_reponses))
                        .addGap(26, 26, 26)
                        .addComponent(lbl_thematique)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_difficulte))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_qcm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_jeu, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_rc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_vf)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBox_niveau1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_niveau1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_niveau1ActionPerformed

    private void btn_qcmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_qcmMouseClicked
        switch(comboBox_theme1.getItemAt(comboBox_theme1.getSelectedIndex())){  // the theme selected
            case "Biologie":
                    CreationQST_qcm qst1 = new CreationQST_qcm(txtF_addQST.getText(), bio, comboBox_niveau1.getSelectedIndex()+1);
                    qst1.setVisible(true);
                break;
            case "Sport":
                    CreationQST_qcm qst2 = new CreationQST_qcm(txtF_addQST.getText(), sport, comboBox_niveau1.getSelectedIndex()+1);
                    qst2.setVisible(true);
                break;
            case "Histoire":
                    CreationQST_qcm qst3 = new CreationQST_qcm(txtF_addQST.getText(), histoire, comboBox_niveau1.getSelectedIndex()+1);
                    qst3.setVisible(true);
                break;
            case "Informatique":
                    CreationQST_qcm qst4 = new CreationQST_qcm(txtF_addQST.getText(), info, comboBox_niveau1.getSelectedIndex()+1);
                    qst4.setVisible(true);
                break;
            case "Aérospatial":
                    CreationQST_qcm qst5 = new CreationQST_qcm(txtF_addQST.getText(), aerospatial, comboBox_niveau1.getSelectedIndex()+1);
                    qst5.setVisible(true);
                break;
            case "Aéronautique":
                    CreationQST_qcm qst6 = new CreationQST_qcm(txtF_addQST.getText(), aeronautique, comboBox_niveau1.getSelectedIndex()+1);
                    qst6.setVisible(true);
                break;
            case "Litérature":
                    CreationQST_qcm qst7 = new CreationQST_qcm(txtF_addQST.getText(), litterature, comboBox_niveau1.getSelectedIndex()+1);
                    qst7.setVisible(true);
                break;
            case "Musique":
                    CreationQST_qcm qst8 = new CreationQST_qcm(txtF_addQST.getText(), musique, comboBox_niveau1.getSelectedIndex()+1);
                    qst8.setVisible(true);
                break;
            case "Film":
                    CreationQST_qcm qst9 = new CreationQST_qcm(txtF_addQST.getText(), film, comboBox_niveau1.getSelectedIndex()+1);
                    qst9.setVisible(true);
                break;
            case "Culture Générale":
                    CreationQST_qcm qst10 = new CreationQST_qcm(txtF_addQST.getText(), cultureG, comboBox_niveau1.getSelectedIndex()+1);
                    qst10.setVisible(true);
                break;                
        }
    }//GEN-LAST:event_btn_qcmMouseClicked

    private void btn_rcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rcMouseClicked
        switch(comboBox_theme1.getItemAt(comboBox_theme1.getSelectedIndex())){  // the theme selected
            case "Biologie":
                    CreationQST_RC qst1 = new CreationQST_RC(txtF_addQST.getText(), bio, comboBox_niveau1.getSelectedIndex()+1);
                    qst1.setVisible(true);
                break;
            case "Sport":
                    CreationQST_RC qst2 = new CreationQST_RC(txtF_addQST.getText(), sport, comboBox_niveau1.getSelectedIndex()+1);
                    qst2.setVisible(true);
                break;
            case "Histoire":
                    CreationQST_RC qst3 = new CreationQST_RC(txtF_addQST.getText(), histoire, comboBox_niveau1.getSelectedIndex()+1);
                    qst3.setVisible(true);
                break;
            case "Informatique":
                    CreationQST_RC qst4 = new CreationQST_RC(txtF_addQST.getText(), info, comboBox_niveau1.getSelectedIndex()+1);
                    qst4.setVisible(true);
                break;
            case "Aérospatial":
                    CreationQST_RC qst5 = new CreationQST_RC(txtF_addQST.getText(), aerospatial, comboBox_niveau1.getSelectedIndex()+1);
                    qst5.setVisible(true);
                break;
            case "Aéronautique":
                    CreationQST_RC qst6 = new CreationQST_RC(txtF_addQST.getText(), aeronautique, comboBox_niveau1.getSelectedIndex()+1);
                    qst6.setVisible(true);
                break;
            case "Litérature":
                    CreationQST_RC qst7 = new CreationQST_RC(txtF_addQST.getText(), litterature, comboBox_niveau1.getSelectedIndex()+1);
                    qst7.setVisible(true);
                break;
            case "Musique":
                    CreationQST_RC qst8 = new CreationQST_RC(txtF_addQST.getText(), musique, comboBox_niveau1.getSelectedIndex()+1);
                    qst8.setVisible(true);
                break;
            case "Film":
                    CreationQST_RC qst9 = new CreationQST_RC(txtF_addQST.getText(), film, comboBox_niveau1.getSelectedIndex()+1);
                    qst9.setVisible(true);
                break;
            case "Culture Générale":
                    CreationQST_RC qst10 = new CreationQST_RC(txtF_addQST.getText(), cultureG, comboBox_niveau1.getSelectedIndex()+1);
                    qst10.setVisible(true);
                break;                
        }
    }//GEN-LAST:event_btn_rcMouseClicked

    private void btn_vfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vfMouseClicked
        switch(comboBox_theme1.getItemAt(comboBox_theme1.getSelectedIndex())){  // the theme selected
            case "Biologie":
                    CreationQST_VF qst1 = new CreationQST_VF(txtF_addQST.getText(), bio, comboBox_niveau1.getSelectedIndex()+1);
                    qst1.setVisible(true);
                break;
            case "Sport":
                    CreationQST_VF qst2 = new CreationQST_VF(txtF_addQST.getText(), sport, comboBox_niveau1.getSelectedIndex()+1);
                    qst2.setVisible(true);
                break;
            case "Histoire":
                    CreationQST_VF qst3 = new CreationQST_VF(txtF_addQST.getText(), histoire, comboBox_niveau1.getSelectedIndex()+1);
                    qst3.setVisible(true);
                break;
            case "Informatique":
                    CreationQST_VF qst4 = new CreationQST_VF(txtF_addQST.getText(), info, comboBox_niveau1.getSelectedIndex()+1);
                    qst4.setVisible(true);
                break;
            case "Aérospatial":
                    CreationQST_VF qst5 = new CreationQST_VF(txtF_addQST.getText(), aerospatial, comboBox_niveau1.getSelectedIndex()+1);
                    qst5.setVisible(true);
                break;
            case "Aéronautique":
                    CreationQST_VF qst6 = new CreationQST_VF(txtF_addQST.getText(), aeronautique, comboBox_niveau1.getSelectedIndex()+1);
                    qst6.setVisible(true);
                break;
            case "Litérature":
                    CreationQST_VF qst7 = new CreationQST_VF(txtF_addQST.getText(), litterature, comboBox_niveau1.getSelectedIndex()+1);
                    qst7.setVisible(true);
                break;
            case "Musique":
                    CreationQST_VF qst8 = new CreationQST_VF(txtF_addQST.getText(), musique, comboBox_niveau1.getSelectedIndex()+1);
                    qst8.setVisible(true);
                break;
            case "Film":
                    CreationQST_VF qst9 = new CreationQST_VF(txtF_addQST.getText(), film, comboBox_niveau1.getSelectedIndex()+1);
                    qst9.setVisible(true);
                break;
            case "Culture Générale":
                    CreationQST_VF qst10 = new CreationQST_VF(txtF_addQST.getText(), cultureG, comboBox_niveau1.getSelectedIndex()+1);
                    qst10.setVisible(true);
                break;                
        }
    }//GEN-LAST:event_btn_vfMouseClicked

    private void btn_jeuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jeuMouseClicked
        bio.afficherListe();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_jeuMouseClicked

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
    private javax.swing.JButton btn_qcm;
    private javax.swing.JButton btn_rc;
    private javax.swing.JButton btn_vf;
    private javax.swing.JComboBox<String> comboBox_nbJoueur;
    private javax.swing.JComboBox<String> comboBox_niveau;
    private javax.swing.JComboBox<String> comboBox_niveau1;
    private javax.swing.JComboBox<String> comboBox_theme;
    private javax.swing.JComboBox<String> comboBox_theme1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_creerSQT;
    private javax.swing.JLabel lbl_difficulte;
    private javax.swing.JLabel lbl_nbJoueur;
    private javax.swing.JLabel lbl_niveau;
    private javax.swing.JLabel lbl_qst;
    private javax.swing.JLabel lbl_reponses;
    private javax.swing.JLabel lbl_thematique;
    private javax.swing.JLabel lbl_theme;
    private javax.swing.JTable table_questions;
    private javax.swing.JTextField txtF_addQST;
    // End of variables declaration//GEN-END:variables
}
