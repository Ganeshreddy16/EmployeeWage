package org.Blz.Wagedata;

public class WageDetails
{
    public static final int IS_FULL_TIME=2;
    public static final int IS_PART_TIME=1;
    public static final int EMP_WAGE_PER_HOUR=20;
    public static final int WORKING_DAYS=20;
    public static void main( String[] args )
    {
        int WorkHours=0;
        double empCheck= (Math.floor(Math.random()*10)%3);
        System.out.println("Wage For");
        switch((int)empCheck) {
            case IS_FULL_TIME:
            {
                WorkHours = 8;
                System.out.println("Full time Emp is " + EMP_WAGE_PER_HOUR * WorkHours * WORKING_DAYS);
            }
            break;
            case IS_PART_TIME:
            {
                WorkHours = 4;
                System.out.println("Part time Emp is " + EMP_WAGE_PER_HOUR * WorkHours*WORKING_DAYS);
            }
            break;
            default:
            {
                WorkHours = 0;
                System.out.println("Absentee is "+EMP_WAGE_PER_HOUR * WorkHours*WORKING_DAYS);
            }
        }

    }
}
