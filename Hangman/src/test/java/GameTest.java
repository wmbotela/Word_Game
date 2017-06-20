public class GameTest{
  @Test
  public void Game_instantantiatesGameCorrectly(){
    Game newGame = new Game();
    assertTrue(newGame instanceof Game);
  }
}
