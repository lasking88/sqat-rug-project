package nl.tudelft.jpacman.cucumber;

import static sqat.series2.Api.hit;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nl.tudelft.jpacman.Launcher;
import nl.tudelft.jpacman.game.Game;

public class StateNavigationSteps  {
	
	private static Game theGame;
	
	private Launcher launcher;
	
	/**
	 * The Game created by the tests.
	 * 
	 * @return Game created when starting up the game. Null if game has not been launched.
	 */
	public static Game getGame()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(762,51,<31,1>,<33,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(762,51,<31,1>,<33,2>)", "304"); return theGame; }

	private static void setGame(Game game)  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(816,61,<35,1>,<37,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(816,61,<35,1>,<37,2>)", "305"); theGame = game; }

	/**
	 * Launch the game. This makes the game available via
	 * the {@link #getGame()} method.
	 */
	@Given("^the user has launched the JPacman GUI$")
	public void theUserHasLaunchedTheJPacmanGUI()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(980,183,<43,1>,<49,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(980,183,<43,1>,<49,2>)", "306"); launcher = new Launcher(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(980,183,<43,1>,<49,2>)", "307"); launcher.launch(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(980,183,<43,1>,<49,2>)", "308"); setGame(launcher.getGame()); }

	/**
	 * Start playing the game.
	 */
	@When("^the user presses the \"Start\" button$")
	public void theUserPressesStart()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(1204,109,<54,1>,<57,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(1204,109,<54,1>,<57,2>)", "309"); getGame().start(); }	

	/**
	 * Verify that the play is actually running.
	 */
	@Then("^the game is running$")
	public void theGameShouldStart()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(1373,109,<62,1>,<65,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(1373,109,<62,1>,<65,2>)", "310"); assertTrue(getGame().isInProgress()); }

	/**
	 * Close the UI after all tests are finished.
	 */
	@After
	public void tearDownUI()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(1542,59,<70,1>,<73,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(523,1080,<20,0>,<74,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/cucumber/StateNavigationSteps.java|(1542,59,<70,1>,<73,2>)", "311"); launcher.dispose(); }
}
