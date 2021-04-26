//ALI ATILGAN
package studentgradingsystemproject;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Student implements Serializable{
   private int std_id; 
   private String std_no;
   private String std_name;
   private String std_surname;
   private char std_gender;
   private String std_nationality;
   private GregorianCalendar std_birthdate;

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public void setStd_no(String std_no) {
        this.std_no = std_no;
    }

    public String getStd_no() {
        return std_no;
    }
        
    public String getStd_name() {
        return std_name;
    }

    public void setStd_name(String std_name) {
        this.std_name = std_name;
    }

    public String getStd_surname() {
        return std_surname;
    }

    public void setStd_surname(String std_surname) {
        this.std_surname = std_surname;
    }

    public char getStd_gender() {
        return std_gender;
    }

    public void setStd_gender(char std_gender) {
        this.std_gender = std_gender;
    }

    public String getStd_nationality() {
        return std_nationality;
    }

    public void setStd_nationality(String std_nationality) {
        this.std_nationality = std_nationality;
    }

    public GregorianCalendar getStd_birthdate() {
        return std_birthdate;
    }

    public void setStd_birthdate(GregorianCalendar std_birthdate) {
        this.std_birthdate = std_birthdate;
    }

    public Student(int std_id, String std_no, String std_name, 
                   String std_surname, char std_gender, String std_nationality, 
                   GregorianCalendar std_birthdate) {
        this.std_id = std_id;
        this.std_no = std_no;
        this.std_name = std_name;
        this.std_surname = std_surname;
        this.std_gender = std_gender;
        this.std_nationality = std_nationality;
        this.std_birthdate = std_birthdate;
    }
    
   
}
