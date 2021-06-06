package studentgradingsystemproject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import studentgradingsystemproject.Functions.AddFunctions;
import studentgradingsystemproject.Functions.CheckFunctions;
import studentgradingsystemproject.Functions.DelFunctions;
import studentgradingsystemproject.Functions.EditFunctions;
import static studentgradingsystemproject.StudentGradingSystemProject.connection;

public class GradeMgmt extends javax.swing.JFrame {

   public GradeMgmt() {
      initComponents();
      refresh_JTable();
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jScrollPane1 = new javax.swing.JScrollPane();
      jTable1 = new javax.swing.JTable();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jTextField2 = new javax.swing.JTextField();
      jTextField1 = new javax.swing.JTextField();
      jLabel4 = new javax.swing.JLabel();
      jTextField3 = new javax.swing.JTextField();
      jLabel5 = new javax.swing.JLabel();
      jTextField4 = new javax.swing.JTextField();
      jTextField5 = new javax.swing.JTextField();
      jTextField6 = new javax.swing.JTextField();
      jLabel9 = new javax.swing.JLabel();
      jTextField7 = new javax.swing.JTextField();
      jLabel6 = new javax.swing.JLabel();
      jLabel10 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

      jTable1.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null}
         },
         new String [] {
            "Grd Id", "Std Id", "Crs Id", "Grd Mt", "Grd Hw", "Grd FINAL", "Grd lgrade"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }
      });
      jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(jTable1);

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
      jButton3.setName("btn_del"); // NOI18N
      jButton3.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
         }
      });

      jLabel2.setText("Grd ID");

      jLabel3.setText("Std ID");

      jTextField2.setName("JTF_std_id"); // NOI18N
      jTextField2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField2ActionPerformed(evt);
         }
      });

      jTextField1.setName("JTF_grd_id"); // NOI18N
      jTextField1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1ActionPerformed(evt);
         }
      });

      jLabel4.setText("Crs ID");

      jTextField3.setName("JTF_crs_id"); // NOI18N

      jLabel5.setText("Grd Midterm");

      jTextField4.setName("JTF_grd_mt"); // NOI18N

      jTextField5.setName("JTF_grd_hw"); // NOI18N
      jTextField5.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField5ActionPerformed(evt);
         }
      });

      jTextField6.setName("JTF_grd_final"); // NOI18N
      jTextField6.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField6ActionPerformed(evt);
         }
      });

      jLabel9.setText("Grd LetterGrade");

      jTextField7.setName("JTF_grd_lgrade"); // NOI18N
      jTextField7.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField7ActionPerformed(evt);
         }
      });

      jLabel6.setText("Grd HOMEWORK");

      jLabel10.setText("Grd FINAL");

      jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                     .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                     .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGap(4, 4, 4)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                     .addComponent(jTextField2)
                     .addComponent(jTextField3)
                     .addComponent(jTextField4)
                     .addComponent(jTextField5)
                     .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jTextField6)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField7)
                        .addGap(110, 110, 110))))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(0, 1, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel7)
                  .addGap(7, 7, 7)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel2))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                           .addComponent(jButton3)
                           .addComponent(jButton2)
                           .addComponent(jButton1)))))
               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addContainerGap())
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       int sel_row = jTable1.getSelectedRow();
       int stdId = Integer.parseInt(model.getValueAt(sel_row, 0).toString());
       ResultSet res;
       String strSQL;

       try {
          strSQL = "select * from grades where grades.grd_id= ?";
          PreparedStatement pst
                  = connection.prepareStatement(strSQL);
          pst.setInt(1, stdId);
          //pst.
          res = pst.executeQuery();
          while (res.next()) {

             jTextField1.setText("" + res.getInt("grd_id"));
             jTextField2.setText("" + res.getInt("std_id"));
             jTextField3.setText("" + res.getInt("crs_id"));
             jTextField4.setText("" + res.getFloat("grd_mt"));
             jTextField5.setText("" + res.getFloat("grd_hw"));
             jTextField6.setText("" + res.getFloat("grd_final"));
             jTextField7.setText(res.getString("grd_lgrade"));
          }
       } catch (SQLException ex) {
          Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if (!jTextField1.getText().trim().isEmpty()) {
          int grd_id = Integer.parseInt(jTextField1.getText().trim());
          List gradeses = StudentGradingSystemProject.gradeses;
          Grades gr;
          Boolean found = false;
          Iterator<Grades> itr = gradeses.iterator();
          while (itr.hasNext()) {
             gr = itr.next();
             if (grd_id == gr.getGrd_id()) {
                found = true;
                break;
             }
          }
          if (found) {
             DelFunctions.delete_grades(grd_id);
             JOptionPane.showMessageDialog(null, "Selected Grade Record Successfully DELETED!");
          }
       } else {
          JOptionPane.showMessageDialog(null, "You have to fill Grade id field before deleting the record!");
       }
       refresh_JTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // SAVE 
       Boolean found = false;
       if (!jTextField1.getText().trim().isEmpty()
               && !jTextField2.getText().trim().isEmpty()
               && !jTextField3.getText().trim().isEmpty()
               && !jTextField4.getText().trim().isEmpty()
               && !jTextField5.getText().trim().isEmpty()
               && !jTextField6.getText().trim().isEmpty()
               && !jTextField7.getText().trim().isEmpty()) {
          int grd_id = Integer.parseInt(jTextField1.getText().trim());
          int std_id = Integer.parseInt(jTextField2.getText().trim());
          int crs_id = Integer.parseInt(jTextField3.getText().trim());
          float grd_mt = Float.parseFloat(jTextField4.getText().trim());
          float grd_hw = Float.parseFloat(jTextField5.getText().trim());
          float grd_final = Float.parseFloat(jTextField6.getText().trim());
          String grd_lgrade = jTextField7.getText().trim();
          found = CheckFunctions.check_grades(grd_id);

          if (!found) {
             // New Grades Record  
             AddFunctions.add_grades(grd_id, std_id, crs_id, grd_mt, grd_hw, grd_final, grd_lgrade);
             JOptionPane.showMessageDialog(null, "NEW Grades Record Successfully ADDED!");
          } else {
             // found is true! So existing student recort will be updgred!!!  
             EditFunctions.edit_grades(grd_id, std_id, crs_id, grd_mt, grd_hw, grd_final, grd_lgrade);
             JOptionPane.showMessageDialog(null, "Grades Record Successfully EDITED!");

          }
       } else {
          JOptionPane.showMessageDialog(null, "You have to fill all fields before saving!");
       }
       refresh_JTable();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //NEW BUTTON
       jTextField1.setText(null);
       jTextField2.setText(null);
       jTextField3.setText(null);
       jTextField4.setText(null);
       jTextField5.setText(null);
       jTextField6.setText(null);
       jTextField7.setText(null);
       jTextField1.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

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
         java.util.logging.Logger.getLogger(GradeMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(GradeMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(GradeMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(GradeMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new GradeMgmt().setVisible(true);
         }
      });
   }

   public void refresh_JTable() {
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      Object rowData[] = new Object[7];
      model.setNumRows(0); //Remove all existing rows of JTable
      ResultSet res;
      String strSQL;

      try {
         strSQL = "select * from grades";
         Statement statement
                 = connection.createStatement();
         res = statement.executeQuery(strSQL);
         while (res.next()) {

            rowData[0] = res.getInt("grd_id");
            rowData[1] = res.getInt("std_id");
            rowData[2] = res.getInt("crs_id");
            rowData[3] = res.getFloat("grd_mt");
            rowData[4] = res.getFloat("grd_hw");
            rowData[5] = res.getFloat("grd_final");
            rowData[6] = res.getString("grd_lgrade");
            model.addRow(rowData);
         }
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
   }
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable1;
   private javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField2;
   private javax.swing.JTextField jTextField3;
   private javax.swing.JTextField jTextField4;
   private javax.swing.JTextField jTextField5;
   private javax.swing.JTextField jTextField6;
   private javax.swing.JTextField jTextField7;
   // End of variables declaration//GEN-END:variables
}
