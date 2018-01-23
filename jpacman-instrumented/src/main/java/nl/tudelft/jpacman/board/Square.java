package nl.tudelft.jpacman.board;

import static sqat.series2.Api.hit;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableList;

import nl.tudelft.jpacman.sprite.Sprite;

public abstract class Square  {

	/**
	 * The units occupying this square, in order of appearance.
	 */
	private final List<Unit> occupants;

	/**
	 * The collection of squares adjacent to this square.
	 */
	private final Map<Direction, Square> neighbours;

	/**
	 * Creates a new, empty square.
	 */
	protected Square()  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(667,135,<33,1>,<37,2>)", "52"); this.occupants = new ArrayList<>(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(667,135,<33,1>,<37,2>)", "53"); this.neighbours = new EnumMap<>(Direction.class); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(667,135,<33,1>,<37,2>)", "54"); assert invariant();
	}

	/**
	 * Returns the square adjacent to this square.
	 * 
	 * @param direction
	 *            The direction of the adjacent square.
	 * @return The adjacent square in the given direction.
	 */
	public Square getSquareAt(Direction direction)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(998,87,<46,1>,<48,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(998,87,<46,1>,<48,2>)", "55"); return neighbours.get(direction); }

	/**
	 * Links this square to a neighbour in the given direction. Note that this
	 * is a one-way connection.
	 * 
	 * @param neighbour
	 *            The neighbour to link.
	 * @param direction
	 *            The direction the new neighbour is in, as seen from this cell.
	 */
	public void link(Square neighbour, Direction direction)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(1366,122,<59,1>,<62,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(1366,122,<59,1>,<62,2>)", "56"); neighbours.put(direction, neighbour); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(1366,122,<59,1>,<62,2>)", "57"); assert invariant(); }

	/**
	 * Returns an immutable list of units occupying this square, in the order in
	 * which they occupied this square (i.e. oldest first.)
	 * 
	 * @return An immutable list of units occupying this square, in the order in
	 *         which they occupied this square (i.e. oldest first.)
	 */
	public List<Unit> getOccupants()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(1784,79,<71,1>,<73,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(1784,79,<71,1>,<73,2>)", "58"); return ImmutableList.copyOf(occupants); }

	/**
	 * Adds a new occupant to this square.
	 * 
	 * @param occupant
	 *            The unit to occupy this square.
	 */
	void put(Unit occupant)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(1988,125,<81,1>,<86,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(1988,125,<81,1>,<86,2>)", "59"); assert occupant != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(1988,125,<81,1>,<86,2>)", "60"); assert !occupants.contains(occupant); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(1988,125,<81,1>,<86,2>)", "61"); occupants.add(occupant); }

	/**
	 * Removes the unit from this square if it was present.
	 * 
	 * @param occupant
	 *            The unit to be removed from this square.
	 */
	void remove(Unit occupant)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(2264,88,<94,1>,<97,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(2264,88,<94,1>,<97,2>)", "62"); assert occupant != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(2264,88,<94,1>,<97,2>)", "63"); occupants.remove(occupant); }

	/**
	 * Verifies that all occupants on this square have indeed listed this square
	 * as the square they are currently occupying.
	 * 
	 * @return <code>true</code> iff all occupants of this square have this
	 *         square listed as the square they are currently occupying.
	 */
	protected final boolean invariant()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(2639,157,<106,1>,<113,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(2639,157,<106,1>,<113,2>)", "66"); for (Unit occupant : occupants) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(2639,157,<106,1>,<113,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(2639,157,<106,1>,<113,2>)", "65"); if (occupant.getSquare() != this) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(2639,157,<106,1>,<113,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(2639,157,<106,1>,<113,2>)", "64"); return false; } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(366,2840,<18,0>,<131,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Square.java|(2639,157,<106,1>,<113,2>)", "67"); return true; }

	/**
	 * Determines whether the unit is allowed to occupy this square.
	 * 
	 * @param unit
	 *            The unit to grant or deny access.
	 * @return <code>true</code> iff the unit is allowed to occupy this square.
	 */
	public abstract boolean isAccessibleTo(Unit unit) ;

	/**
	 * Returns the sprite of this square.
	 * 
	 * @return The sprite of this square.
	 */
	public abstract Sprite getSprite() ;

}
