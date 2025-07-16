import java.util.ArrayList;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        ArrayList<Integer>numbers = new ArrayList<Integer>();

        while (sum <= 5000) {
            int randomNumber = rand.nextInt(31);
            numbers.add(randomNumber);
            sum = sum + randomNumber;
        }
    }

    public  static int highestNumber(ArrayList<Integer> numbers) {
        int highest = numbers.get(0);
        for (int num : numbers) {
            if (num > highest) {
                highest = num;
            }
        }
        return highest;
    }

    public static int lowestNumber(ArrayList<Integer> numbers) {
        int lowest = numbers.get(0);
        for (int num : numbers) {
            if (num < lowest) {
                lowest = num;
            }
        }
        return lowest;
    }
}
