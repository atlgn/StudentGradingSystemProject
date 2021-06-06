package studentgradingsystemproject.Functions;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentgradingsystemproject.StudentGradingSystemProject;
import static studentgradingsystemproject.StudentGradingSystemProject.connection;

/**
 * @author Ali ATILGAN
 */
public class DelFunctions {
   //DELETE

   public static void delete_student(int std_id) {
      try {
         String strSQL = "delete from students where std_id=?";
         PreparedStatement prepStatement
                 = connection.prepareStatement(strSQL);

         prepStatement.setInt(1, std_id);

         prepStatement.executeUpdate();
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }

      /*  Student st = null;
        Boolean found = false;
        Iterator<Student> itr = StudentGradingSystemProject.students.iterator();
        while (itr.hasNext()) {
            st = itr.next();
            if (std_id == st.getStd_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            StudentGradingSystemProject.students.remove(st);
        }*/
   }

   public static void delete_department(int dept_id) {
 try {
         String strSQL = "delete from department where dept_id=?";
         PreparedStatement prepStatement
                 = connection.prepareStatement(strSQL);

         prepStatement.setInt(1, dept_id);

         prepStatement.executeUpdate();
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      /* Department dr = null;
        Boolean found = false;
        Iterator<Department> itr = StudentGradingSystemProject.departments.iterator();
        while (itr.hasNext()) {
            dr = itr.next();
            if (dept_id == dr.getDept_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            StudentGradingSystemProject.departments.remove(dr);
        }*/
   }

   public static void delete_grades(int grd_id) {
 try {
         String strSQL = "delete from grades where grd_id=?";
         PreparedStatement prepStatement
                 = connection.prepareStatement(strSQL);

         prepStatement.setInt(1, grd_id);

         prepStatement.executeUpdate();
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      /*Grades gr = null;
        Boolean found = false;
        Iterator<Grades> itr = StudentGradingSystemProject.gradeses.iterator();
        while (itr.hasNext()) {
            gr = itr.next();
            if (grd_id == gr.getGrd_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            StudentGradingSystemProject.gradeses.remove(gr);
        }*/
   }

   public static void delete_course(int crs_id) {
 try {
         String strSQL = "delete from course where crs_id=?";
         PreparedStatement prepStatement
                 = connection.prepareStatement(strSQL);

         prepStatement.setInt(1, crs_id);

         prepStatement.executeUpdate();
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      /*Course cr = null;
        Boolean found = false;
        Iterator<Course> itr = StudentGradingSystemProject.courses.iterator();
        while (itr.hasNext()) {
            cr = itr.next();
            if (crs_id == cr.getCrs_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            StudentGradingSystemProject.courses.remove(cr);
        }*/
   }

   public static void delete_attendance(int att_id) {
 try {
         String strSQL = "delete from attendance where att_id=?";
         PreparedStatement prepStatement
                 = connection.prepareStatement(strSQL);

         prepStatement.setInt(1, att_id);

         prepStatement.executeUpdate();
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      /* Attendance at = null;
        Boolean found = false;
        Iterator<Attendance> itr = StudentGradingSystemProject.attendances.iterator();
        while (itr.hasNext()) {
            at = itr.next();
            if (att_id == at.getAtt_id()) {
                found = true;
                break;
            }
        }
        if (found) {
            StudentGradingSystemProject.attendances.remove(at);
        }*/
   }

}
