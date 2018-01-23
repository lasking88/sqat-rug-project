package nl.tudelft.jpacman.board;

import static sqat.series2.Api.hit;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class OccupantTest  {

	/**
	 * The unit under test.
	 */
	private Unit unit;

	/**
	 * Resets the unit under test.
	 */
	@Before
	public void setUp()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(505,59,<27,1>,<30,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(505,59,<27,1>,<30,2>)", "293"); unit = new BasicUnit(); }

	/**
	 * Asserts that a unit has no square to start with.
	 */
	@Test
	public void noStartSquare()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(630,71,<35,1>,<38,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(630,71,<35,1>,<38,2>)", "294"); assertNull(unit.getSquare()); }

	/**
	 * Tests that the unit indeed has the target square as its base after
	 * occupation.
	 */
	@Test
	public void testOccupy()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(801,193,<44,1>,<50,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(801,193,<44,1>,<50,2>)", "295"); Square target = new BasicSquare(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(801,193,<44,1>,<50,2>)", "296"); unit.occupy(target); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(801,193,<44,1>,<50,2>)", "297"); assertThat(unit.getSquare(), is(target)); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(801,193,<44,1>,<50,2>)", "298"); assertThat(target.getOccupants(), contains(unit)); }
	
    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
	@Test
	public void testReoccupy()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(1113,218,<56,1>,<63,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(1113,218,<56,1>,<63,2>)", "299"); Square target = new BasicSquare(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(1113,218,<56,1>,<63,2>)", "300"); unit.occupy(target); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(1113,218,<56,1>,<63,2>)", "301"); unit.occupy(target); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(1113,218,<56,1>,<63,2>)", "302"); assertThat(unit.getSquare(), is(target)); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(377,956,<17,0>,<64,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/OccupantTest.java|(1113,218,<56,1>,<63,2>)", "303"); assertThat(target.getOccupants(), contains(unit)); }
}
