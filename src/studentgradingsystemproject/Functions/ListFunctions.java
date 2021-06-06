package studentgradingsystemproject.Functions;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentgradingsystemproject.Attendance;
import studentgradingsystemproject.Course;
import studentgradingsystemproject.Department;
import studentgradingsystemproject.Grades;
import studentgradingsystemproject.Student;
import studentgradingsystemproject.StudentGradingSystemProject;
import static studentgradingsystemproject.StudentGradingSystemProject.connection;
import static studentgradingsystemproject.StudentGradingSystemProject.draw_line;
import static studentgradingsystemproject.StudentGradingSystemProject.fmt;

/**
 * @author Ali ATILGAN
 */
public class ListFunctions {

   //LİST
   public static void list_students() {
      Student st;
      ResultSet res;
      String strSQL, gender, birthdate;
      System.out.printf("\n%10d %10s %15s %15s %10s %12s %12s",
              "Student Id", "Student No", "Std. Name", "Std. Surname",
              "Gender", "Nationality", "Birthday");
      draw_line(90);

      try {
         strSQL = "select * from students";
         Statement statement
                 = connection.createStatement();
         res = statement.executeQuery(strSQL);
         while (res.next()) {
            if (res.getString("std_gender").equalsIgnoreCase("F")) {
               gender = "Female";
            } else {
               gender = "Male";
            }

            birthdate = fmt.format(res.getDate("std_birthdate"));
            System.out.printf("\n%10d %10s %15s %15s %10s %12s %12s",
                    res.getInt("std_id"), res.getString("std_no"),
                    res.getString("std_name"), res.getString("std_surname"),
                    gender, res.getString("std_nationality"), birthdate);
         }

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      /*Student st;
      StudentGradingSystemProject.fmt = new SimpleDateFormat("dd/MM/yyyy");
      Iterator<Student> itr = StudentGradingSystemProject.students.iterator();
      System.out.printf("\n%10s %10s %15s %15s %10s %12s %12s", "Student Id", "Student No", "Std. Name", "Std. Surname", "Gender", "Nationality", "Birthday");
      StudentGradingSystemProject.draw_line(90);
      while (itr.hasNext()) {
         st = itr.next();
         StudentGradingSystemProject.fmt.setCalendar(st.getStd_birthdate());
         System.out.printf("\n%10d %10s %15s %15s %10s %12s %12s", st.getStd_id(), st.getStd_no(), st.getStd_name(), st.getStd_surname(), st.getStd_gender(), st.getStd_nationality(), StudentGradingSystemProject.fmt.format(st.getStd_birthdate().getTime()));
      }
      StudentGradingSystemProject.draw_line(90);
       */
   }

   public static void list_department() {
      Department dr;
      ResultSet res;
      String strSQL;
      System.out.printf("\n%10d %10s", "Department Id", "Department Name");
      StudentGradingSystemProject.draw_line(90);

      try {
         strSQL = "select * from department";
         Statement statement
                 = connection.createStatement();
         res = statement.executeQuery(strSQL);
         while (res.next()) {
            System.out.printf("\n%10d %10s", res.getInt("dept_id"), res.getString("dept_name"));
         }
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      /* Department dr;
      Iterator<Department> itr = StudentGradingSystemProject.departments.iterator();
      System.out.printf("\n%10s %10s", "Department Id", "Department Name");
      StudentGradingSystemProject.draw_line(90);
      while (itr.hasNext()) {
         dr = itr.next();
         System.out.printf("\n%10d %10s", dr.getDept_id(), dr.getDept_name());
      }
      StudentGradingSystemProject.draw_line(90);*/
   }

   public static void list_grades() {
      Grades gr;
      ResultSet res;
      String strSQL;
      System.out.printf("\n%10d %10d %10d %10f %10f %10f %10s", "Grades Id", "Student ID", "Course ID", "Midterm Grade", "Homework Grade", "Final Grade", "Letter Grade");
      StudentGradingSystemProject.draw_line(90);

      try {
         strSQL = "select * from grades";
         Statement statement
                 = connection.createStatement();
         res = statement.executeQuery(strSQL);
         while (res.next()) {
            System.out.printf("\n%10d %10d %10d %10f %10f %10f %10s", res.getInt("grd_id"), res.getInt("std_id"), res.getInt("crs_id"), res.getFloat("grd_mt"), res.getFloat("grd_hw"), res.getFloat("grd_final"), res.getString("grd_lgrade"));
         }
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      /*
         Grades gr;
      Iterator<Grades> itr = StudentGradingSystemProject.gradeses.iterator();
      System.out.printf("\n%10s %10s %15s %15s %10s %12s %12s", "Grade Id", "Student Id", "Course Id", "Grade mt", "Grade hw", "Grade final", "Grade lgrade");
      StudentGradingSystemProject.draw_line(90);
      while (itr.hasNext()) {
         gr = itr.next();
         System.out.printf("\n%10d %10s %15s %15s %10s %12s %12s", gr.getGrd_id(), gr.getStd_id(), gr.getCrs_id(), gr.getGrd_mt(), gr.getGrd_hw(), gr.getGrd_final(), gr.getGrd_lgrade());
      }
      StudentGradingSystemProject.draw_line(90);*/
   }

   public static void list_course() {
      Course cr;
      ResultSet res;
      String strSQL;
      System.out.printf("\n%10d %10d %10s %10s", "Course Id", "Department ID", "Course Code", "Course Name");
      StudentGradingSystemProject.draw_line(90);

      try {
         strSQL = "select * from course";
         Statement statement
                 = connection.createStatement();
         res = statement.executeQuery(strSQL);
         while (res.next()) {
            System.out.printf("\n%10d %10d %10s %10s", res.getInt("crs_id "), res.getInt("dept_id "), res.getString("crs_code"), res.getString("crs_name"));
         }
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }

      /*  
      Course cr;
      Iterator<Course> itr = StudentGradingSystemProject.courses.iterator();
      System.out.printf("\n%10s %10s %15s %15s", "Course Id", "Department Id", "Course Code", "Course name");
      StudentGradingSystemProject.draw_line(90);
      while (itr.hasNext()) {
         cr = itr.next();
         System.out.printf("\n%10d %10s %15s %15s", cr.getCrs_id(), cr.getDept_id(), cr.getCrs_code(), cr.getCrs_name());
      }
      StudentGradingSystemProject.draw_line(90);*/
   }

   public static void list_attendance() {
      Attendance at;
      ResultSet res;
      String strSQL,attendanceDate;
      System.out.printf("\n%10d %10d %10d %10s", "Attendance Id", "Student ID", "Course ID", "Attendance Date");
      StudentGradingSystemProject.draw_line(90);

      try {
         strSQL = "select * from attendance";
         Statement statement
                 = connection.createStatement();
         res = statement.executeQuery(strSQL);
         while (res.next()) {
             attendanceDate = fmt.format(res.getDate("att_date"));
            System.out.printf("\n%10d %10d %10s %10s", res.getInt("att_id"), res.getInt("std_id"), res.getInt("crs_id"),attendanceDate);
         }
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);

         
         
         /* 
             Attendance at;
         StudentGradingSystemProject.fmt = new SimpleDateFormat("dd/MM/yyyy");
      Iterator<Attendance> itr = StudentGradingSystemProject.attendances.iterator();
      System.out.printf("\n%10s %10s %15s %15s", "Attendance Id", "Student Id", "Course Id", "Attendance date");
      StudentGradingSystemProject.draw_line(90);
      while (itr.hasNext()) {
         at = itr.next();
         StudentGradingSystemProject.fmt.setCalendar(at.getAtt_date());
         System.out.printf("\n%10s %10s %15s %15s", at.getAtt_id(), at.getStd_id(), at.getCrs_id(), StudentGradingSystemProject.fmt.format(at.getAtt_date().getTime()));
      }
      StudentGradingSystemProject.draw_line(90);*/
      }

   }
}
