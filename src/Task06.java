import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int quantity;
do {
        System.out.print("Enter quantity of random repeats: ");
        quantity = scanner.nextInt();
}while(quantity<=0);

        int positive = 0;

        for (int i = 0; i < quantity; i++) {
            if (random.nextBoolean()) {
                positive ++;
            }

        }
        String msg = String.format ("Quantity of true is %d quantity of false is %d ", positive, quantity-positive);
        System.out.print(msg);
    }
}
