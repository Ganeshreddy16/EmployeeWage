package org.Blz.Wagedata;

public class WageDetails
{
    public static void main( String[] args )
    {
        int IS_FULL_TIME=2;
        int IS_PART_TIME=1;
        int EMP_WAGE_PER_HOUR=20;
        int WorkHours=0;
        double empCheck= (Math.floor(Math.random()*10)%3);
        System.out.println("Employee wage is ");
        if (empCheck == IS_FULL_TIME)
        {
            WorkHours=8;
            System.out.println(EMP_WAGE_PER_HOUR*WorkHours);
        }
        else if (empCheck == IS_PART_TIME)
        {
            WorkHours = 4;
            System.out.println(EMP_WAGE_PER_HOUR * WorkHours);
        }
        else
        {
                WorkHours=0;
                System.out.println( EMP_WAGE_PER_HOUR* WorkHours);
        }


    }
}
