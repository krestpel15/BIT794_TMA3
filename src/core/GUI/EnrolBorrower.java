/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.GUI;

import core.Library.Borrower;
import javax.swing.JOptionPane;



/**
 *
 * @author krest
 */
public class EnrolBorrower extends javax.swing.JFrame
{
    DataAccessor.MySQLAccessor accessor;
    boolean toEdit = false;
    
    

    /**
     * Creates new form EnrolBorrower
     */
    public EnrolBorrower(boolean edit, Borrower borrower)
    {
        initComponents();
        accessor = new DataAccessor.MySQLAccessor();
        if (edit){
            toEdit = true;
            enrolButton.setText("Save");
            borrowIdTextField1.setText(borrower.getBorrowerId());
            borrowIdTextField1.setEditable(false);
            borrowerNameTextField.setText(borrower.getName());
            borrowerAddTextField.setText(borrower.getAddress());
            borrowerPhoneNumTextField.setText(borrower.getPhoneNum());
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        borrowIdTextField1 = new javax.swing.JTextField();
        borrowerNameTextField = new javax.swing.JTextField();
        borrowerAddTextField = new javax.swing.JTextField();
        borrowerPhoneNumTextField = new javax.swing.JTextField();
        enrolButton = new javax.swing.JButton();
        backButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Fill the text fields to add a enrol Borrower.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Borrower ID:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Address: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Phone Number: ");

        enrolButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        enrolButton.setText("Enrol");
        enrolButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        enrolButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                enrolButtonActionPerformed(evt);
            }
        });

        backButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backButton6.setText("Back");
        backButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton6.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                backButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(borrowIdTextField1)
                            .addComponent(borrowerNameTextField)
                            .addComponent(borrowerAddTextField)
                            .addComponent(borrowerPhoneNumTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(enrolButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(borrowIdTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(borrowerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(borrowerAddTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(borrowerPhoneNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(enrolButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(backButton6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButton6ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_backButton6ActionPerformed
    {//GEN-HEADEREND:event_backButton6ActionPerformed
        this.dispose();
        new Services().setVisible(true);
    }//GEN-LAST:event_backButton6ActionPerformed

    private void enrolButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_enrolButtonActionPerformed
    {//GEN-HEADEREND:event_enrolButtonActionPerformed
        Borrower borrower = new Borrower();
        
        String borrowerId = borrowIdTextField1.getText();
        String name = borrowerNameTextField.getText();
        String address = borrowerAddTextField.getText();
        String phoneNum = borrowerPhoneNumTextField.getText();
        
         if (borrowerId.isEmpty())
        { 
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Librarian Id.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (name.isEmpty())
        { 
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Name.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (address.isEmpty())
        { 
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Item Address", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (phoneNum.isEmpty())
        { 
            JOptionPane.showMessageDialog(null, "Please Enter a Valid Phone Number", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        borrower.setBorrowerId(borrowerId);
        borrower.setName(name);
        borrower.setAddress(address);
        borrower.setPhoneNum(phoneNum);
        
         if (toEdit){
            accessor.editBorrower(borrower);
            JOptionPane.showMessageDialog(null, "The borrower successfully saved!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }else{//Adding
            accessor.AddBorrower(borrower);
            JOptionPane.showMessageDialog(null, "The borrower is successfully added!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
         
         //empty textfields
        borrowIdTextField1.setText(" ");
        borrowerNameTextField.setText(" ");
        borrowerAddTextField.setText(" ");
        borrowerPhoneNumTextField.setText(" ");
    }//GEN-LAST:event_enrolButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(EnrolBorrower.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(EnrolBorrower.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(EnrolBorrower.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(EnrolBorrower.class.getName()).log(
                    java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new EnrolBorrower(false, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton6;
    private javax.swing.JTextField borrowIdTextField1;
    private javax.swing.JTextField borrowerAddTextField;
    private javax.swing.JTextField borrowerNameTextField;
    private javax.swing.JTextField borrowerPhoneNumTextField;
    private javax.swing.JButton enrolButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
