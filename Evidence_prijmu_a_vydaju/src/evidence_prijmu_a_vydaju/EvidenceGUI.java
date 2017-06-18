/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidence_prijmu_a_vydaju;

import evidence_prijmu_a_vydaju.backend.Manager;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author kingc
 */
public class EvidenceGUI extends javax.swing.JFrame {

    private Manager manager = new Manager();
    
    /**
     * Creates new form EvidenceGUI
     */
    public EvidenceGUI() {
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

        createYearButton = new javax.swing.JButton();
        endYearButton = new javax.swing.JButton();
        cretaetRecordButton = new javax.swing.JButton();
        countPaymentsButton = new javax.swing.JButton();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createYearButton.setText("Create Year");
        createYearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createYearButtonActionPerformed(evt);
            }
        });

        endYearButton.setText("End Year");
        endYearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endYearButtonActionPerformed(evt);
            }
        });

        cretaetRecordButton.setLabel("Create Record");
        cretaetRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cretaetRecordButtonActionPerformed(evt);
            }
        });

        countPaymentsButton.setText("Count Payments");
        countPaymentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countPaymentsButtonActionPerformed(evt);
            }
        });

        label1.setText("Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(countPaymentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(endYearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cretaetRecordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(createYearButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(274, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(createYearButton)
                .addGap(18, 18, 18)
                .addComponent(endYearButton)
                .addGap(18, 18, 18)
                .addComponent(cretaetRecordButton)
                .addGap(18, 18, 18)
                .addComponent(countPaymentsButton)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        createYearButton.getAccessibleContext().setAccessibleName("CreateYear");
        endYearButton.getAccessibleContext().setAccessibleName("EndYear");
        cretaetRecordButton.getAccessibleContext().setAccessibleName("CreateRecord");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void endYearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endYearButtonActionPerformed
        try {
            JOptionPane.showMessageDialog(null, manager.countIncomes()+
                    manager.countExpense() + manager.countPayments());
        } catch (IOException ex) {
            Logger.getLogger(EvidenceGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_endYearButtonActionPerformed

    private void countPaymentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countPaymentsButtonActionPerformed
        try {
            // TODO add your handling code here:
            String s = manager.countPayments();
            if(s.equals("ERROR")){
                 JOptionPane.showMessageDialog(null, "No year to count");
                 return;
            }
            JOptionPane.showMessageDialog(null, s);
        } catch (IOException ex) {
            Logger.getLogger(EvidenceGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_countPaymentsButtonActionPerformed

    private void cretaetRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cretaetRecordButtonActionPerformed
       CreateRecord.startGUI(this, true);
    }//GEN-LAST:event_cretaetRecordButtonActionPerformed

    private void createYearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createYearButtonActionPerformed
       NewYear.startGUI(this,true);
    }//GEN-LAST:event_createYearButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void startGUI() {
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
            java.util.logging.Logger.getLogger(EvidenceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EvidenceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EvidenceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EvidenceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EvidenceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton countPaymentsButton;
    private javax.swing.JButton createYearButton;
    private javax.swing.JButton cretaetRecordButton;
    private javax.swing.JButton endYearButton;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    private class CountPaymentsSwingWorker extends SwingWorker<Void, Void> {
        
        @Override
        protected Void doInBackground() throws IOException {
            JOptionPane.showMessageDialog(null, manager.countPayments());
            return null;    
        }
    
    }
}