package nl.tudelft.jpacman.level;

import static sqat.series2.Api.hit;
import java.util.List;
import java.util.Map;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.npc.NPC;
import nl.tudelft.jpacman.npc.ghost.Ghost;
import nl.tudelft.jpacman.npc.ghost.GhostColor;
import nl.tudelft.jpacman.npc.ghost.GhostFactory;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;

public class LevelFactory  {

	private static final int GHOSTS = 4;
	private static final int BLINKY = 0;
	private static final int INKY = 1;
	private static final int PINKY = 2;
	private static final int CLYDE = 3;

	/**
	 * The default value of a pellet.
	 */
	private static final int PELLET_VALUE = 10;

	/**
	 * The sprite store that provides sprites for units.
	 */
	private final PacManSprites sprites;

	/**
	 * Used to cycle through the various ghost types.
	 */
	private int ghostIndex;

	/**
	 * The factory providing ghosts.
	 */
	private final GhostFactory ghostFact;

	/**
	 * Creates a new level factory.
	 * 
	 * @param spriteStore
	 *            The sprite store providing the sprites for units.
	 * @param ghostFactory
	 *            The factory providing ghosts.
	 */
	public LevelFactory(PacManSprites spriteStore, GhostFactory ghostFactory)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(1336,165,<57,1>,<61,2>)", "570"); this.sprites = spriteStore; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(1336,165,<57,1>,<61,2>)", "571"); this.ghostIndex = -1; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(1336,165,<57,1>,<61,2>)", "572"); this.ghostFact = ghostFactory;
	}

	/**
	 * Creates a new level from the provided data.
	 * 
	 * @param board
	 *            The board with all ghosts and pellets occupying their squares.
	 * @param ghosts
	 *            A list of all ghosts on the board.
	 * @param startPositions
	 *            A list of squares from which players may start the game.
	 * @return A new level for the board.
	 */
	public Level createLevel(Board board, List<NPC> ghosts,
			List<Square> startPositions)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(1867,266,<74,1>,<81,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(1867,266,<74,1>,<81,2>)", "573"); CollisionMap collisionMap = new PlayerCollisions(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(1867,266,<74,1>,<81,2>)", "574"); return new Level(board, ghosts, startPositions, collisionMap); }

	/**
	 * Creates a new ghost.
	 * 
	 * @return The new ghost.
	 */
	NPC createGhost()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2203,364,<88,1>,<103,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2203,364,<88,1>,<103,2>)", "580"); ghostIndex++; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2203,364,<88,1>,<103,2>)", "581"); ghostIndex %= GHOSTS; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2203,364,<88,1>,<103,2>)", "582"); switch (ghostIndex) {
		case BLINKY:
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2203,364,<88,1>,<103,2>)", "575"); return ghostFact.createBlinky();
		case INKY:
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2203,364,<88,1>,<103,2>)", "576"); return ghostFact.createInky();
		case PINKY:
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2203,364,<88,1>,<103,2>)", "577"); return ghostFact.createPinky();
		case CLYDE:
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2203,364,<88,1>,<103,2>)", "578"); return ghostFact.createClyde();
		default:
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2203,364,<88,1>,<103,2>)", "579"); return new RandomGhost(sprites.getGhostSprite(GhostColor.RED));
		} }

	/**
	 * Creates a new pellet.
	 * 
	 * @return The new pellet.
	 */
	public Pellet createPellet()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2639,95,<110,1>,<112,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2639,95,<110,1>,<112,2>)", "583"); return new Pellet(PELLET_VALUE, sprites.getPelletSprite()); }

	/**
	 * Implementation of an NPC that wanders around randomly.
	 * 
	 * @author Jeroen Roosen 
	 */
	private static final class RandomGhost extends Ghost  {

		/**
		 * The suggested delay between moves.
		 */
		private static final long DELAY = 175L;

		/**
		 * Creates a new random ghost.
		 * 
		 * @param ghostSprite
		 *            The sprite for the ghost.
		 */
		RandomGhost(Map<Direction, Sprite> ghostSprite)  {
			super(ghostSprite, (int) DELAY, 0);
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "584"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2838,438,<119,1>,<140,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(3108,92,<132,2>,<134,3>)", "568");}

		@Override
		public Direction nextMove()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "585"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2838,438,<119,1>,<140,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(3204,69,<136,2>,<139,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "586"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(2838,438,<119,1>,<140,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(3204,69,<136,2>,<139,3>)", "569"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/level/LevelFactory.java|(549,2729,<21,0>,<141,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "587"); return randomMove(); }
	}
}
