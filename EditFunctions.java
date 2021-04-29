/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradingsystemproject;

import java.util.GregorianCalendar;
import java.util.Iterator;
import static studentgradingsystemproject.StudentGradingSystemProject.attendances;
import static studentgradingsystemproject.StudentGradingSystemProject.courses;
import static studentgradingsystemproject.StudentGradingSystemProject.departments;
import static studentgradingsystemproject.StudentGradingSystemProject.gradeses;
import static studentgradingsystemproject.StudentGradingSystemProject.students;

/**
 *
 * @author gram1
 */
public class EditFunctions {

    /**
     *
     * @param std_id
     * @param std_no
     * @param std_name
     * @param std_surname
     * @param std_gender
     * @param std_nationality
     * @param std_birthday
     */
    public static void edit_student(int std_id, String std_no, String std_name, String std_surname, char std_gender, String std_nationality, GregorianCalendar std_birthday) {
        
     Student st=null;
      Boolean found=false;
      Iterator <Student> itr = students.iterator();
      while (itr.hasNext()) {
          st = itr.next(); 
          if(std_id==st.getStd_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          st.setStd_no(std_no);
          st.setStd_name(std_name);
          st.setStd_surname(std_surname);
          st.setStd_nationality(std_nationality);
          st.setStd_gender(std_gender);
          st.setStd_birthdate(std_birthday);
      }
    }  
    public static void edit_course(int crs_id, int dept_id, String crs_code, String crs_name) {
        
     Course cr =null;
      Boolean found=false;
      Iterator <Course> itr = courses.iterator();
      while (itr.hasNext()) {
          cr = itr.next(); 
          if(crs_id==cr.getCrs_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          cr.setCrs_code(crs_code);
          cr.setCrs_name(crs_name);
      }
    }
    public static void edit_department(int dept_id, String dept_name) {
        
     Department dr =null;
      Boolean found=false;
      Iterator <Department> itr = departments.iterator();
      while (itr.hasNext()) {
          dr = itr.next(); 
          if(dept_id==dr.getDept_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          dr.setDept_name(dept_name);
      }
    }
    public static void edit_grades(int grd_id, int std_id, int crs_id, float grd_mt, float grd_hw, float grd_final, String grd_lgrade) {
        
     Grades gr =null;
      Boolean found=false;
      Iterator <Grades> itr = gradeses.iterator();
      while (itr.hasNext()) {
          gr = itr.next(); 
          if(grd_id == gr.getGrd_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          gr.setGrd_mt(grd_mt);
          gr.setGrd_hw(grd_hw);
          gr.setGrd_final(grd_final);
          gr.setGrd_lgrade(grd_lgrade);
      }
    }
    public static void edit_attendance(int att_id, int std_id, int crs_id, GregorianCalendar att_date) {
        
     Attendance at =null;
      Boolean found=false;
      Iterator <Attendance> itr = attendances.iterator();
      while (itr.hasNext()) {
          at = itr.next(); 
          if(att_id==at.getAtt_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          at.setAtt_date(att_date);
      }
    }
    
}
