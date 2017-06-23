package kiru;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		int year = 2013;
	 
    //Flag to store the test result
    boolean isLeapYear = false;

    if(year % 400 == 0)
    {
        isLeapYear = true;
    }
    else if (year % 100 == 0)
    {
        isLeapYear = false;
    }
    else if(year % 4 == 0)
    {
        isLeapYear = true;
    }
    else
    {
        isLeapYear = false;
    }

    //Output the test result
    if(isLeapYear)
    {
        System.out.println("Year "+year+" is a Leap Year");
    }
    else
    {
        System.out.println("Year "+year+" is not a Leap Year");
    }

	}

}