package studentgradingsystemproject.Functions;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import studentgradingsystemproject.StudentGradingSystemProject;
import static studentgradingsystemproject.StudentGradingSystemProject.connection;

/**
 *
 * @author Ali ATILGAN 17000103
 */
public class CheckFunctions {

   public static Boolean check_student(int std_id) {
      ResultSet res;
      String strSQL;
      Boolean ret = false;
      try {
         strSQL = "select count(*) from students where students.std_id = ?";

         PreparedStatement prepStatement = connection.prepareStatement(strSQL);
         prepStatement.setInt(1, std_id);
         res = prepStatement.executeQuery();

         //Initiall res points to null, we need to advance it to the first record
         res.next();

         // if the first field value is > 0 then there is a record which
         // student id is equal to std_id
         if (res.getInt(1) > 0) {
            ret = true;
         }

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      return ret; // returns true if found; returns false if not found
   }

   public static Boolean check_department(int dept_id) {
      ResultSet res;
      String strSQL;
      Boolean ret = false;
      try {
         strSQL = "select count(*) from department where dept_id = ?";

         PreparedStatement prepStatement = connection.prepareStatement(strSQL);
         prepStatement.setInt(1, dept_id);
         res = prepStatement.executeQuery();

         //Initiall res points to null, we need to advance it to the first record
         res.next();

         // if the first field value is > 0 then there is a record which
         // student id is equal to std_id
         if (res.getInt(1) > 0) {
            ret = true;
         }

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      return ret; // returns true if found; returns false if not found
   }

   public static Boolean check_course(int crs_id) {
      ResultSet res;
      String strSQL;
      Boolean ret = false;
      try {
         strSQL = "select count(*) from course where course.crs_id = ?";

         PreparedStatement prepStatement = connection.prepareStatement(strSQL);
         prepStatement.setInt(1, crs_id);
         res = prepStatement.executeQuery();

         //Initiall res points to null, we need to advance it to the first record
         res.next();

         // if the first field value is > 0 then there is a record which
         // student id is equal to std_id
         if (res.getInt(1) > 0) {
            ret = true;
         }

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      return ret; // returns true if found; returns false if not found
   }

   public static Boolean check_grades(int grd_id) {
      ResultSet res;
      String strSQL;
      Boolean ret = false;
      try {
         strSQL = "select count(*) from grades where grades.grd_id = ?";

         PreparedStatement prepStatement = connection.prepareStatement(strSQL);
         prepStatement.setInt(1, grd_id);
         res = prepStatement.executeQuery();

         //Initiall res points to null, we need to advance it to the first record
         res.next();

         // if the first field value is > 0 then there is a record which
         // student id is equal to std_id
         if (res.getInt(1) > 0) {
            ret = true;
         }

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      return ret; // returns true if found; returns false if not found
   }

   public static Boolean check_attendance(int att_id) {
      ResultSet res;
      String strSQL;
      Boolean ret = false;
      try {
         strSQL = "select count(*) from attendance where attendance.att_id = ?";

         PreparedStatement prepStatement = connection.prepareStatement(strSQL);
         prepStatement.setInt(1, att_id);
         res = prepStatement.executeQuery();

         //Initiall res points to null, we need to advance it to the first record
         res.next();

         // if the first field value is > 0 then there is a record which
         // student id is equal to std_id
         if (res.getInt(1) > 0) {
            ret = true;
         }

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      return ret; // returns true if found; returns false if not found
   }
}
