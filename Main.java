
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int target = rd.nextInt(1, 101);
        int attempts = 0;

        while (true) {

            System.out.println("Enter a number between 1 to 100:");
            int guess = sc.nextInt();

            attempts++;

            if (guess > target) {
                System.out.println("Number is smaller");

            } else if (guess < target) {
                System.out.println("Number is greater");

            } else {
                System.out.println("We got the number!");
                System.out.println("Attempts: " + attempts);
                break;
            }
        }

        sc.close();
    }
}
