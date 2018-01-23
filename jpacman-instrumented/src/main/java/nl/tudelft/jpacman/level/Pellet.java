package nl.tudelft.jpacman.level;

import static sqat.series2.Api.hit;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.sprite.Sprite;

public class Pellet extends Unit  {

	/**
	 * The sprite of this unit.
	 */
	private final Sprite image;
	
	/**
	 * The point value of this pellet.
	 */
	private final int value;
	
	/**
	 * Creates a new pellet.
	 * @param points The point value of this pellet.
	 * @param sprite The sprite of this pellet.
	 */
	public Pellet(int points, Sprite sprite)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(213,610,<11,0>,<45,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(525,91,<28,1>,<31,2>)", "743"); this.image = sprite; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(213,610,<11,0>,<45,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(525,91,<28,1>,<31,2>)", "744"); this.value = points;
	}
	
	/**
	 * Returns the point value of this pellet.
	 * @return The point value of this pellet.
	 */
	public int getValue()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(213,610,<11,0>,<45,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(718,42,<37,1>,<39,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(213,610,<11,0>,<45,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(718,42,<37,1>,<39,2>)", "745"); return value; }
	
	@Override
	public Sprite getSprite()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(213,610,<11,0>,<45,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(764,57,<41,1>,<44,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(213,610,<11,0>,<45,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/Pellet.java|(764,57,<41,1>,<44,2>)", "746"); return image; }
}
