/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradingsystemproject;

import java.text.SimpleDateFormat;
import java.util.Iterator;
import static studentgradingsystemproject.StudentGradingSystemProject.attendances;
import static studentgradingsystemproject.StudentGradingSystemProject.courses;
import static studentgradingsystemproject.StudentGradingSystemProject.departments;
import static studentgradingsystemproject.StudentGradingSystemProject.draw_line;
import static studentgradingsystemproject.StudentGradingSystemProject.gradeses;
import static studentgradingsystemproject.StudentGradingSystemProject.students;

/**
 *
 * @author gram1
 */
public class ListFunctions {
    public static void list_students() {
      Student st;
      SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
      
      Iterator <Student> itr = students.iterator();
      System.out.printf("\n%10s %10s %15s %15s %10s %12s %12s",
              "Student Id", "Student No","Std. Name", "Std. Surname", 
              "Gender","Nationality", "Birthday");
        draw_line(90);
        
      while (itr.hasNext()) {
          st = itr.next(); 
          fmt.setCalendar(st.getStd_birthdate());
          System.out.printf("\n%10d %10s %15s %15s %10s %12s %12s",
              st.getStd_id(), st.getStd_no(), st.getStd_name(), 
              st.getStd_surname(), st.getStd_gender(), st.getStd_nationality(), 
              fmt.format(st.getStd_birthdate().getTime()));
      }
      draw_line(90);
        
    }
    public static void list_course() {
      Course cr;
      Iterator <Course> itr = courses.iterator();
      System.out.printf("\n%10s %10s %15s %15s",
              "Course Id", "Department Id","Course Code", "Course name");
        draw_line(90);
        
      while (itr.hasNext()) {
          cr = itr.next(); 
          System.out.printf("\n%10d %10s %15s %15s",
              cr.getCrs_id(), cr.getDept_id(), cr.getCrs_code(), cr.getCrs_name());
      }
      draw_line(90);
        }
    public static void list_department() {
      Department dr;
      Iterator <Department> itr = departments.iterator();
      System.out.printf("\n%10s %10s",
              "Department Id", "Department Name");
        draw_line(90);
      while (itr.hasNext()) {
          dr = itr.next(); 
          System.out.printf("\n%10d %10s",
              dr.getDept_id(), dr.getDept_name());
      }
      draw_line(90);
        }
    public static void list_grades() {
      Grades gr;
      Iterator <Grades> itr = gradeses.iterator();
      System.out.printf("\n%10s %10s %15s %15s %10s %12s %12s",
              "Grade Id", "Student Id","Course Id", "Grade mt", 
              "Grade hw","Grade final", "Grade lgrade");
        draw_line(90);
      while (itr.hasNext()) {
          gr = itr.next(); 
          System.out.printf("\n%10d %10s %15s %15s %10s %12s %12s",
              gr.getGrd_id(), gr.getStd_id(), gr.getCrs_id(), 
              gr.getGrd_mt(), gr.getGrd_hw(), gr.getGrd_final(), 
              gr.getGrd_lgrade());
      }
      draw_line(90);
    }
    public static void list_attendance() {
      Attendance at;
       SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
      Iterator <Attendance> itr = attendances.iterator();
      System.out.printf("\n%10s %10s %15s %15s",
              "Attendance Id", "Student Id", "Course Id", "Attendance date");
        draw_line(90);
      while (itr.hasNext()) {
          at = itr.next(); 
          fmt.setCalendar(at.getAtt_date());
          System.out.printf("\n%10s %10s %15s %15s",
              at.getAtt_id(), at.getStd_id(), at.getCrs_id(),
              fmt.format(at.getAtt_date().getTime()));

      }
      draw_line(90);
        }
}
