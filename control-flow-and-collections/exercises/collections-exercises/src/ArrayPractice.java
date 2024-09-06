import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

    // Method to sum all even numbers in an ArrayList
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {  // Check if the number is even
                total += integer;  // Add even number to total
            }
        }
        return total;  // Return the sum of even numbers
    }

    // Method to print words with exactly 5 letters
    public static void printFiveLetterWords(ArrayList<String> words) {
        for (String word : words) {
            if (word.length() == 5) {  // Check if the word has exactly 5 letters
                System.out.println(word);
            }
        }
    }

    // Method to print words of a user-specified length
    public static void printWordsOfLength(ArrayList<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {  // Check if the word has the specified length
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        // 1. Sum Even Numbers in an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sumOfEvens = sumEven(numbers);  // Call sumEven method
        System.out.println("Sum of even numbers: " + sumOfEvens);

        // 2. Create an ArrayList of words
        ArrayList<String> words = new ArrayList<>(Arrays.asList("apple", "peach", "banana", "grape", "melon"));

        // 3. Print words with exactly 5 letters
        System.out.println("\nWords with exactly 5 letters:");
        printFiveLetterWords(words);

        // 4. Prompt user for word length and print words of that length
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter a word length to search for: ");
        int wordLength = input.nextInt();
        System.out.println("\nWords with length " + wordLength + ":");
        printWordsOfLength(words, wordLength);

        // 5. BONUS: Convert a string to an ArrayList
        String sentence = "I would not, could not, in a box";
        ArrayList<String> sentenceWords = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        System.out.println("\nArrayList from a sentence: " + sentenceWords);
    }
}
