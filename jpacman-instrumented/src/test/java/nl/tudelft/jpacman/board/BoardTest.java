package nl.tudelft.jpacman.board;

import static sqat.series2.Api.hit;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

public class BoardTest  {

	private Board board;
	
	private final Square x0y0 = mock(Square.class);
	private final Square x0y1 = mock(Square.class);
	private final Square x0y2 = mock(Square.class);
	private final Square x1y0 = mock(Square.class);
	private final Square x1y1 = mock(Square.class);
	private final Square x1y2 = mock(Square.class);
	
	private static final int MAX_WIDTH = 2;
	private static final int MAX_HEIGHT = 3;
	
	/**
	 * Setup a board that can be used for testing.
	 */
	@Before
	public void setUp()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(732,241,<31,1>,<41,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(732,241,<31,1>,<41,2>)", "266"); Square[][] grid = new Square[MAX_WIDTH][MAX_HEIGHT]; hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(732,241,<31,1>,<41,2>)", "267"); grid[0][0] = x0y0; hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(732,241,<31,1>,<41,2>)", "268"); grid[0][1] = x0y1; hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(732,241,<31,1>,<41,2>)", "269"); grid[0][2] = x0y2; hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(732,241,<31,1>,<41,2>)", "270"); grid[1][0] = x1y0; hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(732,241,<31,1>,<41,2>)", "271"); grid[1][1] = x1y1; hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(732,241,<31,1>,<41,2>)", "272"); grid[1][2] = x1y2; hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(732,241,<31,1>,<41,2>)", "273"); board = new Board(grid); }
	
	/**
	 * Verifies the board has the correct width.
	 */
	@Test
	public void verifyWidth()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(1033,82,<46,1>,<49,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(1033,82,<46,1>,<49,2>)", "274"); assertEquals(MAX_WIDTH, board.getWidth()); }
	
	/**
	 * Verifies the board has the correct height.
	 */
	@Test
	public void verifyHeight()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(1176,85,<54,1>,<57,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(1176,85,<54,1>,<57,2>)", "275"); assertEquals(MAX_HEIGHT, board.getHeight()); }
	
	/**
	 * Verifies the square at x0y0 is indeed the right square.
	 */
	@Test
	public void verifyX0Y0()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(1335,80,<62,1>,<65,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(1335,80,<62,1>,<65,2>)", "276"); assertEquals(x0y0, board.squareAt(0, 0)); }
	
	/**
	 * Verifies the square at x1y2 is indeed the right square.
	 */
	@Test
	public void verifyX1Y2()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(1489,80,<70,1>,<73,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(1489,80,<70,1>,<73,2>)", "277"); assertEquals(x1y2, board.squareAt(1, 2)); }
	
	/**
	 * Verifies the square at x0y1 is indeed the right square.
	 */
	@Test
	public void verifyX0Y1()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(1643,80,<78,1>,<81,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(242,1483,<14,0>,<82,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/board/BoardTest.java|(1643,80,<78,1>,<81,2>)", "278"); assertEquals(x0y1, board.squareAt(0, 1)); }
}
