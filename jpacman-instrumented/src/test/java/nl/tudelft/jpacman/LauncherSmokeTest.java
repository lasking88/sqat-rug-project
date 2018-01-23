package nl.tudelft.jpacman;

import static sqat.series2.Api.hit;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.game.Game;
import nl.tudelft.jpacman.level.Player;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("magicnumber")
public class LauncherSmokeTest  {
	
	private Launcher launcher;
	
	/**
	 * Launch the user interface.
	 */
	@Before
	public void setUpPacman()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1100,89,<37,1>,<41,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1100,89,<37,1>,<41,2>)", "539"); launcher = new Launcher(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1100,89,<37,1>,<41,2>)", "540"); launcher.launch(); }
	
	/**
	 * Quit the user interface when we're done.
	 */
	@After
	public void tearDown()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1248,57,<46,1>,<49,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1248,57,<46,1>,<49,2>)", "541"); launcher.dispose(); }

    /**
     * Launch the game, and imitate what would happen in a typical game.
     * The test is only a smoke test, and not a focused small test.
     * Therefore it is OK that the method is a bit too long.
     * 
     * @throws InterruptedException Since we're sleeping in this test.
     */
    @SuppressWarnings({"methodlength", "PMD.JUnitTestContainsTooManyAsserts"})
    @Test
    public void smokeTest() throws InterruptedException  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "542"); Game game = launcher.getGame(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "543"); Player player = game.getPlayers().get(0); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "544"); assertFalse(game.isInProgress()); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "545"); game.start(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "546"); assertTrue(game.isInProgress()); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "547"); assertEquals(0, player.getScore()); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "548"); game.move(player, Direction.EAST); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "549"); assertEquals(10, player.getScore()); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "550"); game.move(player, Direction.WEST); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "551"); assertEquals(10, player.getScore()); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "552"); move(game, Direction.EAST, 7); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "553"); assertEquals(60, player.getScore()); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "554"); move(game, Direction.NORTH, 6); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "555"); assertEquals(120, player.getScore()); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "556"); move(game, Direction.WEST, 2); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "557"); assertEquals(120, player.getScore()); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "558"); move(game, Direction.NORTH, 2); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "559"); Thread.sleep(500L); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "560"); move(game, Direction.WEST, 10); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "561"); move(game, Direction.EAST, 10); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "562"); assertFalse(player.isAlive()); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "563"); game.stop(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(1608,1491,<58,4>,<103,6>)", "564"); assertFalse(game.isInProgress()); }

    /**
     * Make number of moves in given direction.
     *
     * @param game The game we're playing
     * @param dir The direction to be taken
     * @param numSteps The number of steps to take
     */
    public static void move(Game game, Direction dir, int numSteps)  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(3313,212,<112,4>,<117,5>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(3313,212,<112,4>,<117,5>)", "566"); Player player = game.getPlayers().get(0); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(3313,212,<112,4>,<117,5>)", "567"); for (int i = 0; i < numSteps; i++) { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(3313,212,<112,4>,<117,5>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(960,2567,<29,0>,<118,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/LauncherSmokeTest.java|(3313,212,<112,4>,<117,5>)", "565"); game.move(player, dir); } }
}
