package nl.tudelft.jpacman.npc.ghost;

import static sqat.series2.Api.hit;
import java.util.List;
import java.util.Map;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.sprite.Sprite;

public class Blinky extends Ghost  {

	/**
	 * The variation in intervals, this makes the ghosts look more dynamic and
	 * less predictable.
	 */
	private static final int INTERVAL_VARIATION = 50;

	/**
	 * The base movement interval.
	 */
	private static final int MOVE_INTERVAL = 250;

	/**
	 * Creates a new "Blinky", a.k.a. "Shadow".
	 * 
	 * @param spriteMap
	 *            The sprites for this ghost.
	 */
	// TODO Blinky should speed up when there are a few pellets left, but he
	// has no way to find out how many there are.
	public Blinky(Map<Direction, Sprite> spriteMap)  {
		super(spriteMap, MOVE_INTERVAL, INTERVAL_VARIATION);
	hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(1506,1704,<40,0>,<96,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(2039,107,<61,1>,<63,2>)", "844");}

	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * When the ghosts are not patrolling in their home corners (Blinky:
	 * top-right, Pinky: top-left, Inky: bottom-right, Clyde: bottom-left),
	 * Blinky will attempt to shorten the distance between Pac-Man and himself.
	 * If he has to choose between shortening the horizontal or vertical
	 * distance, he will choose to shorten whichever is greatest. For example,
	 * if Pac-Man is four grid spaces to the left, and seven grid spaces above
	 * Blinky, he'll try to move up towards Pac-Man before he moves to the left.
	 * </p>
	 */
	@Override
	public Direction nextMove()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(1506,1704,<40,0>,<96,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(2719,489,<78,1>,<95,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(1506,1704,<40,0>,<96,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(2719,489,<78,1>,<95,2>)", "847"); Square target = Navigation.findNearest(Player.class, getSquare())
				.getSquare(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(1506,1704,<40,0>,<96,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(2719,489,<78,1>,<95,2>)", "848"); if (target == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(1506,1704,<40,0>,<96,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(2719,489,<78,1>,<95,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(1506,1704,<40,0>,<96,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(2719,489,<78,1>,<95,2>)", "845"); return randomMove(); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(1506,1704,<40,0>,<96,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(2719,489,<78,1>,<95,2>)", "849"); List<Direction> path = Navigation.shortestPath(getSquare(), target,
				this); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(1506,1704,<40,0>,<96,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(2719,489,<78,1>,<95,2>)", "850"); if (path != null && !path.isEmpty()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(1506,1704,<40,0>,<96,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(2719,489,<78,1>,<95,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(1506,1704,<40,0>,<96,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(2719,489,<78,1>,<95,2>)", "846"); return path.get(0); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(1506,1704,<40,0>,<96,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Blinky.java|(2719,489,<78,1>,<95,2>)", "851"); return randomMove(); }
}
