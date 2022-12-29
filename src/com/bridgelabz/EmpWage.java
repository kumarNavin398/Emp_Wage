package com.bridgelabz;

public class EmpWage {
    public static void main(String[] args) {
        System.out.println("Welcome");
               int IS_FULL_TIME = 1;
                //OR double Emp_Check=Math.floor(Math.random() * 10) % 2;
                int Emp_Check=(int)(Math.random()*2);
                if(Emp_Check == IS_FULL_TIME){
                    System.out.println("present");
                }
                else {
                    System.out.println("Absent");
                }
            }
    }

