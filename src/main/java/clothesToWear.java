import java.util.Objects;
import java.util.Scanner;

public class clothesToWear {
    public static void main(String[] args) {
        System.out.println("Hello! Welcome to the clothing calculator, the calculator for fashionistas! \n");
        System.out.println("Let's start off with the temperature for today, how many degrees is it outside? \n");
        Scanner user = new Scanner(System.in);

        //tried to see if integer can work interchangeably with string & without the need to then code the string into an integer and intelliJ offered a way to switch it
        Integer temp = Integer.valueOf(user.nextLine());

        System.out.println("Next, please choose from the given list of words, the best suited state of the outside environment: \n");
        System.out.println("It's a white christmas, You're in England, it's raining, Gone with the wind, Sunshine and daisies, Outside, what's that?");

        Scanner reader = new Scanner(System.in);
        String weather = reader.nextLine();
        /*objects.equals is used to verify if both objects have the exact value whereas the == compares the reference in java.
        Side note: IntelliJ was the one that showed me the fix! */
        if (Objects.equals(weather, "It's a white christmas") && temp < 20) {
            System.out.println("It's too cold, stay inside!");
        } else if (Objects.equals(weather, "You're in England, it's raining") && temp < 20) {
            System.out.println("You're gonna get wet, stay inside!");
        } else if (Objects.equals(weather, "Gone with the wind") && temp < 20) {
            System.out.println("You want to fly? Safe to keep both feet inside the house!");
        } else if (Objects.equals(weather, "Gone with the wind") && temp > 10) {
            System.out.println("Sunburn is dangerous, stay inside!");
        } else if (Objects.equals(weather, "Outside, what's that?") && temp < 20) {
            System.out.println("I like it, keep the PJ's on");
        } else {
            System.out.println("Guess you got to stay indoors :(");
        }
    }
}

