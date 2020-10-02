/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/**
 *
 * @author caiu3350
 */
public class employeeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Employee emp;
        int type;
        double rate;
        int hours;
        String name, prompt;
        do{
        while(true){
            emp = new Employee();
            System.out.print("Enter name: "+emp.getNameRules()+"> ");
            name=s.nextLine();
            if(emp.setName(name)) break;
            
        }
        while(true){
            System.out.print("Enter type: "+emp.getTypeRules()+"> ");
            type=s.nextInt();
            if(emp.setType(type)) break;
        }
        while(true){
            System.out.print("Enter hours: "+emp.getHourRules()+"> ");
            hours=s.nextInt();
            if(emp.setHours(hours))break;
        }
        while(true){
            System.out.print("Enter rate: "+emp.getRateRules()+"> ");
            rate=s.nextDouble();
            if(emp.setRate(rate))break;
        }
        System.out.println("_________________________________");
        System.out.println("Pay this week for "+emp.getName());
        System.out.println("$"+emp.getPay());
        
            System.out.print("Enter another? y or n > ");
            prompt=s.next();
            s.nextLine();
        }while(prompt.equals("y")||prompt.equals("Y"));
        System.out.println("Goodbye");
}
}
