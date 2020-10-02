/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 //working?
package employee;

/**
 *
 * @author caiu3350
 */
public class Employee {
    private String name;
    private int type;
    private double rate;
    private double hours;
    public Employee(){
        name="";
        type=0;
        rate=0;
        hours=0;
    }
    public boolean setName(String nm){
        boolean blank=(nm.equals(""));
        if(blank)
            return false;
        else{
            name=nm;
            return true;
        }
    }
    public boolean setType(int t){
        boolean oneortwo=(t==1||t==2);
        if(!oneortwo){
            return false;
        }
        else{
            type=t;
            return true;
        }
    }
    public boolean setRate(double rt){
        boolean rateok=rt>=6.75&&rt<=30.50;
        if(rateok){
            rate=rt;
            return true;
        }
        else
            return false;
    }
    public boolean setHours(int hrs){
        boolean hoursok=hrs>=1&&hrs<=60;
        if(hoursok){
            hours = hrs;
            return true;
            
        }
        else
            return false;
    }
    public String getName(){
        return name;
    }
    public double getPay(){
        double pay;
        boolean noovertime = hours<=40||type==2;
        if(noovertime){
            pay=rate*hours;
                   
        }
        else
            pay = rate*40+(hours-40)*rate*2;
            return pay;
    }
    public String getHourRules(){
        return"Between 1 and 60";
    }
    public String getRateRules(){
        return"Between 6.75 and 30.50";
    }
    public String getTypeRules(){
        return"1 or 2";
    }
    public String getNameRules(){
        return "Minimum 1 letter";
    }
}
