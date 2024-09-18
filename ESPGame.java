/* 

 * Class: CMSC203  

 * Instructor: Khandan Monshi 

 * Description: (Give a brief description for each Class) 

 * Due: 09/18/2024 

 * Platform/compiler: Eclipse 

 * I pledge that I have completed the programming assignment  

* independently. I have not copied the code from a student or   * any source. I have not given my code to any student. 

 * Print your Name here: Ugonna Umunna. 

*/ 

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class ESPGame {
    public static void main(String[] args) throws FileNotFoundException {
        // Constants for color names
        final String COLOR_1 = "Black";
        final String COLOR_2 = "White";
        final String COLOR_3 = "Gray";
        final String COLOR_4 = "Silver";
        final String COLOR_5 = "Maroon";
        final String COLOR_6 = "Red";
        final String COLOR_7 = "Purple";
        final String COLOR_8 = "Fuchsia";
        final String COLOR_9 = "Green";
        final String COLOR_10 = "Lime";
        final String COLOR_11 = "Olive";
        final String COLOR_12 = "Yellow";
        final String COLOR_13 = "Navy";
        final String COLOR_14 = "Blue";
        final String COLOR_15 = "Teal";
        final String COLOR_16 = "Aqua";

        // Prepare for input and random generation
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // Display the list of colors from colors.txt
        File file = new File("colors.txt");
        Scanner fileReader = new Scanner(file);
        System.out.println("There are sixteen colors from the file:");
        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }
        fileReader.close();

        int correctGuesses = 0;

        // Game loop: ask user to guess the randomly chosen color 3 times
        for (int round = 1; round <= 3; round++) {
            System.out.println("\nRound " + round);
            System.out.println("I am thinking of a color. Is it one of the list of colors above?");
            System.out.print("Enter your guess: ");
            String userGuess = input.nextLine().trim().toLowerCase();

            // Randomly select a color
            int randomColorIndex = rand.nextInt(16) + 1;
            String selectedColor = "";

            // Use if-else to determine the selected color
            if (randomColorIndex == 1) {
                selectedColor = COLOR_1.toLowerCase();
            } else if (randomColorIndex == 2) {
                selectedColor = COLOR_2.toLowerCase();
            } else if (randomColorIndex == 3) {
                selectedColor = COLOR_3.toLowerCase();
            } else if (randomColorIndex == 4) {
                selectedColor = COLOR_4.toLowerCase();
            } else if (randomColorIndex == 5) {
                selectedColor = COLOR_5.toLowerCase();
            } else if (randomColorIndex == 6) {
                selectedColor = COLOR_6.toLowerCase();
            } else if (randomColorIndex == 7) {
                selectedColor = COLOR_7.toLowerCase();
            } else if (randomColorIndex == 8) {
                selectedColor = COLOR_8.toLowerCase();
            } else if (randomColorIndex == 9) {
                selectedColor = COLOR_9.toLowerCase();
            } else if (randomColorIndex == 10) {
                selectedColor = COLOR_10.toLowerCase();
            } else if (randomColorIndex == 11) {
                selectedColor = COLOR_11.toLowerCase();
            } else if (randomColorIndex == 12) {
                selectedColor = COLOR_12.toLowerCase();
            } else if (randomColorIndex == 13) {
                selectedColor = COLOR_13.toLowerCase();
            } else if (randomColorIndex == 14) {
                selectedColor = COLOR_14.toLowerCase();
            } else if (randomColorIndex == 15) {
                selectedColor = COLOR_15.toLowerCase();
            } else if (randomColorIndex == 16) {
                selectedColor = COLOR_16.toLowerCase();
            }

            // Display the result
            System.out.println("I was thinking of " + selectedColor + ".");

            // Check if the user's guess is correct
            if (userGuess.equals(selectedColor)) {
                correctGuesses++;
            }
        }

        // Show the result after 3 rounds
        System.out.println("\nGame Over");
        System.out.println("You guessed " + correctGuesses + " out of 3 colors correctly.");

        // Ask for user details
        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        System.out.print("Describe yourself: ");
        String userDescription = input.nextLine();

        System.out.print("Due Date (MM/DD): ");
        String dueDate = input.nextLine();

        // Display the user information
        System.out.println("\nUser Name: " + userName);
        System.out.println("User Description: " + userDescription);
        System.out.println("Date: " + dueDate);

        input.close();
    }
}
