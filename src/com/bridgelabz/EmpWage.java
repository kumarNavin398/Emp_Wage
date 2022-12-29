package com.bridgelabz;

import java.util.Random;

public class EmpWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HRS = 8;
    static final int PART_TIME_HRS = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static final int WORKING_DAYS_PER_MONTH = 20;
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation");
        int dayCount = 1;
        int totalWage = 0;
        int totalWorkHrs = 0;
        while(dayCount <= WORKING_DAYS_PER_MONTH && totalWorkHrs <= 100) {
            int dailyWage = 0;
            int workHrs = 0;
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeeCheck) {
                case IS_FULL_TIME:
                    System.out.println("Employee is Present");
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HRS;
                    workHrs = 8;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee is Part_Time");
                    dailyWage = PART_TIME_HRS * WAGE_PER_HOUR;
                    workHrs = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            totalWage += dailyWage;
            totalWorkHrs += workHrs;
            System.out.println("Daily Wage for  Day " + dayCount + " is " + dailyWage);
            System.out.println("Total wage till Day " + dayCount + " is " + totalWage);
            System.out.println("Working Hours till Day " + dayCount + " is " + totalWorkHrs);
            dayCount++;
        }
        System.out.println("Wage for a Month is: " + totalWage);
        System.out.println("Complete Working Hours per month: " + totalWorkHrs);

    }
}
            
    

