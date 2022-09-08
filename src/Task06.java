import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter quantity of random repeats: ");
        int quantity = scanner.nextInt();

        int positive = 0, negative = 0;

        for (int i = 0; i < quantity; i++) {
            if (random.nextBoolean()) {
                positive += 1;
            } else {
                negative += 1;
            }
        }
        System.out.println("Quantity of true is " + positive + ", quantity of false is " + negative + ".");
    }
}
