package exercises;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 *  Using class objects to represent heroes
 *  https://en.wikipedia.org/wiki/Gladiators_(1992_UK_TV_series)
 *
 * See:
 * - ClassObjects
 * - MethodsArrObj (just objects)
 */
public class Ex6ClassObjects {

    public static void main(String[] args) {
        new Ex6ClassObjects().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        // Code here
        Hero hero1 = new Hero();
        out.print("Hero 1 name: ");
        hero1.name = sc.nextLine();
        out.print("Hero 1 strength: ");
        hero1.strength = sc.nextInt();

        sc.nextLine();

        Hero hero2 = new Hero();
        out.print("Hero 2 name: ");
        hero2.name = sc.nextLine();
        out.print("Hero 2 strength: ");
        hero2.strength = sc.nextInt();

        if (hero1.strength > hero2.strength)
        {
            out.println(hero1.name + " is stronger than " + hero2.name);
        }
        else if (hero1.strength == hero2.strength)
        {
            out.println("They are equal");
        }
        else
        {
            out.println(hero2.name + " is stronger than " + hero1.name);
        }
    }


    // ------ The class to use  -----------
    // A class for objects that describes a Hero
    class Hero {
        String name;
        int strength;
    }


}
