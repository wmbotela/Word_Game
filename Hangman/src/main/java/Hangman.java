import java.util.Random;

public class Hangman{

  /** the thing that displays the game */
  private HangmanDisplay display = new HangmanDisplay();

  /** the word to be guessed */
  private String word = null;

  /** the array of possible words */
  private String[] wordArray = {"help","word","work","pant", "farm"};

  /** the random number generator */
  private Random randNumGen = new Random();

  /** the number of wrong guesses */
  private int numWrongGuesses = 0;

  /** the number of right guesses */
  private int numRightGuesses = 0;

  /** the characters that were guessed that were wrong */
  private String wrongGuesses = "";

  /** the characters that were guessed that were right */
  private char[] rightGuesses = {' ',' ',' ', ' '};

  /** Constructor **/

  public Hangman()
  {
    int index = randNumGen.nextInt(wordArray.length);
    word = wordArray[index];
  }
