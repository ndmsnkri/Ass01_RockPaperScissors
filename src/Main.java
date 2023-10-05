import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain;

        System.out.println("Welcome to the game !!");
        System.out.println();
        System.out.println("R is for Rock");
        System.out.println("P is for Paper");
        System.out.println("S is for Scissors");
        System.out.println();

        do {
            // Get move choice from playerA
            String playerA;
            do {
                System.out.print("Player A, enter your move (R/P/S): ");
                playerA = in.nextLine();
                if (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S")) {
                    System.out.println("Invalid input. Please enter R, P, or S.");
                }
            } while (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S"));

            // Get move choice from playerB
            String playerB;
            do {
                System.out.print("Player B, enter your move (R/P/S): ");
                playerB = in.nextLine();
                if (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S")) {
                    System.out.println("Invalid input. Please enter R, P, or S.");
                }
            } while (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S"));

            System.out.println();

            if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors");
            } else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper");
            } else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock");
            }

            // Determine the winner
            String result;
            if (playerA.equalsIgnoreCase(playerB)) {
                result = "It's a Tie!";
            } else if ((playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) ||
                    (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) ||
                    (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P"))) {
                result = "Congratulations !!! Player A wins!";
            } else {
                result = "Congratulations !!! Player B wins!";
            }
            // Display the result
            System.out.println(result);

            System.out.println();

            System.out.print("Play again? (Y/N): ");
            playAgain = in.nextLine();
        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
    }
}
