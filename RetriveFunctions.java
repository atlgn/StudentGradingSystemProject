/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradingsystemproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import static studentgradingsystemproject.StudentGradingSystemProject.attendances;
import static studentgradingsystemproject.StudentGradingSystemProject.courses;
import static studentgradingsystemproject.StudentGradingSystemProject.departments;
import static studentgradingsystemproject.StudentGradingSystemProject.gradeses;
import static studentgradingsystemproject.StudentGradingSystemProject.students;

/**
 *
 * @author gram1
 */
public class RetriveFunctions {
     public static void retrieve_student() throws IOException, ClassNotFoundException{
     File infile  = new File("students.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     students = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void retrieve_course() throws IOException, ClassNotFoundException{
     File infile  = new File("courses.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     courses = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void retrieve_department() throws IOException, ClassNotFoundException{
     File infile  = new File("departments.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     departments = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void retrieve_grades() throws IOException, ClassNotFoundException{
     File infile  = new File("gradeses.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     gradeses = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
    public static void retrieve_attendance() throws IOException, ClassNotFoundException{
     File infile  = new File("attendances.dat");
     FileInputStream infilestream = new FileInputStream(infile);
     ObjectInputStream inObjectStream = new ObjectInputStream(infilestream);
     attendances = (ArrayList)inObjectStream.readObject();
     
     inObjectStream.close();
     
    }
}
