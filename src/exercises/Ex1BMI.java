package exercises;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *
 * Program to calculate a persons BMI
 * See https://en.wikipedia.org/wiki/Body_mass_index
 *
 * Formula is: bmi = weight / height²     (kg/m²)
 *
 * See:
 * - F2C
 * - IO
 * - PrimitiveVariables
 * - Arithmetic
 */
public class Ex1BMI {

    // Don't care about this, must be there, start coding at program
    public static void main(String[] args) {
        new Ex1BMI().program();
    }

    // This connects our program to the keyboard
    final Scanner sc = new Scanner(in);

    void program() {
        // Write your code here
        double inWeight = 0;
        double inHeight = 0;
        // --- Input ---------
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your weight (kg): ");
        inWeight = sc.nextDouble();
        System.out.print("Please enter your height (m): ");
        inHeight = sc.nextDouble();

        // --- Process --------
        double bmi = inWeight / (inHeight * inHeight);
        // --- Output ---------
        out.println("BMI = " + bmi + ":" + inWeight + ":" + inHeight);
    }

}
