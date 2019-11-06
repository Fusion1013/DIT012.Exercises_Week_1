package exercises;

import java.util.Scanner;

import static java.lang.System.*;;

/*
 * Program to calculate sum and average for non-negative integers
 *
 * See:
 * - Loops (while only)
 * - LoopAndAHalf
 *
 */
public class Ex3SumAvg {

    public static void main(String[] args) {
        new Ex3SumAvg().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // Write your code here

        // -- Input (and bookkeeping)
        int sum = 0;
        double i = 0;
        int inp = sc.nextInt();

        // Process
        while (inp != -1)
        {
            sum += inp;
            inp = sc.nextInt();
            i++;
        }

        // -- Output ----
        out.println("Sum = " + sum + " Avg = " + sum / i);
    }

}
