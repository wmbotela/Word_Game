
import java.util.Arrays;
import java.io.Console;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;



public class Game{
    public void runHangMan(){
        Console myConsole = System.console();
        Random wordPickRandomizer = new Random();
        String[] words = {"apple","pea","patriot","hop","grapple","stop","flippers","pique"}; //words array

        boolean gameInPlay = true;
        while (gameInPlay) {
          int randomIndex = wordPickRandomizer.nextInt(words.length);
          String randomWord = words[randomIndex];
          //Here I insert a char array to hold the random word to allow for progressive changing of the hiddenWord to the actual word
          char[] randomWordAsCharArray = randomWord.toCharArray();
          int randomWordLength = randomWord.length();
          char[] hiddenWord = new char[randomWordLength]; //this array contains the same word that was radomly picked but as a hidden version with hashes(octothorpes)
          for (int i = 0 ;i < randomWordLength ; i ++ ) {
            hiddenWord[i]='#';
          }

          boolean wordIsGuessed = false;
          int userAttempts = 0;
          int numberOfGuesses = randomWordLength;

          while (!(wordIsGuessed)&&(userAttempts!=numberOfGuesses)) {
            System.out.println("The word is now ...");
            printArray(hiddenWord);
            System.out.println("Guesses left "+(numberOfGuesses-userAttempts));
            System.out.println("Enter the letter");
            String inputGuess = myConsole.readLine();
            inputGuess.toLowerCase();
            char userCharGuess = inputGuess.charAt(0);
            userAttempts++;
            //a for loop comes in here to do all the changing from a hash to the actual letter if correct
            for (int i = 0 ; i < randomWordLength ; i++ ) {
              if (userCharGuess == randomWordAsCharArray[i]) {
                hiddenWord[i]=userCharGuess;
              }
              if (userFoundWholeWord(hiddenWord)) {
                wordIsGuessed = false;
                System.out.println("Congrats bro!");
              }
            }
          }
        }
        System.out.println("Game Over! X(");
    }
    //Prints out the array as a list
        public static void printArray(char[] array){
          for (int i=0;i<array.length ;i++ ) {
            System.out.print(array[i]+"");
          }
          System.out.println();
        }


        //Verifies that every element in the array has been changed from a hash thus the user has found every word
        public static boolean userFoundWholeWord(char[] array){
          for (int i=0;i<array.length ;i++ ) {
            if (array[i]=='#') {
              return false;
            }
          }
          return true;
        }
    }
