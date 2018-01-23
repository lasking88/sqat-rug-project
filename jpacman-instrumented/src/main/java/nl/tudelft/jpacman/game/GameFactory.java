package nl.tudelft.jpacman.game;

import static sqat.series2.Api.hit;
import nl.tudelft.jpacman.level.Level;
import nl.tudelft.jpacman.level.PlayerFactory;

public class GameFactory  {

	/**
	 * The factory providing the player objects.
	 */
	private final PlayerFactory playerFact;

	/**
	 * Creates a new game factory.
	 * 
	 * @param playerFactory
	 *            The factory providing the player objects.
	 */
	public GameFactory(PlayerFactory playerFactory)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/GameFactory.java|(198,850,<11,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/GameFactory.java|(454,87,<24,1>,<26,2>)", "365"); this.playerFact = playerFactory;
	}

	/**
	 * Creates a game for a single level with one player.
	 * 
	 * @param level
	 *            The level to create a game for.
	 * @return A new single player game.
	 */
	public Game createSinglePlayerGame(Level level)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/GameFactory.java|(198,850,<11,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/GameFactory.java|(716,117,<35,1>,<37,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/GameFactory.java|(198,850,<11,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/GameFactory.java|(716,117,<35,1>,<37,2>)", "366"); return new SinglePlayerGame(playerFact.createPacMan(), level); }

	/**
	 * Returns the player factory associated with this game factory.
	 * @return the player factory associated with this game factory.
	 */
	protected PlayerFactory getPlayerFactory()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/GameFactory.java|(198,850,<11,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/GameFactory.java|(978,68,<43,1>,<45,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/game/GameFactory.java|(198,850,<11,0>,<46,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/game/GameFactory.java|(978,68,<43,1>,<45,2>)", "367"); return playerFact; }
}
