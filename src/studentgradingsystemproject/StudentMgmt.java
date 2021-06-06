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
import java.util.Date;
import java.util.GregorianCalendar;
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

/**
 *
 * @author btyo
 */
public class StudentMgmt extends javax.swing.JFrame {

    /**
     * Creates new form StudentMgmt
     */
    public StudentMgmt() {
        initComponents();
        refresh_JTable();
        datePicker2.setDateToToday();
        
    }
    
   
    @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      buttonGroup_gender = new javax.swing.ButtonGroup();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      jTextField1 = new javax.swing.JTextField();
      jTextField2 = new javax.swing.JTextField();
      jTextField3 = new javax.swing.JTextField();
      jTextField4 = new javax.swing.JTextField();
      jRadioButton1 = new javax.swing.JRadioButton();
      jRadioButton2 = new javax.swing.JRadioButton();
      jTextField5 = new javax.swing.JTextField();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();
      jButton3 = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTable1 = new javax.swing.JTable();
      datePicker2 = new com.github.lgooddatepicker.components.DatePicker();

      setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
      setTitle("Managing Student Records");

      jLabel1.setText("Std Id");

      jLabel2.setText("Std No");

      jLabel3.setText("Name");

      jLabel4.setText("Surname");

      jLabel5.setText("Gender");

      jLabel6.setText("Nationality");

      jLabel7.setText("Birthday");

      jTextField1.setName("JTF_std_id"); // NOI18N

      jTextField2.setName("JTF_std_no"); // NOI18N

      jTextField3.setName("JTF_std_name"); // NOI18N

      jTextField4.setName("JTF_std_surname"); // NOI18N

      buttonGroup_gender.add(jRadioButton1);
      jRadioButton1.setSelected(true);
      jRadioButton1.setText("Female");

      buttonGroup_gender.add(jRadioButton2);
      jRadioButton2.setText("Male");

      jTextField5.setName("JTF_std_nationality"); // NOI18N

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
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null}
         },
         new String [] {
            "Std Id", "Std No", "Std Name", "Std Surname", "STD Gender", "Std Nationality", "Std Birthday"
         }
      ));
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
            .addGap(30, 30, 30)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jLabel5)
               .addComponent(jLabel7)
               .addComponent(jLabel6)
               .addComponent(jLabel4)
               .addComponent(jLabel3)
               .addComponent(jLabel2)
               .addComponent(jLabel1))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(10, 10, 10)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jTextField3)
                     .addComponent(jTextField4)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2))
                     .addComponent(jTextField5)
                     .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))))
               .addGroup(layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(20, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel1)
               .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel4)
               .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel5)
               .addComponent(jRadioButton1)
               .addComponent(jRadioButton2))
            .addGap(5, 5, 5)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel6)
               .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel7)
               .addComponent(datePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jButton1)
               .addComponent(jButton2)
               .addComponent(jButton3))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    jTextField1.setText(null);
    jTextField2.setText(null);
    jTextField3.setText(null);
    jTextField4.setText(null);
    jTextField5.setText(null);
    jRadioButton1.setSelected(true);
    datePicker2.setDateToToday();
    jTextField1.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    int sel_row= jTable1.getSelectedRow();
    
    
    int stdId = Integer.parseInt(model.getValueAt(sel_row, 0).toString());
    
    ResultSet res;
    String strSQL, gender, birthdate;
      
    try {
           strSQL="select * from students where students.std_id = ?";
           PreparedStatement pst =
                   connection.prepareStatement(strSQL);
           pst.setInt(1, stdId);
           //pst.
           res = pst.executeQuery();
           while (res.next()){
                if (res.getString("std_gender").equalsIgnoreCase("F"))
                  gender = "Female"; else gender="Male";
                  birthdate = fmt.format(res.getDate("std_birthdate"));
                               
                  jTextField1.setText(""+res.getInt("Std_id"));
                  jTextField2.setText(res.getString("std_no"));
                  jTextField3.setText(res.getString("std_name"));
                  jTextField4.setText(res.getString("std_surname"));
                  jTextField5.setText(res.getString("std_nationality"));
                  if (res.getString("std_gender").equalsIgnoreCase("M")) 
                       jRadioButton2.setSelected(true);
                  else jRadioButton1.setSelected(true);
                  Date dt = res.getDate("std_birthdate");
                  String st_d = dateToString(dt);
                  datePicker2.setText(st_d);
             }
                    
            } catch (SQLException ex) {
            Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
            }
     
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // Save button
       Boolean found=false;
       if(
           !jTextField2.getText().trim().isEmpty()&&
           !jTextField3.getText().trim().isEmpty()&&
           !jTextField4.getText().trim().isEmpty()&&
           !jTextField5.getText().trim().isEmpty()) {
            int std_id         = Integer.parseInt(jTextField1.getText().trim());
            String std_no      = jTextField2.getText().trim();
            String std_name    = jTextField3.getText().trim();
            String std_surname = jTextField4.getText().trim();
            char std_gender;
            if(jRadioButton1.isSelected()) std_gender='F'; else std_gender='M';
            String std_nationality=jTextField5.getText().trim();
            String temp_date = datePicker2.getDate().toString().trim();
   
            String string_birthdate=temp_date.substring(8,10)+"/"+
                                temp_date.substring(5,7)+"/"+
                                temp_date.substring(0,4);

            GregorianCalendar std_birthdate = 
                    StudentGradingSystemProject.strToGregorianCalendar(
                     string_birthdate);

            found=CheckFunctions.check_student(std_id);

           if (!found) {  
             // New Student Record  
             AddFunctions.add_student(std_id, std_no, std_name, 
                       std_surname, std_gender, std_nationality, std_birthdate);
             JOptionPane.showMessageDialog(null, "NEW Student Record Successfully ADDED!");
           } else {
             // found is true! So existing student recort will be updated!!!  
             EditFunctions.edit_student(std_id, std_no, std_name, 
                     std_surname, std_gender, std_nationality, std_birthdate);
             JOptionPane.showMessageDialog(null, "Student Record Successfully EDITED!");

           }
    }//GEN-LAST:event_jButton2ActionPerformed
        else {
            JOptionPane.showMessageDialog(null, "You have to fill all fields before saving!");
        }
        refresh_JTable();
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      // DELETE BUTTON
       Boolean found=false;
        if(
           !jTextField1.getText().trim().isEmpty()) {
            int std_id         = Integer.parseInt(jTextField1.getText().trim());
            
            found=CheckFunctions.check_student(std_id);

           if (found) {  
             DelFunctions.delete_student(std_id);
             JOptionPane.showMessageDialog(null, "Selected Student Record Successfully DELETED!");
           } 
    } else                                      
       {
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
            java.util.logging.Logger.getLogger(StudentMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMgmt().setVisible(true);
            }
        });
    }
    
    public String dateToString(Date d_date) {
    String temp_date, conv_date=null;
    temp_date = StudentGradingSystemProject.fmt.format(d_date);
    // Required format is like: May 15, 2021
    switch (temp_date.substring(3,5)) {
        case "01": conv_date="January "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;
        case "02": conv_date="February "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;        
        case "03": conv_date="March "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "04": conv_date="April "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "05": conv_date="May "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "06": conv_date="June "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "07": conv_date="July "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "08": conv_date="August "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "09": conv_date="September "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "10": conv_date="October "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "11": conv_date="November "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
        case "12": conv_date="December "+temp_date.substring(0,2)+", "+
                temp_date.substring(6,10); break;                
    }
    return conv_date;    
    }
    
    public String DateFormatConverter(String s_date) {
    String dd=null, mm=null, yyyy=null;
    int w_start=0;
    for (int i=0; i<s_date.length(); i++) {
        if(s_date.charAt(i)==' ') {
           if(mm==null) {
               mm= s_date.substring(w_start, i);
               w_start=i+1;
           } else if (dd==null) {
               dd=s_date.substring(w_start, i-1); // Do not get "," character
               w_start=i+1;
           }
       }
    }  
       yyyy=s_date.substring(w_start, s_date.length());
       return dd+"/"+mm+"/"+yyyy;    
    }
    
    public void refresh_JTable() {
        
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
           Object rowData[] = new Object[7]; 
           model.setNumRows(0); //Remove all existing rows of JTable
           ResultSet res;
           String strSQL, gender, birthdate;
      
      try {
           strSQL="select * from students";
           Statement statement =
                   connection.createStatement();
           res = statement.executeQuery(strSQL);
           while (res.next()){
                if (res.getString("std_gender").equalsIgnoreCase("F"))
                  gender = "Female"; else gender="Male";
                  birthdate = fmt.format(res.getDate("std_birthdate"));
              
              rowData[0] = res.getInt("std_id");
              rowData[1] = res.getString("std_no");
              rowData[2] = res.getString("std_name");
              rowData[3] = res.getString("std_surname");
              rowData[4] = gender;
              rowData[5] = res.getString("std_nationality");
              rowData[6] = birthdate;  
              model.addRow(rowData);
             }
                    
            } catch (SQLException ex) {
            Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
            }      
          }
    
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.ButtonGroup buttonGroup_gender;
   private com.github.lgooddatepicker.components.DatePicker datePicker2;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JButton jButton3;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JRadioButton jRadioButton1;
   private javax.swing.JRadioButton jRadioButton2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTable1;
   private javax.swing.JTextField jTextField1;
   private javax.swing.JTextField jTextField2;
   private javax.swing.JTextField jTextField3;
   private javax.swing.JTextField jTextField4;
   private javax.swing.JTextField jTextField5;
   // End of variables declaration//GEN-END:variables
}
