/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atm;

/**
 *
 * @author Jess Saguran
 */

import java.util.Scanner;

class Savings
{
    public void withdrawal (int a)
    {
        int total;
        total = 1000 - a;
        System.out.println("The account type you selected is Savings. Your current balance is " + total);
    }
}

class Checking extends Savings
{
    public void withdrawal (int a)
    {
        int total;
        total = 2000 - a;
        System.out.println("The account type you selected is Checking. Your current balance is " + total);
    }
}

class Business extends Savings
{
    public void withdrawal (int a)
    {
        int total;
        total = 5000 - a;
        System.out.println("The account type you selected is Business. Your current balance is " + total);
    }
}


public class Polymorphism2 {

    public static void main(String args[]) 
    {
        int a;
        int acctno;
        int acctype;
        Scanner newscan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = newscan.nextLine();
        System.out.println("Please enter you account number");
        acctno = newscan.nextInt();
        System.out.println("Enter the amount you want to withdraw");
        a = newscan.nextInt();
        System.out.println("Select account type" + "\t1 Savings" + "\t2 Checking" + "\t3 Business");
        acctype = newscan.nextInt();
        if (acctype == 1)
        {
            Savings amt = new Savings();
            amt.withdrawal(a);
        }
        if (acctype == 2)
        {
            Checking amt = new Checking();
            amt.withdrawal(a);
        }
        if (acctype == 3)
        {
            Business amt = new Business();
            amt.withdrawal(a);
        }
        if (acctype > 3 || acctype <= 0)
        {
            System.out.println("Incorrect account type, please try again");
        }
        
        System.out.println("Customer Name: " + name + "\tCustomer Account Number: " + acctno + "\tWithdrawal Amount: " + a);
        
    }
}
