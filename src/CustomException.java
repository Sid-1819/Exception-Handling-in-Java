// Define a custom exception class that extends RuntimeException
class MyCustomizedException extends RuntimeException {
    // Constructor that takes a string message and passes it to the superclass constructor
    public MyCustomizedException(String str) {
        super(str); // Call the constructor of the superclass (RuntimeException) with the message
    }
}

public class CustomException {

    public static void main(String[] args) {
        // Declare and initialize variables
        int i = 20; // Initialize i to 20
        int j = 0;  // Initialize j to 0

        try {
            // Perform division
            j = 18 / i;  // Divide 18 by i and assign the result to j

            // Check if the result of the division is zero
            if (j == 0) {
                // If j is zero, throw a custom exception
                throw new MyCustomizedException("answer cannot be 0");
            }
        } catch (MyCustomizedException e) {
            // Catch the custom exception and print a message
            // Set j to a default value to avoid zero
            j = 18 / 1;
            System.out.println("Default value set due to exception: " + e);
        }

        // Print the value of j
        // If no exception was thrown, this will print the result of the division
        // If an exception was thrown and caught, it will print the default value
        System.out.println(j);
    }
}
