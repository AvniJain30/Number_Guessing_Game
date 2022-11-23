import java.util.Scanner;
import java.util.Random;

public class RandomNo {
    public static void main(String[] args){
        int ans, guess, totalAttempts = 3, score = 0;
        final int max = 100;

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("A number is between 1 to 100.");
        System.out.println("Guess the number within 5 tries");
        System.out.println();

        while(totalAttempts != 0) {
            ans = r.nextInt(max) + 1;
            System.out.println("Guess the number : ");
            guess = s.nextInt();

            if (guess == ans) {
                System.out.println("Good job, the number was " + ans);
                score++;
            } else {
                System.out.println("Sorry, but the number was " + ans);
            }

            totalAttempts--;
        }

        System.out.println("Your score is : " + score);
    }
}
