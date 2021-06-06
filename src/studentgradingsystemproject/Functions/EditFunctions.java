package studentgradingsystemproject.Functions;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentgradingsystemproject.StudentGradingSystemProject;
import static studentgradingsystemproject.StudentGradingSystemProject.connection;

/**
 * @author Ali ATILGAN
 */
public class EditFunctions {

   public static void edit_student(int std_id, String std_no, String std_name, String std_surname, char std_gender, String std_nationality, GregorianCalendar std_birthday) {

      try {
         String strSQL = "update students set std_no=?, std_name=? ,std_surname=?, std_gender=?, std_nationality=?, std_birthdate=? "
                 + "WHERE std_id=?";
         PreparedStatement prepStatement
                 = connection.prepareStatement(strSQL);

         prepStatement.setInt(7, std_id);
         prepStatement.setString(1, std_no);
         prepStatement.setString(2, std_name);
         prepStatement.setString(3, std_surname);
         prepStatement.setObject(4, std_gender, java.sql.Types.CHAR);
         prepStatement.setString(5, std_nationality);
         prepStatement.setObject(6, std_birthday.getTime(), java.sql.Types.DATE);

         prepStatement.executeUpdate();
      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }

      /* Student st = null;
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
         st.setStd_no(std_no);
         st.setStd_name(std_name);
         st.setStd_surname(std_surname);
         st.setStd_nationality(std_nationality);
         st.setStd_gender(std_gender);
         st.setStd_birthdate(std_birthday);
      }*/
   }

   public static void edit_department(int dept_id, String dept_name) {

      try {
         String strSQL = "update department set dept_name=?"
                 + " WHERE dept_id=?";
         PreparedStatement prepStatement
                 = connection.prepareStatement(strSQL);

         prepStatement.setInt(2, dept_id);
         prepStatement.setString(1, dept_name);

         prepStatement.executeUpdate();

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }

      /*    Department dr = null;
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
         dr.setDept_name(dept_name);
      }
       */
   }

   public static void edit_grades(int grd_id, int std_id, int crs_id, float grd_mt, float grd_hw, float grd_final, String grd_lgrade) {

      try {
         String strSQL = "update grades set std_id=?, crs_id=?, grd_mt=?, grd_hw=?, grd_final=?, grd_lgrade=? "
                 + "WHERE grd_id=?";
         PreparedStatement prepStatement = connection.prepareStatement(strSQL);

         prepStatement.setInt(7, grd_id);
         prepStatement.setInt(1, std_id);
         prepStatement.setInt(2, crs_id);
         prepStatement.setFloat(3, grd_mt);
         prepStatement.setFloat(4, grd_hw);
         prepStatement.setFloat(5, grd_final);
         prepStatement.setString(6, grd_lgrade);
         prepStatement.executeUpdate();

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }

      /*  Grades gr = null;
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
         gr.setGrd_mt(grd_mt);
         gr.setGrd_hw(grd_hw);
         gr.setGrd_final(grd_final);
         gr.setGrd_lgrade(grd_lgrade);
      }*/
   }

   public static void edit_course(int crs_id, int dept_id, String crs_code, String crs_name) {

      try {
         String strSQL = "update course set dept_id=?, crs_code=?, crs_name=?"
                 + " WHERE std_id=?";
         PreparedStatement prepStatement = connection.prepareStatement(strSQL);

         prepStatement.setInt(4, crs_id);
         prepStatement.setInt(1, dept_id);
         prepStatement.setString(2, crs_code);
         prepStatement.setString(3, crs_name);
         prepStatement.executeUpdate();

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }

      /* Course cr = null;
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
         cr.setCrs_code(crs_code);
         cr.setCrs_name(crs_name);
      }*/
   }

   public static void edit_attendance(int att_id, int std_id, int crs_id, GregorianCalendar att_date) {

      try {
         String strSQL = "update attendance set std_id=?, crs_id=?, att_date=?"
                 + "WHERE att_id=?";
         PreparedStatement prepStatement = connection.prepareStatement(strSQL);

         prepStatement.setInt(4, att_id);
         prepStatement.setInt(1, std_id);
         prepStatement.setInt(2, crs_id);
         prepStatement.setObject(3, att_date.getTime(), java.sql.Types.DATE);
         prepStatement.executeUpdate();

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }

      /*   Attendance at = null;
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
         at.setAtt_date(att_date);
      }
   }*/
      //EDIT
   }
}
