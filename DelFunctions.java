/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradingsystemproject;

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
public class DelFunctions {
        public static void delete_student(int std_id) {
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
      if (found) students.remove(st);
      }
    public static void delete_course(int crs_id) {
      Course cr=null;
      Boolean found=false;
      Iterator <Course> itr = courses.iterator();
      while (itr.hasNext()) {
          cr = itr.next(); 
          if(crs_id==cr.getCrs_id()) {
              found=true;
              break;
          }
      }
      if (found) courses.remove(cr);
      }
    public static void delete_department(int dept_id) {
      Department dr=null;
      Boolean found=false;
      Iterator <Department> itr = departments.iterator();
      while (itr.hasNext()) {
          dr = itr.next(); 
          if(dept_id==dr.getDept_id()) {
              found=true;
              break;
          }
      }
      if (found) departments.remove(dr);
      }
    public static void delete_grades(int grd_id) {
      Grades gr=null;
      Boolean found=false;
      Iterator <Grades> itr = gradeses.iterator();
      while (itr.hasNext()) {
          gr = itr.next(); 
          if(grd_id==gr.getGrd_id()) {
              found=true;
              break;
          }
      }
      if (found) gradeses.remove(gr);
      }
    public static void delete_attendance(int att_id) {
      Attendance at=null;
      Boolean found=false;
      Iterator <Attendance> itr = attendances.iterator();
      while (itr.hasNext()) {
          at = itr.next(); 
          if(att_id==at.getAtt_id()) {
              found=true;
              break;
          }
      }
      if (found) attendances.remove(at);
      }
    
}
