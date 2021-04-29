package studentgradingsystemproject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner; 
import static studentgradingsystemproject.AddFunctions.add_student;
import static studentgradingsystemproject.BackupFunctions.backup_attendance;
import static studentgradingsystemproject.BackupFunctions.backup_course;
import static studentgradingsystemproject.BackupFunctions.backup_department;
import static studentgradingsystemproject.BackupFunctions.backup_grades;
import static studentgradingsystemproject.BackupFunctions.backup_student;
import static studentgradingsystemproject.DelFunctions.delete_attendance;
import static studentgradingsystemproject.DelFunctions.delete_course;
import static studentgradingsystemproject.DelFunctions.delete_department;
import static studentgradingsystemproject.DelFunctions.delete_grades;
import static studentgradingsystemproject.DelFunctions.delete_student;
import static studentgradingsystemproject.EditFunctions.edit_student;
import static studentgradingsystemproject.ListFunctions.list_attendance;
import static studentgradingsystemproject.ListFunctions.list_course;
import static studentgradingsystemproject.ListFunctions.list_department;
import static studentgradingsystemproject.ListFunctions.list_grades;
import static studentgradingsystemproject.ListFunctions.list_students;
import static studentgradingsystemproject.RetriveFunctions.retrieve_attendance;
import static studentgradingsystemproject.RetriveFunctions.retrieve_course;
import static studentgradingsystemproject.RetriveFunctions.retrieve_department;
import static studentgradingsystemproject.RetriveFunctions.retrieve_grades;
import static studentgradingsystemproject.RetriveFunctions.retrieve_student;
import static studentgradingsystemproject.TestFunctions.test_attendance;
import static studentgradingsystemproject.TestFunctions.test_course;
import static studentgradingsystemproject.TestFunctions.test_department;
import static studentgradingsystemproject.TestFunctions.test_grades;
import static studentgradingsystemproject.TestFunctions.test_students;

//ALI ATILGAN 
public class StudentGradingSystemProject {
    public static List students;
    public static List courses;
    public static List departments;
    public static List gradeses;
    public static List attendances;
     
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        students    = new ArrayList();
        courses     = new ArrayList();
        departments = new ArrayList();
        gradeses    = new ArrayList();
        attendances = new ArrayList();

           System.out.print("\nPlease Select the Catagory"
                + "\n**** 1 : Student "
                + "\n**** 2 : Course"
                + "\n**** 3 : Department"
                + "\n**** 4 : Grades"
                + "\n**** 5 : Attendance\n--> "
                );
            Scanner sc = new Scanner(System.in);  
                int select = sc.nextInt();
            System.out.print("You entered : "+select);
         draw_line(100);
switch (select) {
  case 1:
      selectstudent();
    break;
  case 2:
     selectcourse();
    break;
  case 3:
     selectdepartment();
    break;
  case 4:     
      selectgrades();
    break;
  case 5:
       selectattendance();
    break;
}
        System.out.printf("\n");
    }
    //Select Function
    public static void selecttext(){
         System.out.print("\nPlease Select the Actions"
                + "\n**** 1 : ADD "
                + "\n**** 2 : EDIT"
                + "\n**** 3 : DELETE"
                + "\n**** 4 : LIST"
                + "\n**** 5 : BACKUP"
                + "\n**** 6 : RETRIVE"
                + "\n**** 7 : TEST "
                + "\n**** 10 :Exit Program \n--> ");
    }
    public static void selectstudent() throws IOException, ClassNotFoundException{  
              Scanner input=new Scanner(System.in);
                int selectctgry;
                
                do{ 
                    selecttext();
                    selectctgry = input.nextInt();
             System.out.print("You entered : "+selectctgry);  
       
             switch (selectctgry) {
  case 1:
        add_student(1,"189222", "Ayse","Cengiz",'F',"Turkey",
                    strToGregorianCalendar("28/03/2002"));
        add_student(2,"193342","Philip","Udoye",'M',"Nigeri",
                    strToGregorianCalendar("16/09/2003"));
        add_student(3,"189931","Kemal","Salih",'M',"TRNC",
                    strToGregorianCalendar("17/05/2002"));
          System.out.print("\n Added student.... \n");    
    break;
   case 2:
       edit_student(3,"189931","Hayri","Salih",'M',"Turkey",
                    strToGregorianCalendar("17/04/2002"));
        System.out.print("\nEdited student.... \n");
    break;
  case 3:
    delete_student(1);
     System.out.print("\nDeleted student.... \n");
    break;
  case 4:     
      list_students();
      System.out.print("\nListing student.... \n");
    break;
      case 5:     
      backup_student();
      System.out.print("\nBackups student.... \n");
    break;
  case 6:
       retrieve_student();
       System.out.print("\nRETRIVE student.... \n");
    break;  
  case 7:
       test_students();
    break;  
}
           }while(selectctgry < 9);
        draw_line(100);
        System.out.print("\n");
    }
    public static void selectcourse() throws IOException, ClassNotFoundException{  
      Scanner input=new Scanner(System.in);
                int selectctgry;
                
                do{ 
                    selecttext();
                    selectctgry = input.nextInt();
             System.out.print("You entered : "+selectctgry);  
       
         switch (selectctgry) {
  case 1:
      
          System.out.print("\n Added Course.... \n");    
    break;
   case 2:
      
        System.out.print("\nEdited Course.... \n");
    break;
  case 3:
    delete_course(1);
     System.out.print("\nDeleted Course.... \n");
    break;
  case 4:     
      list_course();
      System.out.print("\nListing Course.... \n");
    break;
      case 5:     
      backup_course();
      System.out.print("\nBackups Course.... \n");
    break;
  case 6:
       retrieve_course();
       System.out.print("\nRETRIVE Course.... \n");
    break;  
  case 7:
       test_course();
    break;  
}
           }while(selectctgry < 9);
        draw_line(100);
        System.out.print("\n");
    }
    public static void selectdepartment() throws IOException, ClassNotFoundException{  
      Scanner input=new Scanner(System.in);
                int selectctgry;
                
                do{ 
                    selecttext();
                    selectctgry = input.nextInt();
             System.out.print("You entered : "+selectctgry);  
       
              switch (selectctgry) {
  case 1:
      
          System.out.print("\n Added department.... \n");    
    break;
   case 2:
      
        System.out.print("\nEdited department.... \n");
    break;
  case 3:
    delete_department(1);
     System.out.print("\nDeleted department.... \n");
    break;
  case 4:     
      list_department();
      System.out.print("\nListing department.... \n");
    break;
      case 5:     
      backup_department();
      System.out.print("\nBackups department.... \n");
    break;
  case 6:
       retrieve_department();
       System.out.print("\nRETRIVE department.... \n");
    break;  
  case 7:
       test_department();
    break;  
}

           }while(selectctgry < 9);
        draw_line(100);
        System.out.print("\n");
    }
    public static void selectgrades() throws IOException, ClassNotFoundException{  
         Scanner input=new Scanner(System.in);
                int selectctgry;
                
                do{ 
                    selecttext();
                    selectctgry = input.nextInt();
             System.out.print("You entered : "+selectctgry);  
       
              switch (selectctgry) {
  case 1:
      
          System.out.print("\n Added grade.... \n");    
    break;
   case 2:
      
        System.out.print("\nEdited grade.... \n");
    break;
  case 3:
    delete_grades(1);
     System.out.print("\nDeleted grade.... \n");
    break;
  case 4:     
      list_grades();
      System.out.print("\nListing grade.... \n");
    break;
      case 5:     
      backup_grades();
      System.out.print("\nBackups grade.... \n");
    break;
  case 6:
       retrieve_grades();
       System.out.print("\nRETRIVE grade.... \n");
    break;  
  case 7:
       test_grades();
    break;  
}
                }
                while(selectctgry < 9);
        draw_line(100);
        System.out.print("\n");
    }
    public static void selectattendance() throws IOException, ClassNotFoundException{  
       Scanner input=new Scanner(System.in);
                int selectctgry;
                
                do{ 
                    selecttext();
                    selectctgry = input.nextInt();
             System.out.print("You entered : "+selectctgry);  
       
              switch (selectctgry) {
  case 1:
      
          System.out.print("\n Added attendance.... \n");    
    break;
   case 2:
      
        System.out.print("\nEdited attendance.... \n");
    break;
  case 3:
    delete_attendance(1);
     System.out.print("\nDeleted attendance.... \n");
    break;
  case 4:     
      list_attendance();
      System.out.print("\nListing attendance.... \n");
    break;
      case 5:     
      backup_attendance();
      System.out.print("\nBackups attendance.... \n");
    break;
  case 6:
       retrieve_attendance();
       System.out.print("\nRETRIVE attendance.... \n");
    break;  
  case 7:
       test_attendance();
    break;  
              }}while(selectctgry < 9);
        draw_line(100);
        System.out.print("\n");
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
   
    
 
} 

