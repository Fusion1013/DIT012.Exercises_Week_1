package exercises;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * Program to exercise arrays
 *
 * See:
 * - ArrayBasics
 */
public class Ex4Arrays {

    public static void main(String[] args) {
        new Ex4Arrays().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // Write code here
        out.print("Length: ");

        int x = sc.nextInt();
        int[] a = new int[x];

        out.print("Numbers: ");

        for (int i = 0; i < x; i++)
        {
            int n = sc.nextInt();
            a[i] = n;
        }

        out.print("Numbers: ");
        PrintArray(a);

        out.print("Input value to find: ");
        int n = sc.nextInt();
        Boolean found = false;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] == n)
            {
                out.print("Value " + n + " is at index " + i);
                found = true;
            }
        }
        if (!found)
        {
            out.print("Value not found");
        }
    }

    void PrintArray(int[] a)
    {
        String ar = "";
        for (int i : a)
        {
            ar += i + ",";
        }
        ar = ar.substring(0, ar.length() - 1);
        out.println("Array is: [" + ar + "]");
    }
}
