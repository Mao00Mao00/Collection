import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            numbers.add(random.nextInt(100));
        }

        for (int j = 0; j < numbers.size(); j++) {
            System.out.printf("%d ", numbers.get(j));
        }
        System.out.println();
    }
}