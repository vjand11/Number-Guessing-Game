import java.util.Scanner;

public class NumberGuessingGameApp {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100 + 1);
        int userGuess = 0;

        Scanner userInput = new Scanner(System.in);
        NumberGuessingGame numberGuessingGame = new NumberGuessingGame();

        System.out.println("Welcome to the Number Guessing Game!");


        while (userGuess != randomNum) {
            try {
                System.out.print("Please enter a number between 1 and 100: ");
                userGuess = Integer.parseInt(userInput.nextLine());
                String result = numberGuessingGame.determineGuess(userGuess, randomNum);
                System.out.println(result);

            } catch (NumberFormatException e) {
                System.out.println("That doesn't make sense! Try entering a number.");
            }
        }
    }
}
