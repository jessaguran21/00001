/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maturity;

/**
 *
 * @author Jess Saguran
 */
import java.util.Scanner;
public class Maturity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the coupon/interest payment");
        int interest = input.nextInt();
        System.out.println("Please enter the face value");
        int facevalue = input.nextInt();
        System.out.println("Please enter the price");
        int price = input.nextInt();
        System.out.println("Please enter years to maturity");
        int years = input.nextInt();
        
        //Computation
        double FminusP = (facevalue - price) / years;
        double FplusP = (facevalue + price) / 2;
        double YTM = (interest + FminusP) / FplusP;
        
        //Result
        System.out.println(YTM);
    }
}
