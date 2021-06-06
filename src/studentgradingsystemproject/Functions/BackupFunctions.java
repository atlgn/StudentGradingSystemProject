
package studentgradingsystemproject.Functions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import studentgradingsystemproject.StudentGradingSystemProject;

/**
 * @author Ali ATILGAN
 */
public class BackupFunctions {

    //BACKUP
    public static void backup_student() throws IOException {
        File outfile = new File("students.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (final ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(StudentGradingSystemProject.students);
        }
    }

    public static void backup_grades() throws IOException {
        File outfile = new File("gradeses.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (final ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(StudentGradingSystemProject.gradeses);
        }
    }

    public static void backup_department() throws IOException {
        File outfile = new File("departments.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (final ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(StudentGradingSystemProject.departments);
        }
    }

    public static void backup_attendance() throws IOException {
        File outfile = new File("attendances.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (final ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(StudentGradingSystemProject.attendances);
        }
    }

    public static void backup_course() throws IOException {
        File outfile = new File("courses.dat");
        FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (final ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(StudentGradingSystemProject.courses);
        }
    }
    
}
