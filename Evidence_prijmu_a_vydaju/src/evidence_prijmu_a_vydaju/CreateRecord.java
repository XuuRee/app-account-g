/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidence_prijmu_a_vydaju;

import evidence_prijmu_a_vydaju.backend.Manager;
import evidence_prijmu_a_vydaju.backend.Payment;
import evidence_prijmu_a_vydaju.backend.PaymentType;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Year;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.Frame;

/**
 *
 * @author lsuchanek
 */
public class CreateRecord extends javax.swing.JDialog {

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    /**
     * Creates new form CreateRecord
     */
    public CreateRecord(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        String [] type = new String[2];
        type[0]="INCOME";
        type[1]="EXPENSE";
        typeBox.setModel(new javax.swing.DefaultComboBoxModel(type));
        String[] day = new String[31];
        String[] month = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};
        for(int i=0; i<31;i++){
            day[i]= String.valueOf(i+1);
        }
        daysBox.setModel(new javax.swing.DefaultComboBoxModel(day));
        monthBox.setModel(new javax.swing.DefaultComboBoxModel(month));
        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        amountLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        typeBox = new javax.swing.JComboBox<>();
        amountInput = new javax.swing.JTextField();
        noteInput = new javax.swing.JTextField();
        dateLabel = new javax.swing.JLabel();
        daysBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        monthBox = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        amountLabel.setText("Amount");

        typeLabel.setText("Type");

        noteLabel.setText("Note");

        typeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dateLabel.setText("Date");

        daysBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        daysBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daysBoxActionPerformed(evt);
            }
        });

        jLabel5.setText(".");

        monthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        monthBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBoxActionPerformed(evt);
            }
        });

        label1.setText("Create record");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(noteLabel)
                                .addComponent(typeLabel)
                                .addComponent(dateLabel)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amountInput, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(daysBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noteInput, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelButton))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountLabel)
                            .addComponent(amountInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeLabel)
                            .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noteLabel)
                            .addComponent(noteInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(daysBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addGap(38, 38, 38))
        );

        getRootPane().setDefaultButton(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        Payment payment;
        try {
            payment = new Payment();
            payment.setAmount(new BigDecimal(Double.parseDouble(amountInput.getText())));
            payment.setInfo(noteInput.getText());
            String text = typeBox.getSelectedItem().toString();
            if(text.equals("INCOME")){
                payment.setType(PaymentType.INCOME);
            }else{
                payment.setType(PaymentType.EXPENSE);
            }
            int day = Integer.parseInt(daysBox.getSelectedItem().toString());
            int month = 0;
            String mont = monthBox.getSelectedItem().toString();
            switch (mont){
                case "January": month = 1;
                break;
                case "February": month = 2;
                break;
                case "March": month = 3;
                break;
                case "April": month = 4;
                break;
                case "May": month = 5;
                break;
                case "June": month = 6;
                break;
                case "July": month = 7;
                break;
                case "August": month = 8;
                break;
                case "September": month = 9;
                break;
                case "October": month = 10;
                break;
                case "November": month = 11;
                break;
                case "December": month = 12;
                break;
            }
            int year = Year.now().getValue();
            LocalDate date = null;
            date = Year.now().atMonth(month).atDay(day);
            payment.setDate(date);
            Manager man = new Manager();
            String string = man.registerPayment(payment);
            if(string.equals("NOTEXIST")){
                JOptionPane.showMessageDialog(null, "Evidence for this year wasn't started");
            }else if(string.equals("ENDED")){
                JOptionPane.showMessageDialog(null, "Evidence for this year was already ended");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(CreateRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        doClose(RET_OK);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void daysBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daysBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daysBoxActionPerformed

    private void monthBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthBoxActionPerformed
    
    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void startGUI(Frame parent, boolean modal) {
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
            java.util.logging.Logger.getLogger(CreateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CreateRecord dialog = new CreateRecord(parent, modal);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.doClose(RET_CANCEL);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountInput;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JComboBox<String> daysBox;
    private javax.swing.JLabel jLabel5;
    private java.awt.Label label1;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JTextField noteInput;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JButton okButton;
    private javax.swing.JComboBox<String> typeBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
