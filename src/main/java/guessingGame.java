import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        //prints welcome message for the user
        // \n indicates a new line after the string so it doesn't look cluttered
        System.out.println("Welcome to the secret number game! \n");
        // prompts the user for max numbers
        System.out.println("Please input the maximum number of integers you wish to choose from");
        Scanner reader = new Scanner(System.in);
        //allows reader to input their number
        String yourChosenNumber = reader.nextLine();
        //converts the users chosen number from string to an integer named 'max'
        int max = Integer.parseInt(yourChosenNumber);


        System.out.println("Please input the minimum number of integers you wish to choose from ");
        Scanner user = new Scanner(System.in);
        String yourSecondNumber = user.nextLine();
        int min = Integer.parseInt(yourSecondNumber);

        System.out.println("The secret number has been chosen! \n");
        /*math random picks a number between 0 and less than 1
        int makes sure the final number is a whole number
         max-min picks a number between the users input eg. 6-1=5 hence 0 to 5
         +min adds the min value to the minimum value of 0 from the math random command*/
       int  secretNumberIs = (int) (Math.random() * (max-min))+min;
       // System.out.println(secretNumberIs); this was printed to make sure, the random number was generated properly
        System.out.println("Please make your first guess");
        Scanner consumer = new Scanner(System.in);
        String yourGuess = consumer.nextLine();

        System.out.println("Your guess is " + yourGuess);
        int yourGuessCon = Integer.parseInt(yourGuess);

        // if user's guess is higher than the generated number this is printed
        if (yourGuessCon> secretNumberIs) {
            System.out.println("Oops, you've guessed too high! \n");
            // if user's guess is lower than the generated number this is printed
        } else if (yourGuessCon < secretNumberIs) {
            System.out.println("Oops, you're a little too low! \n");
            // if user's guess is the same as the generated number this is printed
        } else {
            System.out.println("Well done! You guessed it correctly \n");
        }

        System.out.println("The secret number was actually " + secretNumberIs);
    }
}
