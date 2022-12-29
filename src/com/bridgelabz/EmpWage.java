package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome");
        int IS_FULL_TIME=1;
        int IS_PART_TIME=2;
        int Emp_Per_Hr_Rate=20;
        //variables
        int Emp_Hr=0;
        int Emp_Wage=0;
        int Emp_check=(int)(Math.random()*3);
        // double Emp_check=Math.floor(Math.random() * 10) % 3;
        if (Emp_check==IS_FULL_TIME){
            System.out.println("Employee work full time");
            Emp_Hr=8;
        } else if (Emp_check==IS_PART_TIME) {
            System.out.println("Employee work part time");
            Emp_Hr=4;
        }
        else {
            System.out.println("Employee Not worked");
        }
        Emp_Wage=Emp_Hr*Emp_Per_Hr_Rate;
        System.out.println("Employee wage = " +Emp_Wage);
    }
    }

            
    

