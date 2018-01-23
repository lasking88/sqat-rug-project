package nl.tudelft.jpacman.npc.ghost;

import static sqat.series2.Api.hit;
import java.util.List;
import java.util.Map;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.sprite.Sprite;

public class Pinky extends Ghost  {

	private static final int SQUARES_AHEAD = 4;

	/**
	 * The variation in intervals, this makes the ghosts look more dynamic and
	 * less predictable.
	 */
	private static final int INTERVAL_VARIATION = 50;

	/**
	 * The base movement interval.
	 */
	private static final int MOVE_INTERVAL = 200;

	/**
	 * Creates a new "Pinky", a.k.a. "Speedy".
	 * 
	 * @param spriteMap
	 *            The sprites for this ghost.
	 */
	public Pinky(Map<Direction, Sprite> spriteMap)  {
		super(spriteMap, MOVE_INTERVAL, INTERVAL_VARIATION);
	hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2531,106,<70,1>,<72,2>)", "763");}

	/**
	 * {@inheritDoc}
	 * 
	 * <p>
	 * When the ghosts are not patrolling their home corners, Pinky wants to go
	 * to the place that is four grid spaces ahead of Pac-Man in the direction
	 * that Pac-Man is facing. If Pac-Man is facing down, Pinky wants to go to
	 * the location exactly four spaces below Pac-Man. Moving towards this place
	 * uses the same logic that Blinky uses to find Pac-Man's exact location.
	 * Pinky is affected by a targeting bug if Pac-Man is facing up - when he
	 * moves or faces up, Pinky tries moving towards a point up, and left, four
	 * spaces.
	 * </p>
	 */
	@Override
	public Direction nextMove()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)", "767"); Unit player = Navigation.findNearest(Player.class, getSquare()); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)", "768"); if (player == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)", "764"); return randomMove(); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)", "769"); Direction targetDirection = player.getDirection(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)", "770"); Square destination = player.getSquare(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)", "771"); for (int i = 0; i < SQUARES_AHEAD; i++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)", "765"); destination = destination.getSquareAt(targetDirection); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)", "772"); List<Direction> path = Navigation.shortestPath(getSquare(),
				destination, this); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)", "773"); if (path != null && !path.isEmpty()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)", "766"); return path.get(0); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(2075,1707,<49,0>,<108,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/npc/ghost/Pinky.java|(3236,544,<88,1>,<107,2>)", "774"); return randomMove(); }
}
