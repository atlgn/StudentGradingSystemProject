package studentgradingsystemproject;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

//ALI ATILGAN 
public class StudentGradingSystemProject {
    public static List students;
    public static List courses;
    public static List departments;
    public static List gradeses;
    public static List attendances;
     
    public static void main(String[] args) {
        students    = new ArrayList();
        courses     = new ArrayList();
        departments = new ArrayList();
        gradeses    = new ArrayList();
        attendances = new ArrayList();
        
        int select = 5;
switch (select) {
  case 1:
     test_students();
    break;
  case 2:
    test_course();
    break;
  case 3:
     test_department();
    break;
  case 4:
    test_grades();
    break;
  case 5:
    test_attendance();
    break;
}
        System.out.printf("\n");
    }
    
    //CALENDAR
    public static GregorianCalendar strToGregorianCalendar(String stDate){
        GregorianCalendar bdate;
        
        bdate = new GregorianCalendar(
                Integer.parseInt(stDate.substring(6,10)),
                Integer.parseInt(stDate.substring(3,5))-1,
                Integer.parseInt(stDate.substring(0,2)));
        return bdate;       
    }
    // DRAW LİNE
    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
  
    //ADD 
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
        //EDIT 
    public static void edit_student(int std_id, String std_no, String std_name, String std_surname, char std_gender, String std_nationality, GregorianCalendar std_birthday) {
        
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
      if (found) {
          st.setStd_no(std_no);
          st.setStd_name(std_name);
          st.setStd_surname(std_surname);
          st.setStd_nationality(std_nationality);
          st.setStd_gender(std_gender);
          st.setStd_birthdate(std_birthday);
      }
    }  
    public static void edit_course(int crs_id, int dept_id, String crs_code, String crs_name) {
        
     Course cr =null;
      Boolean found=false;
      Iterator <Course> itr = courses.iterator();
      while (itr.hasNext()) {
          cr = itr.next(); 
          if(crs_id==cr.getCrs_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          cr.setCrs_code(crs_code);
          cr.setCrs_name(crs_name);
      }
    }
    public static void edit_department(int dept_id, String dept_name) {
        
     Department dr =null;
      Boolean found=false;
      Iterator <Department> itr = departments.iterator();
      while (itr.hasNext()) {
          dr = itr.next(); 
          if(dept_id==dr.getDept_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          dr.setDept_name(dept_name);
      }
    }
    public static void edit_grades(int grd_id, int std_id, int crs_id, float grd_mt, float grd_hw, float grd_final, String grd_lgrade) {
        
     Grades gr =null;
      Boolean found=false;
      Iterator <Grades> itr = gradeses.iterator();
      while (itr.hasNext()) {
          gr = itr.next(); 
          if(grd_id == gr.getGrd_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          gr.setGrd_mt(grd_mt);
          gr.setGrd_hw(grd_hw);
          gr.setGrd_final(grd_final);
          gr.setGrd_lgrade(grd_lgrade);
      }
    }
    public static void edit_attendance(int att_id, int std_id, int crs_id, GregorianCalendar att_date) {
        
     Attendance at =null;
      Boolean found=false;
      Iterator <Attendance> itr = attendances.iterator();
      while (itr.hasNext()) {
          at = itr.next(); 
          if(att_id==at.getAtt_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          at.setAtt_date(att_date);
      }
    }
    //DELETE 
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
    //LİST
    public static void list_students() {
      Student st;
      SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
      
      Iterator <Student> itr = students.iterator();
      System.out.printf("\n%10s %10s %15s %15s %10s %12s %12s",
              "Student Id", "Student No","Std. Name", "Std. Surname", 
              "Gender","Nationality", "Birthday");
        draw_line(90);
        
      while (itr.hasNext()) {
          st = itr.next(); 
          fmt.setCalendar(st.getStd_birthdate());
          System.out.printf("\n%10d %10s %15s %15s %10s %12s %12s",
              st.getStd_id(), st.getStd_no(), st.getStd_name(), 
              st.getStd_surname(), st.getStd_gender(), st.getStd_nationality(), 
              fmt.format(st.getStd_birthdate().getTime()));
      }
      draw_line(90);
        
    }
    public static void list_course() {
      Course cr;
      Iterator <Course> itr = courses.iterator();
      System.out.printf("\n%10s %10s %15s %15s",
              "Course Id", "Department Id","Course Code", "Course name");
        draw_line(90);
        
      while (itr.hasNext()) {
          cr = itr.next(); 
          System.out.printf("\n%10d %10s %15s %15s",
              cr.getCrs_id(), cr.getDept_id(), cr.getCrs_code(), cr.getCrs_name());
      }
      draw_line(90);
        }
    public static void list_department() {
      Department dr;
      Iterator <Department> itr = departments.iterator();
      System.out.printf("\n%10s %10s",
              "Department Id", "Department Name");
        draw_line(90);
      while (itr.hasNext()) {
          dr = itr.next(); 
          System.out.printf("\n%10d %10s",
              dr.getDept_id(), dr.getDept_name());
      }
      draw_line(90);
        }
    public static void list_grades() {
      Grades gr;
      Iterator <Grades> itr = gradeses.iterator();
      System.out.printf("\n%10s %10s %15s %15s %10s %12s %12s",
              "Grade Id", "Student Id","Course Id", "Grade mt", 
              "Grade hw","Grade final", "Grade lgrade");
        draw_line(90);
      while (itr.hasNext()) {
          gr = itr.next(); 
          System.out.printf("\n%10d %10s %15s %15s %10s %12s %12s",
              gr.getGrd_id(), gr.getStd_id(), gr.getCrs_id(), 
              gr.getGrd_mt(), gr.getGrd_hw(), gr.getGrd_final(), 
              gr.getGrd_lgrade());
      }
      draw_line(90);
    }
    public static void list_attendance() {
      Attendance at;
       SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
      Iterator <Attendance> itr = attendances.iterator();
      System.out.printf("\n%10s %10s %15s %15s",
              "Attendance Id", "Student Id", "Course Id", "Attendance date");
        draw_line(90);
      while (itr.hasNext()) {
          at = itr.next(); 
          fmt.setCalendar(at.getAtt_date());
          System.out.printf("\n%10s %10s %15s %15s",
              at.getAtt_id(), at.getStd_id(), at.getCrs_id(),
              fmt.format(at.getAtt_date().getTime()));

      }
      draw_line(90);
        }
    //BACKUP
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
    //RETRIVE
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
    //TEST
    public static void test_students() {
        
        try {
        System.out.printf("\n Tests for Class Student\n\n");
        //1
        System.out.printf("\n STEP 1 Add_student()\n\n");
        
        add_student(1,"189222", "Ayse","Cengiz",'F',"Turkey",
                    strToGregorianCalendar("28/03/2002"));
        add_student(2,"193342","Philip","Udoye",'M',"Nigeri",
                    strToGregorianCalendar("16/09/2003"));
        add_student(3,"189931","Kemal","Salih",'M',"TRNC",
                    strToGregorianCalendar("17/05/2002"));
        add_student(4,"188883","Fathima","Mohammad",'F',"Syria",
                    strToGregorianCalendar("22/11/2001"));                
        add_student(5,"189447","Jasmin","Faruq",'F',"Egypt",
                    strToGregorianCalendar("19/02/2002"));                
        //STEP 2
        System.out.printf("\n STEP 2 List_student()\n\n");
        list_students();
       
        //STEP 3  
        System.out.printf("\n STEP 3 Edit_student()\n\n");
        edit_student(3,"189931","Kemal","Salih",'M',"Turkey",
                    strToGregorianCalendar("17/04/2002"));
     
        //STEP 4
       System.out.printf("\n STEP 4 List_student()\n\n");
       list_students();
      
       //STEP 5
        System.out.printf("\n STEP 5 Backup_student()\n\n");
       backup_student();
       
       //STEP 6
        System.out.printf("\n STEP 6 Delete_student()\n\n");
        delete_student(3);
     
        //STEP 7
        System.out.printf("\n STEP 7 List_student()\n\n");
        list_students();
      
        //STEP 8
         System.out.printf("\n STEP 8 List_student()\n\n");
        retrieve_student();
     
        //STEP 9
        System.out.printf("\n STEP 9 List_student()\n\n");
        list_students(); 
        }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void test_course() {
   try {
        System.out.printf("\n Tests for Class Course\n\n");
     
        //1   
        System.out.printf("\n STEP 1 Add_course()\n\n");
        add_course(1,1,"ITEC314","Multi Platform Programming");
        add_course(2,1,"ITEC413","Information Systems Security");
        add_course(3,2,"ECON101","Introduction to Economics");

         //STEP 2
        System.out.printf("\n STEP 2 List_course()\n\n");
        list_course();
       
        //STEP 3  
        System.out.printf("\n STEP 3 Edit_course()\n\n");
        edit_course(2,1,"ITEC999","ELEC");
     
        //STEP 4
       System.out.printf("\n STEP 4 List_course()\n\n");
       list_course();
      
       //STEP 5
        System.out.printf("\n STEP 5 Backup_course()\n\n");
       backup_course();
       
       //STEP 6
        System.out.printf("\n STEP 6 Delete_course()\n\n");
        delete_course(3);
     
        //STEP 7
        System.out.printf("\n STEP 7 List_course()\n\n");
        list_course();
      
        //STEP 8
         System.out.printf("\n STEP 8 List_course()\n\n");
        retrieve_course();
     
        //STEP 9
        System.out.printf("\n STEP 9 List_course()\n\n");
        list_course(); 
         }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void test_department() {
   try {
        System.out.printf("\n Tests for Class department\n\n");
     
        //1   
        System.out.printf("\n STEP 1 Add_department()\n\n");
        add_department(1,"Information Technologies");
        add_department(2,"Economics");
        add_department(3,"Business");

         //STEP 2
        System.out.printf("\n STEP 2 List_department()\n\n");
        list_department();
       
        //STEP 3  
        System.out.printf("\n STEP 3 Edit_department()\n\n");
        edit_department(2,"bezenes");
     
        //STEP 4
       System.out.printf("\n STEP 4 List_department()\n\n");
       list_department();
      
       //STEP 5
        System.out.printf("\n STEP 5 Backup_department()\n\n");
       backup_department();
       
       //STEP 6
        System.out.printf("\n STEP 6 Delete_department()\n\n");
        delete_department(1);
     
        //STEP 7
        System.out.printf("\n STEP 7 List_department()\n\n");
        list_department();
      
        //STEP 8
         System.out.printf("\n STEP 8 List_department()\n\n");
        retrieve_department();
     
        //STEP 9
        System.out.printf("\n STEP 9 List_department()\n\n");
        list_department(); 
         }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void test_grades() {
   try {
        System.out.printf("\n Tests for Class grades\n\n");
     
        //1   
        System.out.printf("\n STEP 1 Add_grades()\n\n");
        add_grades(1,1,1,90f,88f,96f,"A");
        add_grades(2,2,1,80F,85f,92f,"B");
        add_grades(3,3,2,85F,55f,20f,"C");

         //STEP 2
        System.out.printf("\n STEP 2 List_grades()\n\n");
        list_grades();
       
        //STEP 3  
        System.out.printf("\n STEP 3 Edit_grades()\n\n");
        edit_grades(3,3,2,21F,55f,20f,"D");
     
        //STEP 4
       System.out.printf("\n STEP 4 List_grades()\n\n");
       list_grades();
      
       //STEP 5
        System.out.printf("\n STEP 5 Backup_grades()\n\n");
       backup_grades();
       
       //STEP 6
        System.out.printf("\n STEP 6 Delete_grades()\n\n");
        delete_grades(3);
     
        //STEP 7
        System.out.printf("\n STEP 7 List_grades()\n\n");
        list_grades();
      
        //STEP 8
         System.out.printf("\n STEP 8 List_grades()\n\n");
        retrieve_grades();
     
        //STEP 9
        System.out.printf("\n STEP 9 List_grades()\n\n");
        list_grades(); 
         }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    }
    public static void test_attendance() {
   try {
        System.out.printf("\n Tests for Class attendance\n\n");
     
        //1   
        System.out.printf("\n STEP 1 Add_attendance()\n\n");
        add_attendance(1,1,1,strToGregorianCalendar("09/04/2021"));
        add_attendance(2,2,1,strToGregorianCalendar("09/04/2021"));
        add_attendance(2,1,1,strToGregorianCalendar("19/02/2002"));

         //STEP 2
        System.out.printf("\n STEP 2 List_attendance()\n\n");
        list_attendance();
       
        //STEP 3  
        System.out.printf("\n STEP 3 Edit_attendance()\n\n");
        edit_attendance(1,1,1,strToGregorianCalendar("29/12/2022"));
     
        //STEP 4
       System.out.printf("\n STEP 4 List_attendance()\n\n");
       list_attendance();
      
       //STEP 5
        System.out.printf("\n STEP 5 Backup_attendance()\n\n");
       backup_attendance();
       
       //STEP 6
        System.out.printf("\n STEP 6 Delete_attendance()\n\n");
        delete_attendance(3);
     
        //STEP 7
        System.out.printf("\n STEP 7 List_attendance()\n\n");
        list_attendance();
      
        //STEP 8
         System.out.printf("\n STEP 8 List_attendance()\n\n");
        retrieve_attendance();
     
        //STEP 9
        System.out.printf("\n STEP 9 List_attendance()\n\n");
        list_attendance(); 
         }
        catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error");
                }
    } 
} 

