package nl.tudelft.jpacman.ui;

import static sqat.series2.Api.hit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.game.Game;

class BoardPanel extends JPanel  {

	/**
	 * Default serialisation ID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The background colour of the board.
	 */
	private static final Color BACKGROUND_COLOR = Color.BLACK;

	/**
	 * The size (in pixels) of a square on the board. The initial size of this
	 * panel will scale to fit a board with square of this size.
	 */
	private static final int SQUARE_SIZE = 16;

	/**
	 * The game to display.
	 */
	private final Game game;

	/**
	 * Creates a new board panel that will display the provided game.
	 * 
	 * @param game
	 *            The game to display.
	 */
	BoardPanel(Game game)  {
		super();
		hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(989,302,<49,1>,<62,2>)", "588"); assert game != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(989,302,<49,1>,<62,2>)", "589"); this.game = game; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(989,302,<49,1>,<62,2>)", "590"); Board board = game.getLevel().getBoard(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(989,302,<49,1>,<62,2>)", "591"); int w = board.getWidth() * SQUARE_SIZE; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(989,302,<49,1>,<62,2>)", "592"); int h = board.getHeight() * SQUARE_SIZE; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(989,302,<49,1>,<62,2>)", "593"); Dimension size = new Dimension(w, h); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(989,302,<49,1>,<62,2>)", "594"); setMinimumSize(size); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(989,302,<49,1>,<62,2>)", "595"); setPreferredSize(size);
	}

	@Override
	public void paint(Graphics g)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1294,117,<64,1>,<68,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1294,117,<64,1>,<68,2>)", "596"); assert g != null; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1294,117,<64,1>,<68,2>)", "597"); render(game.getLevel().getBoard(), g, getSize()); }

	/**
	 * Renders the board on the given graphics context to the given dimensions.
	 * 
	 * @param board
	 *            The board to render.
	 * @param g
	 *            The graphics context to draw on.
	 * @param window
	 *            The dimensions to scale the rendered board to.
	 */
	private void render(Board board, Graphics g, Dimension window)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)", "603"); int cellW = window.width / board.getWidth(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)", "604"); int cellH = window.height / board.getHeight(); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)", "605"); g.setColor(BACKGROUND_COLOR); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)", "606"); g.fillRect(0, 0, window.width, window.height); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)", "607"); for (int y = 0; y < board.getHeight(); y++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)", "602"); for (int x = 0; x < board.getWidth(); x++) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)", "598"); int cellX = x * cellW; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)", "599"); int cellY = y * cellH; hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)", "600"); Square square = board.squareAt(x, y); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(1700,498,<80,1>,<95,2>)", "601"); render(square, g, cellX, cellY, cellW, cellH); } } }

	/**
	 * Renders a single square on the given graphics context on the specified
	 * rectangle.
	 * 
	 * @param square
	 *            The square to render.
	 * @param g
	 *            The graphics context to draw on.
	 * @param x
	 *            The x position to start drawing.
	 * @param y
	 *            The y position to start drawing.
	 * @param w
	 *            The width of this square (in pixels.)
	 * @param h
	 *            The height of this square (in pixels.)
	 */
	private void render(Square square, Graphics g, int x, int y, int w, int h)  { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(2677,210,<114,1>,<119,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(2677,210,<114,1>,<119,2>)", "609"); square.getSprite().draw(g, x, y, w, h); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(2677,210,<114,1>,<119,2>)", "610"); for (Unit unit : square.getOccupants()) { hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(2677,210,<114,1>,<119,2>)"); hit("|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(362,2527,<20,0>,<120,1>)", "|project://jpacman/src/main/java/nl/tudelft/jpacman/ui/BoardPanel.java|(2677,210,<114,1>,<119,2>)", "608"); unit.getSprite().draw(g, x, y, w, h); } }
}