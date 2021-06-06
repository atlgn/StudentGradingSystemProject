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
public class AddFunctions {

   public static void add_student(int std_id, String std_no, String std_name, String std_surname, char std_gender, String std_nationality, GregorianCalendar std_birthday) {
      //  Student st = new Student(std_id, std_no, std_name, std_surname, std_gender, std_nationality, std_birthday);
      //   StudentGradingSystemProject.students.add(st);
      try {

         String strSQL = "insert into students "
                 + "(std_no, std_name, std_surname, std_gender, "
                 + "std_nationality, std_birthdate ) values "
                 + "(?, ?, ?, ?, ?, ?)";

         PreparedStatement prepStatement = connection.prepareStatement(strSQL);

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
      /*  Student st =new Student(std_id, std_no, std_name, std_surname,
            std_gender, std_nationality, std_birthday);
            students.add(st);
       */
   }

   public static void add_department(int dept_id, String dept_name) {
      //  Department dr = new Department(dept_id, dept_name);
      //   StudentGradingSystemProject.departments.add(dr);
      try {

         String strSQL = "insert into department"
                 + "(dept_name)  values"
                 + "(?)";

         PreparedStatement prepStatement
                 = connection.prepareStatement(strSQL);

         prepStatement.setString(1, dept_name);

         prepStatement.executeUpdate();

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
      /*        Student st =new Student(std_id, std_no, std_name, std_surname,
            std_gender, std_nationality, std_birthday);
            
            students.add(st);
       */
   }

   public static void add_course(int crs_id, int dept_id, String crs_code, String crs_name) {
      //  Course cr = new Course(crs_id, dept_id, crs_code, crs_name);
      //   StudentGradingSystemProject.courses.add(cr);
      try {

         String strSQL = "insert into course "
                 + "(dept_id, crs_code, crs_name) values "
                 + "( ?, ?, ?)";

         PreparedStatement prepStatement = connection.prepareStatement(strSQL);

         prepStatement.setInt(1, dept_id);
         prepStatement.setString(2, crs_code);
         prepStatement.setString(3, crs_name);
         prepStatement.executeUpdate();

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }

   }

   public static void add_grades(int grd_id, int std_id, int crs_id, float grd_mt, float grd_hw, float grd_final, String grd_lgrade) {
      // Grades gr = new Grades(grd_id, std_id, crs_id, grd_mt, grd_hw, grd_final, grd_lgrade);
      //   StudentGradingSystemProject.gradeses.add(gr);
      try {

         String strSQL = "insert into grades "
                 + "(std_id, crs_id, grd_mt, grd_hw, grd_final, grd_lgrade) values "
                 + "(?, ?, ?, ?, ?, ?)";

         PreparedStatement prepStatement = connection.prepareStatement(strSQL);
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
   }

   public static void add_attendance(int att_id, int std_id, int crs_id, GregorianCalendar att_date) {
      //  Attendance at = new Attendance(att_id, std_id, crs_id, att_date);
      //    StudentGradingSystemProject.attendances.add(at);
      try {

         String strSQL = "insert into attendance "
                 + "(std_id, crs_id, att_date) values "
                 + "(?, ?, ?)";

         PreparedStatement prepStatement = connection.prepareStatement(strSQL);

         prepStatement.setInt(1, std_id);
         prepStatement.setInt(2, crs_id);
         prepStatement.setObject(3, att_date.getTime(), java.sql.Types.DATE);
         prepStatement.executeUpdate();

      } catch (SQLException ex) {
         Logger.getLogger(StudentGradingSystemProject.class.getName()).log(Level.SEVERE, null, ex);
      }
   }

}
