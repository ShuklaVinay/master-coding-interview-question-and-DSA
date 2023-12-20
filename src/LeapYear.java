//Leap Year checker program
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year for check leap year or not");
        year=sc.nextInt();
        boolean isLeapYear=false;
        if ((year%4 ==0 && year%100 !=0) || (year%400 ==0))
        {
            isLeapYear=true;
        }
        if(isLeapYear)
        {
            System.out.println(year +" "+"is a leap year.");
        }
        else {
            System.out.println(year+" "+"is not a leap year.");
        }
    }
}

