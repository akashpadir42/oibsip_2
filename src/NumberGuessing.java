//Number Guessing Game
import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberGuessing {

    // Function
    public static void
    guessingnumbergame()
    {
        System.out.println("******Guess The Number Game******");
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        // Generate the numbers
        int number = 1 + (int)(100 * Math.random());

        // Given n trials
        int n = 7;

        int i, guess;
        System.out.println("\nGuess the number within 7 trials.");
        System.out.println("\nGuess the number between 1 to 100." );


        // Iterate over K Trials
        for (i = 0; i < n; i++) {

            System.out.println("Guess the number:");

            // Taking input for guessing number
            guess = sc.nextInt();

            // If the number guessed
            if (number == guess) {
                System.out.println("Congratulations!" + " You guessed the number.");
                break;
            }
            else if (number > guess && i != n - 1) {
                System.out.println("The number is greater than " + guess);
            }
            else if (number < guess && i != n - 1) {
                System.out.println("The number is less than " + guess);
            }
        }

        if (i == n) {
            System.out.println("You have exhausted " + n + " trials.");

            System.out.println("\nThe number was " + number);
        }
    }

    // Driver Code
    public static void
    main(String arg[])
    {

        // Calling Function
        guessingnumbergame();
    }
}
