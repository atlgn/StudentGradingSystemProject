/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradingsystemproject;

import java.util.GregorianCalendar;
import static studentgradingsystemproject.StudentGradingSystemProject.attendances;
import static studentgradingsystemproject.StudentGradingSystemProject.courses;
import static studentgradingsystemproject.StudentGradingSystemProject.departments;
import static studentgradingsystemproject.StudentGradingSystemProject.gradeses;
import static studentgradingsystemproject.StudentGradingSystemProject.students;

/**
 *
 * @author gram1
 */
public class AddFunctions {
    public static void add_student(int std_id, String std_no, String std_name, String std_surname, char std_gender, String std_nationality, GregorianCalendar std_birthday){
            Student st =new Student(std_id, std_no, std_name, std_surname,
                                    std_gender, std_nationality, std_birthday);
            students.add(st);
    }
    public static void add_course(int crs_id, int dept_id, String crs_code, String crs_name) {
            Course cr =new Course(crs_id, dept_id, crs_code, crs_name);
            courses.add(cr);}
    public static void add_department(int dept_id, String dept_name) {
            Department dr =new Department(dept_id, dept_name);
            departments.add(dr);}
    public static void add_grades(int grd_id, int std_id, int crs_id, float grd_mt, float grd_hw, float grd_final, String grd_lgrade) {
            Grades gr =new Grades(grd_id, std_id, crs_id, grd_mt, grd_hw, grd_final, grd_lgrade);
            gradeses.add(gr);}    
    public static void add_attendance(int att_id, int std_id, int crs_id, GregorianCalendar att_date) {
            Attendance at =new Attendance(att_id, std_id, crs_id, att_date);
            attendances.add(at);}
    
}
