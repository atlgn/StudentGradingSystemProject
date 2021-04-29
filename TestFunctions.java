/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradingsystemproject;

import java.io.IOException;
import javax.swing.JOptionPane;
import static studentgradingsystemproject.AddFunctions.add_attendance;
import static studentgradingsystemproject.AddFunctions.add_course;
import static studentgradingsystemproject.AddFunctions.add_department;
import static studentgradingsystemproject.AddFunctions.add_grades;
import static studentgradingsystemproject.AddFunctions.add_student;
import static studentgradingsystemproject.BackupFunctions.backup_attendance;
import static studentgradingsystemproject.BackupFunctions.backup_course;
import static studentgradingsystemproject.BackupFunctions.backup_department;
import static studentgradingsystemproject.BackupFunctions.backup_grades;
import static studentgradingsystemproject.BackupFunctions.backup_student;
import static studentgradingsystemproject.DelFunctions.delete_attendance;
import static studentgradingsystemproject.DelFunctions.delete_course;
import static studentgradingsystemproject.DelFunctions.delete_department;
import static studentgradingsystemproject.DelFunctions.delete_grades;
import static studentgradingsystemproject.DelFunctions.delete_student;
import static studentgradingsystemproject.EditFunctions.edit_attendance;
import static studentgradingsystemproject.EditFunctions.edit_course;
import static studentgradingsystemproject.EditFunctions.edit_department;
import static studentgradingsystemproject.EditFunctions.edit_grades;
import static studentgradingsystemproject.EditFunctions.edit_student;
import static studentgradingsystemproject.ListFunctions.list_attendance;
import static studentgradingsystemproject.ListFunctions.list_course;
import static studentgradingsystemproject.ListFunctions.list_department;
import static studentgradingsystemproject.ListFunctions.list_grades;
import static studentgradingsystemproject.ListFunctions.list_students;
import static studentgradingsystemproject.RetriveFunctions.retrieve_attendance;
import static studentgradingsystemproject.RetriveFunctions.retrieve_course;
import static studentgradingsystemproject.RetriveFunctions.retrieve_department;
import static studentgradingsystemproject.RetriveFunctions.retrieve_grades;
import static studentgradingsystemproject.RetriveFunctions.retrieve_student;
import static studentgradingsystemproject.StudentGradingSystemProject.strToGregorianCalendar;

/**
 *
 * @author gram1
 */
public class TestFunctions {
       public static void test_students() {
        
        try {
        System.out.printf("\n Tests for Class Student\n\n");
        //1
        System.out.printf("\n STEP 1 Add_student()\n\n");
        
        add_student(1,"189222", "Ayse","Cengiz",'F',"Turkey",
                    strToGregorianCalendar("28/03/2002"));
        add_student(2,"193342","Philip","Udoye",'M',"Nigeri",
                    strToGregorianCalendar("16/09/2003"));
        add_student(3,"189931","Kemal","Salih",'M',"TRNC",
                    strToGregorianCalendar("17/05/2002"));
        add_student(4,"188883","Fathima","Mohammad",'F',"Syria",
                    strToGregorianCalendar("22/11/2001"));                
        add_student(5,"189447","Jasmin","Faruq",'F',"Egypt",
                    strToGregorianCalendar("19/02/2002"));                
        //STEP 2
        System.out.printf("\n STEP 2 List_student()\n\n");
        list_students();
       
        //STEP 3  
        System.out.printf("\n STEP 3 Edit_student()\n\n");
        edit_student(3,"189931","Kemal","Salih",'M',"Turkey",
                    strToGregorianCalendar("17/04/2002"));
     
        //STEP 4
       System.out.printf("\n STEP 4 List_student()\n\n");
       list_students();
      
       //STEP 5
        System.out.printf("\n STEP 5 Backup_student()\n\n");
       backup_student();
       
       //STEP 6
        System.out.printf("\n STEP 6 Delete_student()\n\n");
        delete_student(3);
     
        //STEP 7
        System.out.printf("\n STEP 7 List_student()\n\n");
        list_students();
      
        //STEP 8
         System.out.printf("\n STEP 8 retrieve_student()\n\n");
        retrieve_student();
     
        //STEP 9
        System.out.printf("\n STEP 9 List_student()\n\n");
        list_students(); 
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void test_course() {
   try {
        System.out.printf("\n Tests for Class Course\n\n");
     
        //1   
        System.out.printf("\n STEP 1 Add_course()\n\n");
        add_course(1,1,"ITEC314","Multi Platform Programming");
        add_course(2,1,"ITEC413","Information Systems Security");
        add_course(3,2,"ECON101","Introduction to Economics");

         //STEP 2
        System.out.printf("\n STEP 2 List_course()\n\n");
        list_course();
       
        //STEP 3  
        System.out.printf("\n STEP 3 Edit_course()\n\n");
        edit_course(2,1,"ITEC999","ELEC");
     
        //STEP 4
       System.out.printf("\n STEP 4 List_course()\n\n");
       list_course();
      
       //STEP 5
        System.out.printf("\n STEP 5 Backup_course()\n\n");
       backup_course();
       
       //STEP 6
        System.out.printf("\n STEP 6 Delete_course()\n\n");
        delete_course(3);
     
        //STEP 7
        System.out.printf("\n STEP 7 List_course()\n\n");
        list_course();
      
        //STEP 8
         System.out.printf("\n STEP 8 List_course()\n\n");
        retrieve_course();
     
        //STEP 9
        System.out.printf("\n STEP 9 List_course()\n\n");
        list_course(); 
         }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void test_department() {
   try {
        System.out.printf("\n Tests for Class department\n\n");
     
        //1   
        System.out.printf("\n STEP 1 Add_department()\n\n");
        add_department(1,"Information Technologies");
        add_department(2,"Economics");
        add_department(3,"Business");

         //STEP 2
        System.out.printf("\n STEP 2 List_department()\n\n");
        list_department();
       
        //STEP 3  
        System.out.printf("\n STEP 3 Edit_department()\n\n");
        edit_department(2,"bezenes");
     
        //STEP 4
       System.out.printf("\n STEP 4 List_department()\n\n");
       list_department();
      
       //STEP 5
        System.out.printf("\n STEP 5 Backup_department()\n\n");
       backup_department();
       
       //STEP 6
        System.out.printf("\n STEP 6 Delete_department()\n\n");
        delete_department(1);
     
        //STEP 7
        System.out.printf("\n STEP 7 List_department()\n\n");
        list_department();
      
        //STEP 8
         System.out.printf("\n STEP 8 List_department()\n\n");
        retrieve_department();
     
        //STEP 9
        System.out.printf("\n STEP 9 List_department()\n\n");
        list_department(); 
         }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void test_grades() {
   try {
        System.out.printf("\n Tests for Class grades\n\n");
     
        //1   
        System.out.printf("\n STEP 1 Add_grades()\n\n");
        add_grades(1,1,1,90f,88f,96f,"A");
        add_grades(2,2,1,80F,85f,92f,"B");
        add_grades(3,3,2,85F,55f,20f,"C");

         //STEP 2
        System.out.printf("\n STEP 2 List_grades()\n\n");
        list_grades();
       
        //STEP 3  
        System.out.printf("\n STEP 3 Edit_grades()\n\n");
        edit_grades(3,3,2,21F,55f,20f,"D");
     
        //STEP 4
       System.out.printf("\n STEP 4 List_grades()\n\n");
       list_grades();
      
       //STEP 5
        System.out.printf("\n STEP 5 Backup_grades()\n\n");
       backup_grades();
       
       //STEP 6
        System.out.printf("\n STEP 6 Delete_grades()\n\n");
        delete_grades(3);
     
        //STEP 7
        System.out.printf("\n STEP 7 List_grades()\n\n");
        list_grades();
      
        //STEP 8
         System.out.printf("\n STEP 8 List_grades()\n\n");
        retrieve_grades();
     
        //STEP 9
        System.out.printf("\n STEP 9 List_grades()\n\n");
        list_grades(); 
         }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void test_attendance() {
   try {
        System.out.printf("\n Tests for Class attendance\n\n");
     
        //1   
        System.out.printf("\n STEP 1 Add_attendance()\n\n");
        add_attendance(1,1,1,strToGregorianCalendar("09/04/2021"));
        add_attendance(2,2,1,strToGregorianCalendar("09/04/2021"));
        add_attendance(2,1,1,strToGregorianCalendar("19/02/2002"));

         //STEP 2
        System.out.printf("\n STEP 2 List_attendance()\n\n");
        list_attendance();
       
        //STEP 3  
        System.out.printf("\n STEP 3 Edit_attendance()\n\n");
        edit_attendance(1,1,1,strToGregorianCalendar("29/12/2022"));
     
        //STEP 4
       System.out.printf("\n STEP 4 List_attendance()\n\n");
       list_attendance();
      
       //STEP 5
        System.out.printf("\n STEP 5 Backup_attendance()\n\n");
       backup_attendance();
       
       //STEP 6
        System.out.printf("\n STEP 6 Delete_attendance()\n\n");
        delete_attendance(3);
     
        //STEP 7
        System.out.printf("\n STEP 7 List_attendance()\n\n");
        list_attendance();
      
        //STEP 8
         System.out.printf("\n STEP 8 List_attendance()\n\n");
        retrieve_attendance();
     
        //STEP 9
        System.out.printf("\n STEP 9 List_attendance()\n\n");
        list_attendance(); 
         }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    } 


}
