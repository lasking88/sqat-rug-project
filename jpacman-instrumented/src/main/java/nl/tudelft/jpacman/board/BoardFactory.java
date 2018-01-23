package nl.tudelft.jpacman.board;

import static sqat.series2.Api.hit;
import nl.tudelft.jpacman.sprite.PacManSprites;
import nl.tudelft.jpacman.sprite.Sprite;

public class BoardFactory  {

	/**
	 * The sprite store providing the sprites for the background.
	 */
	private final PacManSprites sprites;

	/**
	 * Creates a new BoardFactory that will create a board with the provided
	 * background sprites.
	 * 
	 * @param spriteStore
	 *            The sprite store providing the sprites for the background.
	 */
	public BoardFactory(PacManSprites spriteStore)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(612,81,<26,1>,<28,2>)", "781"); this.sprites = spriteStore;
	}

	/**
	 * Creates a new board from a grid of cells and connects it.
	 * 
	 * @param grid
	 *            The square grid of cells, in which grid[x][y] corresponds to
	 *            the square at position x,y.
	 * @return A new board, wrapping a grid of connected cells.
	 */
	public Board createBoard(Square[][] grid)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "789"); assert grid != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "790"); Board board = new Board(grid); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "791"); int width = board.getWidth(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "792"); int height = board.getHeight(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "793"); for (int x = 0; x < width; x++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "788"); for (int y = 0; y < height; y++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "786"); Square square = grid[x][y]; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "787"); for (Direction dir : Direction.values()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "782"); int dirX = (width + x + dir.getDeltaX()) % width; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "783"); int dirY = (height + y + dir.getDeltaY()) % height; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "784"); Square neighbour = grid[dirX][dirY]; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "785"); square.link(neighbour, dir); } } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(969,543,<38,1>,<58,2>)", "794"); return board; }

	/**
	 * Creates a new square that can be occupied by any unit.
	 * 
	 * @return A new square that can be occupied by any unit.
	 */
	public Square createGround()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(1648,81,<65,1>,<67,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(1648,81,<65,1>,<67,2>)", "795"); return new Ground(sprites.getGroundSprite()); }

	/**
	 * Creates a new square that cannot be occupied by any unit.
	 * 
	 * @return A new square that cannot be occupied by any unit.
	 */
	public Square createWall()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(1871,75,<74,1>,<76,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(1871,75,<74,1>,<76,2>)", "796"); return new Wall(sprites.getWallSprite()); }

	/**
	 * A wall is a square that is inaccessible to anyone.
	 * 
	 * @author Jeroen Roosen 
	 */
	private static final class Wall extends Square  {

		/**
		 * The background for this square.
		 */
		private final Sprite background;

		/**
		 * Creates a new wall square.
		 * 
		 * @param sprite
		 *            The background for the square.
		 */
		Wall(Sprite sprite)  {
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "797"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2046,458,<83,1>,<109,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2299,54,<96,2>,<98,3>)", "775"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "798"); this.background = sprite;
		}

		@Override
		public boolean isAccessibleTo(Unit unit)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "799"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2046,458,<83,1>,<109,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2357,75,<100,2>,<103,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "800"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2046,458,<83,1>,<109,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2357,75,<100,2>,<103,3>)", "776"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "801"); return false; }

		@Override
		public Sprite getSprite()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "802"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2046,458,<83,1>,<109,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2436,65,<105,2>,<108,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "803"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2046,458,<83,1>,<109,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2436,65,<105,2>,<108,3>)", "777"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "804"); return background; }
	}

	/**
	 * A wall is a square that is accessible to anyone.
	 * 
	 * @author Jeroen Roosen 
	 */
	private static final class Ground extends Square  {

		/**
		 * The background for this square.
		 */
		private final Sprite background;

		/**
		 * Creates a new ground square.
		 * 
		 * @param sprite
		 *            The background for the square.
		 */
		Ground(Sprite sprite)  {
			hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "805"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2602,463,<116,1>,<142,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2859,56,<129,2>,<131,3>)", "778"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3813,45)", "806"); this.background = sprite;
		}

		@Override
		public boolean isAccessibleTo(Unit unit)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "807"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2602,463,<116,1>,<142,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2919,74,<133,2>,<136,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "808"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2602,463,<116,1>,<142,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2919,74,<133,2>,<136,3>)", "779"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "809"); return true; }

		@Override
		public Sprite getSprite()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "810"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2602,463,<116,1>,<142,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2997,65,<138,2>,<141,3>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "811"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2602,463,<116,1>,<142,2>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(2997,65,<138,2>,<141,3>)", "780"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/BoardFactory.java|(260,2807,<12,0>,<143,1>)", "|project://sqat-analysis/src/sqat/series2/A1b_DynCov.rsc|(3331,48)", "812"); return background; }
	}
}
