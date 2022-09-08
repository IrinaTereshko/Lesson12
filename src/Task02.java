import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        Random random = new Random();
        // random integer number  from 10 to 20, if +1 then 20 included in random
        int b = 20;
        int a = 10;
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(b-a+1)+a );
        } {

        }

    }
}
