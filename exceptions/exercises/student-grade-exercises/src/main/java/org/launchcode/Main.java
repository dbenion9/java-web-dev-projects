import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Use scanner to ask the user whether to enter string manually or read from file
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to read the string from a file? (yes/no): ");
        String choice = scanner.nextLine().trim().toLowerCase();

        String input = "";

        if (choice.equals("yes")) {
            // Reading string from a file called input.txt
            try {
                input = Files.readString(Paths.get("input.txt"));
                System.out.println("String read from file: " + input);
            } catch (IOException e) {
                System.out.println("Error reading the file.");
                e.printStackTrace();
                return; // Exit the program if file reading fails
            }
        } else {
            // Prompt the user for input manually
            System.out.println("Enter a string: ");
            input = scanner.nextLine();
        }

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through the string, character by character, converting to lowercase and ignoring non-alphabetic characters
        for (char c : input.toLowerCase().toCharArray()) {
            // Only process alphabetic characters
            if (Character.isLetter(c)) {
                // Update the count for this character in the HashMap
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print the results (character and its count)
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}