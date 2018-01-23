package nl.tudelft.jpacman.board;

import static sqat.series2.Api.hit;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

public class SquareTest  {

	/**
	 * The square under test.
	 */
	private Square square;

	/**
	 * Resets the square under test.
	 */
	@Before
	public void setUp()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(510,63,<26,1>,<29,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(510,63,<26,1>,<29,2>)", "279"); square = new BasicSquare(); }

	/**
	 * Assert that the square holds the occupant once it has occupied it.
	 */
	@Test
	public void testOccupy()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(657,153,<34,1>,<40,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(657,153,<34,1>,<40,2>)", "280"); Unit occupant = mock(Unit.class); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(657,153,<34,1>,<40,2>)", "281"); square.put(occupant); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(657,153,<34,1>,<40,2>)", "282"); assertTrue(square.getOccupants().contains(occupant)); }

	/**
	 * Assert that the square no longer holds the occupant after it has left the
	 * square.
	 */
	@Test
	public void testLeave()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(913,180,<46,1>,<53,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(913,180,<46,1>,<53,2>)", "283"); Unit occupant = mock(Unit.class); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(913,180,<46,1>,<53,2>)", "284"); square.put(occupant); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(913,180,<46,1>,<53,2>)", "285"); square.remove(occupant); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(913,180,<46,1>,<53,2>)", "286"); assertFalse(square.getOccupants().contains(occupant)); }

	/**
	 * Assert that the order in which units entered the square is preserved.
	 */
	@Test
	public void testOrder()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(1180,259,<58,1>,<67,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(1180,259,<58,1>,<67,2>)", "287"); Unit o1 = mock(Unit.class); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(1180,259,<58,1>,<67,2>)", "288"); Unit o2 = mock(Unit.class); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(1180,259,<58,1>,<67,2>)", "289"); square.put(o1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(1180,259,<58,1>,<67,2>)", "290"); square.put(o2); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(1180,259,<58,1>,<67,2>)", "291"); Object[] occupantsAsArray = square.getOccupants().toArray(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(376,1065,<16,0>,<68,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/SquareTest.java|(1180,259,<58,1>,<67,2>)", "292"); assertArrayEquals(new Object[] { o1, o2 }, occupantsAsArray); }
}
