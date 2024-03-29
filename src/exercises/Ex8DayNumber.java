package exercises;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;
import static java.lang.System.out;

/*
 *   Program to calculate the day number for same day in a given year.
 *   - To check solution, see http://mistupid.com/calendar/dayofyear.htm
 *
 *   This is exercising functional decomposition
 *   Assume you have a top level method solving the problem. Break down
 *   top level method into smaller methods solving parts of the problem etc.
 *   During this we run tests to make sure the methods works as expected.
 *   Combine the method to solve the problem.
 *
 */
public class Ex8DayNumber {

    public static void main(String[] args) {
        new Ex8DayNumber().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        //test();                // <--------- Uncomment to test only

        // -- In ----------------
        out.print("Input the year > ");
        int year = sc.nextInt();
        out.print("Input the month number > ");
        int month = sc.nextInt();
        out.print("Input the day number > ");
        int day = sc.nextInt();

        // --- Process ---------

        // Write the code to call top level method here
        // Then break the method down in smaller methods, call them etc.
        // Inside toå leel method etc.
        int dayNbr = dayNumber(year, month, day);

        // ---- Out ----
        printResult(year, month, day, dayNbr);

    }

    // ------------ Write your methods below this ------

    int dayNumber(int year, int month, int day)
    {
        return combineMonths(month, year) + day;
    }

    int combineMonths(int month, int year)
    {
        int[] arr = getMonthArray(year);
        int result = 0;
        for(int i = 0; i < month - 1; i++)
        {
            result += arr[i];
        }
        return result;
    }

    int[] getMonthArray(int year)
    {
        if(isLeapYear(year))
        {
            return new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        }
        else
        {
            return new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        }
    }

    boolean isLeapYear(int year)
    {
        if(year % 4 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void printResult(int year, int month, int day, int dayNbr) {
        out.println("Ordinal number for " + day + "/" + month + " in " + year + " is: " + dayNbr);
        if (isLeapYear(year)) {
            out.println(year + " is a leap year");
        } else {
            out.println(year + " is not a leap year");
        }
    }

    // This is used to test methods in isolation
    // Any non trivial method should be tested.
    // If not ... can't build a solution out of possible failing parts!
    void test(){
        out.println( true);


        exit(0);
    }


}
