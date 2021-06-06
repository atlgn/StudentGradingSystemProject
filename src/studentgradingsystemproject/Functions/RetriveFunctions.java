
package studentgradingsystemproject.Functions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import studentgradingsystemproject.StudentGradingSystemProject;

/**
 * @author Ali ATILGAN
 */

public class RetriveFunctions {

    public static void retrieve_department() throws IOException, ClassNotFoundException {
        File infile = new File("departments.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            StudentGradingSystemProject.departments = (ArrayList) inObjectStream.readObject();
        }
    }

    public static void retrieve_grades() throws IOException, ClassNotFoundException {
        File infile = new File("gradeses.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            StudentGradingSystemProject.gradeses = (ArrayList) inObjectStream.readObject();
        }
    }

    public static void retrieve_attendance() throws IOException, ClassNotFoundException {
        File infile = new File("attendances.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            StudentGradingSystemProject.attendances = (ArrayList) inObjectStream.readObject();
        }
    }

    public static void retrieve_course() throws IOException, ClassNotFoundException {
        File infile = new File("courses.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            StudentGradingSystemProject.courses = (ArrayList) inObjectStream.readObject();
        }
    }

    //RETRIVE
    public static void retrieve_student() throws IOException, ClassNotFoundException {
        File infile = new File("students.dat");
        FileInputStream infilestream = new FileInputStream(infile);
        try (final ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            StudentGradingSystemProject.students = (ArrayList) inObjectStream.readObject();
        }
    }
    
}
