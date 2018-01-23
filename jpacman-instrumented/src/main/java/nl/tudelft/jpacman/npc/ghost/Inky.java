package nl.tudelft.jpacman.npc.ghost;

import static sqat.series2.Api.hit;
import java.util.List;
import java.util.Map;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.sprite.Sprite;

public class Inky extends Ghost  {

	private static final int SQUARES_AHEAD = 2;

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
	 * Creates a new "Inky", a.k.a. Bashful.
	 * 
	 * @param spriteMap
	 *            The sprites for this ghost.
	 */
	public Inky(Map<Direction, Sprite> spriteMap)  {
		super(spriteMap, MOVE_INTERVAL, INTERVAL_VARIATION);
	hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(2147,105,<64,1>,<66,2>)", "198");}

	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * Bashful has the most complicated AI of all. When the ghosts are not
	 * patrolling their home corners, Bashful considers two things: Shadow's
	 * location, and the location two grid spaces ahead of Pac-Man. Bashful
	 * draws a line from Shadow to the spot that is two squares in front of
	 * Pac-Man and extends that line twice as far. Therefore, if Bashful is
	 * alongside Shadow when they are behind Pac-Man, Bashful will usually
	 * follow Shadow the whole time. But if Bashful is in front of Pac-Man when
	 * Shadow is far behind him, Bashful tends to want to move away from Pac-Man
	 * (in reality, to a point very far ahead of Pac-Man). Bashful is affected
	 * by a similar targeting bug that affects Speedy. When Pac-Man is moving or
	 * facing up, the spot Bashful uses to draw the line is two squares above
	 * and left of Pac-Man.
	 * </p>
	 * 
	 * <p>
	 * <b>Implementation:</b> by lack of a coordinate system there is a
	 * workaround: first determine the square of Blinky (A) and the square 2
	 * squares away from Pac-Man (B). Then determine the shortest path from A to
	 * B regardless of terrain and walk that same path from B. This is the
	 * destination.
	 * </p>
	 */
	// CHECKSTYLE:OFF To keep this more readable.
	@Override
	public Direction nextMove()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "205"); Unit blinky = Navigation.findNearest(Blinky.class, getSquare()); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "206"); if (blinky == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "199"); return randomMove(); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "207"); Unit player = Navigation.findNearest(Player.class, getSquare()); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "208"); if (player == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "200"); return randomMove(); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "209"); Direction targetDirection = player.getDirection(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "210"); Square playerDestination = player.getSquare(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "211"); for (int i = 0; i < SQUARES_AHEAD; i++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "201"); playerDestination = playerDestination.getSquareAt(targetDirection); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "212"); Square destination = playerDestination; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "213"); List<Direction> firstHalf = Navigation.shortestPath(blinky.getSquare(),
				playerDestination, null); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "214"); if (firstHalf == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "202"); return randomMove(); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "215"); for (Direction d : firstHalf) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "203"); destination = playerDestination.getSquareAt(d); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "216"); List<Direction> path = Navigation.shortestPath(getSquare(),
				destination, this); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "217"); if (path != null && !path.isEmpty()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "204"); return path.get(0); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(1694,2831,<43,0>,<133,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Inky.java|(3530,974,<95,1>,<130,2>)", "218"); return randomMove(); }
	// CHECKSTYLE:ON

}
