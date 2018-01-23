package nl.tudelft.jpacman.level;

import static sqat.series2.Api.hit;
import java.util.Map;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.sprite.AnimatedSprite;
import nl.tudelft.jpacman.sprite.Sprite;

public class Player extends Unit  {

	/**
	 * The amount of points accumulated by this player.
	 */
	private int score;

	/**
	 * The animations for every direction.
	 */
	private final Map<Direction, Sprite> sprites;

	/**
	 * The animation that is to be played when Pac-Man dies.
	 */
	private final AnimatedSprite deathSprite;

	/**
	 * <code>true</code> iff this player is alive.
	 */
	private boolean alive;

	/**
	 * Creates a new player with a score of 0 points.
	 * 
	 * @param spriteMap
	 *            A map containing a sprite for this player for every direction.
	 * @param deathAnimation
	 *            The sprite to be shown when this player dies.
	 */
	protected Player(Map<Direction, Sprite> spriteMap, AnimatedSprite deathAnimation)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(973,225,<45,1>,<51,2>)", "828"); this.score = 0; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(973,225,<45,1>,<51,2>)", "829"); this.alive = true; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(973,225,<45,1>,<51,2>)", "830"); this.sprites = spriteMap; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(973,225,<45,1>,<51,2>)", "831"); this.deathSprite = deathAnimation; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(973,225,<45,1>,<51,2>)", "832"); deathSprite.setAnimating(false);
	}

	/**
	 * Returns whether this player is alive or not.
	 * 
	 * @return <code>true</code> iff the player is alive.
	 */
	public boolean isAlive()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1320,45,<58,1>,<60,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1320,45,<58,1>,<60,2>)", "833"); return alive; }

	/**
	 * Sets whether this player is alive or not.
	 * 
	 * @param isAlive
	 *            <code>true</code> iff this player is alive.
	 */
	public void setAlive(boolean isAlive)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1507,171,<68,1>,<76,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1507,171,<68,1>,<76,2>)", "836"); if (isAlive) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1507,171,<68,1>,<76,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1507,171,<68,1>,<76,2>)", "834"); deathSprite.setAnimating(false); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1507,171,<68,1>,<76,2>)", "837"); if (!isAlive) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1507,171,<68,1>,<76,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1507,171,<68,1>,<76,2>)", "835"); deathSprite.restart(); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1507,171,<68,1>,<76,2>)", "838"); this.alive = isAlive; }

	/**
	 * Returns the amount of points accumulated by this player.
	 * 
	 * @return The amount of points accumulated by this player.
	 */
	public int getScore()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1818,42,<83,1>,<85,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1818,42,<83,1>,<85,2>)", "839"); return score; }

	@Override
	public Sprite getSprite()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1863,125,<87,1>,<93,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1863,125,<87,1>,<93,2>)", "841"); if (isAlive()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1863,125,<87,1>,<93,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1863,125,<87,1>,<93,2>)", "840"); return sprites.get(getDirection()); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(1863,125,<87,1>,<93,2>)", "842"); return deathSprite; }

	/**
	 * Adds points to the score of this player.
	 * 
	 * @param points
	 *            The amount of points to add to the points this player already
	 *            has.
	 */
	public void addPoints(int points)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(2166,57,<102,1>,<104,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(307,1918,<15,0>,<105,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Player.java|(2166,57,<102,1>,<104,2>)", "843"); score += points; }
}
