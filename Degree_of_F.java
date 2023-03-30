/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.degree_of_f;

/**
 *
 * @author Jess Saguran
 */

import java.util.Scanner;
public class Degree_of_F {

  public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter number of females who made a deposit: ");
        int femwDeposit = input.nextInt();
        System.out.println("Enter number of females who did not deposit: ");
        int femwNoDeposit = input.nextInt();
        System.out.println("Enter number of females who litter :");
        int femLitter = input.nextInt();
        System.out.println("Enter number of females who did not litter: ");
        int femNoLitter = input.nextInt();
        System.out.println("Enter the number of males who made a deposit: ");
        int malewDeposit = input.nextInt();
        System.out.println("Enter the number of males who did not deposit: ");
        int malewNoDeposit = input.nextInt();
        System.out.println("Enter the number of males who litter: ");
        int maleLitter = input.nextInt();
        System.out.println("Enter the number of males who did not litter: ");
        int maleNoLitter = input.nextInt(); 
        
        // Total computation
        int total_Deposit = femwDeposit + malewDeposit;
        int total_NoDeposit = femwNoDeposit + malewNoDeposit;
        int total_Litter = femLitter + maleLitter;
        int total_NoLitter = femNoLitter + maleNoLitter;

       // Percentage computation
        double perFemNoDeposit = (double) femwNoDeposit / total_NoDeposit * 100;
        double perMaleNoDeposit = (double) malewNoDeposit / total_NoDeposit * 100;
        double perFemNoLitter = (double) femNoLitter / total_NoLitter * 100;
        double perMaleNoLitter = (double) maleNoLitter / total_NoLitter * 100;

        // Results
        System.out.println("Please see following result: ");
        System.out.println(total_Deposit + " In total made a deposit");
        System.out.println(total_NoDeposit + " In total failed to make a deposit");
        System.out.println(total_Litter + " In total littered");
        System.out.println(total_NoLitter + " In total do not litter");
        System.out.println(Math.round(perFemNoDeposit) + "%" + " of females did not make a deposit");
        System.out.println(Math.round(perMaleNoDeposit) + "%" + " of male did not make a deposit");
        System.out.println(Math.round(perFemNoLitter) + "%" + " of female did not litter");
        System.out.println(Math.round(perMaleNoLitter) + "%" + " of male did not litter");
    }
}
