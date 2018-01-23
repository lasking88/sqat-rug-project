package nl.tudelft.jpacman.board;

import static sqat.series2.Api.hit;

public class Board  {

	/**
	 * The grid of squares with board[x][y] being the square at column x, row y.
	 */
	private final Square[][] board;

	/**
	 * Creates a new board.
	 * 
	 * @param grid
	 *            The grid of squares with grid[x][y] being the square at column
	 *            x, row y.
	 */
	Board(Square[][] grid)  {
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(428,138,<22,1>,<26,2>)", "480"); assert grid != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(428,138,<22,1>,<26,2>)", "481"); this.board = grid; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(428,138,<22,1>,<26,2>)", "482"); assert invariant() : "Initial grid cannot contain null squares";
	}
	
	/**
	 * Whatever happens, the squares on the board can't be null.
	 * @return false if any square on the board is null.
	 */
	protected final boolean invariant()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(696,177,<32,1>,<41,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(696,177,<32,1>,<41,2>)", "486"); for (Square[] row : board) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(696,177,<32,1>,<41,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(696,177,<32,1>,<41,2>)", "485"); for (Square square : row) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(696,177,<32,1>,<41,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(696,177,<32,1>,<41,2>)", "484"); if (square == null) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(696,177,<32,1>,<41,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(696,177,<32,1>,<41,2>)", "483"); return false; } } } hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(696,177,<32,1>,<41,2>)", "487"); return true; }

	/**
	 * Returns the number of columns.
	 * 
	 * @return The width of this board.
	 */
	public int getWidth()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(963,49,<48,1>,<50,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(963,49,<48,1>,<50,2>)", "488"); return board.length; }

	/**
	 * Returns the number of rows.
	 * 
	 * @return The height of this board.
	 */
	public int getHeight()  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(1100,53,<57,1>,<59,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(1100,53,<57,1>,<59,2>)", "489"); return board[0].length; }

	/**
	 * Returns the square at the given <code>x,y</code> position.
	 * 
	 * @param x
	 *            The <code>x</code> position (column) of the requested square.
	 * @param y
	 *            The <code>y</code> position (row) of the requested square.
	 * @return The square at the given <code>x,y</code> position (never null).
	 */
	public Square squareAt(int x, int y)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(1487,172,<70,1>,<75,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(1487,172,<70,1>,<75,2>)", "490"); assert withinBorders(x, y); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(1487,172,<70,1>,<75,2>)", "491"); Square result = board[x][y]; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(1487,172,<70,1>,<75,2>)", "492"); assert result != null : "Follows from invariant."; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(1487,172,<70,1>,<75,2>)", "493"); return result; }

	/**
	 * Determines whether the given <code>x,y</code> position is on this board.
	 * 
	 * @param x
	 *            The <code>x</code> position (row) to test.
	 * @param y
	 *            The <code>y</code> position (column) to test.
	 * @return <code>true</code> iff the position is on this board.
	 */
	public boolean withinBorders(int x, int y)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(1964,111,<86,1>,<88,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(124,1953,<8,0>,<89,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/board/Board.java|(1964,111,<86,1>,<88,2>)", "494"); return x >= 0 && x < getWidth() && y >= 0 && y < getHeight(); }
}
