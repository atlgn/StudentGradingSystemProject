//ALI ATILGAN 17000103
package studentgradingsystemproject;

import java.io.Serializable;

public class Department implements Serializable{
   private int dept_id; 
   private String dept_name;


    public int getDept_id() {
        return dept_id;}
      public void setDept_id(int dept_id) {
        this.dept_id = dept_id;}
    
      
    public String getDept_name() {
        return dept_name;}
 
       public void setDept_name(String dept_name) {
        this.dept_name = dept_name;}
    
    
    public Department (int dept_id, String dept_name)
    {
        this.dept_id = dept_id;
        this.dept_name = dept_name;
      
    }
}
