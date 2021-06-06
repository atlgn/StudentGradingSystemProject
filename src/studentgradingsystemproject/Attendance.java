//ALI ATILGAN 17000103
package studentgradingsystemproject;

import java.io.Serializable;
import java.util.GregorianCalendar;

public class Attendance implements Serializable{
   private int att_id; 
   private int std_id;
   private int crs_id;
   private GregorianCalendar att_date;

    public int getAtt_id() {
        return att_id;}
    public int getStd_id() {
        return std_id;}
    public int getCrs_id() {
        return crs_id;}
    public GregorianCalendar getAtt_date() {
        return att_date;}
   
    
    public void setAtt_id(int att_id) {
        this.att_id = att_id;}
    
    public void setStd_id(int std_id) {
        this.std_id = std_id;}
    
    public void setCrs_id(int crs_id) {
        this.crs_id = crs_id;}

    public void setAtt_date(GregorianCalendar att_date) {
        this.att_date = att_date;}

    
    public Attendance(int att_id, int std_id, int crs_id, GregorianCalendar att_date)
    {
        this.att_id = att_id;
        this.std_id = std_id;
        this.crs_id = crs_id;
        this.att_date = att_date;
    }
}
