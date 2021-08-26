package org.Blz.Wagedata;

public class WageDetails
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Employee Wage Assignment" );
        int IS_FULL_TIME=1;
        double empCheck= (Math.floor(Math.random()*10)%2);
        System.out.println( empCheck);
        if (empCheck == IS_FULL_TIME){
            System.out.println("Employee is present");
        }
        else  {
            System.out.println("Employe is absent");
        }

    }
}
