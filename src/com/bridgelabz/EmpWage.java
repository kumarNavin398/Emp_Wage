package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome");
        final int IS_FULL_TIME =1;
        final int Emp_Per_hour_Rate = 20;
        //variables
        int Emp_hr =0;
        int  Emp_wage=0;
        double Emp_check=Math.floor(Math.random()*10) % 2;
        // int Emp_Check= (int)(10+Math.random()*20);
        if(Emp_check== IS_FULL_TIME){
            System.out.println("Employee is present");
            Emp_hr=8;
        }
        else {
            System.out.println("employee is Absent");
        }
        Emp_wage =Emp_hr * Emp_Per_hour_Rate;
        System.out.println("Employee wage = " +Emp_wage);
    }

            }
    

