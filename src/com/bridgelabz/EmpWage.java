package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome");
        final int IS_FULL_TIME=1;
        final   int IS_PART_TIME=2;
        final   int Emp_Wage_Per_Hr=20;
        //variables
        int Emp_Hr=0;
        int Emp_Wage=0;
        int Emp_Check=(int)(Math.random()*3);

        switch (Emp_Check) {
            case IS_FULL_TIME:
                Emp_Hr = 8;
                break;
            case IS_PART_TIME:
                Emp_Hr = 4;
                break;
            default:
                Emp_Hr = 0;
        }
        Emp_Wage=Emp_Hr*Emp_Wage_Per_Hr;
        System.out.println("Employee wage = " +Emp_Wage);
    }
    }

            
    

