package nl.tudelft.jpacman.level;

import static sqat.series2.Api.hit;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.npc.NPC;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.google.common.collect.Lists;

@SuppressWarnings({"PMD.AvoidDuplicateLiterals", "PMD.TooManyStaticImports"})
public class LevelTest  {

	/**
	 * The level under test.
	 */
	private Level level;

	/**
	 * An NPC on this level.
	 */
	private final NPC ghost = mock(NPC.class);

	/**
	 * Starting position 1.
	 */
	private final Square square1 = mock(Square.class);

	/**
	 * Starting position 2.
	 */
	private final Square square2 = mock(Square.class);

	/**
	 * The board for this level.
	 */
	private final Board board = mock(Board.class);
	
	/**
	 * The collision map.
	 */
	private final CollisionMap collisions = mock(CollisionMap.class);

	/**
	 * Sets up the level with the default board, a single NPC and a starting
	 * square.
	 */
	@Before
	public void setUp()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(1387,237,<62,1>,<68,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(1387,237,<62,1>,<68,2>)", "312"); final long defaultInterval = 100L; hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(1387,237,<62,1>,<68,2>)", "313"); level = new Level(board, Lists.newArrayList(ghost), Lists.newArrayList(
				square1, square2), collisions); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(1387,237,<62,1>,<68,2>)", "314"); when(ghost.getInterval()).thenReturn(defaultInterval); }

	/**
	 * Validates the state of the level when it isn't started yet.
	 */
	@Test
	public void noStart()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(1701,70,<73,1>,<76,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(1701,70,<73,1>,<76,2>)", "315"); assertFalse(level.isInProgress()); }

	/**
	 * Validates the state of the level when it is stopped without starting.
	 */
	@Test
	public void stop()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(1858,83,<81,1>,<85,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(1858,83,<81,1>,<85,2>)", "316"); level.stop(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(1858,83,<81,1>,<85,2>)", "317"); assertFalse(level.isInProgress()); }

	/**
	 * Validates the state of the level when it is started.
	 */
	@Test
	public void start()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2011,84,<90,1>,<94,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2011,84,<90,1>,<94,2>)", "318"); level.start(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2011,84,<90,1>,<94,2>)", "319"); assertTrue(level.isInProgress()); }

	/**
	 * Validates the state of the level when it is started then stopped.
	 */
	@Test
	public void startStop()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2178,105,<99,1>,<104,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2178,105,<99,1>,<104,2>)", "320"); level.start(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2178,105,<99,1>,<104,2>)", "321"); level.stop(); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2178,105,<99,1>,<104,2>)", "322"); assertFalse(level.isInProgress()); }

	/**
	 * Verifies registering a player puts the player on the correct starting
	 * square.
	 */
	@Test @Ignore
	@SuppressWarnings("PMD.JUnitTestsShouldIncludeAssert")
	public void registerPlayer()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2382,193,<110,1>,<116,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2382,193,<110,1>,<116,2>)", "323"); Player p = mock(Player.class); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2382,193,<110,1>,<116,2>)", "324"); level.registerPlayer(p); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2382,193,<110,1>,<116,2>)", "325"); verify(p).occupy(square1); }

	/**
	 * Verifies registering a player twice does not do anything.
	 */
	@Test @Ignore
	@SuppressWarnings("PMD.JUnitTestsShouldIncludeAssert")
	public void registerPlayerTwice()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2650,235,<121,1>,<128,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2650,235,<121,1>,<128,2>)", "326"); Player p = mock(Player.class); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2650,235,<121,1>,<128,2>)", "327"); level.registerPlayer(p); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2650,235,<121,1>,<128,2>)", "328"); level.registerPlayer(p); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2650,235,<121,1>,<128,2>)", "329"); verify(p, times(1)).occupy(square1); }

	/**
	 * Verifies registering a second player puts that player on the correct
	 * starting square.
	 */
	@Test @Ignore
	@SuppressWarnings("PMD.JUnitTestsShouldIncludeAssert")
	public void registerSecondPlayer()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2992,264,<134,1>,<142,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2992,264,<134,1>,<142,2>)", "330"); Player p1 = mock(Player.class); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2992,264,<134,1>,<142,2>)", "331"); Player p2 = mock(Player.class); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2992,264,<134,1>,<142,2>)", "332"); level.registerPlayer(p1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2992,264,<134,1>,<142,2>)", "333"); level.registerPlayer(p2); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(2992,264,<134,1>,<142,2>)", "334"); verify(p2).occupy(square2); }

	/**
	 * Verifies registering a third player puts the player on the correct
	 * starting square.
	 */
	@Test @Ignore
	@SuppressWarnings("PMD.JUnitTestsShouldIncludeAssert")
	public void registerThirdPlayer()  { hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(3361,325,<148,1>,<158,2>)"); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(3361,325,<148,1>,<158,2>)", "335"); Player p1 = mock(Player.class); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(3361,325,<148,1>,<158,2>)", "336"); Player p2 = mock(Player.class); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(3361,325,<148,1>,<158,2>)", "337"); Player p3 = mock(Player.class); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(3361,325,<148,1>,<158,2>)", "338"); level.registerPlayer(p1); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(3361,325,<148,1>,<158,2>)", "339"); level.registerPlayer(p2); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(3361,325,<148,1>,<158,2>)", "340"); level.registerPlayer(p3); hit("|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(679,3009,<25,0>,<159,1>)", "|project://jpacman/src/test/java/nl/tudelft/jpacman/level/LevelTest.java|(3361,325,<148,1>,<158,2>)", "341"); verify(p3).occupy(square1); }
}
