/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encapsulation;

/**
 *
 * @author Jess Saguran
 */

class Employee {
    private int empno;
    private String name;
    private double salary;
    
    public int getempno() {
        return empno;
    }
    
    public String getname(){
        return name;
    }
    public double getsalary(){
        return salary;
    }
    
    public void setempno(int a){
        empno=a;
    }
    public void setname (String b) {
        name=b;
    }
    public void setsalary (double c){
        salary=c;
    }
}

class Organization {
    private int rank;
    private String codename;
    private double compensation;
    
    public int getrank() {
        return rank;
    }
    
    public String getcodename() {
        return codename;
    }
    
    public double getcompensation() {
        return compensation;
    }
    
    public void setrank(int d){
        rank=d;
    }
    public void setcodename (String e) {
        codename=e;
    }
    public void setcompensation (double f){
        compensation=f;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setempno(52145);
        emp1.setname("John");
        emp1.setsalary(100000);
        System.out.println("Employee No: "+ emp1.getempno() + "\tEmployee Name:" + emp1.getname() + "\tEmployee salary: " + emp1.getsalary());
        Employee emp2 = new Employee();
        emp2.setempno(84263);
        emp2.setname("Jess");
        emp2.setsalary(200000);
        System.out.println("Employee No: "+ emp2.getempno() + "\tEmployee Name:" + emp2.getname() + "\tEmployee salary: " + emp2.getsalary());
        Organization memb1 = new Organization();
        memb1.setrank(00001);
        memb1.setcodename("JK");
        memb1.setcompensation(900000);
        System.out.println("Rank No.: "+ memb1.getrank() + "\tCode Name:" + memb1.getcodename() + "\tCompensation: " + memb1.getcompensation());
        
    }
}
