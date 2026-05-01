import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int num = rand.nextInt(100) + 1;
        int guess, attempts = 0;

        System.out.println("Guess number between 1-100");

        do {
            System.out.print("Enter guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < num)
                System.out.println("Too low");
            else if (guess > num)
                System.out.println("Too high");
            else
                System.out.println("Correct in " + attempts + " tries");
        } while (guess != num);

        sc.close();
    }
}