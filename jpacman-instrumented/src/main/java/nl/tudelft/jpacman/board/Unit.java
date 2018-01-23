package nl.tudelft.jpacman.board;

import static sqat.series2.Api.hit;
import nl.tudelft.jpacman.sprite.Sprite;

public abstract class Unit  {

	/**
	 * The square this unit is currently occupying.
	 */
	private Square square;
	
	/**
	 * The direction this unit is facing.
	 */
	private Direction direction;

	/**
	 * Creates a unit that is facing east.
	 */
	protected Unit()  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(411,56,<25,1>,<27,2>)", "747"); this.direction = Direction.EAST;
	}
	
	/**
	 * Sets this unit to face the new direction.
	 * @param newDirection The new direction this unit is facing.
	 */
	public void setDirection(Direction newDirection)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(590,86,<33,1>,<35,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(590,86,<33,1>,<35,2>)", "748"); this.direction = newDirection; }
	
	/**
	 * Returns the current direction this unit is facing.
	 * @return The current direction this unit is facing.
	 */
	public Direction getDirection()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(800,61,<41,1>,<43,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(800,61,<41,1>,<43,2>)", "749"); return this.direction; }
	
	/**
	 * Returns the square this unit is currently occupying.
	 * 
	 * @return The square this unit is currently occupying, or <code>null</code>
	 *         if this unit is not on a square.
	 */
	public Square getSquare()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1060,69,<51,1>,<54,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1060,69,<51,1>,<54,2>)", "750"); assert invariant(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1060,69,<51,1>,<54,2>)", "751"); return square; }

	/**
	 * Occupies the target square iff this unit is allowed to as decided by
	 * {@link Square#isAccessibleTo(Unit)}.
	 * 
	 * @param target
	 *            The square to occupy.
	 */
	public void occupy(Square target)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1316,179,<63,1>,<72,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1316,179,<63,1>,<72,2>)", "753"); assert target != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1316,179,<63,1>,<72,2>)", "754"); if (square != null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1316,179,<63,1>,<72,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1316,179,<63,1>,<72,2>)", "752"); square.remove(this); } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1316,179,<63,1>,<72,2>)", "755"); square = target; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1316,179,<63,1>,<72,2>)", "756"); target.put(this); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1316,179,<63,1>,<72,2>)", "757"); assert invariant(); }
	
	/**
	 * Leaves the currently occupying square, thus removing this unit from the board.
	 */
	public void leaveSquare()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1592,122,<77,1>,<83,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1592,122,<77,1>,<83,2>)", "760"); if (square != null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1592,122,<77,1>,<83,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1592,122,<77,1>,<83,2>)", "758"); square.remove(this); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1592,122,<77,1>,<83,2>)", "759"); square = null; } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(1592,122,<77,1>,<83,2>)", "761"); assert invariant(); }

	/**
	 * Tests whether the square this unit is occupying has this unit listed as
	 * one of its occupiers.
	 * 
	 * @return <code>true</code> if the square this unit is occupying has this
	 *         unit listed as one of its occupiers, or if this unit is currently
	 *         not occupying any square.
	 */
	protected boolean invariant()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(2026,99,<93,1>,<95,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(165,2090,<10,0>,<104,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Unit.java|(2026,99,<93,1>,<95,2>)", "762"); return square == null || square.getOccupants().contains(this); }

	/**
	 * Returns the sprite of this unit.
	 * 
	 * @return The sprite of this unit.
	 */
	public abstract Sprite getSprite() ;

}
