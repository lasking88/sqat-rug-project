package nl.tudelft.jpacman.level;

import static sqat.series2.Api.hit;
import nl.tudelft.jpacman.sprite.PacManSprites;

public class PlayerFactory  {

	/**
	 * The sprite store containing the Pac-Man sprites.
	 */
	private final PacManSprites sprites;

	/**
	 * Creates a new player factory.
	 * 
	 * @param spriteStore
	 *            The sprite store containing the Pac-Man sprites.
	 */
	public PlayerFactory(PacManSprites spriteStore)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerFactory.java|(155,752,<10,0>,<45,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerFactory.java|(424,82,<23,1>,<25,2>)", "477"); this.sprites = spriteStore;
	}

	/**
	 * Creates a new player with the classic Pac-Man sprites.
	 * 
	 * @return A new player.
	 */
	public Player createPacMan()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerFactory.java|(155,752,<10,0>,<45,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerFactory.java|(609,131,<32,1>,<35,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerFactory.java|(155,752,<10,0>,<45,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerFactory.java|(609,131,<32,1>,<35,2>)", "478"); return new Player(getSprites().getPacmanSprites(),
				getSprites().getPacManDeathAnimation()); }

	/**
	 * The sprites created by the factory.
	 * 
	 * @return The sprites for the player created.
	 */
	protected PacManSprites getSprites()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerFactory.java|(155,752,<10,0>,<45,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerFactory.java|(846,59,<42,1>,<44,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerFactory.java|(155,752,<10,0>,<45,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/PlayerFactory.java|(846,59,<42,1>,<44,2>)", "479"); return sprites; }
}
