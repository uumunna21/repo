package package1;

import java.util.Scanner;

public class MovieDriver_Task2 {
    public static void main(String[] args) {
        // Create a new object of type Scanner that reads from the keyboard
        Scanner scanner = new Scanner(System.in);
        String continueInput = "yes"; // Initialize the loop condition

        // Start a loop that continues based on user input
        while (continueInput.equalsIgnoreCase("yes")) {
            // Create a new movie object
            Movie movie = new Movie();

            // Prompt the user to enter the title of a movie
            System.out.println("Enter the title of the movie: ");
            // Read in the line that the user types
            String title = scanner.nextLine();
            // Set the title in the movie object
            movie.setTitle(title);

            // Prompt the user to enter the movie’s rating
            System.out.println("Enter the movie's rating: ");
            // Read in the line that the user types
            String rating = scanner.nextLine();
            // Set the rating in the movie object
            movie.setRating(rating);

            // Prompt the user to enter the number of tickets sold at a theater
            System.out.println("Enter the number of tickets sold: ");
            // Check for integer input
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer for tickets sold.");
                scanner.next();  // Clear invalid input
            }
            int soldTickets = scanner.nextInt();
            // Set the number of tickets sold in the movie object
            movie.setSoldTickets(soldTickets);

            // Print out the information using the movie’s toString method
            System.out.println(movie.toString());

            // Consume the leftover newline character after nextInt()
            scanner.nextLine();

            // Ask the user if they want to enter another movie
            System.out.println("Do you want to enter another movie? (yes/no): ");
            continueInput = scanner.nextLine();
        }

        // Close the scanner to prevent resource leak
        scanner.close();
        
        System.out.println("Thank you for using the MovieDriver!");
    }
}

