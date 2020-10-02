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
public class TheoryExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=12,y=17;
        System.out.println(x!=y);//true
        System.out.println(x>=y||x<15);//true
        System.out.println(x>=y&&x<10);//false
        int score1, score2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter test score 1: ");
        score1=s.nextInt();
        System.out.print("Enter test score 2: ");
        score2=s.nextInt();
        boolean bothover90=score1>=90&&score2>=90;
        boolean atleastone90=score1>=90||score2>=90;
        boolean nofails=score1>=50&&score2>=50;
        boolean atleastone70=score1>=70||score2>=70;
        if(bothover90)
            System.out.println("Manager");
        else if(atleastone90 && nofails)
            System.out.println("supervisor");
        else if(atleastone70 && nofails)
            System.out.println("clerk");
        else
            System.out.println("disqualified");
    }
    
}
