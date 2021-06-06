package studentgradingsystemproject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.GregorianCalendar;
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
import static studentgradingsystemproject.StudentGradingSystemProject.fmt;

public class AttendanceMgmt extends javax.swing.JFrame {

   public AttendanceMgmt() {
      initComponents();
      refresh_JTable();
      datePicker1.setDateToToday();
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jScrollPane1 = new javax.swing.JScrollPane();
      jTable1 = new javax.swing.JTable();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jTextField1 = new javax.swing.JTextField();
      jTextField2 = new javax.swing.JTextField();
      jTextField3 = new javax.swing.JTextField();
      datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jLabel5 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setPreferredSize(new java.awt.Dimension(1050, 383));

      jTable1.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
         },
         new String [] {
            "Att Id", "Std Id", "Crs Id", "Att Date"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
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

      jLabel1.setText("Att ID");

      jLabel2.setText("Std ID");

      jLabel3.setText("Crs ID");

      jLabel4.setText("ATT date");

      jTextField1.setName("JTF_att_id"); // NOI18N
      jTextField1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField1ActionPerformed(evt);
         }
      });

      jTextField2.setName("JTF_std_id"); // NOI18N

      jTextField3.setName("JTF_crs_id"); // NOI18N

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

      jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel4)
                              .addGap(30, 30, 30)
                              .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                           .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addGroup(layout.createSequentialGroup()
                                 .addComponent(jLabel1)
                                 .addGap(45, 45, 45)
                                 .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                 .addComponent(jLabel2)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                              .addGroup(layout.createSequentialGroup()
                                 .addComponent(jLabel3)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                 .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                     .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 823, Short.MAX_VALUE)
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel5)
                  .addGap(48, 48, 48)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel1)
                     .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(20, 20, 20)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel2)
                     .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(22, 22, 22)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel3)
                     .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(26, 26, 26)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel4)
                     .addComponent(datePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jButton1)
                     .addComponent(jButton2)
                     .addComponent(jButton3)))
               .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
            .addGap(19, 19, 19))
      );

      pack();
      setLocationRelativeTo(null);
   }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         
       int sel_row = jTable1.getSelectedRow();
        int stdId = Integer.parseInt(model.getValueAt(sel_row, 0).toString());
     ResultSet res;
    String strSQL, birthdate;
    try { strSQL="select * from attendance where attendance.att_id = ?";
           PreparedStatement pst =
                   connection.prepareStatement(strSQL);
           pst.setInt(1, stdId);
           //pst.
           res = pst.executeQuery();
           while (res.next()){  
                  jTextField1.setText(""+res.getInt("att_id"));
                  jTextField2.setText(""+res.getString("std_id"));
                  jTextField3.setText(""+res.getString("crs_id"));
                  Date dt = res.getDate("att_date");
                  String st_d = dateToString(dt);
                  datePicker1.setText(st_d);
             }
                    
            } catch (SQLException ex) {
            Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
            }
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Boolean found=false;
       if (!jTextField1.getText().trim().isEmpty()) {
          int att_id = Integer.parseInt(jTextField1.getText().trim());

        found=CheckFunctions.check_attendance(att_id);
          
          
          if (found) {
             DelFunctions.delete_attendance(att_id);
             JOptionPane.showMessageDialog(null, "Selected Attendance Record Successfully DELETED!");
          }
       } else {
          JOptionPane.showMessageDialog(null, "You have to fill Attendance id field before deleting the record!");
       }
       refresh_JTable();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//NEW 

       jTextField1.setText(null);
       jTextField2.setText(null);
       jTextField3.setText(null);
       datePicker1.setDateToToday();
       jTextField1.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // SAVE
       Boolean found=false;
       if (!jTextField1.getText().trim().isEmpty()
               && !jTextField2.getText().trim().isEmpty()
               && !jTextField3.getText().trim().isEmpty()) {
          int att_id = Integer.parseInt(jTextField1.getText().trim());
          int std_id = Integer.parseInt(jTextField2.getText().trim());
          int crs_id = Integer.parseInt(jTextField3.getText().trim());
          String temp_date = datePicker1.getDate().toString().trim();
          String string_attdate = temp_date.substring(8, 10) + "/"
                  + temp_date.substring(5, 7) + "/"
                  + temp_date.substring(0, 4);

          GregorianCalendar att_date
                  = StudentGradingSystemProject.strToGregorianCalendar(
                          string_attdate);

        found=CheckFunctions.check_attendance(att_id);
         
          if (!found) {
             // New Student Record  
             AddFunctions.add_attendance(att_id, std_id, crs_id, att_date);
             JOptionPane.showMessageDialog(null, "NEW Attendance Record Successfully ADDED!");
          } else {
             // found is true! So existing student recort will be updated!!!  
             EditFunctions.edit_attendance(att_id, std_id, crs_id, att_date);
             JOptionPane.showMessageDialog(null, "Attendance Record Successfully EDITED!");

          }
       } else {
          JOptionPane.showMessageDialog(null, "You have to fill all fields before saving!");
       }
       refresh_JTable();
    }//GEN-LAST:event_jButton2ActionPerformed

   public static void main(String args[]) {

      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(AttendanceMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(AttendanceMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(AttendanceMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(AttendanceMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }

      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new AttendanceMgmt().setVisible(true);
         }
      });
   }

   public void refresh_JTable() {

      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      Object rowData[] = new Object[4];
      model.setNumRows(0); //Remove all existing rows of JTable
      ResultSet res;
      String strSQL, att_date;

      try {
         strSQL = "select * from attendance";
         Statement statement
                 = connection.createStatement();
         res = statement.executeQuery(strSQL);
         while (res.next()) {
            att_date = fmt.format(res.getDate("att_date"));

            rowData[0] = res.getInt("att_id");
            rowData[1] = res.getInt("std_id");
            rowData[2] = res.getInt("crs_id");
            rowData[3] = att_date;

            model.addRow(rowData);
         }
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
   }

   public String dateToString(Date d_date) {
      String temp_date, conv_date = null;
      temp_date = StudentGradingSystemProject.fmt.format(d_date);
      // Required format is like: May 15, 2021
      switch (temp_date.substring(3, 5)) {
         case "01":
            conv_date = "January " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
         case "02":
            conv_date = "February " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
         case "03":
            conv_date = "March " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
         case "04":
            conv_date = "April " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
         case "05":
            conv_date = "May " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
         case "06":
            conv_date = "June " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
         case "07":
            conv_date = "July " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
         case "08":
            conv_date = "August " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
         case "09":
            conv_date = "September " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
         case "10":
            conv_date = "October " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
         case "11":
            conv_date = "November " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
         case "12":
            conv_date = "December " + temp_date.substring(0, 2) + ", "
                    + temp_date.substring(6, 10);
            break;
      }
      return conv_date;
   }


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private com.github.lgooddatepicker.components.DatePicker datePicker1;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable1;
   private javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField2;
   private javax.swing.JTextField jTextField3;
   // End of variables declaration//GEN-END:variables
}
