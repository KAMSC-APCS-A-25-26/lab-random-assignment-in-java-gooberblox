import java.util.Random;

public class RandomPercentage {
    public static void main(String[] args) {
        // TODO: Create two Random objects
        // 1. One Random object without a seed (unseeded)
        // 2. One Random object with any seed value (seeded)
        Random rand = new Random();
        Random seed = new Random(674169420);
        // TODO: Generate random double values from both Random objects
        // Use nextDouble() method to get values between 0.0 and 1.0
        System.out.println("Unseeded Random: " + String.format("%.2f",rand.nextDouble()*100)+"%");
        System.out.println("Seeded Random: " + String.format("%.2f",rand.nextDouble()*100)+"%");

        // TODO: Format as percentages
        // Format the values to exactly 2 decimal places
        // Display with % symbol
        
        // TODO: Display the values as percentages
        // Show both unseeded and seeded random values
        // Each value should be formatted as below
    }
}