public class NumberGuessingGame {
    private int totalTries = 0;

    public NumberGuessingGame() {
    }

    public String determineGuess(int userInput, int computerNum) {

        if (userInput < 0 || userInput > 100) {
            return "Your guess is out of range, please try again.";
        } else if (userInput == computerNum) {
            totalTries++;
            return "You guessed the number! Total number of guesses: " + totalTries;
        } else if (userInput > computerNum) {
            String response = "You did not guess the number. Your guess is too high, try again";
            totalTries++;
            return response + " Total Tries: " + totalTries;
        } else {
            String response = "You did not guess the number. Your guess is too low, try again.";
            totalTries++;
            return response + " Total Tries: " + totalTries;
        }
    }
}
