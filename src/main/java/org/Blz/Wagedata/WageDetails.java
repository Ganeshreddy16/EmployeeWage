package org.Blz.Wagedata;

public class WageDetails
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Employee Wage Assignment" );
        int IS_FULL_TIME=1;
        int EMP_WAGE_PER_HOUR=20;
        int WORK_HOURS=8;
        double empCheck= (Math.floor(Math.random()*10)%2);
        System.out.println("Employee wage is ");
        if (empCheck == IS_FULL_TIME){
            System.out.println(EMP_WAGE_PER_HOUR*WORK_HOURS);
        }
        else  {
            System.out.println("0");
        }

    }
}
