package BUcs673.HW1;

import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input year:");
        Integer year = input.nextInt();
        if (is_leapYear(year)){
            System.out.println(year+" is a leap year");
        }else {
            System.out.println(year+" is not a leap year");
        }
    }
    public static boolean is_leapYear(Integer year){
        if(year%4==0){
            if (year%100==0){
                if (year%400==0){
                    return true;
                }else{
                    return false;
                }
            }else {
                return true;
            }
        }
        return false;
    }
}
