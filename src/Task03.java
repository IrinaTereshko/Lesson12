import java.util.Random;

public class Task03 {
    public static void main(String[] args) {
        Random random = new Random();

        //random floating point numbers
        // *100 because method work with numbers from 0 to 1
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextDouble() *100);
        }
    }

}
