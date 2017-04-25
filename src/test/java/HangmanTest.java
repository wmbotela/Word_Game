import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {
  @Test
  public void newHangman_createsAnewInstance_true(){
    Hangman testHangman = new Hangman();
    assertEquals(true, testHangman instanceof Hangman);
  }

}
