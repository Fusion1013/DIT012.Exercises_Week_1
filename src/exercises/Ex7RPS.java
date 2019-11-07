package exercises;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
 * The Rock, paper, scissor game.
 * See https://en.wikipedia.org/wiki/Rock%E2%80%93paper%E2%80%93scissors
 *
 * This is exercising smallest step programming (no methods needed)
 *
 * Rules:
 *
 *       -----------  Beats -------------
 *       |                              |
 *       V                              |
 *      Rock (1) --> Scissors (2) --> Paper (3)
 *
 */
public class Ex7RPS {

    public static void main(String[] args) {
        new Ex7RPS().program();
    }

    final Random rand = new Random();
    final Scanner sc = new Scanner(in);

    void program() {

        int maxRounds = 5;
        int human = 0;          // Outcome for player
        int computer = 0;       // Outcome for computer
        int result = 0;         // Result for this round
        int round = 0;      // Number of rounds
        int total = 0;      // Final result after all rounds

        // All code here ... (no method calls)

        out.println("Welcome to Rock, Scissors and Paper");

        // Here the game loop starts
        for(round = 0; round < maxRounds; round++)
        {
            // -------- Input --------------
            out.print("Select 1, 2 or 3 (for R, P or S): ");
            int ps = sc.nextInt();

            // ----- Process -----------------

            //Choose Computer Selection
            int cs = rand.nextInt(3) + 1;
            out.println("Computer Choose: " + cs);

            boolean playerWin = false;

            //Win Cases
            if (ps == 1 && cs == 2) playerWin = false;
            else if (ps == 2 && cs == 3) playerWin = false;
            else if (ps == 3 && cs == 1) playerWin = false;
            else playerWin = true;

            //Result Checker
            if (ps == cs) //If it's a draw, don't run rest of win detection
            {
                out.println("It's a Draw");
            }
            else //If it's not a draw, run win detection
            {
                if (playerWin) {
                    human += 1;
                    out.println("You won");
                }
                else {
                    computer += 1;
                    out.println("Computer Won");
                }
            }
            // ---------- Output --------------
            result = human - computer;
            out.println("Result: " + result);
        }

          //--------  End Game loop
        total = human - computer;

        out.println("Game over! ");
        if (total == 0) {
            out.println("Draw");
        } else if (total > 0) {
            out.println("Human won.");
        } else {
            out.println("Computer won.");
        }
    }
}
