//ALI ATILGAN 17000103
package studentgradingsystemproject;

import java.io.Serializable;

public class Course implements Serializable{
   private int crs_id; 
   private int dept_id;
   private String crs_code;
   private String crs_name;

    public int getCrs_id() {
        return crs_id;}
    public int getDept_id() {
        return dept_id;}
    public String getCrs_code() {
        return crs_code;}
    public String getCrs_name() {
        return crs_name;}
   
    
    public void setCrs_id(int crs_id) {
        this.crs_id = crs_id;}
    
    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;}
    
    public void setCrs_code(String crs_code) {
        this.crs_code = crs_code;}

    public void setCrs_name(String crs_name) {
        this.crs_name = crs_name;}

    
    public Course(int crs_id, int dept_id, String crs_code, String crs_name)
    {
        this.crs_id = crs_id;
        this.dept_id = dept_id;
        this.crs_code = crs_code;
        this.crs_name = crs_name;
    }
}
