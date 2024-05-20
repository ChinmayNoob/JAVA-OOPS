import java.util.Random;

public class prac5A {
    public static void main(String[] args) {
        // Create a Random object with a seed of 1000
        Random random = new Random(1000);

        // Generate and print the first 100 random integers between 1 and 49
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(49) + 1; // Add 1 to shift the range from 0-48 to 1-49
            System.out.print(randomNumber+" ");
        }
    }
}
