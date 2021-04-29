/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradingsystemproject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import static studentgradingsystemproject.StudentGradingSystemProject.attendances;
import static studentgradingsystemproject.StudentGradingSystemProject.courses;
import static studentgradingsystemproject.StudentGradingSystemProject.departments;
import static studentgradingsystemproject.StudentGradingSystemProject.gradeses;
import static studentgradingsystemproject.StudentGradingSystemProject.students;

/**
 *
 * @author gram1
 */
public class BackupFunctions {
    public static void backup_student() throws IOException{
     File outfile  = new File("students.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(students);
     outObjectStream.close();
     
    }
    public static void backup_course() throws IOException{
     File outfile  = new File("courses.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(courses);
     outObjectStream.close();
     
    }
    public static void backup_department() throws IOException{
     File outfile  = new File("departments.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(departments);
     outObjectStream.close();
     
    }
    public static void backup_grades() throws IOException{
     File outfile  = new File("gradeses.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(gradeses);
     outObjectStream.close();
     
    }
    public static void backup_attendance() throws IOException{
     File outfile  = new File("attendances.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
     ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream);
     
     outObjectStream.writeObject(attendances);
     outObjectStream.close();
     
    }
}
