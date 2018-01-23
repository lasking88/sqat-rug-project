package nl.tudelft.jpacman.npc.ghost;

import static sqat.series2.Api.hit;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.npc.NPC;
import nl.tudelft.jpacman.sprite.Sprite;

public abstract class Ghost extends NPC  {
	
	/**
	 * The sprite map, one sprite for each direction.
	 */
	private final Map<Direction, Sprite> sprites;

	/**
	 * The base move interval of the ghost.
	 */
	private final int moveInterval;

	/**
	 * The random variation added to the {@link #moveInterval}.
	 */
	private final int intervalVariation;

	/**
	 * Creates a new ghost.
	 *
	 * @param spriteMap
	 *            The sprites for every direction.
	 * @param moveInterval
	 * 			  The base interval of movement.
	 * @param intervalVariation
	 * 			  The variation of the interval.
	 */
	protected Ghost(Map<Direction, Sprite> spriteMap, int moveInterval, int intervalVariation)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(976,205,<45,1>,<49,2>)", "422"); this.sprites = spriteMap; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(976,205,<45,1>,<49,2>)", "423"); this.intervalVariation = intervalVariation; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(976,205,<45,1>,<49,2>)", "424"); this.moveInterval = moveInterval;
	}

	@Override
	public Sprite getSprite()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1184,79,<51,1>,<54,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1184,79,<51,1>,<54,2>)", "425"); return sprites.get(getDirection()); }

	@Override
	public long getInterval()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1266,116,<56,1>,<59,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1266,116,<56,1>,<59,2>)", "426"); return this.moveInterval + new Random().nextInt(this.intervalVariation); }

	/**
	 * Determines a possible move in a random direction.
	 * 
	 * @return A direction in which the ghost can move, or <code>null</code> if
	 *         the ghost is shut in by inaccessible squares.
	 */
	protected Direction randomMove()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)", "430"); Square square = getSquare(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)", "431"); List<Direction> directions = new ArrayList<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)", "432"); for (Direction d : Direction.values()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)", "428"); if (square.getSquareAt(d).isAccessibleTo(this)) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)", "427"); directions.add(d); } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)", "433"); if (directions.isEmpty()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)", "429"); return null; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)", "434"); int i = new Random().nextInt(directions.size()); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(386,1580,<18,0>,<81,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Ghost.java|(1589,375,<67,1>,<80,2>)", "435"); return directions.get(i); }
}
