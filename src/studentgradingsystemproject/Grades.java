//ALI ATILGAN 17000103
package studentgradingsystemproject;

import java.io.Serializable;


public class Grades implements Serializable{
   private int grd_id; 
   private int std_id;
   private int crs_id; 
   private float grd_mt;
   private float grd_hw; 
   private float grd_final;
   private String grd_lgrade;

   
    public int getGrd_id() {
        return grd_id;}
    public int getStd_id() {
        return std_id;}
    public int getCrs_id() {
        return crs_id;}
    public float getGrd_mt() {
        return grd_mt;}
    public float getGrd_hw() {
        return grd_hw;}
    public float getGrd_final() {
        return grd_final;}
    public String getGrd_lgrade() {
        return grd_lgrade;}
   
    
    public void setGrd_id(int grd_id) {
        this.grd_id = grd_id;}
    
    public void setStd_id(int std_id) {
        this.std_id = std_id;}
    
    public void setCrs_id(int crs_id) {
        this.crs_id = crs_id;}
    
    public void setGrd_mt(float grd_mt) {
        this.grd_mt = grd_mt;}
    
    public void setGrd_hw(float grd_hw) {
        this.grd_hw = grd_hw;}
    
    public void setGrd_final(float grd_final) {
        this.grd_final = grd_final;}

    public void setGrd_lgrade(String grd_lgrade) {
        this.grd_lgrade = grd_lgrade;}

    
    public Grades(int grd_id, int std_id, int crs_id, float grd_mt, float grd_hw, float grd_final, String grd_lgrade)
    {
        this.grd_id = grd_id;
        this.std_id = std_id;
        this.crs_id = crs_id;
        this.grd_mt = grd_mt;
        this.grd_hw = grd_hw;
        this.grd_final = grd_final;
        this.grd_lgrade = grd_lgrade;
    }
}

