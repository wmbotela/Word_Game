import java.io.Console;


  public class App{

   public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("welcome to Hangman aka ... Command Line Word Game");
    Game hangman = new Game();
    System.out.println("Toss in a letter and lets begin. Your best chance would be a vowel... ");
    hangman.runHangMan();
  }

}
