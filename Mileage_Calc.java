/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mileage_calc;

/**
 *
 * @author Jess Saguran
 */

import java.util.Scanner;
public class Mileage_Calc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            
        System.out.println("Enter previous odometer reading (in kilometer)");
        int prevodometer = input.nextInt();
        System.out.println("Enter current odeometer reading (in kilometer)");
        int currodometer = input.nextInt();
        System.out.println("Enter added gas (in litter)");
        int gas = input.nextInt();
        System.out.println("Enter gas price");
        double gasprice = input.nextInt();
        
        //Calculate
        double totalmileage = currodometer - prevodometer;
        double mpg = (gas * 100) / totalmileage;
        
        //Result
        System.out.println("Total litres per 100 km is: " + Math.round(mpg));
    }
}
