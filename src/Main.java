public class Main {
    public static void main(String[] args) {
        // Declare and initialize variables
        int j = 0;        // This will cause an ArithmeticException when used as a divisor
        String str = null; // This will cause a NullPointerException when attempting to access its length
        int i = 0;        // Initialize i to 0

        try {
            // Attempt to print the length of the string 'str'
            // This will throw a NullPointerException since 'str' is null
            System.out.println(str.length());

            // Attempt to perform division by zero
            // This will throw an ArithmeticException
            i = 18 / j;

        } catch (ArithmeticException e) {
            // Catch and handle the ArithmeticException
            // This block will execute if division by zero is attempted
            System.out.println(e);  // Print the exception

        } catch (Exception e) {
            // Catch and handle any other exceptions
            // This block will execute if any other exception is thrown
            System.out.println("Something went wrong...");  // Print a generic error message

        }

        // Print the value of 'i'
        // This will be 0 if an exception was thrown before 'i' was assigned a new value
        System.out.println(i);
    }
}
