/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradingsystemproject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import studentgradingsystemproject.Functions.AddFunctions;
import studentgradingsystemproject.Functions.CheckFunctions;
import studentgradingsystemproject.Functions.DelFunctions;
import studentgradingsystemproject.Functions.EditFunctions;
import static studentgradingsystemproject.StudentGradingSystemProject.connection;

/**
 *
 * @author btyo
 */
public class DepartmentMgmt extends javax.swing.JFrame {

   /**
    * Creates new form StudentMgmt
    */
   public DepartmentMgmt() {
      initComponents();
      refresh_JTable();

   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      buttonGroup_gender = new javax.swing.ButtonGroup();
      jLabel1 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jTextField1 = new javax.swing.JTextField();
      jTextField3 = new javax.swing.JTextField();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTable1 = new javax.swing.JTable();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Managing Student Records");

      jLabel1.setText("dept_id ");

      jLabel3.setText("dept_name");

      jTextField1.setName("JTF_std_id"); // NOI18N

      jTextField3.setName("JTF_std_name"); // NOI18N

      jButton1.setText("New");
      jButton1.setName("btn_new"); // NOI18N
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      jButton2.setText("Save");
      jButton2.setName("btn_save"); // NOI18N
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
         }
      });

      jButton3.setText("Delete");
      jButton3.setName("btn_delete"); // NOI18N
      jButton3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
         }
      });

      jTable1.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null},
            {null, null},
            {null, null},
            {null, null}
         },
         new String [] {
            "dept_id ", "dept_name"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.Object.class
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }
      });
      jTable1.setName("jTable1"); // NOI18N
      jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(jTable1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(56, 56, 56)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jLabel3)
               .addComponent(jLabel1))
            .addGap(10, 10, 10)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jTextField3)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jButton1)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButton2)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jButton3)))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(46, 46, 46)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel3))
            .addGap(137, 137, 137)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jButton1)
               .addComponent(jButton2)
               .addComponent(jButton3))
            .addContainerGap(19, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       jTextField1.setText(null);
       jTextField3.setText(null);
       jTextField1.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       int sel_row = jTable1.getSelectedRow();

       int dept_id = Integer.parseInt(model.getValueAt(sel_row, 0).toString());

       ResultSet res;
       String strSQL;

       try {
          strSQL = "select * from department where dept_id = ?";
          PreparedStatement pst
                  = connection.prepareStatement(strSQL);
          pst.setInt(1, dept_id);
          //pst.
          res = pst.executeQuery();
          while (res.next()) {
             jTextField1.setText("" + res.getInt("dept_id"));
             jTextField3.setText(res.getString("dept_name"));
          }
       } catch (SQLException ex) {
          Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // Save button
       Boolean found = false;
       if (!jTextField3.getText().trim().isEmpty()) {

          int dept_id = Integer.parseInt(jTextField1.getText().trim());

          String dept_name = jTextField3.getText().trim();

          found = CheckFunctions.check_department(dept_id);

          if (!found) {
             // New Student Record  
             AddFunctions.add_department(dept_id, dept_name);
             JOptionPane.showMessageDialog(null, "NEW Department Record Successfully ADDED!");
          } else {
             // found is true! So existing student recort will be updated!!!  
             EditFunctions.edit_department(dept_id, dept_name);
             JOptionPane.showMessageDialog(null, "Department Record Successfully EDITED!");

          }
    }//GEN-LAST:event_jButton2ActionPerformed
        else {
         JOptionPane.showMessageDialog(null, "You have to fill all fields before saving!");
      }
      refresh_JTable();
   }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       // DELETE BUTTON
       Boolean found = false;
       if (!jTextField1.getText().trim().isEmpty()) {
          int dept_id = Integer.parseInt(jTextField1.getText().trim());

          found = CheckFunctions.check_department(dept_id);

          if (found) {
             DelFunctions.delete_department(dept_id);
             JOptionPane.showMessageDialog(null, "Selected Department Record Successfully DELETED!");
          }
       } else {
          JOptionPane.showMessageDialog(null, "You have to fill Student id field before deleting the record!");
       }
       refresh_JTable();
    }//GEN-LAST:event_jButton3ActionPerformed

   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(DepartmentMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(DepartmentMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(DepartmentMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(DepartmentMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new DepartmentMgmt().setVisible(true);
         }
      });
   }

   public void refresh_JTable() {
      
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      Object rowData[] = new Object[2];
      model.setNumRows(0); //Remove all existing rows of JTable
      ResultSet res;
      String strSQL;

      try {
         strSQL = "select * from department";
         Statement statement
                 = connection.createStatement();
         res = statement.executeQuery(strSQL);
         while (res.next()) {

            rowData[0] = res.getInt("dept_id");
            rowData[1] = res.getString("dept_name");

            model.addRow(rowData);
         }

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.ButtonGroup buttonGroup_gender;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable1;
   private javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField3;
   // End of variables declaration//GEN-END:variables
}
