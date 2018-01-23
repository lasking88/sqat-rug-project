package nl.tudelft.jpacman.npc.ghost;

import static sqat.series2.Api.hit;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.level.LevelFactory;
import nl.tudelft.jpacman.level.MapParser;
import nl.tudelft.jpacman.level.Pellet;
import nl.tudelft.jpacman.sprite.PacManSprites;

import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.Lists;

@SuppressWarnings({"magicnumber", "PMD.AvoidDuplicateLiterals", "PMD.TooManyStaticImports"})
public class NavigationTest  {

	/**
	 * Map parser used to construct boards.
	 */
	private MapParser parser;

	/**
	 * Set up the map parser.
	 */
	@Before
	public void setUp()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1172,192,<45,1>,<50,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1172,192,<45,1>,<50,2>)", "368"); PacManSprites sprites = new PacManSprites(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1172,192,<45,1>,<50,2>)", "369"); parser = new MapParser(new LevelFactory(sprites, new GhostFactory(
				sprites)), new BoardFactory(sprites)); }

	/**
	 * Verifies that the path to the same square is empty.
	 */
	@Test
	public void testShortestPathEmpty()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1433,289,<55,1>,<63,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1433,289,<55,1>,<63,2>)", "370"); Board b = parser.parseMap(Lists.newArrayList(" ")).getBoard(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1433,289,<55,1>,<63,2>)", "371"); Square s1 = b.squareAt(0, 0); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1433,289,<55,1>,<63,2>)", "372"); Square s2 = b.squareAt(0, 0); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1433,289,<55,1>,<63,2>)", "373"); List<Direction> path = Navigation
				.shortestPath(s1, s2, mock(Unit.class)); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1433,289,<55,1>,<63,2>)", "374"); assertEquals(0, path.size()); }

	/**
	 * Verifies that if no path exists, the result is <code>null</code>.
	 */
	@Test
	public void testNoShortestPath()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1805,306,<68,1>,<78,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1805,306,<68,1>,<78,2>)", "375"); Board b = parser
				.parseMap(Lists.newArrayList("#####", "# # #", "#####"))
				.getBoard(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1805,306,<68,1>,<78,2>)", "376"); Square s1 = b.squareAt(1, 1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1805,306,<68,1>,<78,2>)", "377"); Square s2 = b.squareAt(3, 1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1805,306,<68,1>,<78,2>)", "378"); List<Direction> path = Navigation
				.shortestPath(s1, s2, mock(Unit.class)); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(1805,306,<68,1>,<78,2>)", "379"); assertNull(path); }

	/**
	 * Verifies that having no traveller ignores terrain.
	 */
	@Test
	public void testNoTraveller()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2179,377,<83,1>,<93,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2179,377,<83,1>,<93,2>)", "380"); Board b = parser
				.parseMap(Lists.newArrayList("#####", "# # #", "#####"))
				.getBoard(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2179,377,<83,1>,<93,2>)", "381"); Square s1 = b.squareAt(1, 1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2179,377,<83,1>,<93,2>)", "382"); Square s2 = b.squareAt(3, 1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2179,377,<83,1>,<93,2>)", "383"); List<Direction> path = Navigation.shortestPath(s1, s2, null); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2179,377,<83,1>,<93,2>)", "384"); assertArrayEquals(new Direction[] { Direction.EAST, Direction.EAST },
				path.toArray(new Direction[] {})); }

	/**
	 * Tests if the algorithm can find a path in a straight line.
	 */
	@Test
	public void testSimplePath()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2632,369,<98,1>,<108,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2632,369,<98,1>,<108,2>)", "385"); Board b = parser.parseMap(Lists.newArrayList("####", "#  #", "####"))
				.getBoard(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2632,369,<98,1>,<108,2>)", "386"); Square s1 = b.squareAt(1, 1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2632,369,<98,1>,<108,2>)", "387"); Square s2 = b.squareAt(2, 1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2632,369,<98,1>,<108,2>)", "388"); List<Direction> path = Navigation
				.shortestPath(s1, s2, mock(Unit.class)); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(2632,369,<98,1>,<108,2>)", "389"); assertArrayEquals(new Direction[] { Direction.EAST },
				path.toArray(new Direction[] {})); }

	/**
	 * Verifies that the algorithm can find a path when it has to take corners.
	 */
	@Test
	public void testCornerPath()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3091,394,<113,1>,<123,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3091,394,<113,1>,<123,2>)", "390"); Board b = parser.parseMap(
				Lists.newArrayList("####", "#  #", "## #", "####")).getBoard(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3091,394,<113,1>,<123,2>)", "391"); Square s1 = b.squareAt(1, 1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3091,394,<113,1>,<123,2>)", "392"); Square s2 = b.squareAt(2, 2); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3091,394,<113,1>,<123,2>)", "393"); List<Direction> path = Navigation
				.shortestPath(s1, s2, mock(Unit.class)); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3091,394,<113,1>,<123,2>)", "394"); assertArrayEquals(new Direction[] { Direction.EAST, Direction.SOUTH },
				path.toArray(new Direction[] {})); }

	/**
	 * Verifies that the nearest object is detected.
	 */
	@Test
	public void testNearestUnit()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3548,302,<128,1>,<137,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3548,302,<128,1>,<137,2>)", "395"); Board b = parser
				.parseMap(Lists.newArrayList("#####", "# ..#", "#####"))
				.getBoard(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3548,302,<128,1>,<137,2>)", "396"); Square s1 = b.squareAt(1, 1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3548,302,<128,1>,<137,2>)", "397"); Square s2 = b.squareAt(2, 1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3548,302,<128,1>,<137,2>)", "398"); Square result = Navigation.findNearest(Pellet.class, s1).getSquare(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3548,302,<128,1>,<137,2>)", "399"); assertEquals(s2, result); }

	/**
	 * Verifies that there is no such location if there is no nearest object.
	 */
	@Test
	public void testNoNearestUnit()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3938,216,<142,1>,<148,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3938,216,<142,1>,<148,2>)", "400"); Board b = parser.parseMap(Lists.newArrayList(" ")).getBoard(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3938,216,<142,1>,<148,2>)", "401"); Square s1 = b.squareAt(0, 0); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3938,216,<142,1>,<148,2>)", "402"); Unit unit = Navigation.findNearest(Pellet.class, s1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(3938,216,<142,1>,<148,2>)", "403"); assertNull(unit); }
	
	/**
	 * Verifies that there is ghost on the default board
	 * next to cell [1, 1].
	 *  
	 * @throws IOException if board reading fails.
	 */
	@Test
	public void testFullSizedLevel() throws IOException  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(4301,295,<156,1>,<164,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(4301,295,<156,1>,<164,2>)", "408"); try (InputStream i = getClass().getResourceAsStream("/board.txt")) { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(4301,295,<156,1>,<164,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(4301,295,<156,1>,<164,2>)", "404"); Board b = parser.parseMap(i).getBoard(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(4301,295,<156,1>,<164,2>)", "405"); Square s1 = b.squareAt(1, 1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(4301,295,<156,1>,<164,2>)", "406"); Unit unit = Navigation.findNearest(Ghost.class, s1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(931,3667,<34,0>,<165,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/npc/ghost/NavigationTest.java|(4301,295,<156,1>,<164,2>)", "407"); assertNotNull(unit); } }
}
