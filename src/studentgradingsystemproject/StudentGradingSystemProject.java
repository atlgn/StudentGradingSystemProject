package studentgradingsystemproject;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import studentgradingsystemproject.Functions.AddFunctions;
import studentgradingsystemproject.Functions.ListFunctions;

//ALI ATILGAN 17000103
public class StudentGradingSystemProject {

   public static List students;
   public static List courses;
   public static List departments;
   public static List gradeses;
   public static List attendances;
   public static SimpleDateFormat fmt;
   // Defining a global pointer for Connection object

   public static Connection connection;

   public static void main(String[] args) throws SQLException {
      students = new ArrayList();
      courses = new ArrayList();
      departments = new ArrayList();
      gradeses = new ArrayList();
      attendances = new ArrayList();
      fmt = new SimpleDateFormat("dd/MM/yyyy");

      connection = DriverManager.getConnection(
              "jdbc:mysql://localhost/studentregsys", "root", "");

      /* create_students();
    create_course();
      create_department();
      create_grades();
      create_attendance();
       */
      new Menu().setVisible(true);
      System.out.printf("\n");
   }

   /* 3- 
    A method is developed to check whether there is a record in the table students
    which its' student id is std_id
    if found it will return true else return false
    */
   //CALENDAR Function
   public static GregorianCalendar strToGregorianCalendar(String stDate) {
      GregorianCalendar bdate;

      bdate = new GregorianCalendar(
              Integer.parseInt(stDate.substring(6, 10)),
              Integer.parseInt(stDate.substring(3, 5)) - 1,
              Integer.parseInt(stDate.substring(0, 2)));
      return bdate;
   }

   // DRAW LİNE FOR LOG
   public static void draw_line(int num) {
      String ln = "";
      for (int i = 0; i < num; i++) {
         ln += "=";
      }
      System.out.printf("\n" + ln);
   }

   //Create Sample DATA //
   public static void create_students() {

      try {
         Statement st = StudentGradingSystemProject.connection.createStatement();
         st.executeUpdate("truncate students");
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }

      System.out.printf("\n  Add_student()\n\n");

      AddFunctions.add_student(1, "189222", "Ayse", "Cengiz", 'F', "Turkey",
              strToGregorianCalendar("28/03/2002"));
      AddFunctions.add_student(2, "193342", "Philip", "Udoye", 'M', "Nigeri",
              strToGregorianCalendar("16/09/2003"));
      AddFunctions.add_student(3, "189931", "Kemal", "Salih", 'M', "TRNC",
              strToGregorianCalendar("17/05/2002"));
      AddFunctions.add_student(4, "188883", "Fathima", "Mohammad", 'F', "Syria",
              strToGregorianCalendar("22/11/2001"));
      AddFunctions.add_student(5, "189447", "Jasmin", "Faruq", 'F', "Egypt",
              strToGregorianCalendar("19/02/2002"));
      //STEP 2
      System.out.printf("\n STEP 2 List_student()");
      ListFunctions.list_students();
   }

   public static void create_department() {
      try {
         Statement st = StudentGradingSystemProject.connection.createStatement();
         st.executeUpdate("truncate department");
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      //1
      System.out.printf("\n STEP 1 Add_department()\n\n");
      AddFunctions.add_department(1, "Information Technologies");
      AddFunctions.add_department(2, "Economics");
      AddFunctions.add_department(3, "Technologies");
      AddFunctions.add_department(4, "Software engineer");

      //STEP 2
      System.out.printf("\n STEP 2 List_department()");
      ListFunctions.list_department();

   }

   public static void create_course() {
      try {
         Statement st = StudentGradingSystemProject.connection.createStatement();
         st.executeUpdate("truncate course");
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
//1
      System.out.printf("\n STEP 1 Add_course()\n\n");
      AddFunctions.add_course(1, 1, "ITEC314", "Multi Platform Programming");
      AddFunctions.add_course(2, 2, "ITEC413", "Information Systems Security");
      AddFunctions.add_course(3, 1, "ECON101", "Introduction to Economics");
      AddFunctions.add_course(4, 2, "SFT", "SOFTWARE to Economics");
      //STEP 2
      System.out.printf("\n STEP 2 List_course()");
      ListFunctions.list_course();
   }

   public static void create_grades() {
      try {
         Statement st = StudentGradingSystemProject.connection.createStatement();
         st.executeUpdate("truncate grades");
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      //1
      System.out.printf("\n STEP 1 add()\n\n");
      AddFunctions.add_grades(1, 1, 1, 90f, 88f, 96f, "A");
      AddFunctions.add_grades(2, 2, 1, 80F, 85f, 92f, "B");
      AddFunctions.add_grades(3, 3, 2, 85F, 55f, 20f, "C");

      //STEP 2
      System.out.printf(" \n STEP 2 List_grades()");
      ListFunctions.list_grades();
   }

   public static void create_attendance() {
      try {
         Statement st = StudentGradingSystemProject.connection.createStatement();
         st.executeUpdate("truncate attendance");
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      //1
      System.out.printf("\n STEP 1 Add_attendance()\n\n");
      AddFunctions.add_attendance(1, 1, 1, strToGregorianCalendar("09/04/2021"));
      AddFunctions.add_attendance(2, 2, 2, strToGregorianCalendar("09/04/2021"));
      AddFunctions.add_attendance(3, 1, 2, strToGregorianCalendar("19/02/2002"));
      AddFunctions.add_attendance(4, 3, 2, strToGregorianCalendar("19/02/2002"));

      //STEP 2
      System.out.printf("\n STEP 2 List_attendance()");
      ListFunctions.list_attendance();

   }
}
